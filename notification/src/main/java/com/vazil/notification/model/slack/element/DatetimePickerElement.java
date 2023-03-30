package com.vazil.notification.model.slack.element;

import com.vazil.notification.model.slack.composition.ConfirmObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DatetimePickerElement implements BlockElement{
    private final String type = "datetimepicker";
    private String action_id;
    private Integer initial_date_time;
    private ConfirmObject confirm;
    private Boolean focus_on_load;

}
