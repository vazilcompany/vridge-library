package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.OptionObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultiExternalSelectElement implements Element {
    private final String type = "multi_external_select";
    private String action_id;
    private Integer min_query_length;
    private OptionObject[] initial_options;
    private ConfirmObject confirm;
    private Integer max_selected_items;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
