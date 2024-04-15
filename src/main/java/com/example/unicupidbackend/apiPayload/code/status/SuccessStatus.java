package com.example.unicupidbackend.apiPayload.code.status;

import com.example.unicupidbackend.apiPayload.code.BaseCode;
import com.example.unicupidbackend.apiPayload.code.ReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    //일반 응답
    _OK(HttpStatus.OK, "COMMON200", "성공입니다.");
    /*
    * 2001: 생성 성공, 2002: 조회 성공, 2003: 수정 성공, 2004: 삭제 성공
    * */

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;


    @Override
    public ReasonDTO getReason(){
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus(){
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build()
                ;
    }
}
