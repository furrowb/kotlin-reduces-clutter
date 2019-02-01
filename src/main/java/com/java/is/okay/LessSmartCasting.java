package com.java.is.okay;

public class LessSmartCasting {
    public static String convertToString(Object object) {
        if(object == null) {
            return "Well, it's null";
        }
        // Need to explicitly cast even though we already verified what it is
        if(object instanceof String) {
            return (String)object;
        } else if(object instanceof Integer) {
            return ((Integer)object).toString();
        } else if(object instanceof Boolean) {
            return ((Boolean)object).toString();
        } else {
            return object.toString();
        }
    }
}
