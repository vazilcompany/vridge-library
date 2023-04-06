package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultiUsersSelectElement implements Element {
    private final String type = "multi_users_select";
    private String action_id;
    private String[] initial_users;
    private ConfirmObject confirm;
    private Integer max_selected_items;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
