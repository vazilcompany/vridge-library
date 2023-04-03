package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersSelectElement implements BlockElement {
    private final String type = "users_select";
    private String action_id;
    private String initial_user;
    private ConfirmObject confirm;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
