package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;

import java.time.LocalDateTime;

public record CouponUsedMessage(
        String traceId,
        String token,
        Long couponId,
        Long memberId,
        Long storeId,
        Long eventId,
        String storeName,
        String eventName,
        CouponMessageType messageType,
        LocalDateTime occurredAt
) implements CouponFcmMessage {

    public static CouponUsedMessage of(String traceId, String token, Long couponId, Long memberId, Long storeId, String storeName, Long eventId, String eventName, CouponMessageType messageType, LocalDateTime occurredAt) {
        return new CouponUsedMessage(traceId, token, couponId, memberId, storeId, eventId, storeName, eventName, messageType, occurredAt);
    }
}

