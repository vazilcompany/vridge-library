package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.DispatchConfigurationObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlainTextInputElement implements Element {
    private final String type = "plain_text_input";
    private String action_id;
    private String initial_value;
    private Boolean multiline;
    private Integer min_length;
    private Integer max_length;
    private DispatchConfigurationObject dispatch_action_config;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
