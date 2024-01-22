package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.composition.PlainTextObject;
import com.vazil.notification.model.slack.element.Element;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InputBlock implements Block {
    private final String type = "input";
    private String block_id;

    private PlainTextObject label;
    private Element element;
    private Boolean dispatch_action;
    private PlainTextObject hint;
    private Boolean optional;


}
