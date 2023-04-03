package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionGroupObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StaticSelectElement implements BlockElement{
    private final String type = "static_select";
    private String action_id;
    private OptionObject[] options;
    private OptionGroupObject[] option_groups;
    private OptionObject initial_options;
    private ConfirmObject confirm;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
