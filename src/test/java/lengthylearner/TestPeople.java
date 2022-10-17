package lengthylearner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestPeople {

    @Test
    public void testAdd(){
        Student student1 = new Student(798L, "Doyle", 6.0);
        People people = new People();
        people.add(student1);
        assertTrue(people.contains(student1));
    }

    @Test
    public void testRemove(){
        int expected = 1;
        Student student1 = new Student(798L, "Doyle", 6.0);
        Student student2 = new Student(322L, "Mike", 4.0);
        People people = new People();
        people.add(student1);
        people.add(student2);
        people.remove(student2);
        assertEquals(expected, people.count());
    }

    @Test
    public void testFindById(){
        Student student1 = new Student(798L, "Doyle", 6.0);
        Student student2 = new Student(322L, "Mike", 4.0);
        People people = new People();
        people.add(student1);
        people.add(student2);
        people.findById(322L);
        assertEquals(student2, people.findById(322L));
    }

}