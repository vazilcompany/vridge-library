package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class PlainTextObject extends TextObject{
    private final String type = "plain_text";
    private final String text;
    private Boolean emoji;
}
