package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ButtonElement implements Element {
    private final String type = "button";
    private PlainTextObject text;
    private String action_id;
    private String url;
    private String value;
    /**
     * Decorates buttons with alternative visual color schemes
     * <p/>
     * default, primary, danger
     */
    private String style;
    private ConfirmObject confirm;
    private String accessibility_label;
}
