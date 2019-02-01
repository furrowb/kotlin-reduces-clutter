package com.java.is.okay;

public class LackOfNullSafety {
    private String maybeNull;

    // No way to know at compile time if this is null
    public LackOfNullSafety(String mightBeNull) {
        this.maybeNull = mightBeNull;
    }

    // You may get a string or you may get a null.  You'll have to check it explicitly
    public String getMaybeNull() {
        return maybeNull;
    }

    // Have to check for nulls everywhere if there's a slight possibility of it being null
    public String uglyNullChecking() {
        if(maybeNull == null) {
            return "Well, it's null";
        }

        return maybeNull;
    }
}
