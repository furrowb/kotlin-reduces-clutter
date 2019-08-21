package com.java.is.okay.lambda;

import java.util.List;

// Need to create lambda interface to create lambda
@FunctionalInterface
public interface FilterLambda<T> {

    // Takes a List of T, returns List of T
    List<T> filterTheList(List<T> list);
}
