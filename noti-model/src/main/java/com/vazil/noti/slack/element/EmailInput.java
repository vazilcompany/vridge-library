package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class EmailInput {
    //https://api.slack.com/reference/block-kit/block-elements#email
    @Builder.Default
    private String type = "email_text_input";
    private String action_id;
    private String initial_value;
    private Object dispatch_action_config;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
