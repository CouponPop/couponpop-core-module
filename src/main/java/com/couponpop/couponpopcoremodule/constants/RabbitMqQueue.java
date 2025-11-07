package com.couponpop.couponpopcoremodule.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RabbitMqQueue {

    // Queue
    public static final String COUPON_USED_QUEUE = "coupon.queue.used";
    public static final String COUPON_ISSUED_QUEUE = "coupon.queue.issued";

}
