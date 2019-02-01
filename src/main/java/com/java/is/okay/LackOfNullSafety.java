package com.java.is.okay;

public class LackOfNullSafety {
    private String maybeNull;

    public LackOfNullSafety(String mightBeNull) {
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
