package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Image {
    @Builder.Default
    private String type = "image";
    private Object title;
    private String block_id;
    private String image_url;
    private String alt_text;
}
