package com.java.is.okay;

import java.util.List;
import java.util.Map;

public class JavaGetAndSet {
    // Verbosely setup private fields
    private List<String> myList;
    private final Map<Integer, String> myMap;

    // Verbosely create constructor to set our private fields
    public JavaGetAndSet(List<String> myList, Map<Integer, String> myMap) {
        this.myList = myList;
        this.myMap = myMap;
    }

    // Verbosely setup getter
    public List<String> getMyList() {
        return myList;
    }

    // Verbosely setup setter
    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    // Verbosely setup getter
    public Map<Integer, String> getMyMap() {
        return myMap;
    }
}
