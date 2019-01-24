package com.java.is.okay;

import java.util.List;
import java.util.Map;

public class GetAndSet {
    private List<String> myList;

    private final Map<Integer, String> myMap;

    public GetAndSet(List<String> myList, Map<Integer, String> myMap) {
        this.myList = myList;
        this.myMap = myMap;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Map<Integer, String> getMyMap() {
        return myMap;
    }
}
