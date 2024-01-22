package com.vazil.notification.model.slack.element;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageElement implements Element {
    private final String type = "image";
    private String image_url;
    private String alt_text;

    public static ImageElement template(String image_url, String alt_text) {
        return ImageElement.builder()
                .image_url(image_url)
                .alt_text(alt_text)
                .build();
    }
}
