package com.vazil.noti.slack.composition;

import lombok.Builder;

@Builder
public class Filter {
    //https://api.slack.com/reference/block-kit/composition-objects#filter_conversations
    private String[] include;
    @Builder.Default
    private Boolean exclude_external_shared_channels = false;
    @Builder.Default
    private Boolean exclude_bot_users = false;
}
