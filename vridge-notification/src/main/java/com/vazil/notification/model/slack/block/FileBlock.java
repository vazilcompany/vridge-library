package com.vazil.notification.model.slack.block;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class FileBlock implements LayoutBlock {
    private final String type = "file";
    private String block_id;
    private String external_id;
    @Builder.Default
    private String source = "remote";
}
