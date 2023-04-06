package com.vazil.notification.model.mattermost;

import com.vazil.notification.service.Utils;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Integration {
    private String url;
    private Context context;
}
