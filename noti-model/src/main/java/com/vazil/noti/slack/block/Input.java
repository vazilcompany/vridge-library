package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class Input {
    @Builder.Default
    private String type = "section";
    private Object label;
    private Object element;
    @Builder.Default
    private Boolean dispatch_action = false;
    private String block_id;
    private Object hint;
    @Builder.Default
    private Boolean optional = false;
}
