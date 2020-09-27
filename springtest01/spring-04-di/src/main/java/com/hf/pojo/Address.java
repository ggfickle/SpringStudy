package com.hf.pojo;

/**
 * @program: springtest01
 * @description: address
 * @author: xiehongfei
 * @create: 2020-09-27 21:24
 **/
public class Address {

    private String localtionName;

    private String localtionId;

    public String getLocaltionName() {
        return localtionName;
    }

    public void setLocaltionName(String localtionName) {
        this.localtionName = localtionName;
    }

    public String getLocaltionId() {
        return localtionId;
    }

    public void setLocaltionId(String localtionId) {
        this.localtionId = localtionId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "localtionName='" + localtionName + '\'' +
                ", localtionId='" + localtionId + '\'' +
                '}';
    }
}
