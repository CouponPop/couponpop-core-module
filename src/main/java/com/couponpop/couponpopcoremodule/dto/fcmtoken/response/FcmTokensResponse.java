package com.couponpop.couponpopcoremodule.dto.fcmtoken.response;

import java.util.List;

public record FcmTokensResponse(
        Long memberId,
        List<String> fcmTokens
) {

    public static FcmTokensResponse of(Long memberId, List<String> fcmTokens) {
        return new FcmTokensResponse(memberId, fcmTokens);
    }
}
