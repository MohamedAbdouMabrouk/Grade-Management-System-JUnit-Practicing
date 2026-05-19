import com.testing.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student sc;

    @BeforeEach
    public void initStudent(){
         sc = new Student("Mohamed Abdou Mabrouk");
    }

    @Test
    public void TestAddStudent(){
        assertEquals("Mohamed Abdou Mabrouk", sc.getName());
        assertEquals(1001, sc.getID());
        assertEquals(0, sc.getGradeCount());
    }

    @Test
    public void TestGetName(){
        assertEquals("Mohamed Abdou Mabrouk", sc.getName());
    }

    @Test
    public void TestSetName(){
        sc.setName("Ahmed Abdou");
        assertEquals("Ahmed Abdou", sc.getName());
    }
}
