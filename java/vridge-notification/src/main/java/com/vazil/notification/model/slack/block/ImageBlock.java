package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageBlock implements Block {
    private final String type = "image";
    private String block_id;
    private PlainTextObject title;
    private String image_url;
    private String alt_text;


}
