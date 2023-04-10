package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class TemplateObject {
    private String object_type;  // feed, list, location, commerce, text  사용

    // Feed
    private Object item_content;

    // List
    private String header_title;
    private Object header_link;  // link 사용
    private Object[] contents;  // content 사용

    // Location
    private String address;
    private String address_title;

    // Commerce
    private Object commerce;

    // Text
    private String text;
    private Object link;

    // Content information
    private Object content;
    private Object social;

    // Button
    private String button_title;
    private Object[] buttons;
}
