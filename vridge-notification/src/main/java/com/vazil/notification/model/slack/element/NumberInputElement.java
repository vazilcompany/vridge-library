package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.DispatchConfigurationObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NumberInputElement implements Element {
    private final String type = "number_input";
    private Boolean is_decimal_allowed;
    private String action_id;
    private String initial_value;
    private String min_value;
    private String max_value;
    private DispatchConfigurationObject dispatch_action_config;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
