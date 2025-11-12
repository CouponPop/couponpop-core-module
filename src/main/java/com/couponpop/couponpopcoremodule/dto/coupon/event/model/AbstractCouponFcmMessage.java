package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class AbstractCouponFcmMessage {

    private final String traceId;
    private final String token;
    private final Long couponId;
    private final Long memberId;
    private final Long storeId;
    private final Long eventId;
    private final LocalDateTime occurredAt;
}
