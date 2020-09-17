package jarvis;

public class employee {
    String name;
    int age;
    int salary;
    int Salary;
  private   int number;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getnumber() {
        return number;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    private void setnumber(int number) {
        this.number = number;
    }


    employee(String name, int age, int salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void prize() {
        if (age > 45) {
            setSalary(salary + 5000);
            System.out.println(Salary);

        }

    }

    void num(int i) {
                setnumber(i);
        System.out.println("номер " + getnumber());
    }

}
