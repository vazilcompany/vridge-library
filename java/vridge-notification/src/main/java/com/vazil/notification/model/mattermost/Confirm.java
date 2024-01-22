package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Confirm {
    private String title;
    private String text;
    private Boolean ok_text;
    private Boolean dismiss_text;
}
