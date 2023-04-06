package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChannelsSelectElement implements Element {
    private final String type = "channels_select";
    private String action_id;
    private String initial_channel;
    private ConfirmObject confirm;
    private Boolean response_url_enabled;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
}
