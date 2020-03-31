package sun.baoxian.base;


import org.openqa.selenium.WebElement;

import java.util.List;


public class LocatorBase {
    private String value;
    private int timout;
    private String locatorName;
    private ByType type;

    /**
     * create a enum variable for By
     *
     */
    public enum ByType {
        xpath, id, linkText, name, className, cssSelector, partialLinkText, tagName
    }

    public LocatorBase() {
    }

    /**
     * defaut Locator ,use Xpath
     *
     * @param element
     */
    public LocatorBase(String element) {
        this.value = element;
        this.timout = 3;
        this.type = ByType.xpath;
    }
    public LocatorBase(List<WebElement> list,int k) {
        this.value=list.get(k).toString();
        this.locatorName = locatorName;
        int size=list.size();

    }

    public LocatorBase(String element, int waitSec) {
        this.timout = waitSec;
        this.value = element;
        this.type = ByType.xpath;
    }

    public LocatorBase(String element, int waitSec, ByType byType) {
        this.timout = waitSec;
        this.value = element;
        this.type = byType;
    }

    public LocatorBase(String element, int waitSec, ByType byType, String locatorName) {
        this.timout = waitSec;
        this.value = element;
        this.type = byType;
        this.locatorName = locatorName;
    }
    public LocatorBase(List<WebElement> list, int waitSec, ByType byType, String locatorName) {
        this.timout = waitSec;
        this.type = byType;
        this.locatorName = locatorName;
        int size=list.size();

    }

    public String getElement() {
        return value;
    }

    public int getWaitSec() {
        return timout;
    }

    public ByType getType() {
        return type;
    }

    public void setType(ByType byType) {
        this.type = byType;
    }

    public String getLocalorName() {
        return locatorName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTimout() {
        return timout;
    }

    public void setTimout(int timout) {
        this.timout = timout;
    }

    public String getLocatorName() {
        return locatorName;
    }

    public void setLocatorName(String locatorName) {
        this.locatorName = locatorName;
    }
}
