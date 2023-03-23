package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Section {
    @Builder.Default
    private String type = "section";
    private Object text;
    private String block_id;
    private Object[] fields;
    private Object accessory;
}
