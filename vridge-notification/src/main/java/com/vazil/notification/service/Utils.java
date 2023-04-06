package com.vazil.notification.service;

import com.google.gson.Gson;

import java.lang.reflect.Method;
import lombok.Builder;

public class Utils {

    public static <T> String toJson(T message) {
        return new Gson().toJson(message);
    }


}
