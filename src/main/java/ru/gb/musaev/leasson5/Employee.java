package ru.gb.musaev.leasson5;

public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullname, String position,String  email,String  phone, double salary,int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("ФИО:" + fullname + ", " +
                            "Должность:" + position + ", " +
                            "Email:" + email + ", " +
                            "Зарплата:" + salary + ", " +
                            "Возраст:" + age  );
    }
    public int getage(){
        return age;
    }
}

