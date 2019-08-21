package com.java.is.okay;

public class JavaNoAliases {
    public static class String {
        public java.lang.String theString;

        public java.lang.String getTheString() {
            return theString;
        }

        public void setTheString(java.lang.String theString) {
            this.theString = theString;
        }
    }

    public static class Klass<T> {
        public T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
