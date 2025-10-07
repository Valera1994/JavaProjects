public class Task15 {
    public static void main(String[] args) {
        Stud student = new Stud("Vasya", "Group 1408");
        Teach teacher = new Teach("Ivan", "Mathematics");

        System.out.println(student.getGroup());
        System.out.println(teacher.getGrad());

        student.printInfo();
        teacher.printInfo();
    }
}
