package com.couponpop.couponpopcoremodule.enums.coupon;

import lombok.AllArgsConstructor;

@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public enum CouponMessageType {

    ISSUED("issued"),
    USED("used"),
    EXPIRED("expired"),
    CANCELED("canceled");

    private final String type;

    public static CouponMessageType from(String couponStatus) {
        for (CouponMessageType messageType : values()) {
            if (messageType.type.equals(couponStatus)) return messageType;
        }
        throw new IllegalArgumentException("Unknown routingKey: " + couponStatus);
    }
}
