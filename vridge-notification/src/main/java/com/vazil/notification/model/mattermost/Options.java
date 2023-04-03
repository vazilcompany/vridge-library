package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Options {
    private String text;
    private String value;
}
