package com.vazil.noti.mattermost;

import lombok.Builder;

@Builder
public class Actions {
    private String name;
    private String text;
    private String type;  // button, menu
    private String value;
    private String style;  // default, primary, danger
    private Object confirm;
}