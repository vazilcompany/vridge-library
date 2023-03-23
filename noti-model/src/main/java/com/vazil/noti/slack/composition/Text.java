package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class Text {
    private String type; // plain_text, mrkdwn
    private String text;
    private Boolean emoji;
    private Boolean verbatim;
}

