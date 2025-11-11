package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;

public record CouponIssuedMessage(
        String traceId,
        String token,
        Long couponId,
        Long memberId,
        Long storeId,
        String storeName,
        Long eventId,
        int totalCount,
        int issuedCount,
        String eventName,
        CouponMessageType messageType
) {
    public static CouponIssuedMessage of(String traceId, String token, Long couponId, Long memberId, Long storeId, String storeName, Long eventId, int totalCount, int issuedCount, String eventName, CouponMessageType messageType) {
        return new CouponIssuedMessage(
                traceId,
                token,
                couponId,
                memberId,
                storeId,
                storeName,
                eventId,
                totalCount,
                issuedCount,
                eventName,
                messageType
        );
    }
}
