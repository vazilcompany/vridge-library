package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class DatetimePicker {
    //https://api.slack.com/reference/block-kit/block-elements#datetimepicker
    @Builder.Default
    private String type = "datetimepicker";
    private String action_id;
    private Integer initial_date_time;
    private Object confirm;
    @Builder.Default
    private Boolean focus_on_load = false;
}
