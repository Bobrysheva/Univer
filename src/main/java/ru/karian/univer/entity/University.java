package ru.karian.univer.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class University {
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
    private String name;

    public University(String name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

    public String startSemester() {
        final StringBuilder sb = new StringBuilder("В университете: ");
        sb.append(name).append(" начали работу преподаватели: ").append("\n");
        sb.append(teachers.toString());
        sb.append("\nИ начали учебу студенты студенты: ").append(students).append("\n");
        return sb.toString();
    }
}
