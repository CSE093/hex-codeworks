import java.util.Comparator;

public class CourseUtility {

    public static Comparator<Course> getComparator(String type) {

        if (type.equals("ASC")) {
            return Comparator.comparingInt(c -> c.fee);
        }
        else if (type.equals("DESC")) {
            return Comparator.comparingInt((Course c) -> c.fee).reversed();
        }
        else {
            return Comparator.comparing(c -> c.name);
        }
    }
}