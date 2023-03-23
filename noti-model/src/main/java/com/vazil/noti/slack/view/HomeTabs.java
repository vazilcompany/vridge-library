package com.vazil.noti.slack.view;

import lombok.Builder;

@Builder
public class HomeTabs {
    @Builder.Default
    private String type = "home";
    private Object[] blocks;
    private String private_metadata;
    private String callback_id;
    private String external_id;
}
