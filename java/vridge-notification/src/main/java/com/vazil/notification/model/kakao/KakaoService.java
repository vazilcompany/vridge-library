//package com.vazil.core.notification.service;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import com.vazil.core.notification.ConnectionManager;
//import com.vazil.core.notification.model.Enum.kakao.Kapi;
//import com.vazil.core.notification.model.Enum.kakao.Kauth;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.lang.reflect.Type;
//import java.net.HttpURLConnection;
//import java.net.ProtocolException;
//import java.util.*;
//
//@Log4j2
//@Service
//@RequiredArgsConstructor
//public class KakaoService {
//
//    private final ConnectionManager connectionManager;
//
//    @Value("${spring.security.oauth2.client.registration.kakao.client-id}")
//    private String restApiKey;
//    @Value("${kakao-admin-key}")
//    private String adminKey;
//    @Value("${spring.security.oauth2.client.registration.kakao.redirect-uri}")
//    private String redirectUrl;
//    @Value("${spring.security.oauth2.client.registration.kakao.scope}")
//    private String scope;
//    private String logoutRedirectUrl;
//
//
//    private String accessToken;
//    private String refresh_token;
//
//
//
//    /*
//    KAUTH
//     */
//    //인가 코드 받기
//    public String getAutorizationCode() throws IOException, InterruptedException {
//        Map<String, String> param = new HashMap<>();
//        param.put("client_id", restApiKey);
//        param.put("redirect_uri", redirectUrl);
//        param.put("response_type", "code");
//        String requestUrl = Kauth.AUTHORIZE.getLink() + "?" + connectionManager.paramBuilder(param);
//        return requestUrl;
//    }
//
//
//    /*
//    KAPI
//    */
//    public Map<String, Object> getFriends() {
//        log.info("Get friends information");
//        String friendList = apiRequest(Kapi.TALK_FRIENDS.getLink(), HttpMethod.GET, null);
//        Type type = new TypeToken<Map<String, Object>>() {
//        }.getType();
//
//        Map<String, Object> friendInfo = new Gson().fromJson(friendList, type);
//
//        return friendInfo;
//    }
//
//    public void sendToMe(String content) {
//        Map<String, String> body = new HashMap<>();
//        body.put("template_object", content);
//        apiRequest(Kapi.TALK_MEMO_DEFAULT_SEND.getLink(), HttpMethod.POST, body);
//    }
//
//    public void sendMessage(String content) {
//        log.info("SENDING KAKAO MESSAGE to friend(s)");
//        List<Map<String, Object>> friendInfo = (List<Map<String, Object>>) getFriends().get("elements");
//
//        String[] uuids = friendInfo.stream().map(element -> "\"" + element.get("uuid") + "\"").toArray(String[]::new);
//
//        Map<String, String> body = new HashMap<>();
//        body.put("receiver_uuids", Arrays.toString(uuids));
//        body.put("template_object", content);
//
//        apiRequest(Kapi.TALK_FRIENDS_MESSAGE_DEFAULT_SEND.getLink(), HttpMethod.POST, body);
//        log.info("SENDING KAKAO MESSAGE EXECUTED");
//    }
//
//    /*
//    api 호출 방식을 정하기
//    */
//    public String apiRequest(String requestUrl, HttpMethod method, Map<String, String> param) {
//        log.info("Sending apiRequest to KAKAO");
//        if ((method == HttpMethod.GET && param != null) || (method == HttpMethod.DELETE && param != null)) {
//            requestUrl += "?" + connectionManager.paramBuilder(param);
//        }
//
//        HttpURLConnection connection = connectionManager.httpURLConnection(requestUrl);
//        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//        if (adminKeyUrl().contains(requestUrl)) {
//            connection.setRequestProperty("Authorization", "KakaoAK " + adminKey);
//        } else if (adminKeyOrAccessTokenUrl().contains(requestUrl) && accessToken.length() == 0) {
//            connection.setRequestProperty("Authorization", "KakaoAK " + adminKey);
//        } else if (restApiKeyUrl().contains(requestUrl)) {
//            connection.setRequestProperty("Authorization", "KakaoAK " + restApiKey);
//        } else {
//            connection.setRequestProperty("Authorization", "Bearer " + accessToken);
//        }
//
//        try {
//            connection.setRequestMethod(method.toString());
//        } catch (ProtocolException e) {
//            log.error("잘못된 HTTP 메서드 요청입니다. : {}", e.getMessage());
//        }
//
//        if (method == HttpMethod.POST) {
//            connectionManager.setUrlencodedBody(connection, param);
//        }
//
//        String response = connectionManager.sendRequest(connection);
//
//        connection.disconnect();
//        return response;
//    }
//
//
//    /*
//    인증 방식
//    */
//    public List<String> adminKeyUrl() {
//        List<Kapi> adminKeyList = List.of(Kapi.APP_USERS, Kapi.USER_IDS, Kapi.TALK_CHANNELS_CREATE_TARGET_USER_FILE, Kapi.TALK_CHANNELS_TARGET_USER_FILE, Kapi.TALK_CHANNELS_UPDATE_TARGET_USERS, Kapi.TALK_CHANNELS_DELETE_TARGET_USERS, Kapi.PUSH_REGISTER, Kapi.PUSH_TOKENS, Kapi.PUSH_SEND, Kapi.CALENDAR_PUBLIC_CREATE_EVENT, Kapi.CALENDAR_PUBLIC_EVENTS, Kapi.CALENDAR_PUBLIC_EVENT, Kapi.CALENDAR_PUBLIC_UPDATE_EVENT, Kapi.CALENDAR_PUBLIC_DELETE_EVENT, Kapi.CALENDAR_SUBSCRIBABLE_CALENDARS, Kapi.CALENDAR_HOLIDAYS);
//
//        List<String> adminKeyUrl = new ArrayList<>();
//        for (Kapi kapi : adminKeyList) {
//            adminKeyUrl.add(kapi.getLink());
//        }
//        return adminKeyUrl;
//    }
//
//    public List<String> adminKeyOrAccessTokenUrl() {
//        List<Kapi> list = List.of(Kapi.USER_LOGOUT, Kapi.USER_UNLINK, Kapi.USER_ME, Kapi.USER_SHIPPING_ADDRESS, Kapi.USER_SCOPES, Kapi.USER_REVOKE_SCOPES, Kapi.USER_SERVICE_TERMS, Kapi.TALK_CHANNELS);
//
//        List<String> bothAvailableUrl = new ArrayList<>();
//        for (Kapi kapi : list) {
//            bothAvailableUrl.add(kapi.getLink());
//        }
//        return bothAvailableUrl;
//    }
//
//    public List<String> restApiKeyUrl() {
//        List<Kapi> list = List.of(Kapi.PUSH_DEREGISTER);
//
//        List<String> restApiKeyUrl = new ArrayList<>();
//        for (Kapi kapi : list) {
//            restApiKeyUrl.add(kapi.getLink());
//        }
//        return restApiKeyUrl;
//    }
//}