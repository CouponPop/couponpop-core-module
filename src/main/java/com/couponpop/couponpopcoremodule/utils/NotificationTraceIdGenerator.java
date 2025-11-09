package com.couponpop.couponpopcoremodule.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.stream.Stream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NotificationTraceIdGenerator {

    public static String generate(Object... values) {

        String join = String.join(":", Stream.of(values)
                .map(NotificationTraceIdGenerator::normalize)
                .toArray(String[]::new));

        return UUID.nameUUIDFromBytes(join.getBytes(StandardCharsets.UTF_8)).toString();
    }

    private static String normalize(Object value) {
        if (value == null) {
            return "";
        }

        return value.toString();
    }
}
