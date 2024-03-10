package ru.karian.univer.entity;

import ru.karian.univer.entity.impl.EnterUnivesity;
import ru.karian.univer.entity.impl.TeachStudents;

import java.util.ArrayList;

public class Teacher implements EnterUnivesity, TeachStudents {
    private String name;
    private int age;
    private String subject;
    private String univName;
    private ArrayList<Student> students;

    public Teacher(String name, int age, String subject, String univName) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.univName = univName;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n" + "Преподаватель: ").append("\n");
        sb.append("Имя: ").append(name).append(", предмет ").append(subject);
        return sb.toString();
    }

    @Override
    public int getId() {
        int id;
        id = (int) (Math.random() * 1000);
        return id;
    }

    @Override
    public String takeGroup(ArrayList<Student> group) {
        return this.getName() + " курирует группу студентов " + group.toString();

    }

    @Override
    public void teachGroup(ArrayList<Student> group) {
        System.out.println(this.getName() + "ведет занятие по предмету " + this.getSubject() + " для студентов: " + group.toString());
    }
}
