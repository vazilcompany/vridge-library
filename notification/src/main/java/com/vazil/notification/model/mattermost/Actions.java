package com.vazil.notification.model.mattermost;

import com.vazil.notification.model.mattermost.Enum.Style;
import com.vazil.notification.model.mattermost.Enum.Type;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Actions {
    private String name;
    private String text;
    private Type type;
    private String value;
    private Style style;
    private Confirm confirm;
}