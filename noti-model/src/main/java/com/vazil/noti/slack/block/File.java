package com.vazil.noti.slack.block;

import lombok.Builder;

@Builder
public class File {
    @Builder.Default
    private String type = "file";
    private String block_id;
    private String external_id;
    private String source;
}
