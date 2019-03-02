package com.java.is.okay.functional;

import java.util.List;

// Need to create functional interface to create lambda
public interface FilterLambda<T> {

    // Takes a List of T, returns List of T
    List<T> filterTheList(List<T> list);
}
