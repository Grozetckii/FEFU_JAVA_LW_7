import java.io.IOException;

/**��������� ��������� ����� ������ �����, ������� �������� ����� ������� � �����
 ������ ������� ���� ���������� (����), ���� ���
 ����� ��� �� ������� � ���� ������ ������� ����� ������ ���� �������
 (�� ���� ������� - ����� ������, � ������������������ �������� � ����).
 �������� ���������� � ������� ���������� �������,
 ����� ���� ��� �� ������� � ������� �������������� �������.
 �� ��� ����� ������ � ������� ������ ��������� �����������.
 ��������� ������ �������� (��������, �� �������) ���������� � ���,
 ��� ������ ������ ������� � ������� ���� �� ����. �������, ��� � ������� ����������� ����� ����.**/

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
                System.out.println("������� 1: " + "���");
            }else{
                System.out.println("������� 1: ������. ���� " + phil1.amountOfRice + " ����.");
            }
            if(phil2.isEating){
                System.out.println("������� 2: " + "���");
            }else{
                System.out.println("������� 2: ������. ���� " + phil2.amountOfRice + " ����.");
            }
            if(phil3.isEating){
                System.out.println("������� 3: " + "���");
            }else{
                System.out.println("������� 3: ������. ���� " + phil3.amountOfRice + " ����.");
            }
            if(phil4.isEating){
                System.out.println("������� 4: " + "���");
            }else{
                System.out.println("������� 4: ������. ���� " + phil4.amountOfRice + " ����.");
            }
            if(phil5.isEating){
                System.out.println("������� 5: " + "���");
            }else{
                System.out.println("������� 5: ������. ���� " + phil5.amountOfRice + " ����.");
            }
            System.out.println("\033[2J");
        }
    }
}
