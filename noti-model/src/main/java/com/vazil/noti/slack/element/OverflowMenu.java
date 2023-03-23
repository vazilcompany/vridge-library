package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class OverflowMenu {
    //https://api.slack.com/reference/block-kit/block-elements#overflow
    @Builder.Default
    private String type = "overflow";
    private String action_id;
    private Object[] options;
    private Object confirm;
}
