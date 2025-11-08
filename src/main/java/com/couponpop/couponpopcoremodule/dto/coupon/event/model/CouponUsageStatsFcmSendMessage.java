package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

public record CouponUsageStatsFcmSendMessage(
        Long memberId,
        String token,
        String topDong,
        int topHour,
        int activeEventCount
) {

    public static CouponUsageStatsFcmSendMessage of(Long memberId, String token, String topDong, int topHour, int activeEventCount) {
        return new CouponUsageStatsFcmSendMessage(memberId, token, topDong, topHour, activeEventCount);
    }
}
