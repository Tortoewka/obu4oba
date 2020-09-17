package jarvis;

public class java2 {


    public static void main(String[] args) {

        employee[] arr = new employee[5];
        arr[0] = new employee("Иванов Иван Иванович", 60, 1500);
        arr[1] = new employee("Петров Петр Петрович", 25, 1000);
        arr[2] = new employee("Сидоров Сидор Сидорович", 50, 3500);
        arr[3] = new employee("Радионов Радион Радионович", 22, 1000);
        arr[4] = new employee("Unknown Тор Одинович", 28, 1000);


        arr[1].getAge();
        arr[1].getSalary();

        employee[] a = new employee[5];
        double sum1 = 0;
       double sum2 = 0;
        int sum6 = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {

            sum6 = (sum6 + arr[i].getAge());

            sum = (sum + arr[i].getSalary());


            if (arr[i].getAge() > 45) {
                arr[i].num(i);
                System.out.println(arr[i].getName());
                arr[i].prize();


            }
            sum1 = sum / 5;
            sum2 = sum6 / 5;


        }
        System.out.println("седнее арифметическое зарплаты всех сотрудников " + sum1);
        System.out.println("седнее арифметическое возроста всех сотрудников " + sum2);


    }
}
