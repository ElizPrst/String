public class Main {
    public static void main(String[] args) {
        // task 1
        {  String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName= "Ivanov";
        firstName= lastName+ " "+firstName+ " "+middleName;
        System.out.println("ФИО сотрудника — "+firstName);

        //task 2
        String firstNameUp= firstName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+firstNameUp);
    }
        //task 3
        String fullName= "Иванов Семён Семёнович";
        System.out.println("ФИО сотрудника — "+ fullName.replace('ё', 'е'));
    }
        }