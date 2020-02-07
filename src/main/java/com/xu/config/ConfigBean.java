package com.xu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ConfigBean {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private String myAge;

    @Value("${myConfig.myObject.mySex}")
    private String mySex;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }

    public String getMySex() {
        return mySex;
    }

    public void setMySex(String mySex) {
        this.mySex = mySex;
    }
}
