package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class PlainTextInput {
    //https://api.slack.com/reference/block-kit/block-elements#input
    @Builder.Default
    private String type = "plain_text_input";
    private String action_id;
    private String initial_value;
    @Builder.Default
    private Boolean multiline = false;
    private Integer min_length;
    private Integer max_length;
    private Object dispatch_action_config;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
