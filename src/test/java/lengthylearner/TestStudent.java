package lengthylearner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(659L, "Doyle", 20.0);
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(659L, "Doyle", 20.0);
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(432L, "Mike", 5.0);
        student.learn(6.0);
        assertEquals(11.0, student.getTotalStudyTime());
    }

}