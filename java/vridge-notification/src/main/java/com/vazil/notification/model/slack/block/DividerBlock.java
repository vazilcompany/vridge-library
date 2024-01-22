package com.vazil.notification.model.slack.block;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DividerBlock implements Block {
    private final String type = "divider";
    private String block_id;
}
