package com.couponpop.couponpopcoremodule.dto.coupon.event.model;

public record CouponUsageStatsFcmSendMessage(
        String traceId,
        Long memberId,
        String token,
        String topDong,
        int topHour,
        int activeEventCount
) {

    public static CouponUsageStatsFcmSendMessage of(String traceId, Long memberId, String token, String topDong, int topHour, int activeEventCount) {
        return new CouponUsageStatsFcmSendMessage(traceId, memberId, token, topDong, topHour, activeEventCount);
    }
}
