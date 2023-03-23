package com.vazil.noti.mattermost;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
public class Fields {
    private String title;
    private String value;
    @SerializedName("short")
    @Builder.Default
    private boolean isShort = false;
}
