package com.couponpop.couponpopcoremodule.dto.couponevent.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StoreOwnershipResponse(
        @JsonProperty("isOwner")
        boolean isOwner
) {
    public static StoreOwnershipResponse from(boolean isOwner) {
        return new StoreOwnershipResponse(isOwner);
    }
}
