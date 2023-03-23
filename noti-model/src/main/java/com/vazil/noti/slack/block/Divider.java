package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Divider {
    @Builder.Default
    private String type = "divider";
    private String block_id;
}
