package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.FilterObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConversationsSelectElement implements Element {
    private final String type = "conversations_select";
    private String action_id;
    private String initial_conversation;
    private Boolean default_to_current_conversation;
    private ConfirmObject confirm;
    private Boolean response_url_enabled;
    private FilterObject filter;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
