package com.vazil.noti.slack.element;

import lombok.Builder;

@Builder
public class MultiSelectMenu {
    //https://api.slack.com/reference/block-kit/block-elements#multi_select
    private String type;  // MultiSelectMenuType
    private String action_id;
    private String[] initial_channels;
    private Object[] options;
    private Object[] option_groups;
    @Builder.Default
    private Integer min_query_length = 3;
    private Object[] initial_options;
    private String[] initial_users;
    private String[] initial_conversations;
    @Builder.Default
    private Boolean default_to_current_conversation = false;
    private Object confirm;
    private Integer max_selected_items;
    private Object filter;
    @Builder.Default
    private Boolean focus_on_load = false;
    private Object placeholder;
}
