package ru.karian.univer._main;

import ru.karian.univer.entity.Student;
import ru.karian.univer.entity.Teacher;
import ru.karian.univer.entity.University;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Сергей Панин", 35, "История", "РГГУ");
        Teacher teacher2 = new Teacher("Светлана Сергеевна", 40, "Геология", "РГГУ");
        Teacher teacher3 = new Teacher("Дмитрий Анатольевич", 50, "География", "РГГУ");

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        Student student1 = new Student("Алексей Воробьев", 23, teachers, "РГГУ");
        Student student2 = new Student("Ольга Иванова", 17, teachers, "РГГУ");
        Student student3 = new Student("Ирина Петрова", 18, teachers, "РГГУ");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        University university = new University("РГГУ", teachers, students);

        System.out.println(university.startSemester());
        System.out.println("Студенту с именем " + student1.getName() + " присвоен ID: " + student1.getId());
        student2.visitLessons(teacher2);
        student3.passExams(teacher3);
        System.out.println("Преподавателю с именем " + teacher1.getName() + " присвоен ID: " + teacher1.getId());
        System.out.println(teacher2.takeGroup(students));
        teacher3.teachGroup(students);
    }
}