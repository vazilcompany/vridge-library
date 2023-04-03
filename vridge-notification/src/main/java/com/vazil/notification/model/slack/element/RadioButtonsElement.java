package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RadioButtonsElement implements BlockElement{
    private final String type = "radio_buttons";
    private String action_id;
    private OptionObject[] options;
    private OptionObject initial_option;
    private ConfirmObject confirm;
    private Boolean focus_on_load;
}
