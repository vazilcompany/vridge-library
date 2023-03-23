package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class Option {
    //https://api.slack.com/reference/block-kit/composition-objects#option
    private Object text;
    private String value;
    private Object description;
    private String url;
}
