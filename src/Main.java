//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName= "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = String.join(" ", firstName, middleName, lastName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //Task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Task 3
        String fullNameRus = "Иванов Семён Семёнович";
        fullNameRus = fullNameRus.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameRus);
    }
}