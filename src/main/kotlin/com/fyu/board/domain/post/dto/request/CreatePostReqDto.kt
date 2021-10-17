package com.fyu.board.domain.post.dto.request

import com.fyu.board.domain.post.entity.Post

data class CreatePostReqDto(

    val title: String,
    val contents: String
) {
    fun toEntity(): Post {
        return Post(title = this.title, contents = this.contents)
    }
}
