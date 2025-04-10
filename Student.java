public class Student {
    
    private String name;
    private int age;
    private String studentId;
    private String course;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String name, int age, String studentId, String course) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
   
public String toString() {
    return "name= " + name + "\n" +
            "age= " + age +"\n"+
            "studentId= " + studentId + "\n" +
            "course= " + course +"\n"
            ;
}

     public static void main(String args[]){
    	Student s=new Student("chinmay",19,"2023bit054","IT");
    	System.out.print(s);
    }
}

