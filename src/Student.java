public class Student {
    private int rollno;
    private String name;
    static String college = "KIIT";

    public Student(int rollno, String name) {
        this.rollno = rollno; // Use 'rollno' parameter to set the 'rollno' field
        this.name = name;     // Use 'name' parameter to set the 'name' field
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + college); // Use 'rollno' and 'name' fields here
    }
}
