import java.io.*;
import java.util.*;

public class Mage extends Novice
{
    public Mage(Novice novice){
        super.changeJobTo("Mage");
        super.setStatusClass(novice.getLevel(), 250, 300, novice.bag);
    }
}