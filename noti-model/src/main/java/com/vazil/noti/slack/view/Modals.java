package com.vazil.noti.slack.view;

import lombok.Builder;

import java.util.List;

@Builder
public class Modals {
    @Builder.Default
    private String type = "modal";
    private Object title;
    private List<Object> blocks;
    private Object close;
    private Object submit;
    private String private_metadata;
    private String callback_id;
    @Builder.Default
    private Boolean clear_on_close = false;
    @Builder.Default
    private Boolean notify_on_close = false;
    private String external_id;
    private Boolean submit_disabled;
}
