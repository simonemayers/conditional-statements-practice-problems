public class Student {
    String firstName, lastName, major;
    int graduationYear;
    double gpa;

    public Student(String firstName, String lastName, int graduationYear, double gpa, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.gpa = gpa;
        this.major = major;
    }
    public int incrementGraduationYear(){
        return this.graduationYear = this.graduationYear + 1;
    }

    public static void main(String[] args) {
        Student simone = new Student("Simone", "Mayers", 2016, 3.3, "Psychology");
        Student hillary = new Student("Hillary", "Mayers", 2016, 4.0, "Political Science");

        System.out.println("In " + simone.graduationYear + " " + simone.firstName + " " + simone.lastName + " graduated with a degree in " + simone.major + " with a GPA of " + simone.gpa);
        System.out.println(hillary.graduationYear);
        hillary.incrementGraduationYear();
        System.out.println(hillary.graduationYear);
    }
}
