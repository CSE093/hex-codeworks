import java.util.*;

public class SortApp {

    public static void main(String[] args) {

        Course c1 = new Course(101, "Java", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 8000);
        Course c5 = new Course(105, "Angular", 12000);

        List<Course> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        System.out.println("All Courses");
        for (Course c : list) {
            System.out.println(c);
        }

        System.out.println("\nFee Low to High");
        Collections.sort(list, CourseUtility.getComparator("ASC"));

        for (Course c : list) {
            System.out.println(c);
        }

        System.out.println("\nFee High to Low");
        Collections.sort(list, CourseUtility.getComparator("DESC"));

        for (Course c : list) {
            System.out.println(c);
        }

        System.out.println("\nSort by Name");
        Collections.sort(list, CourseUtility.getComparator("NAME"));

        for (Course c : list) {
            System.out.println(c);
        }
    }
}