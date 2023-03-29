package com.vazil.notification.model.mattermost.Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Style {
    DEFAULT("default"),
    PRIMARY("primary"),
    DANGER("danger"),
    ;

    private final String style;
}
