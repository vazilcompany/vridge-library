package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.element.BlockElement;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContextBlock implements LayoutBlock {
    private final String type = "context";
    private String block_id;
    private BlockElement[] elements;
}
