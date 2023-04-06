package com.vazil.notification.model.slack;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SlackFields {
    private String title;
    private String value;
    @SerializedName("short")
    private Boolean isShort;
}