package com.java.is.okay;

public class JavaParameters {
    private String firstSetting;
    private String secondSetting;
    private String thirdSetting = "Default"; // Set a default value but unwieldy to use

    // No way to have a default parameter unless we overload method
    public void setParameters(String firstSetting, String secondSetting, String thirdSetting) {
        this.firstSetting = firstSetting;
        this.secondSetting = secondSetting;
        this.thirdSetting = thirdSetting;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters firstSetting(String value) {
        this.firstSetting = value;
        return this;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters secondSetting(String value) {
        this.secondSetting = value;
        return this;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters thirdSetting(String value) {
        this.thirdSetting = value;
        return this;
    }

    public String getFirstSetting() {
        return firstSetting;
    }

    public String getSecondSetting() {
        return secondSetting;
    }

    public String getThirdSetting() {
        return thirdSetting;
    }
}
