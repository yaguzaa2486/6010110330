import java.util.*;
import java.io.*;

public class Deknarok{
public static void main(String args[])
{
    Scanner s = new Scanner(System.in);
    Novice novice = new Novice();
    Bag bag = new Bag();

    while(true){
        System.out.println("############################");
        System.out.println("Class : " + novice.getJob());
        System.out.println("Level : " + novice.showLevel());
        System.out.println("############################");
        System.out.println("HP : " + novice.showHp()+"/"+novice.getMaxHp() + "    MP : " + novice.showMp()+"/"+novice.getMaxMp()); //display Hp on screen
        System.out.println("Exp : " + novice.showExp() + '/' + novice.getMaxExp()+"      Money : " + novice.showMoney()); //display Exp on screen
        System.out.println("############################");
        System.out.println("Attack => Press|A|");
        System.out.println("Open Inventory => Press|I|");
        System.out.println("Use HEAL => Press|H|");
        if(novice.getLevel() == 10 && novice.getJob() == "Novice") {
            System.out.println("CHANGE CLASS NOW => Press|C|");
        }
        

        System.out.print("Input :  ");
        char c = s.next().charAt(0);


         if(c == 'A' || c == 'a'){
        System.out.print("How many Monsters do you want to attack :");
        int j = s.nextInt();
        for(int i=0;i<=j;i++){
            novice.attack();
        }
    }
    else if(c == 'I' || c == 'i'){
        bag.inventory();
    }
    else if(c == 'Q' || c == 'q'){
        System.exit(0);
    }
    else if(c == 'H' || c == 'h'){
        novice.heal();
    }
    else if(c == 'C' || c == 'c') {
        if(novice.getLevel() == 10 && novice.getJob() == "Novice"){
        System.out.println("\n\n\n\n\n\n");
        System.out.println("########################");
        System.out.println("PLEASE SELECT YOUR CLASS");
        System.out.println("########################");
        System.out.println("1. Swordman");
        System.out.println("2. Mage");
        System.out.println("########################");

        System.out.print("Input: ");
        c = s.next().charAt(0);

        System.out.println("\n\n\n\n");

        System.out.println("===========Congratulations !!!============\n");

        switch(c) {
            case '1': System.out.println("     YOUR CLASS IS \"Swordman\" NOW !");
                      novice = new Swordman(novice);
                      break;
            
            case '2': System.out.println("     YOUR CLASS IS \"Mage\" NOW !");
                      novice = new Mage(novice);
                      break;

            default:
        }
        }
    }
    
    }

    }
}






/*try
    {
        while(true) //use loop
        {
           
            System.out.println("\n\n");
            System.out.println("############################");
            System.out.println("Level : " + novice.showLevel());
            System.out.println("############################");
            System.out.println("your HP is " + novice.doHp()); //display Hp on screen
            System.out.println("your Exp is " + novice.doExp()); //display Exp on screen
            System.out.println("your Money is " + novice.doMoney()); //display Money on screen
            System.out.println("############################");
            
            Thread.sleep(500); //loop every 1 second
        }
    }
    
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }*/