package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;

public record CouponUsedMessage(
        Long couponId,
        Long memberId,
        Long storeId,
        String storeName,
        Long eventId,
        String eventName,
        CouponMessageType couponStatus
) {
    public static CouponUsedMessage of(Long couponId, Long memberId, Long storeId, String storeName, Long eventId, String eventName, CouponMessageType messageType) {
        return new CouponUsedMessage(
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
