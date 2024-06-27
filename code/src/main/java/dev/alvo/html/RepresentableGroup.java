package dev.alvo.html;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class RepresentableGroup implements TagContentApplicable {

  private final List<TagContentApplicable> representables;

  RepresentableGroup(List<TagContentApplicable> representables) {
    this.representables = representables;
  }

  public RepresentableGroup() {
    this.representables = Collections.emptyList();
  }

  @SafeVarargs
  public RepresentableGroup(List<TagContentApplicable>... representables) {
    this.representables = Arrays.stream(representables)
      .reduce((a, b) -> Stream.concat(a.stream(), b.stream()).collect(Collectors.toList()))
      .orElse(Collections.emptyList());
  }

  @Override
  public List<TagContentApplicable> getContent() {
    return this.representables;
  }
}
