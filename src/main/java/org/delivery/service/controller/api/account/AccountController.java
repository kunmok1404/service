package org.delivery.service.controller.api.account;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.delivery.service.api.common.Api;
import org.delivery.service.api.error.ErrorCode;
import org.delivery.service.api.error.UserErrorCode;
import org.delivery.service.exception.ApiException;
import org.delivery.service.repository.account.AccountRepository;
import org.delivery.service.vo.account.AccountVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/me")
    public Api<AccountVO> save() {
        var response =  AccountVO.builder()
                        .name("홍길동")
                        .email("A@gmail.com")
                        .registeredAt(LocalDateTime.now())
                        .build();

        var str = "안녕하세요.";

        try {
            var age = Integer.parseInt(str);
        } catch (Exception e) {
            throw new ApiException(ErrorCode.SERVER_ERROR, e, "사용자 Me 호출시 에러 발생");
        }

        return Api.OK(response);
    }
}
