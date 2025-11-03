package com.couponpop.couponpopcoremodule.dto.fcmtoken.request;

public record FcmTokenExpireRequest(
        String fcmToken
) {
    public static FcmTokenExpireRequest from(String fcmToken) {
        return new FcmTokenExpireRequest(fcmToken);
    }
}
