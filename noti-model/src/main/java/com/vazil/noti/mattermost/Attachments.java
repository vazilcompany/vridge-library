package com.vazil.noti.mattermost;

import com.vazil.core.notification.model.Enum.Color;
import com.vazil.core.utils.TimeManager;
import lombok.Builder;

import java.time.ZoneOffset;

@Builder
public class Attachments {
    private String fallback;
    @Builder.Default
    private String color = Color.INFO.getColor();
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private Object[] fields;
    private String image_url;
    private String thumb_url;
    @Builder.Default
    private String footer = "Vridge";
    @Builder.Default
    private String footer_icon = "https://vridge.vazil.me/logo_v2/s01.png";
    @Builder.Default
    private long ts = TimeManager.now().toInstant(ZoneOffset.of("+09:00")).toEpochMilli();
}
