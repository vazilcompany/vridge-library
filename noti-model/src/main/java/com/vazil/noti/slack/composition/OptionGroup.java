package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class OptionGroup {
    //https://api.slack.com/reference/block-kit/composition-objects#option_group
    private Object label;
    private Object[] options;
}
