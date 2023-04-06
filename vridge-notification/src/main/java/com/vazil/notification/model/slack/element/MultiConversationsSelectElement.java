package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.FilterObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultiConversationsSelectElement implements Element {
    private final String type = "multi_conversations_select";
    private String action_id;
    private String[] initial_conversations;
    private Boolean default_to_current_conversation;
    private ConfirmObject confirm;
    private Integer max_selected_items;
    private FilterObject filter;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
