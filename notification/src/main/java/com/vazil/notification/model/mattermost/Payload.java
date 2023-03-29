package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payload {
    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private boolean link_names;
    private boolean unfurl_links;
    private boolean unfurl_media;
    private Attachments[] attachments;
}
