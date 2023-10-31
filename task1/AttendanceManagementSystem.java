import java.util.Scanner;

public class AttendanceManagementSystem {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Attendance Management System!");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Get the student's ID number
        System.out.println("Enter your ID number:");
        int id = scanner.nextInt();

        // Get the student's attendance record
        System.out.println("Enter your attendance record in a week (1 for Present, 0 for Absent):");
        int[] attendanceRecord = new int[10];
        for (int i = 0; i < attendanceRecord.length; i++) {
            attendanceRecord[i] = scanner.nextInt();
        }

        // Calculate the student's attendance percentage
        int totalAttendance = 0;
        for (int i = 0; i < attendanceRecord.length; i++) {
            totalAttendance += attendanceRecord[i];
        }
        float attendancePercentage = (float) totalAttendance / 6 * 10;

        // Display the student's attendance record
        System.out.println("Here is your attendance record:");
        for (int i = 0; i < attendanceRecord.length; i++) {
            System.out.println("Week " + (i + 1) + ": " + attendanceRecord[i]);
        }

        // Display the student's attendance percentage
        System.out.println("Your attendance percentage is " + attendancePercentage + "%.");

        // Determine the student's attendance status
        if (attendancePercentage >= 75) {
            System.out.println("You are in good attendance records.");
        } else {
            System.out.println("Your attendance is short and you are in danger of failing.");
        }
    }
}
