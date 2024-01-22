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

    public static SectionBlock markdown(String title1, String body1, String title2, String body2) {
        return SectionBlock.builder()
                .fields(
                        new TextObject[]{
                                MarkdownObject.textTemplate(title1 + "\n" + body1)
                                , MarkdownObject.textTemplate(title2 + "\n" + body2)
                        })
                .build();
    }

    public static SectionBlock markdown(String title, String body) {
        return markdown(title, body, " ", " ");
    }

    public static SectionBlock plainText(String title1, String body1, String title2, String body2) {
        return SectionBlock.builder()
                .fields(
                        new TextObject[]{
                                PlainTextObject.textTemplate(title1 + "\n" + body1)
                                , PlainTextObject.textTemplate(title2 + "\n" + body2)
                        })
                .build();
    }

    public static SectionBlock plainText(String title, String body) {
        return plainText(title, body, " ", " ");
    }

}
