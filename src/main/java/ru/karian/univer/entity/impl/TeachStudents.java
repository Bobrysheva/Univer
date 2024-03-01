package ru.karian.univer.entity.impl;

import ru.karian.univer.entity.Student;

import java.util.ArrayList;

public interface TeachStudents {
    String takeGroup(ArrayList<Student> group);

    void teachGroup(ArrayList<Student> group);
}
