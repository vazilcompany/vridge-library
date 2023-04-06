package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.MarkdownObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import com.vazil.notification.model.slack.composition.TextObject;
import com.vazil.notification.model.slack.element.Element;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SectionBlock implements Block {
    private final String type = "section";
    private String block_id;
    private TextObject text;
    private TextObject[] fields;
    private Element accessory;

    public static SectionBlock sectionTitle(String title1, String title2) {
        return SectionBlock.builder()
                .fields(
                        new TextObject[]{
                                MarkdownObject.textTemplate(title1)
                                , MarkdownObject.textTemplate(title2)
                        })
                .build();
    }

    public static SectionBlock sectionTitle(String title) {
        return sectionTitle(title, " ");
    }

    public static SectionBlock sectionBody(String body1, String body2) {
        return SectionBlock.builder()
                .fields(
                        new TextObject[]{
                                PlainTextObject.textTemplate(body1)
                                , PlainTextObject.textTemplate(body2)
                        })
                .build();
    }

    public static SectionBlock sectionBody(String body) {
        return sectionTitle(body, " ");
    }

}
