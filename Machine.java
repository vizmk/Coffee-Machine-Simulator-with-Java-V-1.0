package machine;

import java.util.Scanner;

public class Machine {
    //  Scanner scanner=new Scanner(System.in);

    private int iWater=400;
    private int iMilk=540;
    private int iCoffee=120;
    private int iCup=9;
    private int iMoney=550;
    private int clean=0;

        //metodo remaining

        public void remaining(){
            System.out.println("The coffee machine has:");
            System.out.println(iWater+" ml of water");
            System.out.println(iMilk+" ml of milk");
            System.out.println(iCoffee+" g of coffee beans");
            System.out.println(iCup+" disposable cups");
            System.out.println("$"+iMoney+" of money");
            System.out.println();
        }

        //metodo buy
        public void buy(Scanner scanner) {
            if(clean>=10){
                System.out.println("I need cleaning!");
                return;
            }
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String inBuy = scanner.next();
            switch (inBuy) {
                case "1":
                    int espWater = 250;
                    int espCoffee = 16;
                    int espMoney = 4;
                    if (iWater < espWater) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (iCoffee < espCoffee) {
                        System.out.println("Sorry, not enough coffee!");
                    }

                    if ((iWater >= espWater) && (iCoffee >= espCoffee)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        iMoney += espMoney;
                        iWater -= espWater;
                        iCoffee -= espCoffee;
                        iCup -= 1;
                        clean+=1;
                    }
                    break;
                case "2":
                    int latteWter = 350;
                    int latteMilk = 75;
                    int latteCoffee = 20;
                    int latteMoney = 7;
                    if (iWater < latteWter) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (iMilk < latteMilk) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (iCoffee < latteCoffee) {
                        System.out.println("Sorry, not enough coffee!");
                    }
                    if ((iWater >= latteWter) && (iMilk >= latteMilk) && (iCoffee >= latteCoffee)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        iMoney += latteMoney;
                        iWater -= latteWter;
                        iMilk -= latteMilk;
                        iCoffee -= latteCoffee;
                        iCup -= 1;
                        clean+=1;
                    }

                    break;
                case "3":
                    int capMoney = 6;
                    int capWater = 200;
                    int capMilk = 100;
                    int capCoffee = 12;
                    if (iWater < capWater) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (iMilk < capMilk) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (iCoffee < capCoffee) {
                        System.out.println("Sorry, not enough coffee!");
                    }
                    if ((iWater >= capWater) && (iMilk >= capMilk) && (iCoffee >= capCoffee)) {
                        System.out.println("I have enough resources, making you a coffee!");

                        iMoney += capMoney;
                        iWater -= capWater;
                        iMilk -= capMilk;
                        iCoffee -= capCoffee;
                        iCup -= 1;
                        clean+=1;
                    }

                    break;
                case "back":
                    break;
                default:
                    System.out.println("wrong input");
            }
        }
        //metodo take
            public void take (){
                System.out.println("I gave you $"+iMoney);
                iMoney=0;
            }

        //metodo fill
            public void fill(Scanner scanner) {
                //add water
                System.out.println("Write how many ml of water you want to add:");
                int addWater= scanner.nextInt();
                iWater=iWater+addWater;
                //add milk
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk= scanner.nextInt();
                iMilk=iMilk+addMilk;
                //add coffee
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffee= scanner.nextInt();
                iCoffee=iCoffee+addCoffee;
                //add cup
                System.out.println("Write how many disposable cups you want to add:");
                int addCup= scanner.nextInt();
                iCup=iCup+addCup;
            }

            //metodo clean
                public void clean(){
                clean=0;
                    System.out.println("I have been cleaned!");
                }

}

