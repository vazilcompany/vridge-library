package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoBlock implements Block {
    private final String type = "video";
    private String block_id;
    private PlainTextObject title;
    private String title_url;
    private PlainTextObject description;
    private String video_url;
    private String alt_text;
    private String thumbnail_url;
    private String author_name;
    private String provider_icon_url;
    private String provider_name;
}
