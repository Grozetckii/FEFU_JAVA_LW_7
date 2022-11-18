public class Philosopher extends Thread{
    public int amountOfRice;
    public boolean isEating;

    public Philosopher(){
        amountOfRice = 0;
        isEating = false;
    }

    @Override
    public void run(){
        int i = 0;
        while (!Thread.interrupted()){
            i++;
            try {
                if(i % 2 == 0){
                    eat();
                }else{
                    think();
                }
            }catch(InterruptedException ex){
                throw new RuntimeException(ex);
            }

        }
    }

    private void think() throws InterruptedException {
        isEating = false;
        int min = 500;
        int max = 7000;
        sleep((long) ((Math.random() * ((max - min) + 1)) + min));
    }

    private void eat() throws InterruptedException {
        amountOfRice += Rice.eat(this);
    }
}
