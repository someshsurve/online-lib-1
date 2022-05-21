package com.bookportal.service;

import com.bookportal.model.classbookordered.TypeFactor;
import com.bookportal.model.classbookordered.Bookkk;

import java.util.Set;

public interface UserLoginTrackService {

    public TypeFactor addQuestion(TypeFactor typeFactor);

    public TypeFactor updateQuestion(TypeFactor typeFactor);

    public Set<TypeFactor> getQuestions();

    public TypeFactor getQuestion(Long questionId);

    public Set<TypeFactor> getQuestionsOfQuiz(Bookkk bookkk);

    public void deleteQuestion(Long quesId);

    public TypeFactor get(Long questionsId);

}
