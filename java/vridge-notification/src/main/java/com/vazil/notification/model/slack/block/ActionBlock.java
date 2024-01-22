package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.element.Element;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActionBlock implements Block {
    private final String type = "actions";
    private String block_id;
    private Element[] elements;
}
