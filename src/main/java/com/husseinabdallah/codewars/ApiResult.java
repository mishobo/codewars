package com.husseinabdallah.codewars;

import java.util.Objects;

public record ApiResult<T>(T data, String msg, boolean success) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiResult<?> that = (ApiResult<?>) o;
        return success == that.success && Objects.equals(data, that.data) && Objects.equals(msg, that.msg);
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", success=" + success +
                '}';
    }
}
