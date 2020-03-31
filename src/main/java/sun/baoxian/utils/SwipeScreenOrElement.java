package sun.baoxian.utils;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SwipeScreenOrElement {
    private static Logger log = Logger.getLogger(SwipeScreenOrElement.class);
    private WebDriver driver;
    private int appWidth;
    private int appHeight;
    private  WebElement element;
    /**
     * 构造方法，对三个变量进行初始化
     * @param driver
     */
    public SwipeScreenOrElement(WebDriver driver,WebElement element){
        this.driver=driver;
        this.appWidth=driver.manage().window().getSize().width;
        this.appHeight=driver.manage().window().getSize().height;
        this.element=element;
    }
    /**
     * 向左滑动
     * @param duration 滑动时间，单位是毫秒
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    private void swipeToLeft(int duration) throws Exception {
        int startx=appWidth*9/10;
        int endx=appWidth*1/10;
        int y=appHeight*1/2;
        try {
            Duration dur=Duration.ofMillis(duration);
            this.swipe(element,startx,y,endx,y);
        } catch (Exception e) {
            // TODO: handle exception
            log.info("swipeToLeft is failure -> "+e.getMessage());
            throw new Exception("swipeToLeft is failure -> "+e.getMessage());
        }
    }
    /**
     * 向右滑动
     * @param duration 滑动时间，单位毫秒
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
    private void swipeToRight(int duration) throws Exception {

        int startx=appWidth*1/10;
        int endx=appWidth*9/10;
        int y=appHeight*1/2;
        try {
            Duration dur=Duration.ofMillis(duration);
            this.swipe(element,startx,y,endx,y);
        } catch (Exception e) {
            // TODO: handle exception
            log.error("swipeToRight is failure -> "+e.getMessage());
            throw new Exception("swipeToRight is failure -> "+e.getMessage());
        }
    }
    /**
     * 向上滑动
     * @param duration 持续时间，单位毫秒
     * @throws
     */
    @SuppressWarnings("deprecation")
    public void swipeToUp(int duration) throws Exception {
        int starty=appHeight*9/10;
        int endy=appHeight*1/10;
        int x=appWidth*1/2;
        try {
            Duration dur=Duration.ofMillis(duration);
            this.swipe(element,x,starty,x,endy);
        } catch (Exception e) {
            // TODO: handle exception
            log.error("swipeToUp is failure -> "+e.getMessage());
            throw new Exception("swipeToUp is failure -> "+e.getMessage());

        }
    }
    /**
     * 向下滑动
     * @param duration 持续时间，单位毫秒
     * @throws
     */
    @SuppressWarnings("deprecation")
    public void swipeToDown(int duration) throws Exception {
        int starty=appHeight*1/10;
        int endy=appHeight*9/10;
        int x=appWidth*1/2;
        try {
            Duration dur=Duration.ofMillis(duration);
            this.swipe(element,x,starty,x,endy);
        } catch (Exception e) {
            // TODO: handle exception
            log.error("swipeToDown is failure -> "+e.getMessage());
            throw new Exception("swipeToDown is failure -> "+e.getMessage());
        }
    }
    /**
     * 滑动方法，通过参数实现各方向滑动
     * @param direction 方向参数，值为"up"、"down"、"left"、"right"
     * @param duration 滑动时间，单位毫秒
     * @throws
     * @throws
     */
    public void swipe(String direction,int duration) throws Exception {
        String direc=direction.toLowerCase();
        switch(direc){
            case "up":
                this.swipeToUp(duration);
                break;
            case "down":
                this.swipeToDown(duration);
                break;
            case "left":
                this.swipeToLeft(duration);
                break;
            case "right":
                this.swipeToRight(duration);
                break;
            default:
                System.out.println("方向参数错误");
                log.error("direction of swipe,direction must is up or down or left or right");
                throw new Exception("direction of swipe,direction must is up or down or left or right");
        }
    }

    public void swipe(WebElement webElement, int startx, int starty, int endx, int endy){
//        Actions ta=new Actions(driver);
//        ta.release();
//        ta.moveToElement(webElement,startx,starty).clickAndHold().moveByOffset(endx,endy).release().build().perform();
            Actions ta=new Actions(driver);
            ta.release();
            ta.moveToElement(webElement,startx,starty).perform();
        WebDriverWait wait=new WebDriverWait(driver,600);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        ta.moveToElement(webElement).clickAndHold().moveByOffset(endx,endy).release().build().perform();
    }


    /**
     * 基于元素上的滑动
     * @param element
     * @param direction
     * @param offsetfrom
     * @param offsetend
     *
     */
    public void swipeOnElement(WebElement element,String direction,int offsetfrom,int offsetend){
        //获取元素起始点坐标
        Point p=element.getLocation();
        int startx=p.getX();
        int starty=p.getY();

        //获取元素的宽和高
        Dimension dim=element.getSize();
        int width=dim.getWidth();
        int height=dim.getHeight();

        //获取元素的中心点坐标

        int centerx=startx+1/2*width;
        int centery=starty+1/2*height;

        //计算出元素的结束点坐标
        int endx=startx+width;
        int endy=starty+height;
        switch (direction.toLowerCase()) {
            case "up":
                this.swipe(element,centerx, endy-offsetfrom, centerx, starty-offsetend);
                break;
            case "down":
                this.swipe(element,centerx,starty+offsetend , centerx, endy-offsetfrom);
                break;

            default:
                new RuntimeException("方向参数有误");
                break;
        }

    }
}



