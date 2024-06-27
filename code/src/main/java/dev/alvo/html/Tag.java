package dev.alvo.html;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Tag implements TagContentApplicable {

  private final String name;
  private final RepresentableGroup content;
  private final Set<Attribute> attributes;
  private final Boolean autoCloseable;

  protected Tag(String name) {
    this.name = name;
    this.content = new RepresentableGroup();
    this.attributes = Collections.emptySet();
    this.autoCloseable = false;
  }

  protected Tag(String name, List<TagContentApplicable> content) {
    this.name = name;
    this.content = new RepresentableGroup(content);
    this.attributes = Collections.emptySet();
    this.autoCloseable = false;
  }

  public Tag(String name, List<TagContentApplicable> content, Set<Attribute> attributes) {
    this.name = name;
    this.content = new RepresentableGroup(content);
    this.attributes = attributes;
    this.autoCloseable = false;
  }

  public String getName() {
    return this.name;
  }

  public Set<Attribute> getAttributes() {
    return this.attributes;
  }

  public Boolean getAutoCloseable() {
    return this.autoCloseable;
  }

  @Override
  public List<TagContentApplicable> getContent() {
    return this.content.getContent();
  }
}
