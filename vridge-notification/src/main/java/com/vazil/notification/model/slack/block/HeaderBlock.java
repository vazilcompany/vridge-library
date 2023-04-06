package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HeaderBlock implements Block {
    private final String type = "header";
    private String block_id;
    private PlainTextObject text;

    public static HeaderBlock header(String text) {
        return HeaderBlock.builder()
                .text(PlainTextObject.textTemplate(text))
                .build();
    }
}
