package com.fyu.board.domain.post.entity

import com.fyu.board.domain.global.entity.BaseTimeEntity
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

    private val views: Int

): BaseTimeEntity()