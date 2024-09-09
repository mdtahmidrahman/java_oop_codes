/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modifiedstudent;

/**
 *
 * @author HP
 */

import com.mycompany.modifiedstudent.Student;

public class StudentTest
{
    public static void main(String[] args)
    {
        // Create a new Student object
        Student student1 = new Student("John Doe", 0.0);

        // Display initial information
        System.out.printf("Initial Student Name: %s%n", student1.getName());
        System.out.printf("Initial Student Average: %.2f%n", student1.getAverage());
        
        // Calculate and update class average
        student1.calculateClassAverage();
        
        // Display updated information
        System.out.printf("Updated Student Name: %s%n", student1.getName());
        System.out.printf("Updated Student Average: %.2f%n", student1.getAverage());
        System.out.printf("Letter Grade: %s%n", student1.getLetterGrade());
    }
}
