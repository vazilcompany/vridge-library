package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Context {
    @Builder.Default
    private String type = "context";
    private String block_id;
    private Object[] elements;
}
