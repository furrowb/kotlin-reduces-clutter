package com.java.is.okay;

import com.java.is.okay.lambda.FilterLambda;

import java.util.List;

public class JavaLambda<T> {
    private final List<T> theList;

    public JavaLambda(List<T> list) {
        this.theList = list;
    }

    // We can't immediately see what the FilterLambda requires
    public List<T> filter(FilterLambda<T> lambda) {
        return lambda.filterTheList(theList);
    }
}
