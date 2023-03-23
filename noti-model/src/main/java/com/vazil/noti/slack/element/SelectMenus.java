package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class SelectMenus {
    //https://api.slack.com/reference/block-kit/block-elements#select
    private String type;  // SelectMenusType
    private String action_id;
    private Object[] options;
    private Object[] option_groups;
    private Object[] initial_option;
    @Builder.Default
    private Integer min_query_length = 3;
    private String[] initial_users;
    private String[] initial_conversations;
    @Builder.Default
    private Boolean default_to_current_conversation = false;
    private String[] initial_channels;
    private Object confirm;
    private Boolean response_url_enabled;
    private Object filter;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
