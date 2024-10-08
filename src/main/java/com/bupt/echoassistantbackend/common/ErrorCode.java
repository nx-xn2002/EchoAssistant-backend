package com.bupt.echoassistantbackend.common;

import lombok.Getter;

/**
 * error code
 *
 * @author Ni Xiang
 */
@Getter
public enum ErrorCode {
    /**
     *
     */
    SUCCESS(0, "OK", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", "");
    /**
     * 状态码
     */
    private final int code;
    /**
     * 提示消息
     */
    private final String message;
    /**
     * 描述
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

}
