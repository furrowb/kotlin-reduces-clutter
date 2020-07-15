package com.java.is.okay;

public class JavaParameters {
    private String first;
    private String second;
    private String third = "Default"; // Set a default value but unwieldy to use

    // No way to have a default parameter unless we overload method
    public void setParameters(String firstSetting, String secondSetting, String thirdSetting) {
        this.first = firstSetting;
        this.second = secondSetting;
        this.third = thirdSetting;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters firstSetting(String value) {
        this.first = value;
        return this;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters secondSetting(String value) {
        this.second = value;
        return this;
    }

    // Builder function to ease burden of setting up class
    public JavaParameters thirdSetting(String value) {
        this.third = value;
        return this;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }
}
