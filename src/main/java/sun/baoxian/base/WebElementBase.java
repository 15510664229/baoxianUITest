package sun.baoxian.base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;
import org.testng.Reporter;
import sun.baoxian.utils.RandomUtil;
import sun.baoxian.utils.ScreenShotUtil;


public class WebElementBase extends  WebCaseBase {
    private static Logger log = Logger.getLogger(WebElementBase.class);
    public static ArrayList<Exception> noSuchElementExceptions = new ArrayList<Exception>();


    /**
     * 返回操作
     */
    public void clickBackButton() {
        driver.navigate().back();
    }

    /**
     * 文本框输入操作
     *
     * @param locator 元素locator
     * @param value   输入值
     */
    public void type(LocatorBase locator, String value) {
        try {
            WebElement webElement = findElement(locator);
            webElement.clear();//清除输入框原有内容
            webElement.sendKeys(value);
            //log.info("input输入："+locator.getLocalorName()+"["+"By."+locator.getType()+":"+locator.getElement()+"  value:"+value+"]");
            log.info("input输入：" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "  value:" + "*******" + "]");
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.error("找不到元素，input输入失败:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
            e.printStackTrace();
            //throw e;
            //Assertion.flag=false;
        }

    }

    /**
     * 该方法用来针对输入框需要输入新值时使用，主要用在测试用例输入与上一次不一样的值时使用
     *
     * @param locator
     */
    public String sendkeys(LocatorBase locator) {
        String currentName = this.getAttribute(locator, "value");
        String newName = RandomUtil.getRndStrZhByLen(4);
        while (currentName.equals(newName)) {
            newName = RandomUtil.getRndStrZhByLen(4);
        }
        this.type(locator, newName);
        return newName;
    }

    /**
     * 该方法用于随机选择下拉框里和当前选中的值不一样的值
     *
     * @param locator
     * @return
     */
    public String selectRandomOption(LocatorBase locator) {
        Select select = new Select(this.findElement(locator));
        String curName = select.getFirstSelectedOption().getText();
        System.out.println(curName);
        List<WebElement> allOptions = select.getOptions();
        int index = RandomUtil.randomInt(1, allOptions.size() - 1);
        System.out.println(index + "index");
        select.selectByIndex(index);
        String newName = select.getFirstSelectedOption().getText();
        while (curName.equals(newName)) {
            index = RandomUtil.randomInt(1, allOptions.size() - 1);
            select.selectByIndex(index);
            newName = select.getFirstSelectedOption().getText();
        }
        return newName;
    }

    public void type_action(LocatorBase locator, String value) {
        Actions actions = new Actions(driver);
        WebElement weElement = findElement(locator);
        actions.sendKeys(weElement, value).perform();
    }

    /**
     * 普通单击操作
     * driver.findement(By.id("xxx"))
     *
     * @param locator 元素locator
     */
    public void click(LocatorBase locator) {
        try {
            WebElement webElement = findElement(locator);
            webElement.click();
            log.info("click元素：" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]成功！");
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.error("找不到元素，click失败:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * 选择下拉框操作
     *
     * @param locator 元素locator
     * @param text    选择下拉值
     */
    public void selectByText(LocatorBase locator, String text) {
        try {
            WebElement webElement = findElement(locator);
            Select select = new Select(webElement);
            log.info("选择select标签：" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
            try {
                //select.selectByValue(value);
                select.selectByVisibleText(text);
                log.info("选择下拉列表项：" + text);

            } catch (NoSuchElementException notByValue) {
                // TODO: handle exception
                log.info("找不到下拉值，选择下拉列表项失败 " + text);
                throw notByValue;
            }
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.error("找不到元素，选择select标签失败:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
            throw e;
        }
    }

    /**
     * 选择下拉框操作
     *
     * @param locator 元素locator
     * @param value   选择下拉value
     */
    public void selectByValue(LocatorBase locator, String value) {
        Select select;
//        try {
//            WebElement webElement = findElement( locator );
//            select = new Select( webElement );
//            log.info( "选择select标签:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]" );
//        } catch (NoSuchElementException e) {
//            // TODO: handle exception
//            log.error( "找不到元素，选择select标签失败:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]" );
//            throw e;
//        }
        try {
            WebElement webElement = findElement(locator);
            select = new Select(webElement);
            select.selectByValue(value);
            log.info("选择下拉列表项：" + value);

        } catch (NoSuchElementException notByValue) {
            // TODO: handle exception
            log.info("找不到下拉值，选择下拉列表项失败 " + value);
            throw notByValue;
        }
    }

    /**
     * 通过下拉列表的index选择元素
     *
     * @param locator
     * @param index
     */
    public void selectByIndex(LocatorBase locator, int index) {
        // TODO 自动生成的方法存根
        Select select;
//        try {
//            WebElement webElement = findElement( locator );
//            select = new Select( webElement );
//            log.info( "选择select标签:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]" );
//        } catch (NoSuchElementException e) {
//            // TODO: handle exception
//            log.error( "找不到元素，选择select标签失败" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]" );
//            throw e;
//        }
        try {
            //select.selectByValue(value);
            WebElement webElement = findElement(locator);
            select = new Select(webElement);
            select.selectByIndex(index);
            log.info("选择下拉列表项：" + index);

        } catch (NoSuchElementException notByindex) {
            // TODO: handle exception
            log.info("找不到下拉值，选择下拉列表项失败 " + index);
            throw notByindex;
        }
    }

    /**
     * 获取下拉列表的value属性值,这两个方法有问题不要用
     *
     * @param selectLocator 下拉列表 select标签定位信息
     * @return 返回String
     */
    public String getSelectOptionValue(LocatorBase selectLocator, String optinText) {
        WebElement webElement = driver.findElement(By.xpath(selectLocator.getElement() + "//option[text()='"
                + optinText
                + "']"));
        return webElement.getAttribute("value");
    }

    public String getSelectOptionText(LocatorBase selectLocator, String optinValue) {
        WebElement webElement = driver.findElement(By.xpath(selectLocator.getElement() + "//option[text()='"
                + optinValue
                + "']"));
        return webElement.getText();
    }

    /**
     * 点击确认按钮,js弹框的确定或者确认
     */
    public void alertConfirm() {
        Alert alert = driver.switchTo().alert();
        try {
            alert.accept();
            log.info("点击确认按钮");
        } catch (NoAlertPresentException notFindAlert) {
            // TODO: handle exception
            //throw notFindAlert;
            log.error("找不到确认按钮");
            throw notFindAlert;
        }
    }

    /**
     * 点击取消按钮
     */
    public void alertDismiss() {
        Alert alert = driver.switchTo().alert();
        try {
            alert.dismiss();
            log.info("点击取消按钮");
        } catch (NoAlertPresentException notFindAlert) {
            // TODO: handle exception
            //throw notFindAlert;
            log.error("找不到取消按钮");
            throw notFindAlert;
        }
    }

    /**
     * 获取对话框文本
     *
     * @return 返回String
     */
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        try {
            String text = alert.getText().toString();
            log.info("获取对话框文本：" + text);
            return text;
        } catch (NoAlertPresentException notFindAlert) {
            // TODO: handle exception
            log.error("找不到对话框");
            //return "找不到对话框";
            throw notFindAlert;

        }
    }

    /**
     * 双击操作
     *
     * @param locator 元素locator
     */
    public void click_double(LocatorBase locator) {
        WebElement webElement = findElement(locator);
        Actions actions = new Actions(driver);
        actions.doubleClick(webElement).perform();
        //actions.perform();

    }

    /**
     * 清除文本框内容
     *
     * @param locator 元素locator
     */
    public void clear(LocatorBase locator) {
        try {
            WebElement webElement = findElement(locator);
            webElement.clear();
            log.info("清除input值:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.error("清除input值失败:" + locator.getLocalorName() + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");

        }

    }

    /**
     * 切换frame/iframe框架
     *
     * @param locator 元素locator
     */
    public void switchToFrame(LocatorBase locator) {
        WebElement frameElement = findElement(locator);
        driver.switchTo().frame(frameElement);
    }

    /**
     * @param
     * @return void    返回类型
     * @throws
     * @Title: switchToIndex
     */
    public void switchToFrame(int index) {
        driver.switchTo().frame(index);
    }

    /**
     * 切回默认窗口框架
     */
    public void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
    }

    /**
     * 多窗口切换
     *
     * @param i 第几个窗口
     */
    public void switchToWindow(int i) {
        String[] handls = new String[driver.getWindowHandles().size()];
        driver.getWindowHandles().toArray(handls);
        driver.switchTo().window(handls[i]);
    }

    /**
     * 隐式等待
     *
     * @param t 最大等待时间，秒为单位
     **/
    public void Waitformax(int t) {
        driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
    }


    /**
     * 获取元素文本
     *
     * @param locator 元素locator
     */
    public String getText(LocatorBase locator) {
        WebElement webElement = findElement(locator);
        String text = webElement.getText();
        return text;

    }

    /**
     * 获取元素某属性的值
     *
     * @param locator       元素locator
     * @param attributeName
     * @return 返回String
     */
    public String getAttribute(LocatorBase locator, String attributeName) {
        WebElement webElement = findElement(locator);
        String value = webElement.getAttribute(attributeName);
        return value;
    }

    /**
     * 获取当前url
     *
     * @return
     */
    public String getUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }


    /**
     * 获取当前网页标题
     *
     * @return 返回String
     */
    public String getTitle() {
        String title = driver.getTitle();
        return title;
    }

    /**
     * 截屏方法
     *
     * @param FileDriver 文件保存路径
     * @param Filename   文件名
     * @throws Exception 抛出Exception异常
     */
    public void Snapshot(String FileDriver, String Filename) throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(FileDriver + Filename));
            System.out.println("错误截图：" + FileDriver + Filename);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            throw e;
        }
    }

