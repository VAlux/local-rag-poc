package dev.alvo.html;

import java.util.Collections;
import java.util.List;

public final class Content implements TagContentApplicable {

  private final String data;

  Content(String data) {
    this.data = data;
  }

  public String getData() {
    return this.data;
  }

  @Override
  public List<TagContentApplicable> getContent() {
    return Collections.singletonList(this);
  }
}
