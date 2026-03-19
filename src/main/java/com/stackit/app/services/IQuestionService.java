package com.stackit.app.services;

import java.util.List;

import com.stackit.app.dto.QuestionRequestDTO;
import com.stackit.app.dto.QuestionResponseDTO;
import com.stackit.app.models.Question;
import com.stackit.app.models.QuestionElasticDocument;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IQuestionService {
    
    public Mono<QuestionResponseDTO> createQuestion(QuestionRequestDTO questionRequestDTO);

    public Flux<QuestionResponseDTO> searchQuestions(String searchTerm, int offset, int page);

    public Flux<QuestionResponseDTO> getAllQuestions(String cursor, int size);

    public Mono<QuestionResponseDTO> getQuestionById(String id);

    public List<QuestionElasticDocument> searchQuestionsByElasticsearch(String query);
}
