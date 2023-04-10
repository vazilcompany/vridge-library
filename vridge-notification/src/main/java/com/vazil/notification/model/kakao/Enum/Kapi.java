package com.vazil.notification.model.kakao.Enum;

public enum Kapi {
    // https://developers.kakao.com/tool/rest-api/reference
    // https://developers.kakao.com/docs/latest/ko/reference/rest-api-reference

    // 카카오 로그인
    USER_LOGOUT("/v1/user/logout"),   // 로그아웃
    USER_SIGNUP("/v1/user/signup"),   // 연결하기
    USER_UNLINK("/v1/user/unlink"),   // 연결 끊기
    USER_ACCESS_TOKEN_INFO("/v1/user/access_token_info"),   // 토큰 정보 보기
    USER_ME("/v2/user/me"),   // 사용자 정보 가져오기
    USER_UPDATE_PROFILE("/v1/user/update_profile"),   // 사용자 정보 저장하기
    USER_SHIPPING_ADDRESS("/v1/user/shipping_address"),   // 배송지 조회하기
    USER_IDS("/v1/user/ids"),   // 사용자 목록 가져오기
    APP_USERS("/v2/app/users"),   // 여러 사용자 정보 가져오기
    USER_SCOPES("/v2/user/scopes"),   // 동의 내역 확인하기
    USER_REVOKE_SCOPES("/v2/user/revoke/scopes"),   // 동의 철회하기
    USER_SERVICE_TERMS("/v1/user/service/terms"),   // 동의한 약관 확인하기
    OIDC_USER_INFO("/v1/oidc/userinfo"),   // OIDC: 사용자 정보 가져오기


    // 카카오톡 소셜
    TALK_PROFILE("/v1/api/talk/profile"),   // 카카오톡 프로필 받기
    TALK_FRIENDS("/v1/api/talk/friends"),   // 카카오톡 친구 목록 가져오기


    // 메세지
    TALK_MEMO_DEFAULT_SEND("/v2/api/talk/memo/default/send"),   // 나에게 기본 템플릿으로 메시지 보내기
    TALK_MEMO_SEND("/v2/api/talk/memo/send"),   // 나에게 사용자 정의 템플릿으로 메시지 보내기
    TALK_MEMO_SCRAP_SEND("/v2/api/talk/memo/scrap/send"),   // 나에게 스크랩 메시지 보내기
    TALK_FRIENDS_MESSAGE_DEFAULT_SEND("/v1/api/talk/friends/message/default/send"),   // 친구에게 기본 템플릿으로 메시지 보내기
    TALK_FRIENDS_MESSAGE_SEND("/v1/api/talk/friends/message/send"),   // 친구에게 사용자 정의 템플릿으로 메시지 보내기
    TALK_FRIENDS_MESSAGE_SCRAP_SEND("/v1/api/talk/friends/message/scrap/send"),   // 친구에게 스크랩 메시지 보내기

    // 카카오스토리
    STORY_ISSTORYUSER("/v1/api/story/isstoryuser"),   // 사용자 확인하기
    STORY_PROFILE("/v1/api/story/profile"),   // 프로필 받기
    STORY_POST_NOTE("/v1/api/story/post/note"),   // 내 스토리 쓰기(글)
    STORY_POST_PHOTO("/v1/api/story/post/photo"),   // 내 스토리 쓰기(사진)
    STORY_POST_LINK("/v1/api/story/post/link"),   // 내 스토리 쓰기(링크)
    STORY_MYSTORY("/v1/api/story/mystory"),   // 내 스토리 가져오기(지정)
    STORY_MYSTORIES("/v1/api/story/mystories"),   // 내 스토리 가져오기(여러 개)
    STORY_DELETE_MYSTORY("/v1/api/story/delete/mystory"),   // 내 스토리 삭제하기
    STORY_UPLOAD_MULTI("/v1/api/story/upload/multi"),   // 이미지 업로드하기
    STORY_LINKINFO("/v1/api/story/linkinfo"),   // 웹 페이지 스크랩하기


    // 카카오톡 채널
    TALK_CHANNELS("/v1/api/talk/channels"),   // 카카오톡 채널 관계 확인하기
    TALK_CHANNELS_CREATE_TARGET_USER_FILE("/v1/talkchannel/create/target_user_file"),   // 고객 관리: 파일 등록하기
    TALK_CHANNELS_TARGET_USER_FILE("/v1/talkchannel/target_user_file"),   // 고객 관리: 파일 보기
    TALK_CHANNELS_UPDATE_TARGET_USERS("/v1/talkchannel/update/target_users"),   // 고객 관리: 사용자 추가하기
    TALK_CHANNELS_DELETE_TARGET_USERS("/v1/talkchannel/delete/target_users"),   // 고객 관리: 사용자 삭제하기


