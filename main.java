package jarvis;

public class java2 {


    public static void main(String[] args) {
        Cat c = new Cat("Barseek", 0, 0, 0);
        dog d = new dog("sharik", 0, 0, 0);

        c.jump(1);
        d.jump(0.1);
        c.run(100);
        d.run(100);
        c.sail(5);
        d.sail(5);

    }
}
