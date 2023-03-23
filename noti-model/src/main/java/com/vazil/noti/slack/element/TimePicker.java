package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class TimePicker {
    //https://api.slack.com/reference/block-kit/block-elements#timepicker
    @Builder.Default
    private String type = "timepicker";
    private String action_id;
    private String initial_time;
    private Object confirm;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
    private String timezone;
}
