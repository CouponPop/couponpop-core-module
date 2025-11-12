package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;

import java.time.LocalDateTime;

public record CouponIssuedMessage(
        String traceId,
        String token,
        Long couponId,
        Long memberId,
        Long storeId,
        Long eventId,
        String storeName,
        String eventName,
        int totalCount,
        int issuedCount,
        CouponMessageType messageType,
        LocalDateTime occurredAt
) implements CouponFcmMessage {

    public static CouponIssuedMessage of(String traceId, String token, Long couponId, Long memberId, Long storeId, Long eventId, String storeName, String eventName, int totalCount, int issuedCount, CouponMessageType messageType, LocalDateTime occurredAt) {
        return new CouponIssuedMessage(traceId, token, couponId, memberId, storeId, eventId, storeName, eventName, totalCount, issuedCount, messageType, occurredAt);
    }
}
