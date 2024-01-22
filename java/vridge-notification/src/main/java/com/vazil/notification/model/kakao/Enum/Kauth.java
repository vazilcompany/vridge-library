package com.vazil.notification.model.kakao.Enum;

public enum Kauth {

    AUTHORIZE("/oauth/authorize"),   //인가 코드 받기, 추가 항목 동의 받기, 약관 선택해 동의 받기, 카카오톡에서 자동 로그인
    TOKEN("/oauth/token"),   // 토큰 받기, 토큰 갱신하기
    LOGOUT("/oauth/logout"), //카카오계정과 함께 로그아웃

    WELL_KNOWN_OPENID_CONFIGURATION ("/.well-known/openid-configuration"),   // OIDC: 메타데이터 확인하기
    WELL_KNOWN_JWKS_JSON("/.well-known/jwks.json	"),   // OIDC: 공개키 목록 조회하기
    TOKEN_INFO("/oauth/tokeninfo"),   // OIDC: ID 토큰 정보 보기

    ;
    private String link;

    Kauth(String link) {
        this.link = link;
    }

    public String getLink() {
        return "https://kauth.kakao.com" + link;
    }
}
