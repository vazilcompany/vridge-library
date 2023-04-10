package com.vazil.notification.model.kakao.model;

import lombok.Builder;

@Builder
public class Content {
    @Builder.Default
    private String title = "";
    @Builder.Default
    private String image_url = "https://vridge.vazil.me/logo_v2/s01.png";
    @Builder.Default
    private Integer image_width = 150;
    @Builder.Default
    private Integer image_height = 90;
    private String description;
    private Object link;

//    https://d2q9yzkd471o7j.cloudfront.net/logo/logo_vertical.png
//    https://cf.channel.io/pub-file/85296/6385bee201c87b30b8a6/vbotface.png
//    https://vridge.vazil.me/logo_v2/s01.png
}
