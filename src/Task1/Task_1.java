package Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {

        int answer;
        int max = 10;
        do {
            int z = random.nextInt(max);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("попробуйте отгадать число от 0 до 9 и введите значение" + (max - 1));

                int input = sc.nextInt();
                if (input < z) {
                    System.out.println("вы не угадали, загаданное число больше");
                }
                if (input > z) {
                    System.out.println("вы не угадали, загаданное число меньше");
                }
                if (input == z) {
                    guess = true;
                    break;
                }

            }
            if (guess) {
                System.out.println("правильно! z = " + z);

            } else {
                System.out.println("вы не угадали! z = " + z);
            }
            System.out.println(" попробуем игру ещё раз? 1 - да / 0 - нет");

            answer = sc.nextInt();
        } while (answer == 1);
        System.out.println("Чао!");
    }
}


