package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class ItemContent {
    private String profile_text;
    private String profile_image_url;
    private String title_image_text;
    private String title_image_url;
    private String title_image_category;
    private Object[] items;
    private String sum;
    private String sum_op;
}
