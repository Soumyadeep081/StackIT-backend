package com.stackit.app.services;

import com.stackit.app.models.Question;
import com.stackit.app.models.QuestionElasticDocument;

public interface IQuestionIndexService {
    

    void createQuestionIndex(Question question) ;
}
