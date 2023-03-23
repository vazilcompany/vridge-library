package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Video {
    @Builder.Default
    private String type = "video";
    private Object title;
    private String title_url;
    private String block_id;
    private Object description;
    private String video_url;
    private String alt_text;
    private String thumbnail_url;
    private String author_name;
    private String provider_icon_url;
    private String provider_name;
}
