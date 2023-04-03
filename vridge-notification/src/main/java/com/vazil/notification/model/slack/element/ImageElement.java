package com.vazil.notification.model.slack.element;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageElement implements BlockElement {
    private final String type = "image";
    private String image_url;
    private String alt_text;
}
