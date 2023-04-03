package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OptionObject {
    private TextObject text;
    private String value;
    private PlainTextObject description;
    private String url;
}
