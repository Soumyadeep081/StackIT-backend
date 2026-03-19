package com.stackit.app.adapter;

import com.stackit.app.dto.QuestionResponseDTO;
import com.stackit.app.models.Question;

public class QuestionAdapter {
    
    public static QuestionResponseDTO toQuestionResponseDTO(Question question) {
        return QuestionResponseDTO.builder()
            .id(question.getId())
            .title(question.getTitle())
            .content(question.getContent())
            .createdAt(question.getCreatedAt())
            .build();
    }
}
