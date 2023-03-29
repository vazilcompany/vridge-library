package com.vazil.notification.model.mattermost.Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Color {
    INFO("#009944"),
    ERROR("#cf000f"),
    WARNING("#f0541e")
    ;

    private final String color;
}
