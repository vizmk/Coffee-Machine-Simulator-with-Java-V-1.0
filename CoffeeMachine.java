package machine;
import  java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Machine machine = new Machine();
        //dichiarazione valori iniziali

        //iniziamo il ciclo do-while


        //stampa menu
        do {
            System.out.println();
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = scanner.next();

            //inizio switch menu principale
            switch (action) {
                case "buy":
                    machine.buy(scanner);
                    break;

                case "take":
                    machine.take();
                    break;
                case "fill":
                    machine.fill(scanner);
                    break;
                case "exit":
                    exit=true;
                    break;
                case "remaining":
                    machine.remaining();
                    break;
                case "clean":
                    machine.clean();
                    break;
                default:
                    System.out.println("wrong input");
            }
        }
            while (!exit) ;


    }
}


