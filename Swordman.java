import java.io.*;
import java.util.*;

public class Swordman extends Novice
{
    public Swordman(Novice novice){
        super.changeJobTo("Swordman");
        super.setStatusClass(novice.getLevel(), 400, 200, novice.bag);
    }
}