import java.io.IOException;

/**Несколько философов сидят вокруг стола, посреди которого стоит тарелка с рисом
 Каждый философ либо размышляет (спит), либо ест
 Брать рис из тарелки в один момент времени может только один философ
 (то есть тарелка - общий ресурс, с синхронизированным доступом к нему).
 Философы размышляют в течение случайного времени,
 потом едят рис из тарелки в течение фиксированного времени.
 На это время доступ к тарелке других философов блокируется.
 Программа должна выдавать (например, на консоль) информацию о том,
 что делает каждый философ и сколько риса он съел. Считать, что в тарелке бесконечный запас риса.**/

public class Main{
    public static void main(String[] args) {
        Philosopher phil1 = new Philosopher();
        Philosopher phil2 = new Philosopher();
        Philosopher phil3 = new Philosopher();
        Philosopher phil4 = new Philosopher();
        Philosopher phil5 = new Philosopher();

        phil1.start();
        phil2.start();
        phil3.start();
        phil4.start();
        phil5.start();

        while (true){
            if(phil1.isEating){
                System.out.println("Философ 1: " + "ест");
            }else{
                System.out.println("Философ 1: думает. Съел " + phil1.amountOfRice + " риса.");
            }
            if(phil2.isEating){
                System.out.println("Философ 2: " + "ест");
            }else{
                System.out.println("Философ 2: думает. Съел " + phil2.amountOfRice + " риса.");
            }
            if(phil3.isEating){
                System.out.println("Философ 3: " + "ест");
            }else{
                System.out.println("Философ 3: думает. Съел " + phil3.amountOfRice + " риса.");
            }
            if(phil4.isEating){
                System.out.println("Философ 4: " + "ест");
            }else{
                System.out.println("Философ 4: думает. Съел " + phil4.amountOfRice + " риса.");
            }
            if(phil5.isEating){
                System.out.println("Философ 5: " + "ест");
            }else{
                System.out.println("Философ 5: думает. Съел " + phil5.amountOfRice + " риса.");
            }
            System.out.println("\033[2J");
        }
    }
}
