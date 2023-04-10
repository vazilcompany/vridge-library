package com.vazil.notification.model.mattermost;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MattermostFields {
    private String title;
    private String value;
    @SerializedName("short")
    private Boolean isShort;

    public static MattermostFields template(String title, String value, Boolean isShort) {
        return MattermostFields.builder()
                .title(title)
                .value(value)
                .isShort(isShort)
                .build();
    }
}

