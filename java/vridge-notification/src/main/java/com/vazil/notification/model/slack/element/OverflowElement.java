package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OverflowElement implements Element {
    private final String type = "overflow";
    private String action_id;
    private OptionObject[] options;
    private ConfirmObject confirm;
}