    // 카카오페이
    PAYMENT_READY("/v1/payment/ready"),   // 단건 결제 준비, 정기 결제 시작
    PAYMENT_APPROVE("/v1/payment/approve"),   // 단건 결제 승인
    PAYMENT_SUBSCRIPTION("/v1/payment/subscription"),   // 정기 결제 요청(2회차)
    PAYMENT_CANCEL("/v1/payment/cancel"),   // 결제 취소
    PAYMENT_ORDER("/v1/payment/order"),   // 주문 조회
    PAYMENT_MANAGE_SUBSCRIPTION_STATUS("/v1/payment/manage/subscription/status"),   // 정기 결제 상태 조회
    PAYMENT_MANAGE_SUBSCRIPTION_INACTIVE("/v1/payment/manage/subscription/inactive"),   // 정기결제 비활성화


    // 푸시 알림
    PUSH_REGISTER("/v2/push/register"),   // 푸시 토큰 등록하기
    PUSH_TOKENS("/v2/push/tokens"),   // 푸시 토큰 보기
    PUSH_DEREGISTER("/v2/push/deregister"),   // 푸시 토큰 삭제하기
    PUSH_SEND("/v2/push/send"),   // 푸시 알림 보내기


    // 톡캘린더
    CALENDAR_CALENDARS("/v2/api/calendar/calendars"),   // 사용자 캘린더 > 목록 가져오기
    CALENDAR_CREATE_CALENDAR("/v2/api/calendar/create/calendar"),   // 사용자 캘린더 > 생성하기: 서브 캘린더
    CALENDAR_UPDATE_CALENDAR("/v2/api/calendar/update/calendar"),   // 사용자 캘린더 > 수정하기: 서브 캘린더
    CALENDAR_DELETE_CALENDAR("/v2/api/calendar/delete/calendar"),   // 사용자 캘린더 > 삭제하기: 서브 캘린더
    CALENDAR_CREATE_EVENT("/v2/api/calendar/create/event"),   // 일반 일정 > 생성하기
    CALENDAR_EVENTS("/v2/api/calendar/events"),   // 일반 일정 > 목록 가져오기
    CALENDAR_EVENT("/v2/api/calendar/event"),   // 일반 일정 > 상세 조회하기
    CALENDAR_UPDATE_EVENT_HOST("/v2/api/calendar/update/event/host"),   // 일반 일정 > 수정하기
    CALENDAR_UPDATE_EVENT_GUEST("/v2/api/calendar/update/event/guest"),   // 일반 일정 > 수정하기: 게스트 일정
    CALENDAR_DELETE_EVENT("/v2/api/calendar/delete/event"),   // 일반 일정 > 삭제하기
    CALENDAR_PUBLIC_CREATE_EVENT("/v2/api/calendar/public/create/event"),   // 공개 일정 > 생성하기
    CALENDAR_PUBLIC_EVENTS("/v2/api/calendar/public/events"),   // 공개 일정 > 목록 가져오기
    CALENDAR_PUBLIC_EVENT("/v2/api/calendar/public/event"),   // 공개 일정 > 상세 조회하기
    CALENDAR_PUBLIC_UPDATE_EVENT("/v2/api/calendar/public/update/event"),   // 공개 일정 > 수정하기
    CALENDAR_PUBLIC_DELETE_EVENT("/v2/api/calendar/public/delete/event"),   // 공개 일정 > 삭제하기
    CALENDAR_PUBLIC_FOLLOW("/v2/api/calendar/public/follow"),   // 공개 일정 > 사용자 캘린더에 추가하기
    CALENDAR_SUBSCRIBABLE_CALENDARS("/v2/api/calendar/subscribable/calendars"),   // 구독 캘린더 > 구독 가능 캘린더 목록 가져오기
    CALENDAR_SUBSCRIBE("/v2/api/calendar/subscribe"),   // 구독 캘린더 > 구독하기
    CALENDAR_UNSUBSCRIBE("/v2/api/calendar/unsubscribe"),   // 구독 캘린더 > 구독 해제하기
    CALENDAR_HOLIDAYS("/v2/api/calendar/holidays"),   // 공휴일 및 주요 기념일 조회하기


    ;

    private final String link;

    Kapi(String link) {
        this.link = link;
    }

    public String getLink() {
        return "https://kapi.kakao.com" + link;
    }
}
