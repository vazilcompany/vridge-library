package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.PlainTextObject;
import com.vazil.notification.model.slack.element.Element;
import com.vazil.notification.model.slack.element.ImageElement;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContextBlock implements Block  {
    private final String type = "context";
    private String block_id;
    private Element[] elements;

    public static ContextBlock footer(String imageUrl, String altText, String text ) {
        return ContextBlock.builder()
                .elements(new Element[]{ImageElement.template(imageUrl, altText), PlainTextObject.textTemplate(text)})
                .build();
    }
}
