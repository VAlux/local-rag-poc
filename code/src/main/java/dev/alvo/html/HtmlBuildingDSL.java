package dev.alvo.html;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class HtmlBuildingDSL {

  public static Tag html(TagContentApplicable... content) {
    return supplyTag(Tags.HTML, content);
  }

  public static Tag html(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.HTML, attributes, content);
  }

  public static Tag html(Attribute... attributes) {
    return supplyTag(Tags.HTML, attributes);
  }

  public static Tag body(TagContentApplicable... content) {
    return supplyTag(Tags.BODY, content);
  }

  public static Tag body(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BODY, attributes, content);
  }

  public static Tag body(Attribute... attributes) {
    return supplyTag(Tags.BODY, attributes);
  }

  public static Tag table(TagContentApplicable... content) {
    return supplyTag(Tags.TABLE, content);
  }

  public static Tag table(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TABLE, attributes, content);
  }

  public static Tag table(Attribute... attributes) {
    return supplyTag(Tags.TABLE, attributes);
  }

  public static Tag column(TagContentApplicable... content) {
    return supplyTag(Tags.TABLE_COLUMN, content);
  }

  public static Tag column(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TABLE_COLUMN, attributes, content);
  }

  public static Tag column(Attribute... attributes) {
    return supplyTag(Tags.TABLE_COLUMN, attributes);
  }

  public static Tag row(TagContentApplicable... content) {
    return supplyTag(Tags.TABLE_ROW, content);
  }

  public static Tag row(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TABLE_ROW, attributes, content);
  }

  public static Tag row(Attribute... attributes) {
    return supplyTag(Tags.TABLE_ROW, attributes);
  }

  public static Tag a(TagContentApplicable... content) {
    return supplyTag(Tags.A, content);
  }

  public static Tag a(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.A, attributes, content);
  }

  public static Tag a(Attribute... attributes) {
    return supplyTag(Tags.A, attributes);
  }

  public static Tag abbr(TagContentApplicable... content) {
    return supplyTag(Tags.ABBR, content);
  }

  public static Tag abbr(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ABBR, attributes, content);
  }

  public static Tag abbr(Attribute... attributes) {
    return supplyTag(Tags.ABBR, attributes);
  }

  public static Tag acronym(TagContentApplicable... content) {
    return supplyTag(Tags.ACRONYM, content);
  }

  public static Tag acronym(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ACRONYM, attributes, content);
  }

  public static Tag acronym(Attribute... attributes) {
    return supplyTag(Tags.ACRONYM, attributes);
  }

  public static Tag address(TagContentApplicable... content) {
    return supplyTag(Tags.ADDRESS, content);
  }

  public static Tag address(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ADDRESS, attributes, content);
  }

  public static Tag address(Attribute... attributes) {
    return supplyTag(Tags.ADDRESS, attributes);
  }

  public static Tag applet(TagContentApplicable... content) {
    return supplyTag(Tags.APPLET, content);
  }

  public static Tag applet(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.APPLET, attributes, content);
  }

  public static Tag applet(Attribute... attributes) {
    return supplyTag(Tags.APPLET, attributes);
  }

  public static Tag area(TagContentApplicable... content) {
    return supplyTag(Tags.AREA, content);
  }

  public static Tag area(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.AREA, attributes, content);
  }

  public static Tag area(Attribute... attributes) {
    return supplyTag(Tags.AREA, attributes);
  }

  public static Tag article(TagContentApplicable... content) {
    return supplyTag(Tags.ARTICLE, content);
  }

  public static Tag article(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ARTICLE, attributes, content);
  }

  public static Tag article(Attribute... attributes) {
    return supplyTag(Tags.ARTICLE, attributes);
  }

  public static Tag aside(TagContentApplicable... content) {
    return supplyTag(Tags.ASIDE, content);
  }

  public static Tag aside(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ASIDE, attributes, content);
  }

  public static Tag aside(Attribute... attributes) {
    return supplyTag(Tags.ASIDE, attributes);
  }

  public static Tag audio(TagContentApplicable... content) {
    return supplyTag(Tags.AUDIO, content);
  }

  public static Tag audio(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.AUDIO, attributes, content);
  }

  public static Tag audio(Attribute... attributes) {
    return supplyTag(Tags.AUDIO, attributes);
  }

  public static Tag b(TagContentApplicable... content) {
    return supplyTag(Tags.B, content);
  }

  public static Tag b(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.B, attributes, content);
  }

  public static Tag b(Attribute... attributes) {
    return supplyTag(Tags.B, attributes);
  }

  public static Tag base(TagContentApplicable... content) {
    return supplyTag(Tags.BASE, content);
  }

  public static Tag base(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BASE, attributes, content);
  }

  public static Tag base(Attribute... attributes) {
    return supplyTag(Tags.BASE, attributes);
  }

  public static Tag basefont(TagContentApplicable... content) {
    return supplyTag(Tags.BASEFONT, content);
  }

  public static Tag basefont(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BASEFONT, attributes, content);
  }

  public static Tag basefont(Attribute... attributes) {
    return supplyTag(Tags.BASEFONT, attributes);
  }

  public static Tag bb(TagContentApplicable... content) {
    return supplyTag(Tags.BB, content);
  }

  public static Tag bb(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BB, attributes, content);
  }

  public static Tag bb(Attribute... attributes) {
    return supplyTag(Tags.BB, attributes);
  }

  public static Tag bdo(TagContentApplicable... content) {
    return supplyTag(Tags.BDO, content);
  }

  public static Tag bdo(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BDO, attributes, content);
  }

  public static Tag bdo(Attribute... attributes) {
    return supplyTag(Tags.BDO, attributes);
  }

  public static Tag big(TagContentApplicable... content) {
    return supplyTag(Tags.BIG, content);
  }

  public static Tag big(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BIG, attributes, content);
  }

  public static Tag big(Attribute... attributes) {
    return supplyTag(Tags.BIG, attributes);
  }

  public static Tag blockquote(TagContentApplicable... content) {
    return supplyTag(Tags.BLOCKQUOTE, content);
  }

  public static Tag blockquote(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BLOCKQUOTE, attributes, content);
  }

  public static Tag blockquote(Attribute... attributes) {
    return supplyTag(Tags.BLOCKQUOTE, attributes);
  }

  public static Tag br(TagContentApplicable... content) {
    return supplyTag(Tags.BR, content);
  }

  public static Tag br(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BR, attributes, content);
  }

  public static Tag br(Attribute... attributes) {
    return supplyTag(Tags.BR, attributes);
  }

  public static Tag button(TagContentApplicable... content) {
    return supplyTag(Tags.BUTTON, content);
  }

  public static Tag button(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.BUTTON, attributes, content);
  }

  public static Tag button(Attribute... attributes) {
    return supplyTag(Tags.BUTTON, attributes);
  }

  public static Tag canvas(TagContentApplicable... content) {
    return supplyTag(Tags.CANVAS, content);
  }

  public static Tag canvas(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.CANVAS, attributes, content);
  }

  public static Tag canvas(Attribute... attributes) {
    return supplyTag(Tags.CANVAS, attributes);
  }

  public static Tag caption(TagContentApplicable... content) {
    return supplyTag(Tags.CAPTION, content);
  }

  public static Tag caption(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.CAPTION, attributes, content);
  }

  public static Tag caption(Attribute... attributes) {
    return supplyTag(Tags.CAPTION, attributes);
  }

  public static Tag center(TagContentApplicable... content) {
    return supplyTag(Tags.CENTER, content);
  }

  public static Tag center(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.CENTER, attributes, content);
  }

  public static Tag center(Attribute... attributes) {
    return supplyTag(Tags.CENTER, attributes);
  }

  public static Tag cite(TagContentApplicable... content) {
    return supplyTag(Tags.CITE, content);
  }

  public static Tag cite(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.CITE, attributes, content);
  }

  public static Tag cite(Attribute... attributes) {
    return supplyTag(Tags.CITE, attributes);
  }

  public static Tag code(TagContentApplicable... content) {
    return supplyTag(Tags.CODE, content);
  }

  public static Tag code(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.CODE, attributes, content);
  }

  public static Tag code(Attribute... attributes) {
    return supplyTag(Tags.CODE, attributes);
  }

  public static Tag col(TagContentApplicable... content) {
    return supplyTag(Tags.COL, content);
  }

  public static Tag col(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.COL, attributes, content);
  }

  public static Tag col(Attribute... attributes) {
    return supplyTag(Tags.COL, attributes);
  }

  public static Tag colgroup(TagContentApplicable... content) {
    return supplyTag(Tags.COLGROUP, content);
  }

  public static Tag colgroup(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.COLGROUP, attributes, content);
  }

  public static Tag colgroup(Attribute... attributes) {
    return supplyTag(Tags.COLGROUP, attributes);
  }

  public static Tag command(TagContentApplicable... content) {
    return supplyTag(Tags.COMMAND, content);
  }

  public static Tag command(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.COMMAND, attributes, content);
  }

  public static Tag command(Attribute... attributes) {
    return supplyTag(Tags.COMMAND, attributes);
  }

  public static Tag datagrid(TagContentApplicable... content) {
    return supplyTag(Tags.DATAGRID, content);
  }

  public static Tag datagrid(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DATAGRID, attributes, content);
  }

  public static Tag datagrid(Attribute... attributes) {
    return supplyTag(Tags.DATAGRID, attributes);
  }

  public static Tag datalist(TagContentApplicable... content) {
    return supplyTag(Tags.DATALIST, content);
  }

  public static Tag datalist(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DATALIST, attributes, content);
  }

  public static Tag datalist(Attribute... attributes) {
    return supplyTag(Tags.DATALIST, attributes);
  }

  public static Tag dd(TagContentApplicable... content) {
    return supplyTag(Tags.DD, content);
  }

  public static Tag dd(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DD, attributes, content);
  }

  public static Tag dd(Attribute... attributes) {
    return supplyTag(Tags.DD, attributes);
  }

  public static Tag del(TagContentApplicable... content) {
    return supplyTag(Tags.DEL, content);
  }

  public static Tag del(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DEL, attributes, content);
  }

  public static Tag del(Attribute... attributes) {
    return supplyTag(Tags.DEL, attributes);
  }

  public static Tag details(TagContentApplicable... content) {
    return supplyTag(Tags.DETAILS, content);
  }

  public static Tag details(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DETAILS, attributes, content);
  }

  public static Tag details(Attribute... attributes) {
    return supplyTag(Tags.DETAILS, attributes);
  }

  public static Tag dfn(TagContentApplicable... content) {
    return supplyTag(Tags.DFN, content);
  }

  public static Tag dfn(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DFN, attributes, content);
  }

  public static Tag dfn(Attribute... attributes) {
    return supplyTag(Tags.DFN, attributes);
  }

  public static Tag dialog(TagContentApplicable... content) {
    return supplyTag(Tags.DIALOG, content);
  }

  public static Tag dialog(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DIALOG, attributes, content);
  }

  public static Tag dialog(Attribute... attributes) {
    return supplyTag(Tags.DIALOG, attributes);
  }

  public static Tag dir(TagContentApplicable... content) {
    return supplyTag(Tags.DIR, content);
  }

  public static Tag dir(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DIR, attributes, content);
  }

  public static Tag dir(Attribute... attributes) {
    return supplyTag(Tags.DIR, attributes);
  }

  public static Tag div(TagContentApplicable... content) {
    return supplyTag(Tags.DIV, content);
  }

  public static Tag div(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DIV, attributes, content);
  }

  public static Tag div(Attribute... attributes) {
    return supplyTag(Tags.DIV, attributes);
  }

  public static Tag dl(TagContentApplicable... content) {
    return supplyTag(Tags.DL, content);
  }

  public static Tag dl(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DL, attributes, content);
  }

  public static Tag dl(Attribute... attributes) {
    return supplyTag(Tags.DL, attributes);
  }

  public static Tag dt(TagContentApplicable... content) {
    return supplyTag(Tags.DT, content);
  }

  public static Tag dt(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.DT, attributes, content);
  }

  public static Tag dt(Attribute... attributes) {
    return supplyTag(Tags.DT, attributes);
  }

  public static Tag em(TagContentApplicable... content) {
    return supplyTag(Tags.EM, content);
  }

  public static Tag em(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.EM, attributes, content);
  }

  public static Tag em(Attribute... attributes) {
    return supplyTag(Tags.EM, attributes);
  }

  public static Tag embed(TagContentApplicable... content) {
    return supplyTag(Tags.EMBED, content);
  }

  public static Tag embed(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.EMBED, attributes, content);
  }

  public static Tag embed(Attribute... attributes) {
    return supplyTag(Tags.EMBED, attributes);
  }

  public static Tag eventsource(TagContentApplicable... content) {
    return supplyTag(Tags.EVENTSOURCE, content);
  }

  public static Tag eventsource(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.EVENTSOURCE, attributes, content);
  }

  public static Tag eventsource(Attribute... attributes) {
    return supplyTag(Tags.EVENTSOURCE, attributes);
  }

  public static Tag fieldset(TagContentApplicable... content) {
    return supplyTag(Tags.FIELDSET, content);
  }

  public static Tag fieldset(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FIELDSET, attributes, content);
  }

  public static Tag fieldset(Attribute... attributes) {
    return supplyTag(Tags.FIELDSET, attributes);
  }

  public static Tag figcaption(TagContentApplicable... content) {
    return supplyTag(Tags.FIGCAPTION, content);
  }

  public static Tag figcaption(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FIGCAPTION, attributes, content);
  }

  public static Tag figcaption(Attribute... attributes) {
    return supplyTag(Tags.FIGCAPTION, attributes);
  }

  public static Tag figure(TagContentApplicable... content) {
    return supplyTag(Tags.FIGURE, content);
  }

  public static Tag figure(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FIGURE, attributes, content);
  }

  public static Tag figure(Attribute... attributes) {
    return supplyTag(Tags.FIGURE, attributes);
  }

  public static Tag font(TagContentApplicable... content) {
    return supplyTag(Tags.FONT, content);
  }

  public static Tag font(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FONT, attributes, content);
  }

  public static Tag font(Attribute... attributes) {
    return supplyTag(Tags.FONT, attributes);
  }

  public static Tag footer(TagContentApplicable... content) {
    return supplyTag(Tags.FOOTER, content);
  }

  public static Tag footer(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FOOTER, attributes, content);
  }

  public static Tag footer(Attribute... attributes) {
    return supplyTag(Tags.FOOTER, attributes);
  }

  public static Tag form(TagContentApplicable... content) {
    return supplyTag(Tags.FORM, content);
  }

  public static Tag form(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FORM, attributes, content);
  }

  public static Tag form(Attribute... attributes) {
    return supplyTag(Tags.FORM, attributes);
  }

  public static Tag frame(TagContentApplicable... content) {
    return supplyTag(Tags.FRAME, content);
  }

  public static Tag frame(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FRAME, attributes, content);
  }

  public static Tag frame(Attribute... attributes) {
    return supplyTag(Tags.FRAME, attributes);
  }

  public static Tag frameset(TagContentApplicable... content) {
    return supplyTag(Tags.FRAMESET, content);
  }

  public static Tag frameset(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.FRAMESET, attributes, content);
  }

  public static Tag frameset(Attribute... attributes) {
    return supplyTag(Tags.FRAMESET, attributes);
  }

  public static Tag head(TagContentApplicable... content) {
    return supplyTag(Tags.HEAD, content);
  }

  public static Tag head(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.HEAD, attributes, content);
  }

  public static Tag head(Attribute... attributes) {
    return supplyTag(Tags.HEAD, attributes);
  }

  public static Tag header(TagContentApplicable... content) {
    return supplyTag(Tags.HEADER, content);
  }

  public static Tag header(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.HEADER, attributes, content);
  }

  public static Tag header(Attribute... attributes) {
    return supplyTag(Tags.HEADER, attributes);
  }

  public static Tag hgroup(TagContentApplicable... content) {
    return supplyTag(Tags.HGROUP, content);
  }

  public static Tag hgroup(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.HGROUP, attributes, content);
  }

  public static Tag hgroup(Attribute... attributes) {
    return supplyTag(Tags.HGROUP, attributes);
  }

  public static Tag hr(TagContentApplicable... content) {
    return supplyTag(Tags.HR, content);
  }

  public static Tag hr(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.HR, attributes, content);
  }

  public static Tag hr(Attribute... attributes) {
    return supplyTag(Tags.HR, attributes);
  }

  public static Tag i(TagContentApplicable... content) {
    return supplyTag(Tags.I, content);
  }

  public static Tag i(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.I, attributes, content);
  }

  public static Tag i(Attribute... attributes) {
    return supplyTag(Tags.I, attributes);
  }

  public static Tag iframe(TagContentApplicable... content) {
    return supplyTag(Tags.IFRAME, content);
  }

  public static Tag iframe(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.IFRAME, attributes, content);
  }

  public static Tag iframe(Attribute... attributes) {
    return supplyTag(Tags.IFRAME, attributes);
  }

  public static Tag img(TagContentApplicable... content) {
    return supplyTag(Tags.IMG, content);
  }

  public static Tag img(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.IMG, attributes, content);
  }

  public static Tag img(Attribute... attributes) {
    return supplyTag(Tags.IMG, attributes);
  }

  public static Tag input(TagContentApplicable... content) {
    return supplyTag(Tags.INPUT, content);
  }

  public static Tag input(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.INPUT, attributes, content);
  }

  public static Tag input(Attribute... attributes) {
    return supplyTag(Tags.INPUT, attributes);
  }

  public static Tag ins(TagContentApplicable... content) {
    return supplyTag(Tags.INS, content);
  }

  public static Tag ins(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.INS, attributes, content);
  }

  public static Tag ins(Attribute... attributes) {
    return supplyTag(Tags.INS, attributes);
  }

  public static Tag isindex(TagContentApplicable... content) {
    return supplyTag(Tags.ISINDEX, content);
  }

  public static Tag isindex(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.ISINDEX, attributes, content);
  }

  public static Tag isindex(Attribute... attributes) {
    return supplyTag(Tags.ISINDEX, attributes);
  }

  public static Tag kbd(TagContentApplicable... content) {
    return supplyTag(Tags.KBD, content);
  }

  public static Tag kbd(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.KBD, attributes, content);
  }

  public static Tag kbd(Attribute... attributes) {
    return supplyTag(Tags.KBD, attributes);
  }

  public static Tag keygen(TagContentApplicable... content) {
    return supplyTag(Tags.KEYGEN, content);
  }

  public static Tag keygen(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.KEYGEN, attributes, content);
  }

  public static Tag keygen(Attribute... attributes) {
    return supplyTag(Tags.KEYGEN, attributes);
  }

  public static Tag label(TagContentApplicable... content) {
    return supplyTag(Tags.LABEL, content);
  }

  public static Tag label(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.LABEL, attributes, content);
  }

  public static Tag label(Attribute... attributes) {
    return supplyTag(Tags.LABEL, attributes);
  }

  public static Tag legend(TagContentApplicable... content) {
    return supplyTag(Tags.LEGEND, content);
  }

  public static Tag legend(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.LEGEND, attributes, content);
  }

  public static Tag legend(Attribute... attributes) {
    return supplyTag(Tags.LEGEND, attributes);
  }

  public static Tag li(TagContentApplicable... content) {
    return supplyTag(Tags.LI, content);
  }

  public static Tag li(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.LI, attributes, content);
  }

  public static Tag li(Attribute... attributes) {
    return supplyTag(Tags.LI, attributes);
  }

  public static Tag link(TagContentApplicable... content) {
    return supplyTag(Tags.LINK, content);
  }

  public static Tag link(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.LINK, attributes, content);
  }

  public static Tag link(Attribute... attributes) {
    return supplyTag(Tags.LINK, attributes);
  }

  public static Tag map(TagContentApplicable... content) {
    return supplyTag(Tags.MAP, content);
  }

  public static Tag map(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.MAP, attributes, content);
  }

  public static Tag map(Attribute... attributes) {
    return supplyTag(Tags.MAP, attributes);
  }

  public static Tag mark(TagContentApplicable... content) {
    return supplyTag(Tags.MARK, content);
  }

  public static Tag mark(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.MARK, attributes, content);
  }

  public static Tag mark(Attribute... attributes) {
    return supplyTag(Tags.MARK, attributes);
  }

  public static Tag menu(TagContentApplicable... content) {
    return supplyTag(Tags.MENU, content);
  }

  public static Tag menu(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.MENU, attributes, content);
  }

  public static Tag menu(Attribute... attributes) {
    return supplyTag(Tags.MENU, attributes);
  }

  public static Tag meta(TagContentApplicable... content) {
    return supplyTag(Tags.META, content);
  }

  public static Tag meta(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.META, attributes, content);
  }

  public static Tag meta(Attribute... attributes) {
    return supplyTag(Tags.META, attributes);
  }

  public static Tag meter(TagContentApplicable... content) {
    return supplyTag(Tags.METER, content);
  }

  public static Tag meter(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.METER, attributes, content);
  }

  public static Tag meter(Attribute... attributes) {
    return supplyTag(Tags.METER, attributes);
  }

  public static Tag nav(TagContentApplicable... content) {
    return supplyTag(Tags.NAV, content);
  }

  public static Tag nav(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.NAV, attributes, content);
  }

  public static Tag nav(Attribute... attributes) {
    return supplyTag(Tags.NAV, attributes);
  }

  public static Tag noframes(TagContentApplicable... content) {
    return supplyTag(Tags.NOFRAMES, content);
  }

  public static Tag noframes(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.NOFRAMES, attributes, content);
  }

  public static Tag noframes(Attribute... attributes) {
    return supplyTag(Tags.NOFRAMES, attributes);
  }

  public static Tag noscript(TagContentApplicable... content) {
    return supplyTag(Tags.NOSCRIPT, content);
  }

  public static Tag noscript(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.NOSCRIPT, attributes, content);
  }

  public static Tag noscript(Attribute... attributes) {
    return supplyTag(Tags.NOSCRIPT, attributes);
  }

  public static Tag object(TagContentApplicable... content) {
    return supplyTag(Tags.OBJECT, content);
  }

  public static Tag object(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.OBJECT, attributes, content);
  }

  public static Tag object(Attribute... attributes) {
    return supplyTag(Tags.OBJECT, attributes);
  }

  public static Tag ol(TagContentApplicable... content) {
    return supplyTag(Tags.OL, content);
  }

  public static Tag ol(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.OL, attributes, content);
  }

  public static Tag ol(Attribute... attributes) {
    return supplyTag(Tags.OL, attributes);
  }

  public static Tag optgroup(TagContentApplicable... content) {
    return supplyTag(Tags.OPTGROUP, content);
  }

  public static Tag optgroup(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.OPTGROUP, attributes, content);
  }

  public static Tag optgroup(Attribute... attributes) {
    return supplyTag(Tags.OPTGROUP, attributes);
  }

  public static Tag option(TagContentApplicable... content) {
    return supplyTag(Tags.OPTION, content);
  }

  public static Tag option(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.OPTION, attributes, content);
  }

  public static Tag option(Attribute... attributes) {
    return supplyTag(Tags.OPTION, attributes);
  }

  public static Tag output(TagContentApplicable... content) {
    return supplyTag(Tags.OUTPUT, content);
  }

  public static Tag output(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.OUTPUT, attributes, content);
  }

  public static Tag output(Attribute... attributes) {
    return supplyTag(Tags.OUTPUT, attributes);
  }

  public static Tag p(TagContentApplicable... content) {
    return supplyTag(Tags.P, content);
  }

  public static Tag p(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.P, attributes, content);
  }

  public static Tag p(Attribute... attributes) {
    return supplyTag(Tags.P, attributes);
  }

  public static Tag param(TagContentApplicable... content) {
    return supplyTag(Tags.PARAM, content);
  }

  public static Tag param(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.PARAM, attributes, content);
  }

  public static Tag param(Attribute... attributes) {
    return supplyTag(Tags.PARAM, attributes);
  }

  public static Tag pre(TagContentApplicable... content) {
    return supplyTag(Tags.PRE, content);
  }

  public static Tag pre(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.PRE, attributes, content);
  }

  public static Tag pre(Attribute... attributes) {
    return supplyTag(Tags.PRE, attributes);
  }

  public static Tag progress(TagContentApplicable... content) {
    return supplyTag(Tags.PROGRESS, content);
  }

  public static Tag progress(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.PROGRESS, attributes, content);
  }

  public static Tag progress(Attribute... attributes) {
    return supplyTag(Tags.PROGRESS, attributes);
  }

  public static Tag q(TagContentApplicable... content) {
    return supplyTag(Tags.Q, content);
  }

  public static Tag q(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.Q, attributes, content);
  }

  public static Tag q(Attribute... attributes) {
    return supplyTag(Tags.Q, attributes);
  }

  public static Tag rp(TagContentApplicable... content) {
    return supplyTag(Tags.RP, content);
  }

  public static Tag rp(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.RP, attributes, content);
  }

  public static Tag rp(Attribute... attributes) {
    return supplyTag(Tags.RP, attributes);
  }

  public static Tag rt(TagContentApplicable... content) {
    return supplyTag(Tags.RT, content);
  }

  public static Tag rt(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.RT, attributes, content);
  }

  public static Tag rt(Attribute... attributes) {
    return supplyTag(Tags.RT, attributes);
  }

  public static Tag ruby(TagContentApplicable... content) {
    return supplyTag(Tags.RUBY, content);
  }

  public static Tag ruby(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.RUBY, attributes, content);
  }

  public static Tag ruby(Attribute... attributes) {
    return supplyTag(Tags.RUBY, attributes);
  }

  public static Tag s(TagContentApplicable... content) {
    return supplyTag(Tags.S, content);
  }

  public static Tag s(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.S, attributes, content);
  }

  public static Tag s(Attribute... attributes) {
    return supplyTag(Tags.S, attributes);
  }

  public static Tag samp(TagContentApplicable... content) {
    return supplyTag(Tags.SAMP, content);
  }

  public static Tag samp(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SAMP, attributes, content);
  }

  public static Tag samp(Attribute... attributes) {
    return supplyTag(Tags.SAMP, attributes);
  }

  public static Tag script(TagContentApplicable... content) {
    return supplyTag(Tags.SCRIPT, content);
  }

  public static Tag script(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SCRIPT, attributes, content);
  }

  public static Tag script(Attribute... attributes) {
    return supplyTag(Tags.SCRIPT, attributes);
  }

  public static Tag section(TagContentApplicable... content) {
    return supplyTag(Tags.SECTION, content);
  }

  public static Tag section(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SECTION, attributes, content);
  }

  public static Tag section(Attribute... attributes) {
    return supplyTag(Tags.SECTION, attributes);
  }

  public static Tag select(TagContentApplicable... content) {
    return supplyTag(Tags.SELECT, content);
  }

  public static Tag select(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SELECT, attributes, content);
  }

  public static Tag select(Attribute... attributes) {
    return supplyTag(Tags.SELECT, attributes);
  }

  public static Tag small(TagContentApplicable... content) {
    return supplyTag(Tags.SMALL, content);
  }

  public static Tag small(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SMALL, attributes, content);
  }

  public static Tag small(Attribute... attributes) {
    return supplyTag(Tags.SMALL, attributes);
  }

  public static Tag source(TagContentApplicable... content) {
    return supplyTag(Tags.SOURCE, content);
  }

  public static Tag source(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SOURCE, attributes, content);
  }

  public static Tag source(Attribute... attributes) {
    return supplyTag(Tags.SOURCE, attributes);
  }

  public static Tag span(TagContentApplicable... content) {
    return supplyTag(Tags.SPAN, content);
  }

  public static Tag span(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SPAN, attributes, content);
  }

  public static Tag span(Attribute... attributes) {
    return supplyTag(Tags.SPAN, attributes);
  }

  public static Tag strike(TagContentApplicable... content) {
    return supplyTag(Tags.STRIKE, content);
  }

  public static Tag strike(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.STRIKE, attributes, content);
  }

  public static Tag strike(Attribute... attributes) {
    return supplyTag(Tags.STRIKE, attributes);
  }

  public static Tag strong(TagContentApplicable... content) {
    return supplyTag(Tags.STRONG, content);
  }

  public static Tag strong(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.STRONG, attributes, content);
  }

  public static Tag strong(Attribute... attributes) {
    return supplyTag(Tags.STRONG, attributes);
  }

  public static Tag style(TagContentApplicable... content) {
    return supplyTag(Tags.STYLE, content);
  }

  public static Tag style(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.STYLE, attributes, content);
  }

  public static Tag style(Attribute... attributes) {
    return supplyTag(Tags.STYLE, attributes);
  }

  public static Tag sub(TagContentApplicable... content) {
    return supplyTag(Tags.SUB, content);
  }

  public static Tag sub(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SUB, attributes, content);
  }

  public static Tag sub(Attribute... attributes) {
    return supplyTag(Tags.SUB, attributes);
  }

  public static Tag sup(TagContentApplicable... content) {
    return supplyTag(Tags.SUP, content);
  }

  public static Tag sup(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.SUP, attributes, content);
  }

  public static Tag sup(Attribute... attributes) {
    return supplyTag(Tags.SUP, attributes);
  }

  public static Tag tbody(TagContentApplicable... content) {
    return supplyTag(Tags.TBODY, content);
  }

  public static Tag tbody(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TBODY, attributes, content);
  }

  public static Tag tbody(Attribute... attributes) {
    return supplyTag(Tags.TBODY, attributes);
  }

  public static Tag td(TagContentApplicable... content) {
    return supplyTag(Tags.TD, content);
  }

  public static Tag td(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TD, attributes, content);
  }

  public static Tag td(Attribute... attributes) {
    return supplyTag(Tags.TD, attributes);
  }

  public static Tag textarea(TagContentApplicable... content) {
    return supplyTag(Tags.TEXTAREA, content);
  }

  public static Tag textarea(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TEXTAREA, attributes, content);
  }

  public static Tag textarea(Attribute... attributes) {
    return supplyTag(Tags.TEXTAREA, attributes);
  }

  public static Tag tfoot(TagContentApplicable... content) {
    return supplyTag(Tags.TFOOT, content);
  }

  public static Tag tfoot(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TFOOT, attributes, content);
  }

  public static Tag tfoot(Attribute... attributes) {
    return supplyTag(Tags.TFOOT, attributes);
  }

  public static Tag th(TagContentApplicable... content) {
    return supplyTag(Tags.TH, content);
  }

  public static Tag th(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TH, attributes, content);
  }

  public static Tag th(Attribute... attributes) {
    return supplyTag(Tags.TH, attributes);
  }

  public static Tag thead(TagContentApplicable... content) {
    return supplyTag(Tags.THEAD, content);
  }

  public static Tag thead(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.THEAD, attributes, content);
  }

  public static Tag thead(Attribute... attributes) {
    return supplyTag(Tags.THEAD, attributes);
  }

  public static Tag time(TagContentApplicable... content) {
    return supplyTag(Tags.TIME, content);
  }

  public static Tag time(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TIME, attributes, content);
  }

  public static Tag time(Attribute... attributes) {
    return supplyTag(Tags.TIME, attributes);
  }

  public static Tag title(TagContentApplicable... content) {
    return supplyTag(Tags.TITLE, content);
  }

  public static Tag title(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TITLE, attributes, content);
  }

  public static Tag title(Attribute... attributes) {
    return supplyTag(Tags.TITLE, attributes);
  }

  public static Tag tr(TagContentApplicable... content) {
    return supplyTag(Tags.TR, content);
  }

  public static Tag tr(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TR, attributes, content);
  }

  public static Tag tr(Attribute... attributes) {
    return supplyTag(Tags.TR, attributes);
  }

  public static Tag track(TagContentApplicable... content) {
    return supplyTag(Tags.TRACK, content);
  }

  public static Tag track(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TRACK, attributes, content);
  }

  public static Tag track(Attribute... attributes) {
    return supplyTag(Tags.TRACK, attributes);
  }

  public static Tag tt(TagContentApplicable... content) {
    return supplyTag(Tags.TT, content);
  }

  public static Tag tt(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.TT, attributes, content);
  }

  public static Tag tt(Attribute... attributes) {
    return supplyTag(Tags.TT, attributes);
  }

  public static Tag u(TagContentApplicable... content) {
    return supplyTag(Tags.U, content);
  }

  public static Tag u(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.U, attributes, content);
  }

  public static Tag u(Attribute... attributes) {
    return supplyTag(Tags.U, attributes);
  }

  public static Tag ul(TagContentApplicable... content) {
    return supplyTag(Tags.UL, content);
  }

  public static Tag ul(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.UL, attributes, content);
  }

  public static Tag ul(Attribute... attributes) {
    return supplyTag(Tags.UL, attributes);
  }

  public static Tag var(TagContentApplicable... content) {
    return supplyTag(Tags.VAR, content);
  }

  public static Tag var(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.VAR, attributes, content);
  }

  public static Tag var(Attribute... attributes) {
    return supplyTag(Tags.VAR, attributes);
  }

  public static Tag video(TagContentApplicable... content) {
    return supplyTag(Tags.VIDEO, content);
  }

  public static Tag video(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.VIDEO, attributes, content);
  }

  public static Tag video(Attribute... attributes) {
    return supplyTag(Tags.VIDEO, attributes);
  }

  public static Tag wbr(TagContentApplicable... content) {
    return supplyTag(Tags.WBR, content);
  }

  public static Tag wbr(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.WBR, attributes, content);
  }

  public static Tag wbr(Attribute... attributes) {
    return supplyTag(Tags.WBR, attributes);
  }

  public static Tag h1(TagContentApplicable... content) {
    return supplyTag(Tags.H1, content);
  }

  public static Tag h1(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.H1, attributes, content);
  }

  public static Tag h1(Attribute... attributes) {
    return supplyTag(Tags.H1, attributes);
  }

  public static Tag h2(TagContentApplicable... content) {
    return supplyTag(Tags.H2, content);
  }

  public static Tag h2(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.H2, attributes, content);
  }

  public static Tag h2(Attribute... attributes) {
    return supplyTag(Tags.H2, attributes);
  }

  public static Tag h3(TagContentApplicable... content) {
    return supplyTag(Tags.H3, content);
  }

  public static Tag h3(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.H3, attributes, content);
  }

  public static Tag h3(Attribute... attributes) {
    return supplyTag(Tags.H3, attributes);
  }

  public static Tag h4(TagContentApplicable... content) {
    return supplyTag(Tags.H4, content);
  }

  public static Tag h4(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.H4, attributes, content);
  }

  public static Tag h4(Attribute... attributes) {
    return supplyTag(Tags.H4, attributes);
  }

  public static Tag h5(TagContentApplicable... content) {
    return supplyTag(Tags.H5, content);
  }

  public static Tag h5(Set<Attribute> attributes, TagContentApplicable... content) {
    return supplyTag(Tags.H5, attributes, content);
  }

  public static Tag h5(Attribute... attributes) {
    return supplyTag(Tags.H5, attributes);
  }

  static Content text(final String text) {
    return new Content(text);
  }

  public static Content text(final Character text) {
    return new Content(text.toString());
  }

  public static <T> Content text(final T value, final Function<T, String> supplier) {
    return new Content(supplier.apply(value));
  }

  public static <T extends Number> Content text(final T number) {
    return text(number, String::valueOf);
  }

  private static Tag supplyTag(Tags tag, Attribute... attributes) {
    final Set<Attribute> attributesSet = new HashSet<>(Arrays.asList(attributes));
    return tag.getTagSupplier().apply(Collections.emptyList(), attributesSet);
  }

  private static Tag supplyTag(Tags tag, TagContentApplicable... content) {
    return tag.getTagSupplier().apply(Arrays.asList(content), Collections.emptySet());
  }

  private static Tag supplyTag(Tags tag, Set<Attribute> attributes, TagContentApplicable... content) {
    return tag.getTagSupplier().apply(Arrays.asList(content), attributes);
  }

  public static Set<Attribute> attrs(Attribute... attributes) {
    return new HashSet<>(Arrays.asList(attributes));
  }

  /**
   * Accepts key-value pairs separated by '=' or : in a form of a string array
   */
  public static Set<Attribute> attrs(String... attributes) {
    return Arrays.stream(attributes)
      .flatMap(data -> toAttribute(data).map(Stream::of).orElse(Stream.empty()))
      .collect(Collectors.toSet());
  }

  private static Optional<Attribute> toAttribute(String attribute) {
    String[] attributeData = attribute.split("[=:]");

    if (attributeData.length != 2) {
      return Optional.empty();
    }

    return Optional.of(new Attribute(attributeData[0], attributeData[1]));
  }

  public static <T> TagContentApplicable forEach(Collection<T> items, Function<T, TagContentApplicable> repr) {
    return new RepresentableGroup(items.stream().map(repr).collect(Collectors.toList()));
  }
}
