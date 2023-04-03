package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Integration {
    private String url;
    private Context context;
}
