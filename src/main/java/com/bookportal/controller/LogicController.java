package com.bookportal.controller;

import com.bookportal.model.classbookordered.Bookkk;
import com.bookportal.model.classbookordered.TypeFactor;
import com.bookportal.service.BookkkkService;
import com.bookportal.service.UserLoginTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class LogicController {
    @Autowired
    private UserLoginTrackService service;

    @Autowired
    private BookkkkService bookkkkService;

    //add typeFactor
    @PostMapping("/")
    public ResponseEntity<TypeFactor> add(@RequestBody TypeFactor typeFactor) {
        return ResponseEntity.ok(this.service.addQuestion(typeFactor));
    }

    //update the typeFactor
    @PutMapping("/")
    public ResponseEntity<TypeFactor> update(@RequestBody TypeFactor typeFactor) {
        return ResponseEntity.ok(this.service.updateQuestion(typeFactor));
    }

    //get all question of any quid
    @GetMapping("/quiz/{qid}")
    public ResponseEntity<?> getQuestionsOfQuiz(@PathVariable("qid") Long qid) {
//        Bookkk bookkk = new Bookkk();
//        bookkk.setqId(qid);
//        Set<TypeFactor> questionsOfQuiz = this.service.getQuestionsOfQuiz(bookkk);
//        return ResponseEntity.ok(questionsOfQuiz);

        Bookkk bookkk = this.bookkkkService.getBook(qid);
        Set<TypeFactor> typeFactors = bookkk.getQuestions();
        List list = new ArrayList(typeFactors);
        if (list.size() > Integer.parseInt(bookkk.getNumberOfQuestions())) {
            list = list.subList(0, Integer.parseInt(bookkk.getNumberOfQuestions() + 1));
        }
        Collections.shuffle(list);
        return ResponseEntity.ok(list);


    }


    @GetMapping("/quiz/all/{qid}")
    public ResponseEntity<?> getQuestionsOfQuizAdmin(@PathVariable("qid") Long qid) {
        Bookkk bookkk = new Bookkk();
        bookkk.setqId(qid);
        Set<TypeFactor> questionsOfQuiz = this.service.getQuestionsOfQuiz(bookkk);
        return ResponseEntity.ok(questionsOfQuiz);

//        return ResponseEntity.ok(list);


    }


    //get single question
    @GetMapping("/{quesId}")
    public TypeFactor get(@PathVariable("quesId") Long quesId) {
        return this.service.getQuestion(quesId);
    }

    //delete question
    @DeleteMapping("/{quesId}")
    public void delete(@PathVariable("quesId") Long quesId) {
        this.service.deleteQuestion(quesId);
    }


    //eval quiz
    @PostMapping("/eval-quiz")
    public ResponseEntity<?> evalQuiz(@RequestBody List<TypeFactor> typeFactors) {
        System.out.println(typeFactors);
        double marksGot = 0;
        int correctAnswers = 0;
        int attempted = 0;
        for (TypeFactor q : typeFactors) {
            //single typeFactors
            TypeFactor typeFactor = this.service.get(q.getQuesId());
            if (typeFactor.getAnswer().equals(q.getGivenAnswer())) {
                //correct
                correctAnswers++;

                double marksSingle = Double.parseDouble(typeFactors.get(0).getQuiz().getMaxMarks()) / typeFactors.size();
                //       this.typeFactors[0].quiz.maxMarks / this.typeFactors.length;
                marksGot += marksSingle;

            }

            if (q.getGivenAnswer() != null) {
                attempted++;
            }

        }
        ;

        Map<String, Object> map = Map.of("marksGot", marksGot, "correctAnswers", correctAnswers, "attempted", attempted);
        return ResponseEntity.ok(map);

    }

}
