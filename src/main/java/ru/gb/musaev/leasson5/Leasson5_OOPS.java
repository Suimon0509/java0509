package ru.gb.musaev.leasson5;

public class Leasson5_OOPS {
    public static void main(String[] args){
      Employee[] employees = {
              new Employee("Иванов Иван Иванович", "Инженер", "ivan@a.com", "89775438696", 455000, 35),
              new Employee("Петров Петр Петрович", "Слесарь", "petr@a.com", "89779524562", 700000, 45),
              new Employee("Сергеев Сергей Сергеевич", "Врач", "sergei@a.com", "89859412032", 900500, 25),
              new Employee("Магомедов Магомед Магомедович", "Директор", "maga@a.com", "89796541235", 155500, 30),
              new Employee("Русланов Руслан Русланович", "Програмист", "ruslan@a.com", "89779631245", 800000, 41),
      };
        for (Employee employee: employees) {
            if (employee.getAge() > 40){
                employee.info();
            }

        }

    }
}
