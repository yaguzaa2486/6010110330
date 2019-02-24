import java.io.*;
import java.util.*;

public class Bag{
    public void inventory(){
        Scanner scan = new Scanner(System.in);
        Item item = new Item();
        char c ;

    do{
        System.out.println("Inventory");
        System.out.println("------------------");
        System.out.println("(1)HP Potion :  " + item.hpPotion);
        System.out.println("(2)Dagger     :  " + item.dagger);
        System.out.println("(3)Shield    :  " + item.shield);
        System.out.println("------------------");
        System.out.println("Check Info Item Choose With Number ");
        System.out.println("BACK => Press|B|");
        

    System.out.print("Input : ");
    c = scan.next().charAt(0);
    if(c == '1'){
        System.out.println(">>>>>> Potion to increase Health point <<<<<<");
    }
    else if(c == '2'){
        System.out.println(">>>>>> Weapon attack 20 <<<<<<");
    }
    else if(c == '3'){
        System.out.println(">>>>>> Shield Defend 20 <<<<<<");
    }
    else if(c == 'B' || c == 'b')
        break;
    System.out.println("\nBACK => Press|B|");
    System.out.println("Press Any Key To Back Inventory");
    c = scan.next().charAt(0);
    System.out.println("\n\n");
    

    }while(c != 'B' && c != 'b');
}
}