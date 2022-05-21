package com.bookportal.service.impl;

import com.bookportal.model.classbookordered.Bookkk;
import com.bookportal.model.classbookordered.TypeFactor;
import com.bookportal.repo.TypeFactoryRepository;
import com.bookportal.service.UserLoginTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserLoginTrackServiceImpl implements UserLoginTrackService {

    @Autowired
    private TypeFactoryRepository typeFactoryRepository;

    @Override
    public TypeFactor addQuestion(TypeFactor typeFactor) {
        return this.typeFactoryRepository.save(typeFactor);
    }

    @Override
    public TypeFactor updateQuestion(TypeFactor typeFactor) {
        return this.typeFactoryRepository.save(typeFactor);
    }

    @Override
    public Set<TypeFactor> getQuestions() {
        return new HashSet<>(this.typeFactoryRepository.findAll());
    }

    @Override
    public TypeFactor getQuestion(Long questionId) {
        return this.typeFactoryRepository.findById(questionId).get();
    }

    @Override
    public Set<TypeFactor> getQuestionsOfQuiz(Bookkk bookkk) {
        return this.typeFactoryRepository.findByBookkk(bookkk);
    }

    @Override
    public void deleteQuestion(Long quesId) {
        TypeFactor typeFactor = new TypeFactor();
        typeFactor.setQuesId(quesId);
        this.typeFactoryRepository.delete(typeFactor);
    }

    @Override
    public TypeFactor get(Long questionsId) {
       return this.typeFactoryRepository.getOne(questionsId);
    }
}
