package com.example.pictgram.form;

import lombok.Data;

@Data
public class FavoriteForm {

    private Long userId;

    private Long topicId;

    private TopicForm topic;
}