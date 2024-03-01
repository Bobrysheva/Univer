package ru.karian.univer.entity.impl;

import ru.karian.univer.entity.Teacher;

public interface Learn {
    void visitLessons(Teacher teacher);

    void passExams(Teacher teacher);

}
