package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class Commerce {
    private Integer regular_price;
    private Integer discount_price;
    private Integer discount_rate;
}
