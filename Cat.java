package jarvis;

public class Cat extends animals {
    Cat(String name, int run, double jump, int sail) {
        super(name, run, jump, sail);
    }


    void run(int a) {
        if (run > 200) {
            System.out.println("the cat doesn't want run " + run);
        } else {
            System.out.println("cat run " + run);
        }
    }

    void jump(double jump) {
        if (jump > 2) {
            System.out.println("the cat doesn't want jump " + jump);
        } else {
            System.out.println("cat jmp " + jump);
        }
    }

    void sail(int sail) {
        System.out.println("the cat doesn't want sail " + sail);
    }


}
