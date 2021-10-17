package com.fyu.board.domain.post.dto.response

import com.fyu.board.domain.post.entity.Post

data class PostResDto(
    val id: Long,
    val title: String,
    val contents: String,
    val views: Int
) {
    fun toDto(post: Post) = PostResDto(id, title, contents, views)
}