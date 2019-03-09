package com.java.is.okay;

public class JavaString {
  private final String item1;
  private final String item2;

  public JavaString(String item1, String item2) {
    this.item1 = item1;
    this.item2 = item2;
 }

  public String getCombinedStringViaStringBuilder() {
     return new StringBuilder()
      .append(item1)
      .append(" ")
      .append(item2)
      .toString();
  }

  public String getCombinedStringViaConcatenation() {
    return item1 + " " + item2;
  }

  public String blockOfText() {
      return "Lorem ipsum dolor sit amet, consetetur sadipscing elitr," +
          "\n" +
          "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna" +
          "\n" +
          "aliquyam erat, sed diam voluptua. At vero eos et accusam et justo";
  }
}
