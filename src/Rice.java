
public class Rice {
    public static synchronized int eat(Philosopher philosopher) throws InterruptedException {
        philosopher.isEating = true;
        Thread.sleep(1000);
        int min = 10;
        int max = 100;
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }
}
