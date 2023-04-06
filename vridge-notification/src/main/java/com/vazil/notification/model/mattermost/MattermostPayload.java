package com.vazil.notification.model.mattermost;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

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

    public static MattermostPayload basicTemplate(MattermostPayload mattermostPayload) {
        return MattermostPayload.builder()
                .channel(mattermostPayload.channel)
                .text(mattermostPayload.text)
                .username(mattermostPayload.username)
                .icon_url(mattermostPayload.icon_url)
                .icon_emoji(mattermostPayload.icon_emoji)
                .link_names(mattermostPayload.link_names)
                .unfurl_links(mattermostPayload.unfurl_links)
                .unfurl_media(mattermostPayload.unfurl_media)
                .attachments(mattermostPayload.attachments)
                .build();
    }

    public static String textTemplate(String text) {
        MattermostPayload mattermostPayload =MattermostPayload.builder().text(text).build();
        return new Gson().toJson(mattermostPayload);
    }



}