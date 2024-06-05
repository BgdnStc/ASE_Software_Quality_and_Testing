package test;

import classes.Student;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StudentTest {
    Student student;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
        student = new Student("John Doe", 21, new float[]{5, 6.5f, 8}, "john.doe@gmail.com");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test(expected = RuntimeException.class)
    public void constructor() {
        Student student = new Student(null, 0, null, null);
    }

    @Test
    public void setAgeRight() {
        Integer inputAge = 21;
        Integer expectedAge = inputAge;

        student.setAge(inputAge);
        Integer actualAge = student.getAge();

        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setAgeNull() {
        student.setAge(null);
        Integer actualAge = student.getAge();

        assertNull(actualAge);
    }

    @Test
    public void setAgeLow() {
        Integer inputAge = 15;

        student.setAge(inputAge);
        Integer actualAge = student.getAge();

        assertNull(actualAge);
    }

    @Test
    public void setAgeHigh() {
        Integer inputAge = 70;

        student.setAge(inputAge);
        Integer actualAge = student.getAge();

        assertNull(actualAge);
    }

    @Test
    public void setGradesRight() {
        float[] inputGrades = new float[]{5, 6.5f, 8};
        float[] expectedGrades = inputGrades;

        student.setGrades(inputGrades);
        float[] actualGrades = student.getGrades();

        assertEquals(expectedGrades, actualGrades);
    }

    @Test
    public void setGradesLow() {
        float[] inputGrades = new float[]{-1, 6.5f, 8};

        student.setGrades(inputGrades);
        float[] actualGrades = student.getGrades();

        assertNull(actualGrades);
    }

    @Test
    public void setGradesHigh() {
        float[] inputGrades = new float[]{5, 6.5f, 11};

        student.setGrades(inputGrades);
        float[] actualGrades = student.getGrades();

        assertNull(actualGrades);
    }

    @Test
    public void getStudentGradesAverage() {
        float expectedAverage = 6.5f;
        float actualAverage = student.getStudentGradesAverage();

        assertEquals(expectedAverage, actualAverage, 0);
    }
}