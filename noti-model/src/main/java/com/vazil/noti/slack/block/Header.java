package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Header {
    @Builder.Default
    private String type = "header";
    private String block_id;
    private Object text;
}
