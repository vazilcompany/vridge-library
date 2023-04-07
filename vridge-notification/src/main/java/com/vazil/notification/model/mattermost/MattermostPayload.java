package com.vazil.notification.model.mattermost;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

/**
 * <h1>Mattermost create create incoming webhook </h1>
 * https://developers.mattermost.com/integrate/webhooks/incoming/
 */
@Data
@Builder
public class MattermostPayload {
    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private Boolean link_names;
    private Boolean unfurl_links;
    private Boolean unfurl_media;
    private Attachments[] attachments;

    public static String textTemplate(String text) {
        return new Gson().toJson(MattermostPayload.builder().text(text).build());
    }

    public static String vridgeTemplate(String username, String iconUrl, String text, Attachments[] attachments) {
        return new Gson().toJson(MattermostPayload.builder()
                .username(username)
                .icon_url(iconUrl)
                .text(text)
                .attachments(attachments)
                .build());
    }
}