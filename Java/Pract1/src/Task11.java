public class Task11 {
    public static void main(String[] args) {
        Student student = new Student("Бельмак Виктория");
        Teacher teacher = new Teacher("Устинов Сергей Михайлович","Вычислительная математика");

        teacher.evaluate(student);
    }
}
