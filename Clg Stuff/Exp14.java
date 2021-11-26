class Odd extends Thread {
    public void run() {
        int i;
        for (i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Even extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                if (i == 30 || i == 60 || i == 90) {
                    System.out.println();
                }
            } else {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class Exp14 {                        //* Multithreading
    public static void main(String[] args) {
        Odd O1 = new Odd();
        Even E1 = new Even();
        O1.start();
        E1.start();
    }
}