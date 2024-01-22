package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class Link {
    // https://developers.kakao.com/console/app/845803/config/platform - 사이트 도메인 설정
    @Builder.Default
    private String web_url = "https://vridge.vazil.me";
    @Builder.Default
    private String mobile_web_url = "https://vridge.vazil.me";
    private String android_execution_params;
    private String ios_execution_params;
}
