package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class MarkdownObject extends TextObject{
    private final String type = "mrkdwn";
    private final String text;
    private Boolean verbatim;
}
