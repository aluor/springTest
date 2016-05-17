package it.academy;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class NullValueBean {
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "NullValueBean{" +
        "value='" + value + '\'' +
        '}';
  }
}
