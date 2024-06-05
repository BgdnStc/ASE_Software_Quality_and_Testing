package classes;

public class Student {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;
    private static final int MIN_GRADE = 0;
    private static final int MAX_GRADE = 10;
    private String name;
    private Integer age;
    private float[] grades;
    private String email;

    public Student(String name, int age, float[] grades, String email) {
        super();
        if (name == null || age < MIN_AGE || age > MAX_AGE || grades == null || email == null) {
            throw new RuntimeException();
        }
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age != null) {
            if (age < MIN_AGE || age > MAX_AGE) {
                this.age = null;
                return;
            }
            this.age = age;
        } else {
            this.age = null;
        }
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        for (float grade : grades) {
            if (grade < MIN_GRADE || grade > MAX_GRADE) {
                this.grades = null;
                return;
            }
        }
        this.grades = grades;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getStudentGradesAverage() {
        if (this.grades == null) {
            return 0;
        }
        float total = 0;
        for (float grade : this.grades) {
            total += grade;
        }
        return total / this.grades.length;
    }
}
