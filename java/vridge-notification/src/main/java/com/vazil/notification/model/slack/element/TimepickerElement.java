package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import com.vazil.notification.model.slack.composition.PlainTextObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TimepickerElement implements Element {
    private final String type = "timepicker";
    private String action_id;
    private String initial_time;
    private ConfirmObject confirm;
    private Boolean focus_on_load;
    private PlainTextObject placeholder;
    private String timezone;
}
