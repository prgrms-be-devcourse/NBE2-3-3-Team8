package org.programmers.signalbuddy.domain.bookmark.exception

import org.programmers.signalbuddy.global.exception.ErrorCode
import org.springframework.http.HttpStatus

enum class BookmarkErrorCode(
    override val httpStatus: HttpStatus,
    override val code: Int,
    override val message: String
) : ErrorCode {

    NOT_FOUND_BOOKMARK(HttpStatus.NOT_FOUND, 10000, "해당 즐겨찾기를 찾을 수 없습니다."),
    INVALID_COORDINATES(HttpStatus.BAD_REQUEST, 10001, "위도 또는 경도 값이 유효하지 않습니다."),
    UNAUTHORIZED_MEMBER_ACCESS(HttpStatus.FORBIDDEN, 10002, "해당 즐겨찾기를 접근할 권한이 없습니다.");
}