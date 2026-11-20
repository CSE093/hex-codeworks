import java.util.Comparator;

public class CourseUtility {

    public static Comparator<Course> getComparator(String direction) {

        if (direction.equals("ASC")) {
            return Comparator.comparingInt(c -> c.fee);
        }
        else {
            return Comparator.comparingInt((Course c) -> c.fee).reversed();
        }
    }
}