package dev.alvo.html;

import java.util.Objects;

public final class Attribute {

  private final String name;
  private final String value;

  public Attribute(String name) {
    this.name = name;
    this.value = null;
  }

  public Attribute(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return this.name;
  }

  public String getValue() {
    return this.value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.name, attribute.name) && Objects.equals(this.value, attribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.value);
  }
}
