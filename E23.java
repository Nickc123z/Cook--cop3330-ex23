/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.Scanner;


public class E23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Is the car silent when you turn the key? ");
        String st = scan.next();

        if (st.equalsIgnoreCase("y")){

            System.out.print("Are the Battery terminals corroded? ");

            String st1 = scan.next();

            if (st1.equalsIgnoreCase("y"))

                System.out.println("Battery may not be clean.\nClean the terminals and try starting again.");

            else

                System.out.println("The battery cables may be damaged.\nReplace cables and try again");

        } else {

            System.out.print("Does the car make a slicking noise? ");

            String st2 = scan.next();

            if (st2.equalsIgnoreCase("y"))

                System.out.println("Battery may be damaged.\nReplace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                String st3 = scan.next();

                if ((st3.equalsIgnoreCase("y")))

                    System.out.println("Spark plug connection may be loose.\nCheck spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    String st4 = scan.next();


                    if (st4.equalsIgnoreCase("y")) {

                        System.out.println("Does your car have fuel injection? ");

                        String st5 = scan.next();

                        if (st5.equalsIgnoreCase("y"))

                            System.out.println("Get in it for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }


    }

}


