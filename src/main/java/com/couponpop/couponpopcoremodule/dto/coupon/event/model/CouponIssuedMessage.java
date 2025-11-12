package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import com.couponpop.couponpopcoremodule.enums.coupon.CouponMessageType;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString(callSuper = true)
public class CouponIssuedMessage extends AbstractCouponFcmMessage {

    private final String storeName;
    private final int totalCount;
    private final int issuedCount;
    private final String eventName;
    private final CouponMessageType messageType;

    public CouponIssuedMessage(String traceId, String token, Long couponId, Long memberId, Long storeId, Long eventId, String storeName, String eventName, int totalCount, int issuedCount, CouponMessageType messageType, LocalDateTime occurredAt) {
        super(traceId, token, couponId, memberId, storeId, eventId, occurredAt);
        this.storeName = storeName;
        this.totalCount = totalCount;
        this.issuedCount = issuedCount;
        this.eventName = eventName;
        this.messageType = messageType;
    }

    public static CouponIssuedMessage of(String traceId, String token, Long couponId, Long memberId, Long storeId, Long eventId, String storeName, String eventName, int totalCount, int issuedCount, CouponMessageType messageType, LocalDateTime occurredAt) {
        return new CouponIssuedMessage(traceId, token, couponId, memberId, storeId, eventId, storeName, eventName, totalCount, issuedCount, messageType, occurredAt);
    }
}
