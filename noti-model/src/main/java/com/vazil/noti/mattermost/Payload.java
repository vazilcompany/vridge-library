package com.vazil.noti.mattermost;

import lombok.Builder;

@Builder
public class Payload {
    private String channel;
    private String text;
    @Builder.Default
    private String username = "브릿지 봇";
    @Builder.Default
    private String icon_url = "https://cf.channel.io/pub-file/85296/6385bee201c87b30b8a6/vbotface.png";
    private String icon_emoji;
    private boolean link_names;
    private boolean unfurl_links;
    private boolean unfurl_media;
    private Object[] attachments;
}
