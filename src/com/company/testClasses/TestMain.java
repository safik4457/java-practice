package com.company.testClasses;

public class TestMain {
    public static void main(String[] arg) {


        Student student = new Student();

        student.id = 1L;
        student.name = "Masud";
        student.age = 25;
        student.rollNo = 05;
        student.departmentName = "CSE";


        Teacher teacher = new Teacher();

        teacher.id = 1L;
        teacher.name = "Masud";
        teacher.age = 25;
        teacher.departmentName = "CSE";

        System.out.print(student.id + " "+ student.age + " "+ student.rollNo +" "+ student.departmentName);


        ProblemSolution s = new ProblemSolution();

        System.out.println(s.sum(2,3));
        System.out.println(s.sum(2,3,4));
        System.out.println(s.sum(2,3,4,5));
    }
}
