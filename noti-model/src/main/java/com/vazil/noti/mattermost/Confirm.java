package com.vazil.noti.mattermost;

import lombok.Builder;

@Builder
public class Confirm {
    private String title;
    private String text;
    private Boolean ok_text;
    private Boolean dismiss_text;
}
