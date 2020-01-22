/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Map;
import java.util.HashMap;

import entity.Student;

import java.util.Collection;


/**
 *
 * @author Mobile Apps
 */


public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Kwame", "Computer Science"));
                put(2, new Student(2, "Yaw", "Denis Broke"));
                put(3, new Student(3, "Hannah", "Hair-Do"));
                put(4, new Student(4, "Jet Brown", "Computer Repair"));
                put(5, new Student(5, "Stand By", "Air-Condition Repair"));
            }
        };
    }

    public Collection<Student> getAllStudent() {
        return StudentDao.students.values();
    }
}
