package sun.baoxian.actions.yuyuedan;

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class Insure {
    private  String aplName;
    private  String aplCard;
    private String aplMob;
    private String aplCity;
    private  String aplAdr;
    private String aplEmail;
    private String aplJob;
    private String aplPost;
    private String aplBrith;
    private String aplCity1;
    private String bankCode;
    private String bankCard;
    private String bankMob;



    private String bankCity;
    private String aplSex;
    private String aplCardPeriod;
    private String aplWet;
    private String aplHit;



    private String insEml;
    private String insCardPeriod;
    private  String insSex;
    private String insBrith;
    private String insName;
    private String insCard;
    private String insbankCode;
    private String insbankCard;
    private String insbankMob;
    private String insJob;
    private String insAdr;
    private String insCity;
    private String insMob;
    private  String insPost;
    private String insWet;
    private String insHit;
    private String price1;//试算页面金额
    private String price2;//信息填写页面试算金额

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }
    public String getInsEml() {
        return insEml;
    }

    public void setInsEml(String insEml) {
        this.insEml = insEml;
    }
    public String getAplSex() {
        return aplSex;
    }

    public void setAplSex(String aplSex) {
        this.aplSex = aplSex;
    }

    public String getAplCardPeriod() {
        return aplCardPeriod;
    }

    public void setAplCardPeriod(String aplCardPeriod) {
        this.aplCardPeriod = aplCardPeriod;
    }

    public String getAplWet() {
        return aplWet;
    }

    public void setAplWet(String aplWet) {
        this.aplWet = aplWet;
    }

    public String getAplHit() {
        return aplHit;
    }

    public void setAplHit(String aplHit) {
        this.aplHit = aplHit;
    }

    public String getInsCardPeriod() {
        return insCardPeriod;
    }

    public void setInsCardPeriod(String insCardPeriod) {
        this.insCardPeriod = insCardPeriod;
    }

    public String getInsSex() {
        return insSex;
    }

    public void setInsSex(String insSex) {
        this.insSex = insSex;
    }

    public String getInsbankCode() {
        return insbankCode;
    }

    public void setInsbankCode(String insbankCode) {
        this.insbankCode = insbankCode;
    }

    public String getInsbankCard() {
        return insbankCard;
    }

    public void setInsbankCard(String insbankCard) {
        this.insbankCard = insbankCard;
    }

    public String getInsbankMob() {
        return insbankMob;
    }

    public void setInsbankMob(String insbankMob) {
        this.insbankMob = insbankMob;
    }

    public String getInsJob() {
        return insJob;
    }

    public void setInsJob(String insJob) {
        this.insJob = insJob;
    }

    public String getInsAdr() {
        return insAdr;
    }

    public void setInsAdr(String insAdr) {
        this.insAdr = insAdr;
    }

    public String getInsCity() {
        return insCity;
    }

    public void setInsCity(String insCity) {
        this.insCity = insCity;
    }

    public String getInsMob() {
        return insMob;
    }

    public void setInsMob(String insMob) {
        this.insMob = insMob;
    }

    public String getInsPost() {
        return insPost;
    }

    public void setInsPost(String insPost) {
        this.insPost = insPost;
    }


    public void setAplBrith(String aplBrith) {
        this.aplBrith = aplBrith;
    }

    public void setAplCity1(String aplCity1) {
        this.aplCity1 = aplCity1;
    }

    public void setInsBrith(String insBrith) {
        this.insBrith = insBrith;
    }

    public String getAplBrith() {
        return aplBrith;
    }

    public String getAplCity1() {
        return aplCity1;
    }

    public String getInsBrith() {
        return insBrith;
    }
    public Insure() {
    }

    public String getAplName() {
        return aplName;
    }

    public String getAplCard() {
        return aplCard;
    }

    public String getAplMob() {
        return aplMob;
    }

    public String getAplCity() {
        return aplCity;
    }

    public String getAplAdr() {
        return aplAdr;
    }

    public String getAplEmail() {
        return aplEmail;
    }

    public String getAplJob() {
        return aplJob;
    }

    public String getAplPost() {
        return aplPost;
    }

    public String getInsName() {
        return insName;
    }

    public String getInsCard() {
        return insCard;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBankCard() {
        return bankCard;
    }

    public String getBankMob() {
        return bankMob;
    }

    public String getInsWet() {
        return insWet;
    }

    public String getInsHit() {
        return insHit;
    }

    public String getPrice1() {
        return price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setAplName(String aplName) {
        this.aplName = aplName;
    }

    public void setAplCard(String aplCard) {
        this.aplCard = aplCard;
    }

    public void setAplMob(String aplMob) {
        this.aplMob = aplMob;
    }

    public void setAplCity(String aplCity) {
        this.aplCity = aplCity;
    }

    public void setAplAdr(String aplAdr) {
        this.aplAdr = aplAdr;
    }

    public void setAplEmail(String aplEmail) {
        this.aplEmail = aplEmail;
    }

    public void setAplJob(String aplJob) {
        this.aplJob = aplJob;
    }

    public void setAplPost(String aplPost) {
        this.aplPost = aplPost;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public void setInsCard(String insCard) {
        this.insCard = insCard;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public void setBankMob(String bankMob) {
        this.bankMob = bankMob;
    }

    public void setInsWet(String insWet) {
        this.insWet = insWet;
    }

    public void setInsHit(String insHit) {
        this.insHit = insHit;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    @Override
    public String toString() {
        return "Insure{" +
                "aplName='" + aplName + '\'' +
                ", aplCard='" + aplCard + '\'' +
                ", aplMob='" + aplMob + '\'' +
                ", aplCity='" + aplCity + '\'' +
                ", aplAdr='" + aplAdr + '\'' +
                ", aplEmail='" + aplEmail + '\'' +
                ", aplJob='" + aplJob + '\'' +
                ", aplPost='" + aplPost + '\'' +
                ", aplBrith='" + aplBrith + '\'' +
                ", aplCity1='" + aplCity1 + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", bankMob='" + bankMob + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", aplSex='" + aplSex + '\'' +
                ", aplCardPeriod='" + aplCardPeriod + '\'' +
                ", aplWet='" + aplWet + '\'' +
                ", aplHit='" + aplHit + '\'' +
                ", insEml='" + insEml + '\'' +
                ", insCardPeriod='" + insCardPeriod + '\'' +
                ", insSex='" + insSex + '\'' +
                ", insBrith='" + insBrith + '\'' +
                ", insName='" + insName + '\'' +
                ", insCard='" + insCard + '\'' +
                ", insbankCode='" + insbankCode + '\'' +
                ", insbankCard='" + insbankCard + '\'' +
                ", insbankMob='" + insbankMob + '\'' +
                ", insJob='" + insJob + '\'' +
                ", insAdr='" + insAdr + '\'' +
                ", insCity='" + insCity + '\'' +
                ", insMob='" + insMob + '\'' +
                ", insPost='" + insPost + '\'' +
                ", insWet='" + insWet + '\'' +
                ", insHit='" + insHit + '\'' +
                ", price1='" + price1 + '\'' +
                ", price2='" + price2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Insure insure = (Insure) o;

        if (aplName != null ? !aplName.equals(insure.aplName) : insure.aplName != null) return false;
        if (aplCard != null ? !aplCard.equals(insure.aplCard) : insure.aplCard != null) return false;
        if (aplMob != null ? !aplMob.equals(insure.aplMob) : insure.aplMob != null) return false;
        if (aplCity != null ? !aplCity.equals(insure.aplCity) : insure.aplCity != null) return false;
        if (aplAdr != null ? !aplAdr.equals(insure.aplAdr) : insure.aplAdr != null) return false;
        if (aplEmail != null ? !aplEmail.equals(insure.aplEmail) : insure.aplEmail != null) return false;
        if (aplJob != null ? !aplJob.equals(insure.aplJob) : insure.aplJob != null) return false;
        if (aplPost != null ? !aplPost.equals(insure.aplPost) : insure.aplPost != null) return false;
        if (aplBrith != null ? !aplBrith.equals(insure.aplBrith) : insure.aplBrith != null) return false;
        if (aplCity1 != null ? !aplCity1.equals(insure.aplCity1) : insure.aplCity1 != null) return false;
        if (bankCode != null ? !bankCode.equals(insure.bankCode) : insure.bankCode != null) return false;
        if (bankCard != null ? !bankCard.equals(insure.bankCard) : insure.bankCard != null) return false;
        if (bankMob != null ? !bankMob.equals(insure.bankMob) : insure.bankMob != null) return false;
        if (bankCity != null ? !bankCity.equals(insure.bankCity) : insure.bankCity != null) return false;
        if (aplSex != null ? !aplSex.equals(insure.aplSex) : insure.aplSex != null) return false;
        if (aplCardPeriod != null ? !aplCardPeriod.equals(insure.aplCardPeriod) : insure.aplCardPeriod != null)
            return false;
        if (aplWet != null ? !aplWet.equals(insure.aplWet) : insure.aplWet != null) return false;
        if (aplHit != null ? !aplHit.equals(insure.aplHit) : insure.aplHit != null) return false;
        if (insEml != null ? !insEml.equals(insure.insEml) : insure.insEml != null) return false;
        if (insCardPeriod != null ? !insCardPeriod.equals(insure.insCardPeriod) : insure.insCardPeriod != null)
            return false;
        if (insSex != null ? !insSex.equals(insure.insSex) : insure.insSex != null) return false;
        if (insBrith != null ? !insBrith.equals(insure.insBrith) : insure.insBrith != null) return false;
        if (insName != null ? !insName.equals(insure.insName) : insure.insName != null) return false;
        if (insCard != null ? !insCard.equals(insure.insCard) : insure.insCard != null) return false;
        if (insbankCode != null ? !insbankCode.equals(insure.insbankCode) : insure.insbankCode != null) return false;
        if (insbankCard != null ? !insbankCard.equals(insure.insbankCard) : insure.insbankCard != null) return false;
        if (insbankMob != null ? !insbankMob.equals(insure.insbankMob) : insure.insbankMob != null) return false;
        if (insJob != null ? !insJob.equals(insure.insJob) : insure.insJob != null) return false;
        if (insAdr != null ? !insAdr.equals(insure.insAdr) : insure.insAdr != null) return false;
        if (insCity != null ? !insCity.equals(insure.insCity) : insure.insCity != null) return false;
        if (insMob != null ? !insMob.equals(insure.insMob) : insure.insMob != null) return false;
        if (insPost != null ? !insPost.equals(insure.insPost) : insure.insPost != null) return false;
        if (insWet != null ? !insWet.equals(insure.insWet) : insure.insWet != null) return false;
        if (insHit != null ? !insHit.equals(insure.insHit) : insure.insHit != null) return false;
        if (price1 != null ? !price1.equals(insure.price1) : insure.price1 != null) return false;
        return price2 != null ? price2.equals(insure.price2) : insure.price2 == null;
    }

    @Override
    public int hashCode() {
        int result = aplName != null ? aplName.hashCode() : 0;
        result = 31 * result + (aplCard != null ? aplCard.hashCode() : 0);
        result = 31 * result + (aplMob != null ? aplMob.hashCode() : 0);
        result = 31 * result + (aplCity != null ? aplCity.hashCode() : 0);
        result = 31 * result + (aplAdr != null ? aplAdr.hashCode() : 0);
        result = 31 * result + (aplEmail != null ? aplEmail.hashCode() : 0);
        result = 31 * result + (aplJob != null ? aplJob.hashCode() : 0);
        result = 31 * result + (aplPost != null ? aplPost.hashCode() : 0);
        result = 31 * result + (aplBrith != null ? aplBrith.hashCode() : 0);
        result = 31 * result + (aplCity1 != null ? aplCity1.hashCode() : 0);
        result = 31 * result + (bankCode != null ? bankCode.hashCode() : 0);
        result = 31 * result + (bankCard != null ? bankCard.hashCode() : 0);
        result = 31 * result + (bankMob != null ? bankMob.hashCode() : 0);
        result = 31 * result + (bankCity != null ? bankCity.hashCode() : 0);
        result = 31 * result + (aplSex != null ? aplSex.hashCode() : 0);
        result = 31 * result + (aplCardPeriod != null ? aplCardPeriod.hashCode() : 0);
        result = 31 * result + (aplWet != null ? aplWet.hashCode() : 0);
        result = 31 * result + (aplHit != null ? aplHit.hashCode() : 0);
        result = 31 * result + (insEml != null ? insEml.hashCode() : 0);
        result = 31 * result + (insCardPeriod != null ? insCardPeriod.hashCode() : 0);
        result = 31 * result + (insSex != null ? insSex.hashCode() : 0);
        result = 31 * result + (insBrith != null ? insBrith.hashCode() : 0);
        result = 31 * result + (insName != null ? insName.hashCode() : 0);
        result = 31 * result + (insCard != null ? insCard.hashCode() : 0);
        result = 31 * result + (insbankCode != null ? insbankCode.hashCode() : 0);
        result = 31 * result + (insbankCard != null ? insbankCard.hashCode() : 0);
        result = 31 * result + (insbankMob != null ? insbankMob.hashCode() : 0);
        result = 31 * result + (insJob != null ? insJob.hashCode() : 0);
        result = 31 * result + (insAdr != null ? insAdr.hashCode() : 0);
        result = 31 * result + (insCity != null ? insCity.hashCode() : 0);
        result = 31 * result + (insMob != null ? insMob.hashCode() : 0);
        result = 31 * result + (insPost != null ? insPost.hashCode() : 0);
        result = 31 * result + (insWet != null ? insWet.hashCode() : 0);
        result = 31 * result + (insHit != null ? insHit.hashCode() : 0);
        result = 31 * result + (price1 != null ? price1.hashCode() : 0);
        result = 31 * result + (price2 != null ? price2.hashCode() : 0);
        return result;
    }

    public  Insure checkNull(Insure obj) {
        Class<? extends Object> clazz = obj.getClass();
        // 获取实体类的所有属性，返回Field数组
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // 可访问私有变量
            field.setAccessible(true);
            // 获取属性类型
            String type = field.getGenericType().toString();
            // 如果type是类类型，则前面包含"class "，后面跟类名
            if ("class java.lang.String".equals(type)) {
                // 将属性的首字母大写
                String methodName = field.getName().replaceFirst(field.getName().substring(0, 1),
                        field.getName().substring(0, 1).toUpperCase());
                System.out.println(methodName);
                try {
                    Method methodGet = clazz.getMethod("get" + methodName);
                    // 调用getter方法获取属性值
                    String str = (String) methodGet.invoke(obj);
                    if (StringUtils.isBlank(str)) {
                        // Method methodSet = clazz.getMethod("set" +
                        // methodName, new Class[] { String.class });
                        // methodSet.invoke(o, new Object[] { "" });
                        System.out.println(field.getType()); // class java.lang.String
                        // 如果为null的String类型的属性则重新复制为空字符串
                        field.set(obj, field.getType().getConstructor(field.getType()).newInstance(""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return obj;
    }

}