    public void SnapshotForElement(String FileDriver, String Filename, LocatorBase locator) throws Exception {

        File scrFile = findElement(locator).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrFile, new File(FileDriver + Filename));
            System.out.println("错误截图：" + FileDriver + Filename);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 死等，程序休眠暂停
     *
     * @param time 以秒为单位
     */
    public void sleep(long time) {
        try {
            log.info("等待" + time + "秒");
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    /**
     * 显式等待 判断页面是否完全加载完成
     *
     * @param time 已秒为单位
     */
    public void pagefoload(long time) {
        ExpectedCondition<Boolean> pageLoad = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, time * 1000);
        wait.until(pageLoad);
    }

    public void executeJS(String js) {
        ((JavascriptExecutor) driver).executeScript(js);
        System.out.println("执行JS脚本：" + js);

    }

    /**
     * 判断一组元素是否存在
     *
     * @param locator 一组元素定位信息
     * @param timeOut 超时时间 秒
     * @return 返回boolean true存在，false不存在
     * @throws InterruptedException
     */
    public boolean isElementsPresent(LocatorBase locator, int timeOut) throws InterruptedException {
        log.info("等待" + timeOut + "秒判断元素：" + locator.getElement() + "是否存在");
        boolean isPresent = false;
        Thread.sleep(timeOut * 1000);
        List<WebElement> we = findElements(locator);
        if (we.size() != 0) {
            isPresent = true;
        }
        log.info("判断结果为：" + isPresent);
        return isPresent;
    }

    /**
     * 执行cmd命令
     */
    public void executeCmd(String cmd) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("cmd /c start " + cmd);
//        runtime.exit( 0 );
    }

