package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilterObject {
    private String[] include;
    private Boolean excludeExternalSharedChannels;
    private Boolean excludeBotUsers;
}
