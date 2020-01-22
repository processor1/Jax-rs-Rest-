/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Mobile Apps
 */
public class Student {
    
    private int studentId;
    private String studentName;
    private String studentCourse;

    public Student(int studentId, String studentName, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }
    
    
}
