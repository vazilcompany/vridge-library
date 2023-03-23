package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class RadioButtonGroup {
    // https://api.slack.com/reference/block-kit/block-elements#radio
    @Builder.Default
    private String type = "radio_buttons";
    private String action_id;
    private Object[] options;
    private Object initial_option;
    private Object confirm;
    @Builder.Default
    private Boolean focus_on_load = false;
}
