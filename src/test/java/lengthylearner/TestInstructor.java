package lengthylearner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestInstructor {
    private Instructor instructor;

    @BeforeEach
    public void setUp(){
        instructor = new Instructor(300L, "Bertha");
    }

    @Test
    public void testImplementation(){
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student1 = new Student(432L, "Doyle", 2.0);
        instructor.teach(student1, 6.0);
        assertEquals(8.0, student1.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        Student student1 = new Student(432L, "Doyle", 2.0);
        Student student2 = new Student(349L, "Kyle", 4.0);
        Learner[] learners = {student1, student2};
        instructor.lecture(learners, 4.0);
        assertEquals(4.0, student1.getTotalStudyTime());
    }

}