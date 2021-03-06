package Hw4;

public class Employee {
    String name;
    String position;
    int phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, int phoneNumber,int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
