package com.bupt.echoassistantbackend.controller;

import com.bupt.echoassistantbackend.common.BaseResponse;
import com.bupt.echoassistantbackend.common.ErrorCode;
import com.bupt.echoassistantbackend.common.utils.ResultUtils;
import com.bupt.echoassistantbackend.exception.BusinessException;
import com.bupt.echoassistantbackend.model.request.UserRegisterRequest;
import com.bupt.echoassistantbackend.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 *
 * @author Ni Xiang
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户注册
     *
     * @param registerRequest user register request
     * @return {@link BaseResponse }<{@link Long }>
     * @author Ni Xiang
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest registerRequest,
                                           HttpServletRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if (registerRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long result = userService.userRegister(registerRequest, request);
        return ResultUtils.success(result);
    }
}
