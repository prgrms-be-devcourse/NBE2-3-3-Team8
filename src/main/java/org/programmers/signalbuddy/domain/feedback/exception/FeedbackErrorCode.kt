package org.programmers.signalbuddy.domain.feedback.exception

import org.programmers.signalbuddy.global.exception.ErrorCode
import org.springframework.http.HttpStatus

enum class FeedbackErrorCode(
    override val httpStatus: HttpStatus,
    override val code: Int,
    override val message: String,
) : ErrorCode {

    NOT_FOUND_FEEDBACK(HttpStatus.NOT_FOUND, 40000, "해당 피드백을 찾을 수 없습니다."),
    FEEDBACK_MODIFIER_NOT_AUTHORIZED(HttpStatus.FORBIDDEN, 40001, "해당 게시물의 작성자와 일치하지 않습니다."),
    FEEDBACK_ELIMINATOR_NOT_AUTHORIZED(HttpStatus.FORBIDDEN, 40002, "해당 게시물의 작성자와 일치하지 않습니다.");
}
