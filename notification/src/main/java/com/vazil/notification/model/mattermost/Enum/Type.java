package com.vazil.notification.model.mattermost.Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {
    BUTTON("button"),
    MENU("menu"),
    ;

    private final String type;
}
