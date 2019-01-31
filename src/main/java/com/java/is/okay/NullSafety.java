package com.java.is.okay;

public class NullSafety {
    private String maybeNull;

    public NullSafety(String mightBeNull) {
        this.maybeNull = mightBeNull;
    }

    public String getMaybeNull() {
        return maybeNull;
    }

    public String uglyNullChecking() {
        if(maybeNull == null) {
            return "Well, it's null";
        }

        return maybeNull;
    }
}
