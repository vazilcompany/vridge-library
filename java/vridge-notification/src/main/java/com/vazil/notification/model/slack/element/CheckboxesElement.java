package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckboxesElement implements Element {
    private final String type = "checkboxes";
    private String action_id;
    private OptionObject[] options;
    private OptionObject[] initial_options;
    private ConfirmObject confirm;
    private Boolean focus_on_load;
}
