package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;

public record CouponUsedMessage(
        String traceId,
        Long couponId,
        Long memberId,
        Long storeId,
        String storeName,
        Long eventId,
        String eventName,
        CouponMessageType messageType
) {
    public static CouponUsedMessage of(String traceId, Long couponId, Long memberId, Long storeId, String storeName, Long eventId, String eventName, CouponMessageType messageType) {
        return new CouponUsedMessage(
                traceId,
                couponId,
                memberId,
                storeId,
                storeName,
                eventId,
                eventName,
                messageType
        );
    }
}
