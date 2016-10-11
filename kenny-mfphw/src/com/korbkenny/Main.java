package com.korbkenny;

import java.util.*;

public class Main {

//    static Timer timer = new Timer();
//    static int seconds = 8;

    public static void main(String[] args) {

        art();
        shakeTheBall();

    }

    public static int getRandomNumber() {
        int datNumber = (int) (Math.random() * 9);
        return datNumber;
    }


    public static void shakeTheBall() {


        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine().toLowerCase().replaceAll("\\s", "");


        if (userInput.equals("yes")) {
            System.out.println("  Think hard about your question.");
            System.out.println("When you are ready, type the first");
            System.out.println("   word that comes to your mind");
            input = new Scanner(System.in);
            userInput = input.nextLine();
        //    datTimer();
        //    while (seconds != 1) {
        //    }
                System.out.println("");
                int choice = getRandomNumber();
                switch (choice) {
                    case 0:
                        System.out.println("*~*~* Believe whatever you want *~*~*");
                        break;
                    case 1:
                        System.out.println("*~*~* As this was counting down, *~*~* \n*~*~* you learned what answer *~*~* \n*~*~* you wanted to be true *~*~*");
                        break;
                    case 2:
                        System.out.println("*~*~* Phat chance *~*~*");
                        break;
                    case 3:
                        System.out.println("*~*~* Yes... *~*~*\n*~*~* Unless you wanted no... *~*~*\n*~*~* ...then no. *~*~*");
                        break;
                    case 4:
                        System.out.println("*~*~* umfmm idk liek, Im' supper durnkh *~*~*\n*~*~* aks againg laterrrr *~*~*");
                        break;
                    case 5:
                        System.out.println("*~*~* Outlook not so good *~*~*\n*~*~* (as an email service) *~*~*");
                        break;
                    case 6:
                        System.out.println("*~*~* Yeah, totally *~*~*\n*~*~* (It's hard to communicate sarcasm through text) *~*~* ");
                        break;
                    case 7:
                        System.out.println("*~*~* Fur shore *~*~*");
                        break;
                    case 8:
                        System.out.println("*~*~* You might want to take advice from an actual human *~*~*");
                        break;
                }

                shakeAgain();

            } else if (userInput.equals("no")) {
                quit();
            } else {
                System.out.println("Wait, wut?");
                shakeAgain();
            }


    }



    public static void shakeAgain() {
        System.out.println("\nShake again?");
        shakeTheBall();
    }

    public static void quit() {
        System.out.println("Seeya");
        return;
    }

    public static void art() {
        System.out.println("      This 8-ball is magic         ");
        System.out.println("    But somewhere deep down        ");
        System.out.println("     You already knew that        ");
        System.out.println("           Didn't you?          ");
        System.out.println("                               ");
        System.out.println("             I mean,         ");
        System.out.println("        just look at it:       ");
        System.out.println("                               ");
        System.out.println("              000                 ");
        System.out.println("           0       0             ");
        System.out.println("         0           0             ");
        System.out.println("         0     8     0            ");
        System.out.println("         0           0             ");
        System.out.println("           0       0             ");
        System.out.println("              000                  ");
        System.out.println("                               ");
        System.out.println("                               ");
        System.out.println("          So tell me:                     ");
        System.out.println("       Will you shake it?                       ");

    }


//    public static void datTimer() {
//
//        TimerTask task;
//
//        task = new TimerTask() {
//
//            @Override
//            public void run() {
//                if (seconds > 0) {
//                    System.out.println(seconds);
//                    seconds--;
//                } else {
//                    cancel();
//                }
//            }
//
//        };
//        timer.schedule(task, 0, 1000);
//    }
}




