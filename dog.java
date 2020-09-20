package jarvis;

public class dog extends animals {
    dog(String name, int run, double jump, int sail) {
        super(name, run, jump, sail);
    }

    void jump(double jump) {
        if (jump > 0.5) {
            System.out.println("the dog can't jump " + jump);
        } else {
            System.out.println("cat jmp " + jump);
        }
    }

    void sail(int sail) {
        if (sail > 10) {
            System.out.println("the dog can't sail " + sail);
        } else {
            System.out.println("cat sail " + sail);
        }
    }

    void run(int run) {
        if (run > 500) {
            System.out.println("the dog can't run " + run);
        } else {
            System.out.println("cat run " + run);
        }
    }
}
