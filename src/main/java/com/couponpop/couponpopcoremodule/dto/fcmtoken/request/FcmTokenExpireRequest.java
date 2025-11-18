package com.couponpop.couponpopcoremodule.dto.fcmtoken.request;

public record FcmTokenExpireRequest(
        Long memberId,
        String fcmToken
) {
    public static FcmTokenExpireRequest of(Long memberId, String fcmToken) {
        return new FcmTokenExpireRequest(memberId, fcmToken);
    }
}
