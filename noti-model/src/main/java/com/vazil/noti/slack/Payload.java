package com.vazil.noti.slack;

import lombok.Builder;

@Builder
public class Payload {
    private String channel;
    @Builder.Default
    private String username = "브릿지 봇";
    private String icon_emoji;
    @Builder.Default
    private String icon_url = "https://cf.channel.io/pub-file/85296/6385bee201c87b30b8a6/vbotface.png";
    private String text;
    private Object[] blocks;
    private Object[] attachments;


}
