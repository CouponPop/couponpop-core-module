package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

import java.util.List;

public record CouponUsageStatsFcmSendMessage(
        Long memberId,
        List<String> tokens,
        String topDong,
        int topHour,
        int activeEventCount
) {

    public static CouponUsageStatsFcmSendMessage of(Long memberId, List<String> tokens, String topDong, int topHour, int activeEventCount) {
        return new CouponUsageStatsFcmSendMessage(memberId, tokens, topDong, topHour, activeEventCount);
    }
}
