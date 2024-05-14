public class Student {
    private String lastName;
    private String firstName;
    private int course;
    private long studentID;
    private String hobby;

    // Конструктор для створення студента
    public Student(String lastName, String firstName, int course, long studentID, String hobby) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.studentID = studentID;
        this.hobby = hobby;
    }

    // Метод для виведення даних про студента
    public void display() {
        System.out.println("Прізвище: " + lastName);
        System.out.println("Ім'я: " + firstName);
        System.out.println("Курс: " + course);
        System.out.println("Номер студентського квитка: " + studentID);
        System.out.println("Хобі: " + hobby);
        System.out.println();
    }

    // Геттер для отримання номеру студентського квитка
    public long getStudentID() {
        return studentID;
    }



    // Метод для перевірки чи студент 2 курсу та займається спортом
    public boolean isSecondYearSportStudent() {
        return course == 2 && hobby.equals("спорт");
    }

}