    /**
     * 判断元素是否显示
     *
     * @param locator 元素定位信息
     * @return 返回boolean true显示，false隐藏
     */
    public boolean isElementDisplayed(LocatorBase locator) {
        WebElementBase action = new WebElementBase();
        WebElement webElement = action.findElement(locator);
        webElement.isEnabled();
        log.info("元素显示状态为：" + webElement.isDisplayed());
        return webElement.isDisplayed();
    }

    /**
     * 等待30秒让元素可见
     *
     * @param locator
     */
    public void DisplayElement(LocatorBase locator) {
        WebElementBase action = new WebElementBase();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 50);
        webDriverWait.until(ExpectedConditions.visibilityOf(action.findElement(locator))).isDisplayed();

    }

    /**
     * 查找一组元素
     *
     * @param locator 元素定位信息
     * @return
     */
    public List<WebElement> findElements(final LocatorBase locator) {

        /**
         * 查找某个元素等待几秒
         */
        //Waitformax(Integer.valueOf(locator.getWaitSec()));
        List<WebElement> webElements = null;
        try {
            webElements = (new WebDriverWait(driver, 20)).until(
                    new ExpectedCondition<List<WebElement>>() {

                        @Override
                        public List<WebElement> apply(WebDriver driver) {
                            // TODO 自动生成的方法存根
                            List<WebElement> element = null;
                            element = getElements(locator);
                            return element;
                        }
                    });
            return webElements;
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.info("无法定位页面元素");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,找不到元素：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("找不到所需页面元素[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            return webElements;
        } catch (TimeoutException e) {
            // TODO: handle exception
            log.info("查找页面元素超时");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,超时找不到元素：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("超时找不到所需页面元素[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            //Assertion.assertInfolList.add(arg0)
            return webElements;
        } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            log.info("查找页面元素超时");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,页面元素不可视：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("超时页面元素不可视[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            //Assertion.assertInfolList.add(arg0)
            return webElements;
        }

    }



    public WebElement findElement(final LocatorBase locator) {
        /**
         * 查找某个元素等待几秒
         */
        //Waitformax(Integer.valueOf(locator.getWaitSec()));
        System.out.println(locator.getTimout());
        WebElement webElement = null;
        try {
            webElement = (new WebDriverWait(driver, locator.getTimout())).until(
                    new ExpectedCondition<WebElement>() {

                        @Override
                        public WebElement apply(WebDriver driver) {
                            // TODO 自动生成的方法存根
                            WebElement element = null;
                            element = getElement(locator);
                            return element;
                        }
                    });
            return webElement;
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            log.info("无法定位页面元素");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,找不到元素：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("找不到所需页面元素[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            return webElement;
        } catch (TimeoutException e) {
            // TODO: handle exception
            log.info("超时无法定位页面元素");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,超时找不到元素：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("超时找不到所需页面元素[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            return webElement;
        } catch (ElementNotVisibleException e) {
            // TODO: handle exception
            log.info("超时无法定位页面元素");
            e.printStackTrace();
            WebAssertionBase.assertInfolList.add("failed,超时找不到元素：[" + locator.getType() + ":" + locator.getElement() + "等待:" + locator.getWaitSec());
            noSuchElementExceptions.add(e);
            WebAssertionBase.messageList.add("超时页面元素不可视[" + locator.getElement() + "]:failed");
            ScreenShotUtil screenShot = new ScreenShotUtil(driver);
            //设置截图名字
            Date nowDate = new Date();
            screenShot.setscreenName(this.formatDate(nowDate));
            screenShot.takeScreenshot();
            log.info(this.formatDate(nowDate));
            return webElement;
        }
    }

    /**
     * 通过定位信息获取元素
     *
     * @param locator 元素locator
     * @return 返回WebElement
     * @throws NoSuchElementException 找不到元素异常
     */
    public WebElement getElement(LocatorBase locator) {

        //driver.findElement(By.id("xxx"));

        /**
         * locator.getElement(),获取对象库对象定位信息
         */
        log.info("查找元素：" + locator.getLocalorName() + "方式" + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
        WebElement webElement;
        switch (locator.getType()) {
            case xpath:
                webElement = driver.findElement(By.xpath(locator.getElement()));
                break;
            case id:
                webElement = driver.findElement(By.id(locator.getElement()));
                break;
            case cssSelector:
                webElement = driver.findElement(By.cssSelector(locator.getElement()));
                break;
            case name:
                webElement = driver.findElement(By.name(locator.getElement()));
                break;
            case className:
                webElement = driver.findElement(By.className(locator.getElement()));
                break;
            case linkText:
                webElement = driver.findElement(By.linkText(locator.getElement()));
                break;
            case partialLinkText:
                webElement = driver.findElement(By.partialLinkText(locator.getElement()));
                break;
            case tagName:
                webElement = driver.findElement(By.tagName(locator.getElement()));
                break;
            default:
                webElement = driver.findElement(By.xpath(locator.getElement()));
                break;

        }
        return webElement;
    }

    /**
     * 通过定位信息获取一组元素
     *
     * @param locator 元素locator
     * @return 返回WebElement
     * @throws NoSuchElementException 找不到元素异常
     */
    public List<WebElement> getElements(LocatorBase locator) {
        /**
         * locator.getElement(),获取对象库对象定位信息
         */
        //locator=getLocator(locatorMap.get(key));
        log.info("查找一组元素：" + locator.getLocalorName() + " 方式" + "[" + "By." + locator.getType() + ":" + locator.getElement() + "]");
        List<WebElement> webElements;
        switch (locator.getType()) {
            case xpath:
                webElements = driver.findElements(By.xpath(locator.getElement()));
                /**
                 * 出现找不到元素的时候，记录日志文件
                 */
                break;
            case id:
                webElements = driver.findElements(By.id(locator.getElement()));
                break;
            case cssSelector:
                webElements = driver.findElements(By.cssSelector(locator.getElement()));
                break;
            case name:
                webElements = driver.findElements(By.name(locator.getElement()));
                break;
            case className:
                webElements = driver.findElements(By.className(locator.getElement()));
                break;
            case linkText:
                webElements = driver.findElements(By.linkText(locator.getElement()));
                break;
            case partialLinkText:
                webElements = driver.findElements(By.partialLinkText(locator.getElement()));
                break;
            case tagName:
                webElements = driver.findElements(By.partialLinkText(locator.getElement()));
                break;
            default:
                webElements = driver.findElements(By.xpath(locator.getElement()));
                break;

        }
        return webElements;
    }

    private String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HHmmssSSS");
        return formatter.format(date).toString();
    }

    /**
     * 滑动页面直到出现某个元素
     */
    public void FindUitl(LocatorBase locator) {
        WebElementBase action = new WebElementBase();
        if (!isContentAppeared(locator)){
            action.executeJS("window.scrollBy(0,50)");
        }

    }
    public boolean isContentAppeared(LocatorBase locator) {
        boolean status = false;
        try {
            locator.getElement();
            status=true;
        } catch (NoSuchElementException e) {
           status=false;
        }
        return status;
    }
}

