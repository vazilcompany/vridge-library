package com.vazil.notification.model.slack;

import com.vazil.notification.model.slack.block.LayoutBlock;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SlackPayload {
    private String thread_ts;
    private String text;
    private String channel;
    private String username;
    private String icon_url;
    private String icon_emoji;

    private LayoutBlock[] blocks;
    private Attachments[] attachments;

    private Boolean unfurl_links;
    private Boolean unfurl_media;
}