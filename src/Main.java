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
        System.out.println("\n----------------");
        System.out.println("Rozpoczęto prace");
        System.out.println("----------------\n");
        isWorking = true;
    }
    public void stopWork() {
        System.out.println("\n----------------");
        System.out.println("Zakończono prace");
        System.out.println("----------------\n");
        isWorking = false;
    }

    public void increaseSalary(double addedMoney) {
        System.out.println("\n---------------");
        System.out.println("Zwiększono płace");
        System.out.println("---------------\n");
        salary += addedMoney;
    }
    public void showEmployeeInformation() {
        System.out.println("\n-----------------");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + idNumber);
        System.out.println("IsWorking: " + isWorking);
        System.out.println("------------------\n");
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
        System.out.println("\n-------------------------");
        System.out.println("Przydzielono " + task + " dla " + employee.getName() + " " + employee.getSurname());
        System.out.println("---------------------------\n");
    }
    public void showManagerInformation() {
        System.out.println("\n-----------------");
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Department name: " + department);
        System.out.println("-----------------\n");
    }

    public void changeDepartment(String department) {
        System.out.println("\n-------------");
        System.out.println("Zmiana działu na " + department);
        System.out.println("-------------\n");
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Sklep");

        Employee e1 = new Employee("Bartosz", "Szary", "niebinarny", 78, "kasjer", 90000, 1, false);
        Employee e2 = new Employee("Szymon", "Czarny", "helikopter szturmowy", 112, "sekretarz", 91, 2, false);


        manager.assignTask("mycie kibla", e1);
        manager.assignTask("Mycie podłogi", e2);
        manager.showManagerInformation();
        manager.changeDepartment("jaskinia");
        manager.showManagerInformation();
        e1.showEmployeeInformation();
        e1.startWork();
        e1.showEmployeeInformation();
        e1.increaseSalary(2900);
        e1.showEmployeeInformation();

    }
}

