package com.study.test;

import java.util.List;

public class SubjectService {
    private List<String> subjects;

    public SubjectService(List<String> subject) {
        this.subjects = subject;
    }

    public void showSubjects(){
        int length = 3;
        for(int i = 0; i < length; i++) {
            System.out.println(subjects.get(i));
        }
    }
}

