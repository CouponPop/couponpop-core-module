package com.couponpop.couponpopcoremodule.dto.store.response;

import java.util.List;

public record StoreIdsByDongResponse(
        String dong,
        List<Long> storeIds
) {

    public static StoreIdsByDongResponse of(String dong, List<Long> storeIds) {
        return new StoreIdsByDongResponse(dong, storeIds);
    }
}
