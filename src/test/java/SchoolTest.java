import com.testing.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    private static Student sc;
    @BeforeAll
    public static void initStudent(){
         sc = new Student("Mohamed Abdou Mahmoud");
    }

    @Test
    public void addStudent(){
        assertEquals("Mohamed Abdou Mahmoud", sc.getName());
        assertEquals(1001, sc.getID());
        assertEquals(0, sc.getGradeCount());
    }



}
