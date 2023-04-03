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
    private boolean link_names;
    private boolean unfurl_links;
    private boolean unfurl_media;
    private Attachments[] attachments;


    public static String textTemplate(String text) {
        MattermostPayload mattermostPayload =MattermostPayload.builder().text(text).build();
        return new Gson().toJson(mattermostPayload);
    }



}