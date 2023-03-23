package com.vazil.noti.slack.block;

import com.vazil.core.notification.model.Enum.Color;
import lombok.Builder;

@Builder
public class Attachments {
    private String fallback;
    @Builder.Default
    private String color = Color.INFO.getColor();
    private Object[] blocks;
}
