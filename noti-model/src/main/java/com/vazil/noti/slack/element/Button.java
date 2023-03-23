package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class Button {
    // https://api.slack.com/reference/block-kit/block-elements#button
    @Builder.Default
    private String type = "button";
    private Object text;
    private String action_id;
    private String url;
    private String value;
    private String style; // default, primary, danger
    private Object confirm;
    private String accessibility_label;

}