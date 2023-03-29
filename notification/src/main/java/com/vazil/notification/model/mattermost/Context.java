package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Context {
    private String repo;
    private long pr;
    private String action_id;
    private String action;
    private String token;
}
