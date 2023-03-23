package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class CheckboxGroups {
    //https://api.slack.com/reference/block-kit/block-elements#checkboxes
    @Builder.Default
    private String type = "checkboxes";
    private String action_id;
    private Object[] options;
    private Object[] initial_options;
    private Object confirm;
    @Builder.Default
    private Boolean focus_on_load = false;
}
