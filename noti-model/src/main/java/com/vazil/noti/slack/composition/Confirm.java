package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class Confirm {
    //https://api.slack.com/reference/block-kit/composition-objects#confirm
    private Object title;
    private Object text;
    private Object confirm;
    private Object deny;
    private String style;  //  default, primary, danger
}
