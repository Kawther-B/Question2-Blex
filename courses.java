/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class courses {
    private Map<String, String[]> courses;

    public courses() {
        courses = new HashMap<>();
        courses.put("BSE", new String[]{"Software Engineering", "900,000"});
        courses.put("BIT", new String[]{"Information Technology", "750,000"});
        courses.put("BCS", new String[]{"Computer Science", "800,000"});
        courses.put("BCE", new String[]{"Computer Engineering", "950,000"});
    }

    public String getCourseDetails(String courseID) {
        if (courses.containsKey(courseID)) {
            String[] details = courses.get(courseID);
            return "Course: " + details[0] + ", Tuition: " + details[1];
        } else {
            return "Wrong CourseID details";
        }
    }

    public static void main(String[] args) {
        courses balexCourses = new courses();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Balex Institute Course Information System.");
        System.out.print("Please enter the CourseID: ");
        String courseID = scanner.nextLine().toUpperCase();

        String courseDetails = balexCourses.getCourseDetails(courseID);
        System.out.println(courseDetails);

        scanner.close();
    }
}

