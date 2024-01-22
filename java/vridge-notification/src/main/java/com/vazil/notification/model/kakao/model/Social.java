package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class Social {
    private Integer like_count;
    private Integer comment_count;
    private Integer shared_count;
    private Integer view_count;
    private Integer subscriber_count;
}
