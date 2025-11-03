package com.couponpop.couponpopcoremodule.dto.couponevent.response;

public record StoreOwnershipResponse(
        boolean isOwner
) {
    public static StoreOwnershipResponse of(boolean isOwner) {
        return new StoreOwnershipResponse(isOwner);
    }
}
