package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class Dispatch {
    //https://api.slack.com/reference/block-kit/composition-objects#dispatch_action_config
    private String[] trigger_actions_on;
}
