package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class DatePicker {
    //https://api.slack.com/reference/block-kit/block-elements#datepicker
    @Builder.Default
    private String type = "datepicker";
    private String action_id;
    private String initial_date;
    private Object confirm;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
