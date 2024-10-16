package org.example.xianxingchazhao;

/**
 * Created by Pascal on 2024/9/27.
 */
public class Student implements Comparable<Student>{
    private String name;

    private int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object student){
        if (this == student) {
            return false;
        }
        if (student == null) {
            return false;
        }
        if (this.getClass() != student.getClass()) {
            return false;
        }
        Student st1 = (Student) student;
        return this.name.equals(st1.name);
    }

    @Override
    public String toString() {
        return String.format("Student(name %s,score %d)", name,score);
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}
