package ru.karian.univer.entity;

import ru.karian.univer.entity.impl.EnterUnivesity;
import ru.karian.univer.entity.impl.Learn;

import java.util.ArrayList;
import java.util.Random;

public class Student implements EnterUnivesity, Learn {
    private String name;
    private int age;
    ArrayList<Teacher> teachers;
    String university;

    public Student(String name, int age, ArrayList<Teacher> teachers, String university) {
        this.name = name;
        this.age = age;
        this.teachers = teachers;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n").append(name);
        sb.append(", возраст ").append(age);
        return sb.toString();
    }

    @Override
    public int getId() {
        int id;
        id = (int) (Math.random() * 1000);
        return id;
    }

    @Override
    public void visitLessons(Teacher teacher) {
        System.out.println("Студент " + this.name + " с ID " + getId() + " посетил занятие " + teacher.getSubject());
    }

    @Override
    public void passExams(Teacher teacher) {
        System.out.println("Студент " + this.name + " с ID " + getId() + " сдал экзамен по предмету:  " + teacher.getSubject() + " у преподавателя " + teacher.getName());

    }
}
