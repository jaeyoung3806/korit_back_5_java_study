package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일0", 26));
        students.add(new Student("김준일1", 27));
        students.add(new Student("김준일2", 28));
        students.add(new Student("김준일3", 29));

        System.out.println(students);

        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(students.get(0).getAge() + 1);
        }

        // 향상된 for
        for(Student student : students){
            student.setAge(student.getAge() + 1);
        }
        System.out.println(students);

        students.forEach(student -> student.setAge(student.getAge() + 1 ));

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++){
            studentArray[i] = new Student("김준일", 31);
        }
        int i = 0;
        for(Student student : studentArray){
            studentArray[i] = new Student("김준일", 31);
            i++;
        }

        for(Student student : studentArray) {
            System.out.println(student);
        }

        students.set(0, new Student("김준일", 31));
    }
}
