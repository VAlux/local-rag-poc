package dev.alvo.html.interpreter;

import dev.alvo.html.*;

import java.util.List;
import java.util.stream.Collectors;

public class PrettyHtmlInterpreter {

  private final String indentContent;
  private final int indentSize;

  public PrettyHtmlInterpreter() {
    this(" ", 2);
  }

  public PrettyHtmlInterpreter(String indentCharacter, int indentSize) {
    this.indentContent = indentCharacter;
    this.indentSize = indentSize;
  }

  public String interpret(final TagContentApplicable root) {
    return this.interpretElement(root, 0);
  }

  private String interpret(final List<TagContentApplicable> root, int indent) {
    return root.stream()
      .map(content -> interpretElement(content, indent))
      .collect(Collectors.joining("\n"));
  }

  private String interpretElement(final TagContentApplicable content, final int indent) {
    final String spaces = representIndent(indent);
    if (content instanceof RepresentableGroup) {
      return interpret(content.getContent(), indent);
    } else if (content instanceof Tag) {
      final Tag tag = (Tag) content;
      final String begin = spaces + createStartingTag(tag);
      final String contents = interpret(tag.getContent(), indent + 1);
      final String end = spaces + String.format("</%s>", tag.getName());

      return String.join("\n", begin, contents, end);
    } else if (content instanceof Content) {
      return spaces + ((Content) content).getData();
    }

    throw new IllegalArgumentException("Unknown content type: " + content.getClass().getSimpleName());
  }

  private String createStartingTag(final Tag tag) {
    if (tag.getAttributes().isEmpty()) {
      return String.format("<%s>", tag.getName());
    } else {
      final String attributes = tag.getAttributes().stream()
        .map(this::representAttribute)
        .collect(Collectors.joining(" "));

      return String.format("<%s %s>", tag.getName(), attributes);
    }
  }

  private String representIndent(final int indent) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < indent * this.indentSize; i++) {
      stringBuilder.append(this.indentContent);
    }

    return stringBuilder.toString();
  }

  private String representAttribute(final Attribute attribute) {
    if (attribute.getValue() != null) {
      return String.format("%s=\"%s\"", attribute.getName(), attribute.getValue());
    }

    return attribute.getName();
  }
}
