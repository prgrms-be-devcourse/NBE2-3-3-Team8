package org.programmers.signalbuddy.domain.member.exception

import org.programmers.signalbuddy.global.exception.ErrorCode
import org.springframework.http.HttpStatus

enum class AdminErrorCode(
    override val httpStatus: HttpStatus,
    override val code: Int,
    override val message: String
) : ErrorCode {

    NOT_FOUND_MEMBER(HttpStatus.NOT_FOUND, 60000, "해당 사용자를 찾을 수 없습니다."),
    ALREADY_EXIST_EMAIL(HttpStatus.CONFLICT, 60001, "이미 존재하는 이메일 입니다."),
    PROFILE_IMAGE_LOAD_ERROR_NOT_EXIST_FILE(HttpStatus.INTERNAL_SERVER_ERROR, 60002, "유효하지 않은 URL 또는 읽을 수 없는 파일입니다."),
    WITHDRAWN_MEMBER(HttpStatus.FORBIDDEN, 60003, "탈퇴한 회원입니다."),
}