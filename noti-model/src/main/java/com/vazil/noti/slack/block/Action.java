package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Action {
    @Builder.Default
    private String type = "actions";
    private String block_id;
    private Object[] elements;
}
