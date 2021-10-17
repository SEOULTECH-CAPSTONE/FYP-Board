package com.fyu.board.domain.post.service

import com.fyu.board.domain.post.dao.PostRepository
import com.fyu.board.domain.post.dto.request.CreatePostReqDto
import com.fyu.board.domain.post.entity.Post
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService(
    private val postRepository: PostRepository,
) {

    @Transactional
    fun createPost(createPostReqDto: CreatePostReqDto): Post {
        return postRepository.save(createPostReqDto.toEntity())
    }

}