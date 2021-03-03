package Hw4;

public class Hw4 {
    public static void main(String[] args) {

        //2 Конструктор класса должен заполнять эти поля при создании объекта;
        Employee employee1 = new Employee("Бэт Смит", "лошадинный хирург", 34834343, 100000, 34);


        //4 Вывести при помощи методов из пункта 3 ФИО и должность.

        System.out.println("Имя и должность:" + employee1.getName() + " - " + employee1.getPosition());

        //5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] employees = {
                employee1,
                new Employee("Рик Санчез", "ученый", 361166, 10, 63),
                new Employee("Морти Смит", "ученик", 361167, 10, 14),
                new Employee("Саммер Смит", "ученица", 361177, 10, 14),
                new Employee("Джерри Смит", "рекламный агент", 361178, 50000, 35)
        };

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println( "Cотрудники старше сорока лет:" + employees[i].getName() + ", "
                        + employees[i].getPosition() + ", номер телефона: " + employees[i].getPhoneNumber()
                        + ", зарплата: " + employees[i].getSalary() + ", возраст: " + employees[i].getAge());
            }
        }
    }
}








