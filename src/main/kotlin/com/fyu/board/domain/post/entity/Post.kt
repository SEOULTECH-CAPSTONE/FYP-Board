package com.fyu.board.domain.post.entity

import com.fyu.board.domain.global.entity.BaseTimeEntity
import com.fyu.board.domain.post.dto.request.CreatePostReqDto
import com.fyu.board.domain.post.dto.response.PostResDto
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Post(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0,

    private val title: String,

    private val contents: String,

    private val views: Int = 0

) : BaseTimeEntity() {

    fun from(post: Post) = PostResDto(id, title, contents, views)
}