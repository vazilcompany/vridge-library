package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class NumberInput {
    //https://api.slack.com/reference/block-kit/block-elements#number
    @Builder.Default
    private String type = "number_input";
    private Boolean is_decimal_allowed;
    private String action_id;
    private String initial_value;
    private String min_value;
    private String max_value;
    private Object dispatch_action_config;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
