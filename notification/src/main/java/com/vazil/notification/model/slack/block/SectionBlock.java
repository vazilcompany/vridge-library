package com.vazil.notification.model.slack.block;

import com.vazil.notification.model.slack.element.BlockElement;
import com.vazil.notification.model.slack.composition.TextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SectionBlock implements LayoutBlock {
    private final String type = "section";
    private String block_id;
    private TextObject text;
    private TextObject[] fields;
    private BlockElement accessory;
}
