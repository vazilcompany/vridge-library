package com.vazil.notification.model.slack.element;

import lombok.Builder;
import lombok.Data;
import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionGroupObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;

@Data
@Builder
public class MultiStaticSelectElement implements BlockElement{
    private final String type = "multi_static_select";
    private String action_id;
    private OptionObject[] options;
    private OptionGroupObject[] option_groups;
    private OptionObject[] initial_options;
    private ConfirmObject confirm;
    private Integer max_selected_items;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
