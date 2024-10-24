class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Person() {};
    public Person( String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Nazywam sie " + name + " " + surname + '\n');
    }
    public void changeAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

class Employee extends Person {
    String position;
    double salary;
    int idNumber;
    boolean isWorking;

    public Employee() {};
    public Employee(String name, String surname, String gender, int age, String position, double salary, int idNumber, boolean isWorking) {
        super(name, surname, gender, age);
        this.position = position;
        this.salary = salary;
        this.idNumber = idNumber;
        this.isWorking = isWorking;
    }

    public void startWork() {
        System.out.println("Rozpoczęto prace");
        isWorking = true;
    }
    public void stopWork() {
        System.out.println("Zakończono prace");
        isWorking = false;
    }

    public void increaseSalary(double addedMoney) {
        salary += addedMoney;
    }

}

class Manager extends Employee {
    int numberOfPeople;
    String department;

    public Manager(int numberOfPeople, String department) {
        this.numberOfPeople = numberOfPeople;
        this.department = department;
    }
    public Manager(String name, String surname, String gender, int age, String position, double salary, int idNumber, boolean isWorking, int numberOfPeople, String department) {
        super(name, surname, gender, age, position, salary, idNumber, isWorking);
        this.numberOfPeople = numberOfPeople;
        this.department = department;
    }

    public void assignTask(String task, Employee employee) {
        System.out.println("Przydzielono " + task + " dla " + employee.getName() + " " + employee.getSurname());
    }
    public void showInformation() {
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Department name: " + department);
    }

    public void changeDepartment(String department) {
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Sklep");

        Employee e1 = new Employee("Bartosz", "Szary", "kot", 78, "kasjer", 90000, 1, false);
        Employee e2 = new Employee("Bartosz", "Szary", "kot", 78, "kasjer", 90000, 1, false);

        manager.assignTask("mycie kibla", e);

    }
}

