package com.exam.controller;

import com.exam.model.UserPage;
import com.exam.model.exam.Quiz;
import com.exam.service.UserPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/userpagebooks")
public class UserPageController {
    @Autowired
    private UserPageService userPageService;

    @PostMapping("/")
    public ResponseEntity<UserPage> add(@RequestBody UserPage page) {
        return ResponseEntity.ok(this.userPageService.addUserPage(page));
    }

    @PutMapping("/")
    public ResponseEntity<UserPage> update(@RequestBody UserPage page) {
        return ResponseEntity.ok(this.userPageService.updateUserPage(page));
    }

    @GetMapping("/")
    public ResponseEntity<?> UserPagebooks() {
        return ResponseEntity.ok(this.userPageService.getUserPages());
    }

    @GetMapping("/{qid}")
    public UserPage page(@PathVariable("qid") Long qid) {
        return this.userPageService.getUserPage(qid);
    }

    @DeleteMapping("/{qid}")
    public void delete(@PathVariable("qid") Long qid) {
        this.userPageService.deleteUserPage(qid);
    }
}
