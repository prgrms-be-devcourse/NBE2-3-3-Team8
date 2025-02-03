package org.programmers.signalbuddy.domain.member.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.programmers.signalbuddy.domain.admin.dto.AdminMemberResponse
import org.programmers.signalbuddy.domain.member.service.AdminService
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/admins")
@Tag(name = "Admins")
class AdminController(
    private val adminService: AdminService
) {

    @Operation(summary = "사용자 전체 조회 API")
    @GetMapping("/members")
    fun getAllMembers(
        @PageableDefault(
            page = 0,
            size = 10,
            sort = ["email"]
        ) pageable: Pageable
    ): ResponseEntity<List<AdminMemberResponse>>? {
        val members = adminService.getAllMembers(pageable)
        return ResponseEntity.ok(members)
    }

    @Operation(summary = "사용자 상세 조회 API")
    @GetMapping("/members/{id}")
    fun getAllMembers(@PathVariable id : Long): ResponseEntity<AdminMemberResponse>? {
        val member = adminService.getMember(id)
        return ResponseEntity.ok(member)
    }
}