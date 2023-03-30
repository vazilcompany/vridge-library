package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DispatchConfigurationObject {
    private String[] trigger_actions_on;
}
