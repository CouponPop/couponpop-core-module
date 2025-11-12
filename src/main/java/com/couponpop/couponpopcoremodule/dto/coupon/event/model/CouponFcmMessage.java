package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import java.time.LocalDateTime;


public interface CouponFcmMessage {

    String traceId();

    String token();

    Long couponId();

    Long memberId();

    Long storeId();

    Long eventId();

    LocalDateTime occurredAt();
}
