package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.DispatchConfigurationObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UrlTextInputElement implements Element {
    private final String type = "url_text_input";
    private String action_id;
    private String initial_value;
    private DispatchConfigurationObject dispatch_action_config;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
