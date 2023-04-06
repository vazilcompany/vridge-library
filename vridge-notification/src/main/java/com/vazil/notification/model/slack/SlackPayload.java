package com.vazil.notification.model.slack;

import com.google.gson.Gson;
import com.vazil.notification.model.slack.block.Block;
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

    private Block[] blocks;
    private SlackAttachments[] attachments;

    private Boolean unfurl_links;
    private Boolean unfurl_media;


    public static String vridgeTemplate(String username, String icon_url, String text, Block[] blocks, SlackAttachments[] attachments) {
        return new Gson().toJson(SlackPayload.builder()
                .username(username)
                .icon_url(icon_url)
                .text(text)
                .blocks(blocks)
                .attachments(attachments)
                .build());
    }
}