package com.vazil.notification.model.mattermost;


import com.vazil.notification.model.mattermost.Enum.Color;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Attachments {
    private String fallback;
    private Color color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private Fields[] fields;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private long ts;
}
