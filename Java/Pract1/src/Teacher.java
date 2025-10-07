import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;


    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        String grade = switch (random.nextInt(2, 6)) {
            case (5) -> "Отлично";
            case (4) -> "Хорошо";
            case (3) -> "Удовлетворительно";
            case (2) -> "Неудовлетворительно";
            default -> "Ошибка";
        };
        System.out.printf("Преподаватель %s оценил студента с именем " +
                "%s по предмету %s на %s", this.fio, student.getFio(), this.subject, grade);
    }
}
