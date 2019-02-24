import java.io.*;
import java.util.Random;
public class Novice
{
      private int hp; //declared attributes
      private int maxHp;
      private int mp;
      private int maxMp;
      private int exp;
      private int money;
      private int level;
      private int maxExp;
      private String job;

      Bag bag;

      public Novice() //defined attributes
        {
           level = 1;
           hp = 100;
           maxHp = 100;
           mp = 100;
           maxMp = 100;
           exp = 0;
           money = 0;
           maxExp = 10;
           job = "Novice";

           bag = new Bag();
        }
        public int getMaxHp() {
            return maxHp;
        }
    
        public int getHp() {
            return hp;
        }
    
        public int getMaxMp() {
            return maxMp;
        }
    
        public int getMp() {
            return mp;
        }
    
        public int getExp() {
            return exp;
        }
    
        public int getMaxExp() {
            return maxExp;
        }
    
        public int getLevel() {
            return level;
        }
    
        public String getJob() {
            return job;
        }
        
        public int heal() //increase Hp 80 point
        {
            hp += 30;
            return hp;
        }
        public int showHp() 
        {
            if(hp >= maxHp){
                hp = maxHp;
            }
                return hp;
        }
        public int showMp(){
            if(hp >= maxMp){
                hp = maxMp;
            }
            return mp;
        }
        public int showExp() //show EXP and increase with random 0-3
        {
            Random rand = new Random();
            return exp ; // = exp + rand.nextInt(3) ;
        }
        public int showMoney() //show Money and increase with random 0-4
        {
            Random rand = new Random();
            //money = money + rand.nextInt(4);
            return money ;
        }
        public int showLevel()
        {
            while(true)
            {
                if(level == 10){
                    exp = maxExp;
                    return level;
                }
                else if(exp >= maxExp){
                    level++;
                    exp = exp - maxExp;
                    maxExp *= 1.4;
        
                }
                else {
                return level;
                }
            }
            
        }
   
       /* public int doHp() //show Hp and decrease with random 0-2 if Hp lower 30 use heal
        {
            Random rand = new Random();
            hp = hp - rand.nextInt(2) ;

            if(hp < 70){
                hp = heal(hp);
              return  hp;
            }
            else
                return hp;
        }

        public int doExp() //show EXP and increase with random 0-3
        {
            Random rand = new Random();
            return exp = exp + 1 ;
        }

        public int doMoney() //show Money and increase with random 0-4
        {
            Random rand = new Random();
            money = money + rand.nextInt(4);
            return money ;
        }*/
        public void attack()
        {
            Random rand = new Random();
            hp = hp - rand.nextInt(4);
            exp = exp + rand.nextInt(8);
            money = money + rand.nextInt(50);
        }
        public void changeJobTo(String nameOfJob) {
        job = nameOfJob;
    }
        public void setStatusClass(int level, int newHp, int newMp, Bag bag){
            this.level = level ;

            maxHp = newHp;
            hp = maxHp;

            maxMp = newMp;
            mp = maxMp;

            this.bag = bag;
        }
}