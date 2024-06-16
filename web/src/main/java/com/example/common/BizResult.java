package com.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mirau on 2024/6/16.
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BizResult<T> {

    public static final String SUCCESS = "ok";
    public static final String FAIL = "fail";

    private int code;

    private String message = SUCCESS;
    private T data;

    private static final BizResult<Object> EMPTY_SUCCESS = new BizResult<>(0, SUCCESS, null);

    public static BizResult<Object> success() {
        return EMPTY_SUCCESS;
    }

    public static <T> BizResult<T> success(T data) {
        return new BizResult<>(0, SUCCESS, data);
    }

    public static <T> BizResult<T> error(int code, T data) {
        return error(code, FAIL, data);
    }

    public static <T> BizResult<T> error(int code, String msg, T data) {
        return new BizResult<>(code, msg, data);
    }

}
