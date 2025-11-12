package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString(callSuper = true)
public class CouponUsedMessage extends AbstractCouponFcmMessage {

    private final String storeName;
    private final String eventName;
    private final CouponMessageType messageType;

    private CouponUsedMessage(String traceId, String token, Long couponId, Long memberId, Long storeId, Long eventId, String storeName, String eventName, CouponMessageType messageType, LocalDateTime occurredAt) {
        super(traceId, token, couponId, memberId, storeId, eventId, occurredAt);
        this.storeName = storeName;
        this.eventName = eventName;
        this.messageType = messageType;
    }

    public static CouponUsedMessage of(String traceId, String token, Long couponId, Long memberId, Long storeId, String storeName, Long eventId, String eventName, CouponMessageType messageType, LocalDateTime occurredAt) {
        return new CouponUsedMessage(traceId, token, couponId, memberId, storeId, eventId, storeName, eventName, messageType, occurredAt);
    }
}

