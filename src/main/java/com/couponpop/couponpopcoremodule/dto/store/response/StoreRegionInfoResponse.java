package com.couponpop.couponpopcoremodule.dto.store.response;

public record StoreRegionInfoResponse(
        Long storeId,
        String dong
) {

    public static StoreRegionInfoResponse of(Long storeId, String dong) {
        return new StoreRegionInfoResponse(storeId, dong);
    }
}
