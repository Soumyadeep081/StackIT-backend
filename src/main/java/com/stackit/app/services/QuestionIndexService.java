package com.stackit.app.services;

import org.springframework.stereotype.Service;

import com.stackit.app.models.Question;
import com.stackit.app.models.QuestionElasticDocument;
import com.stackit.app.repositories.QuestionDocumentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionIndexService implements IQuestionIndexService {
    
    private final QuestionDocumentRepository questionDocumentRepository;

    @Override
    public void createQuestionIndex(Question question) {
        QuestionElasticDocument document = QuestionElasticDocument.builder()
            .id(question.getId())
            .title(question.getTitle())
            .content(question.getContent())
            .build();

        questionDocumentRepository.save(document);
    }
}
