package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.element.BlockElement;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ActionBlock implements LayoutBlock {
    private final String type = "actions";
    private String block_id;
    private BlockElement[] elements;
}
