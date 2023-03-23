package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class UrlInput {
    //https://api.slack.com/reference/block-kit/block-elements#url
    @Builder.Default
    private String type = "url_text_input";
    private String action_id;
    private String initial_value;
    private Object dispatch_action_config;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
