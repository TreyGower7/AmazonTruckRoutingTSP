import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Final
        {
   private  Scanner keyboard = new Scanner(System.in);
     private String name = "", Guild = "", Enter = "";
     private int Attack = 5, Speed = 5;
     private int characterHP = 100;
           private int lDamage = 0, fDamage = 0;
private int XP = 0, levelUP = 50;
private int cLevel = 1;
private int statsP = 8;
private int LOOP = 0, LOOP1 = 0, LOOP2 = 0, LOOP3 = 0, LOOP4 = 0;
private int bDragonD = 3, bDragonA = 5, bDragonS = 1, bDragonHP = 50;
private String csAttk;
 private int DB = 250;
  private int pls = 0;
private int dead = 0, dead2 = 0;
  private int hmHP = 35, hmS = 1, hmA = 200;
private int hm2HP = 35, hm2S = 1, hm2A = 200;
private int mDrag = 20000;

public void start() throws InterruptedException
    {
   
    //Character Info
    System.out.println();
     System.out.println("Hello welcome to Yeet Online a Turn Based Rpg.");
     System.out.print("Before you start your journey please tell me your name: ");
     name = keyboard.nextLine();
      System.out.println("________________________________");
     System.out.println();

     // Guild name
      System.out.print("Now that I Know your name " + name + " please name your guild: ");
Guild = keyboard.nextLine();
 
 
   System.out.println("________________________________");
  System.out.println();
System.out.println("what a wonderful name for a guild " + name + " of " + Guild + ".");
   System.out.println("________________________________");
System.out.print("press enter to continue");
Enter = keyboard.nextLine();

//Weapon recieve and assign points
   System.out.println("________________________________");
        System.out.println();
   System.out.println("You have recieved the short sword Storm Razor. Congratulations!");
  System.out.println("Storm Razors Base Stats: " + " Attack = " + Attack + " Speed = " + Speed);
   System.out.println("________________________________");
System.out.print("press enter to continue");
Enter = keyboard.nextLine();
   System.out.println("________________________________");
        System.out.println();
        //point assign system also add characterHP
System.out.println("Now lets assign some extra points. You have 8 to spend!");
 System.out.println("________________________________");
System.out.print("press enter to continue");
Enter = keyboard.nextLine();
   System.out.println("________________________________");

//Variables for while assign
statsP = 8;
  //Start While Assign points statement
while(statsP > 0)
{
               System.out.println();
    System.out.print("Which would you like to assign points to (a)ttack or (s)peed? --> ");
        String letter = keyboard.nextLine();
   if(letter.equals("a") || letter.equals("attack") || letter.equals("Attack"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Attack? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
        }
        if(addD <= statsP)
        {
         statsP -= addD;
          Attack += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Attack and have " + statsP + " points left"); 
                    System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(3);
        }
    }
   if(letter.equals("s") || letter.equals("speed") || letter.equals("Speed"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Speed? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
            TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
        }
        if(addD <= statsP)
        {
         statsP -= addD;
         Speed += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Speed and have " + statsP + " points left");
                    System.out.println("________________________________");
      TimeUnit.SECONDS.sleep(3);

        }
    }
  if(statsP == 0)
  {
               System.out.println();
    System.out.println("StormRazors new stats! Attack = " + Attack + " Speed = " + Speed);
      System.out.println("________________________________");
TimeUnit.SECONDS.sleep(5);
  }
}
    //End While Assign points statement
   
   //transition to body of game
            System.out.println();
   System.out.println("With your new trusty sword " + name + " of " + Guild + " we can now send you off to start your adventure in the world of YEET.");
   TimeUnit.SECONDS.sleep(6);

Enter = keyboard.nextLine();
    } //End Point assign system here
        public void bodyOfChapter1() throws InterruptedException
        {
            //Variables
    String Invest;

  //New Chapter 1
   System.out.println();
   System.out.println();
    System.out.println("__________________________________________________________________________________________________________________________");
          System.out.println("                                                  Chapter 1: Game Start");
        System.out.println("__________________________________________________________________________________________________________________________");
   System.out.println();
   System.out.println();
   System.out.println();
   TimeUnit.SECONDS.sleep(3);
//New chapter 1^

//Start story chapter 1
   System.out.println("As you were walking along the path to the kingdom of edelrid, you felt an eerie sense of eyes fall on you.");
        System.out.println("________________________________");
   System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
        System.out.println("________________________________");

System.out.println();
System.out.println("You felt as if you were being stalked.");
 System.out.println("________________________________");
   System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
        System.out.println("________________________________");

System.out.println();
System.out.println("Suddenly you heard a loud heavy breathing from the bushes. You contemplated to yourself whether you wanted to investigate or not.");
        System.out.println("________________________________");
        while(LOOP == 0) {
                System.out.println();
System.out.print("Would you like to Investigate?" + " Type (y) for yes and (n) for no --> ");
Invest = keyboard.nextLine();
        System.out.println("________________________________");
// Yes If statements
if(Invest.equals("y") || Invest.equals("yes") || Invest.equals("Yes"))
{
          System.out.println();
        System.out.println("As you inched in closer, the breathing started to dissipate.");
         System.out.println("________________________________");
 System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
        System.out.println("________________________________");
        System.out.println();
        System.out.println("you leaned ever so slightly closer.");
 System.out.println("________________________________");
 System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
         System.out.println();
        System.out.println("Then with a sudden jolt an enemy wolf leaped out at you.");
        System.out.println("________________________________");
        System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("The wolf tackled you to the ground and knocked Storm Razor out of your hand.");
          System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("You quickly punched the wolf off of you before he could take any of your health away.");
        System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("You fumbled to Storm Razor and hastly lunged for it.");
         System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
         System.out.println();
System.out.println("You picked up Storm Razor and knew it was time for your first battle.");
        TimeUnit.SECONDS.sleep(3);
        LOOP += 1;
        }
//End yes If statements

//No if statements
if(Invest.equals("n") || Invest.equals("no") || Invest.equals("No"))
{
        System.out.println();
        System.out.println("You decided to ignore the noise and keep down the path to edelrid kingdom.");
            System.out.println("________________________________");
 System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
         System.out.println();
         System.out.println("As you grew further and further away from the noise you noticed it following you.");
          System.out.println("________________________________");
 System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
          System.out.println();
        System.out.println("Then with a sudden jolt an enemy wolf leaped out at you.");
        System.out.println("________________________________");
        System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("The wolf tackled you to the ground and knocked Storm Razor out of your hand.");
          System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("You quickly punched the wolf off of you before he could take your HP away.");
        System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
        System.out.println();
        System.out.println("You fumbled to Storm Razor and hastly lunged for it.");
         System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
 System.out.println("________________________________");
         System.out.println();
System.out.println("You picked up Storm Razor and knew it was time for your first battle.");
 System.out.println("________________________________");
         System.out.print("press enter to continue story");
Enter = keyboard.nextLine();
        LOOP += 1;
}
}
//End no if statements
        }  
        public void firstBattle() throws InterruptedException
        {
   //First Battle 
   System.out.println();
   System.out.println();
    System.out.println("__________________________________________________________________________________________________________________________");
          System.out.println("                                                  Chapter 2: First Battle");
        System.out.println("__________________________________________________________________________________________________________________________");
   System.out.println();
   System.out.println();
   System.out.println();
   //First Battle
   //First battle Variables
int wolfD = 3, wolfA = 5, wolfS = 200, wolfHP = 50;

  System.out.println("You have encountered a wolf!");
    System.out.println("________________________________");
        TimeUnit.SECONDS.sleep(1);
while(LOOP1 == 0)
{
    System.out.println();
    System.out.print("would you like to Fight(f) or Run(r)? -->");
  String ForR = keyboard.nextLine();
    System.out.println("________________________________");
  
  if(ForR.equals("f") || ForR.equals("F") || ForR.equals("FIGHT") || ForR.equals("fight"))
  {
         System.out.println();
      System.out.println("Epic Battle Music Starts Playing");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("________________________________");
            LOOP1 += 1;
  }
  if(ForR.equals("r") || ForR.equals("R") || ForR.equals("run") || ForR.equals("Run"))
  {
      if(wolfS > Speed)
      {
             System.out.println();
          System.out.println("You fool the wolf is too fast for you");
      TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
        System.out.println();
          System.out.println("You must fight him!");
      TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
        LOOP1 += 1;
      }
      
      }
}
   //Battle Code
   String Cattk;
 while(wolfHP > 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the wolf with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l) --> ");
         Cattk = keyboard.nextLine();
                 System.out.println("________________________________");
     
     if(Cattk.equals("Lightning Strike") || Cattk.equals("lightning strike") || Cattk.equals("LIGHTNING STRIKE") || Cattk.equals("L") || Cattk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + wolfA;
         if(wolfS > Speed)
         {
                                                  System.out.println();
            System.out.println("The wolf is faster than you");
                        TimeUnit.SECONDS.sleep(1);
            System.out.println("________________________________");

                                                  System.out.println();
             System.out.println("The wolf used fang bite");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 18)
         {
                                     System.out.println();
                                    
             System.out.println("The wolf hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 17)
         {
                                                               System.out.println();
             System.out.println("The wolf did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                          System.out.println("________________________________");

         }
if(Cattk.equals("Lightning Strike") || Cattk.equals("lightning strike") || Cattk.equals("LIGHTNING STRIKE") || Cattk.equals("L") || Cattk.equals("l"))
{
                                                  System.out.println();
         System.out.println("you attacked the wolf with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);


}
                                              System.out.println();
       System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
              TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       wolfHP -= lDamage;
          System.out.println("________________________________");
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the wolf. " + " the wolf has " + wolfHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the wolf. " + " the wolf has " + wolfHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
     }
      if(Cattk.equals("Quick Attack") || Cattk.equals("Q") || Cattk.equals("q") || Cattk.equals("QUICK ATTACK") || Cattk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + wolfA;
         if(wolfS > Speed)
         {
                               System.out.println();
            System.out.println("The wolf is faster than you");
                        TimeUnit.SECONDS.sleep(1);
            System.out.println("________________________________");

                                                  System.out.println();
             System.out.println("The wolf used fang bite");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 18)
         {
                                     System.out.println();
                                    
             System.out.println("The wolf hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 17)
         {
                                                               System.out.println();
             System.out.println("The wolf did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

}
      if(Cattk.equals("Quick Attack") || Cattk.equals("Q") || Cattk.equals("q") || Cattk.equals("QUICK ATTACK") || Cattk.equals("quick attack"))
{
                     System.out.println();
         System.out.println("you attacked the wolf with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(1);

}
                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       wolfHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the wolf. " + " the wolf has " + wolfHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the wolf. " + " the wolf has " + wolfHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
                                   

}
 if(wolfHP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated the wolf, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
     
     //Level System
     XP = (int)(Math.random() * 35) + 10;
                                                                         System.out.println();
System.out.println("You have recieved " + XP + " Experience points");
     System.out.println("________________________________");
                                              TimeUnit.SECONDS.sleep(2);
if(XP < levelUP)
{
                                                                             System.out.println();
    System.out.println("You need " + levelUP + " Experience Points to level up, you only have " + XP + " Experience Points");
                                           TimeUnit.SECONDS.sleep(2);
         System.out.println("________________________________");

}
while(XP >= levelUP)
{
                                                                             System.out.println();
    cLevel += 1;
      System.out.println("You have leveled up to level " + cLevel);
  TimeUnit.SECONDS.sleep(2);
             System.out.println("________________________________");                                        
                XP -= levelUP;
                levelUP += 100;


                            System.out.println();
        System.out.println("You have gained 4 extra level up points to use on stats");
                 System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(2);
   statsP = 4;
   while(statsP > 0)
{
               System.out.println();
    System.out.print("Which would you like to assign points to (a)ttack or (s)peed? --> ");
        String letter = keyboard.nextLine();
   if(letter.equals("a") || letter.equals("attack") || letter.equals("Attack"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Attack? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
        }
        if(addD <= statsP)
        {
         statsP -= addD;
          Attack += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Attack and have " + statsP + " points left"); 
                    System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(3);
        }
    }
   if(letter.equals("s") || letter.equals("speed") || letter.equals("Speed"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Speed? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
            TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
        }
        if(addD <= statsP)
        {
         statsP -= addD;
         Speed += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Speed and have " + statsP + " points left");
                    System.out.println("________________________________");
      TimeUnit.SECONDS.sleep(3);

        }
    }
  if(statsP == 0)
  {
               System.out.println();
    System.out.println("StormRazors new stats! Attack = " + Attack + " Speed = " + Speed);
      System.out.println("________________________________");
TimeUnit.SECONDS.sleep(3);
  }
}
}                        
 }
}
System.out.println();
System.out.println("the wolf has dissoriented you during battle");
System.out.println("________________________________");
TimeUnit.SECONDS.sleep(3);

System.out.println();
System.out.println("you seemed to have lost your sense of direction");
System.out.println("________________________________");
TimeUnit.SECONDS.sleep(2);

int east = 0, south = 0, west = 0;
while(LOOP2 == 0)
{
    System.out.println();
System.out.print("Which direction would you like to go? (N)orth, (S)outh, (E)ast, or (W)est --> ");
       String NSEW = keyboard.nextLine();
  System.out.println("________________________________");
if(NSEW.equals("N") || NSEW.equals("North") || NSEW.equals("north") || NSEW.equals("n") || NSEW.equals("NORTH"))
{
    System.out.println();
    System.out.println("So you have decided to commit to heading North huh");
    System.out.println("________________________________");
    TimeUnit.SECONDS.sleep(2);
        System.out.println();
    System.out.println("As you were walking down the trail you could faintly see the kingdom of Edelrid through the treeline");
    System.out.println("________________________________");
    TimeUnit.SECONDS.sleep(4);
    LOOP2 += 1;
}
    if(NSEW.equals("S") || NSEW.equals("s") || NSEW.equals("South") || NSEW.equals("south") || NSEW.equals("SOUTH"))
    {
      if(south == 1)
    {
         System.out.println();
        System.out.println("You have already gone that direction");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(1);
        }
      if(south == 0)
      {
        System.out.println();
        System.out.println("You started walking south, but unfortunately there is a massive cliff in your way");
        System.out.println("________________________________");
        TimeUnit.SECONDS.sleep(3);
        System.out.println();
        System.out.println("You decided to head back");
        System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(1);
        south = 1;
      }
    }
    if(NSEW.equals("E") || NSEW.equals("e") || NSEW.equals("East") || NSEW.equals("east") || NSEW.equals("EAST"))
    {
       if(east == 1)
    {
         System.out.println();
        System.out.println("You have already gone that direction");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(1);
        }
           if(east == 0)
      {
         System.out.println();
        System.out.println("You started walking east, but along your journey east you got mugged and lost 3 Attack damage on StormRazer");
        System.out.println("________________________________");
        TimeUnit.SECONDS.sleep(4);
      Attack -= 3;
        System.out.println();
        System.out.println("StormRazers new Attack = " + Attack);
                System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(3);
                System.out.println();
        System.out.println("You decided to head back");
        System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(1);
        east = 1;
      }
 
    }
  
    if(NSEW.equals("W") || NSEW.equals("w") || NSEW.equals("West") || NSEW.equals("west") || NSEW.equals("WEST"))
    {
      if(west == 4)
      {
         System.out.println();
        System.out.println("Im done with you");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
      }
      if(west == 3)
      {
         System.out.println();
        System.out.println("Stop choosing this direction and just pick another one please my head is hurting from how obnoxiously persistent you are");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(4);
        west += 1;
      }
      if(west == 2)
      {
         System.out.println();
        System.out.println("You have already gone that direction and haven't slain the baby dragon cause you said no");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
        west += 1;
      }
      if(west == 1)
      {
         System.out.println();
        System.out.println("You have already gone that direction and have slain the baby dragon");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
      }
      if(west == 0)
      {
        System.out.println();
        System.out.println("Your started heading west, and could faintly here explosions in the distance");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
                System.out.println();
        System.out.println("As you came closer to the explosions everything around you was charred black");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
                 System.out.println();
        System.out.println("In the distance you saw a small green flying entity");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
                        System.out.println();
                  System.out.println("As you drew closer to the creature you realized it was a baby dragon");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
                        System.out.println();
                 System.out.println("But were was its mother?");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
                System.out.println();
                 System.out.println("You came to the conclusion that this could be your only chance to kill a dragon");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
                System.out.println();
                 System.out.println("Its a baby dragon there could be major repercussions");
         System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
          
                  
  while(LOOP3 == 0)
  {
                System.out.println();
                 System.out.print("Would you like to fight the dragon? type (y) for yes and (n) for no --> ");
                String YON = keyboard.nextLine();
         System.out.println("________________________________");
           if(YON.equals("n") || YON.equals("N") || YON.equals("No") || YON.equals("no") || YON.equals("NO"))
           {
               if(pls == 2)
             {
                System.out.println();
             System.out.println("Ok fine just go chose another direction");
                System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
               LOOP3 += 1;
              pls += 2;
                 west += 2;
             }
              if(pls == 1)
             {
                System.out.println();
             System.out.println("So your not gonna say yes even though you chose this direction you have one more opportunity");
                System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
              pls += 1;
             }
             if(pls == 0)
             {
             System.out.println();
             System.out.println("Bro you chose this direction can you just say yes and fight the thing please");
                System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(3);
              pls += 1;
             }          
           }
    if(YON.equals("y") || YON.equals("Y") || YON.equals("yes") || YON.equals("Yes") || YON.equals("YES"))
             {
               LOOP3 +=1;
                 System.out.println();
                 System.out.println("You have encountered a baby dragon");
                  System.out.println("________________________________");
                TimeUnit.SECONDS.sleep(2);
                
              

 while(bDragonHP > 0 && dead == 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the baby dragon with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l) --> ");
         csAttk = keyboard.nextLine();
                 System.out.println("________________________________");
  
   if(characterHP > 0 && csAttk.equals("Quick Attack") || characterHP > 0 && csAttk.equals("Q") || characterHP > 0 && csAttk.equals("q") || characterHP > 0 && csAttk.equals("QUICK ATTACK") || characterHP > 0 && csAttk.equals("quick attack"))
{
      if(Speed > bDragonS)
   {
     System.out.println();
     System.out.println("You are faster than the baby dragon");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the baby dragon with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       bDragonHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the baby dragon. " + " the baby dragon has " + bDragonHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the baby dragon. " + " the baby dragon has " + bDragonHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(bDragonHP > 0 && csAttk.equals("Quick Attack") || bDragonHP > 0 && csAttk.equals("Q") || bDragonHP > 0 && csAttk.equals("q") || bDragonHP > 0 && csAttk.equals("QUICK ATTACK") || bDragonHP > 0 && csAttk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + bDragonA;
         if(bDragonS == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The baby dragon used Fire Blast");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 18)
         {
                                     System.out.println();
                                    
             System.out.println("The baby dragon hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 17)
         {
                                                               System.out.println();
             System.out.println("The baby dragon did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
         if(characterHP > 0 && csAttk.equals("Lightning Strike") || characterHP > 0 && csAttk.equals("lightning strike") || characterHP > 0 && csAttk.equals("LIGHTNING STRIKE") || characterHP > 0 && csAttk.equals("L") || characterHP > 0 && csAttk.equals("l"))
{
            if(Speed > bDragonS)
   {
     System.out.println();
     System.out.println("You are faster than the baby dragon");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
      
                                                  System.out.println();
         System.out.println("you attacked the baby dragon with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);



                                              System.out.println();
       System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
         
           TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       bDragonHP -= lDamage;
          System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(2);
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the baby dragon. " + " the baby dragon has " + bDragonHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the baby dragon. " + " the baby dragon has " + bDragonHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

   }
         
              if(bDragonHP > 0 && csAttk.equals("Lightning Strike") || bDragonHP > 0 && csAttk.equals("lightning strike") || bDragonHP > 0 && csAttk.equals("LIGHTNING STRIKE") || bDragonHP > 0 && csAttk.equals("L") || bDragonHP > 0 && csAttk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + bDragonA;
         if(bDragonS == 1)
         {
           System.out.println();
             System.out.println("The baby dragon used Blast Burn");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 18)
         {
                                     System.out.println();
                                    
             System.out.println("The baby dragon hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 17)
         {
                                                               System.out.println();
             System.out.println("The baby dragon did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                          System.out.println("________________________________");

         }
              }
         }
           
         if(characterHP <= 0)
         {
                System.out.println();
     System.out.println("You dead LOL HAHA");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                System.out.println();
     System.out.println("Sorry you didn't make it to the end play again if you want to try again");
            TimeUnit.SECONDS.sleep(3);
     System.out.println("________________________________");
           dead += 1;
           west += 5;
           LOOP2 += 1;
                        }

       if(bDragonHP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated the baby dragon, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
         System.out.println();
         System.out.println("The baby dragon cries for help");
         TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
     
     //Level System
     XP = (int)(Math.random() * 100) + 45;
                                                                         System.out.println();
System.out.println("You have recieved " + XP + " Experience points");
     System.out.println("________________________________");
                                              TimeUnit.SECONDS.sleep(2);
if(XP < levelUP)
{
                                                                             System.out.println();
    System.out.println("You need " + levelUP + " Experience Points to level up, you only have " + XP + " Experience Points");
                                           TimeUnit.SECONDS.sleep(2);
         System.out.println("________________________________");

}
while(XP >= levelUP)
{
                                                                             System.out.println();
    cLevel += 1;
      System.out.println("You have leveled up to level " + cLevel);
  TimeUnit.SECONDS.sleep(2);
             System.out.println("________________________________");                                        
                XP -= levelUP;
                levelUP += 100;


                            System.out.println();
        System.out.println("You have gained 4 extra level up points to use on stats");
                 System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(2);
   statsP = 4;
   while(statsP > 0)
{
               System.out.println();
    System.out.print("Which would you like to assign points to (a)ttack or (s)peed? --> ");
        String letter = keyboard.nextLine();
   if(letter.equals("a") || letter.equals("attack") || letter.equals("Attack"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Attack? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
          Attack += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Attack and have " + statsP + " points left"); 
                    System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(3);
        }
    }
   if(letter.equals("s") || letter.equals("speed") || letter.equals("Speed"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Speed? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
         Speed += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Speed and have " + statsP + " points left");
                    System.out.println("________________________________");
      TimeUnit.SECONDS.sleep(3);

        }
    }
  if(statsP == 0)
  {
               System.out.println();
    System.out.println("StormRazors new stats! Attack = " + Attack + " Speed = " + Speed);
      System.out.println("________________________________");
TimeUnit.SECONDS.sleep(3);
}
 }
  }                        
   }
    }
     }
      } 
     }
      if(west == 0)
      {
                     System.out.println();
      System.out.println("After killing the baby dragon You decided to head back to where you were disoriented and head a different direction");
 System.out.println("________________________________");
TimeUnit.SECONDS.sleep(5);  
      west = 1;  
      }
      }
        } 
}
        //dragon easter egg if gos west
        
        public void chapter3() throws InterruptedException
        {
                             if(dead == 0)
{
//End Chapter 2
   System.out.println();
   System.out.println();
    System.out.println("__________________________________________________________________________________________________________________________");
          System.out.println("                                                  Chapter 3: Off To Edelrid");
 System.out.println("__________________________________________________________________________________________________________________________");
   TimeUnit.SECONDS.sleep(3);
            System.out.println();            
   System.out.println();
   System.out.println();
 //Start chapter 3
 

  System.out.println("You continued your journey down the trail to the kindom of Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
}
          if(bDragonHP <= 0)
          {
             
          System.out.println("As you were heading down the trail you heard a swoosh over head");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
          System.out.println("You fixed your eyes to the sky to see the ferocious creature");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
          System.out.println("What you saw was the mistake of killing the baby dragon");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
            System.out.println("It was the MAMA DRAGON");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
            System.out.println("DUN!!! DUN!!! DUN!!!");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
              System.out.println();
            System.out.println("The MAMA DRAGON flew over head to the kingdom of Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
              System.out.println();
            System.out.println("While she flew over head she threw out two of her henchmen at you to delay you from getting to Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(4);
              System.out.println();
            System.out.println("The two henchmen were Ogres who rode on her wings");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
             System.out.println();
            System.out.println("You needed to get to the kingdom of Edelrid or everyone would surely die, but the Ogres were in your way");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(4);
               System.out.println();
            System.out.println("Because of the dire situation you gained a new ability called Dusk Blade");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
             System.out.println();
            System.out.println("Dusk Blade is a separate sword you conjure and can do tremendous amounts of damage");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
                         System.out.println();
            System.out.println("You must fight the Ogres with your new abilities to get to Edelrid kingdom");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("But wait you only have " + characterHP + " HP Left");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You decided to use a health potion you recived from defeating the baby dragon");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          int hPotion = 100;
            characterHP += hPotion;
            System.out.println();
            System.out.println("You have gained " + hPotion + " HP and now have " + characterHP + " Hp");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          }
        
          if(bDragonHP <= 0)
          {
                            String csAttk;
 while(hmHP > 0 && dead2 == 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the Ogre with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l)  -Dusk Blade(d) --> ");
         csAttk = keyboard.nextLine();
                 System.out.println("________________________________");
  
   if(csAttk.equals("Quick Attack") || csAttk.equals("Q") || csAttk.equals("q") || csAttk.equals("QUICK ATTACK") || csAttk.equals("quick attack"))
{
      if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hmHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hmHP > 0 && csAttk.equals("Quick Attack") || hmHP > 0 && csAttk.equals("Q") || hmHP > 0 && csAttk.equals("q") || hmHP > 0 && csAttk.equals("QUICK ATTACK") || hmHP > 0 && csAttk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
         if(csAttk.equals("Lightning Strike") || csAttk.equals("lightning strike") || csAttk.equals("LIGHTNING STRIKE") || csAttk.equals("L") || csAttk.equals("l"))
{
            if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
      
                                                  System.out.println();
         System.out.println("you attacked the Ogre with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);



                                              System.out.println();
      System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
              TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hmHP -= lDamage;
          System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(2);
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

   }
         
              if(hmHP > 0 && csAttk.equals("Lightning Strike") || hmHP > 0 && csAttk.equals("lightning strike") || hmHP > 0 && csAttk.equals("LIGHTNING STRIKE") || hmHP > 0 && csAttk.equals("L") || hmHP > 0 && csAttk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
           System.out.println();
             System.out.println("The Ogre used Ground Pound");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                          System.out.println("________________________________");

         }
              }
           
         }
   if(csAttk.equals("Dusk Blade") || csAttk.equals("D") || csAttk.equals("B") || csAttk.equals("dusk blade") || csAttk.equals("DUSK BLADE") || csAttk.equals("d") || csAttk.equals("b"))
{
      if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Dusk Blade");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("Kachow!");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * DB) + 50;
       hmHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 240)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 239)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hmHP > 0 && csAttk.equals("Dusk Blade") || hmHP > 0 && csAttk.equals("D") || hmHP > 0 && csAttk.equals("B") || hmHP > 0 && csAttk.equals("dusk blade") || hmHP > 0 && csAttk.equals("DUSK BLADE") || hmHP > 0 && csAttk.equals("d") || hmHP > 0 && csAttk.equals("b"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
           
         
 if(characterHP <= 0)
         {
                System.out.println();
     System.out.println("You dead LOL HAHA");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                System.out.println();
     System.out.println("Sorry you didn't make it to the end play again if you want to try again");
            TimeUnit.SECONDS.sleep(3);
     System.out.println("________________________________");
           dead2 += 1;
     
                        }
       if(hmHP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated the first Ogre, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
         System.out.println();
         System.out.println("Now time to battle the second");
         TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
       }
   
   if(hmHP <= 0)
   {
                            System.out.println();
     System.out.println("The Second Ogre jumps out at you");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                            System.out.println();
     System.out.println("You must defeat him to get to the kingdom of Edelrid");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
   }    
                           
 }
          }
        

                      
                       
                        if(bDragonHP <= 0 && hmHP <= 0)
          {
                            String csAttk;
 while(hm2HP > 0 && dead2 == 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the Ogre with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l)  -Dusk Blade(d) --> ");
         csAttk = keyboard.nextLine();
                 System.out.println("________________________________");
  
   if(csAttk.equals("Quick Attack") || csAttk.equals("Q") || csAttk.equals("q") || csAttk.equals("QUICK ATTACK") || csAttk.equals("quick attack"))
{
      if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hm2HP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hm2HP > 0 && csAttk.equals("Quick Attack") || hm2HP > 0 && csAttk.equals("Q") || hm2HP > 0 && csAttk.equals("q") || hm2HP > 0 && csAttk.equals("QUICK ATTACK") || hm2HP > 0 && csAttk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hm2S == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
         if(csAttk.equals("Lightning Strike") || csAttk.equals("lightning strike") || csAttk.equals("LIGHTNING STRIKE") || csAttk.equals("L") || csAttk.equals("l"))
{
            if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
      
                                                  System.out.println();
         System.out.println("you attacked the Ogre with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);



                                              System.out.println();
      System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
              TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hm2HP -= lDamage;
          System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(2);
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

   }
         
              if(hm2HP > 0 && csAttk.equals("Lightning Strike") || hm2HP > 0 && csAttk.equals("lightning strike") || hm2HP > 0 && csAttk.equals("LIGHTNING STRIKE") || hm2HP > 0 && csAttk.equals("L") || hm2HP > 0 && csAttk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + hm2A;
         if(hm2S == 1)
         {
           System.out.println();
             System.out.println("The Ogre used Ground Pound");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                          System.out.println("________________________________");

         }
              }
           
         }
   if(csAttk.equals("Dusk Blade") || csAttk.equals("D") || csAttk.equals("B") || csAttk.equals("dusk blade") || csAttk.equals("DUSK BLADE") || csAttk.equals("d") || csAttk.equals("b"))
{
      if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Dusk Blade");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                      System.out.println();
System.out.println("Kachow!");
             System.out.println("________________________________");
 System.out.println();
System.out.println(" _,-,");
     TimeUnit.SECONDS.sleep((long) .5);
System.out.println("T_  |");
          TimeUnit.SECONDS.sleep((long) .5);
 System.out.println("||`-'");
          TimeUnit.SECONDS.sleep((long) .5);
System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
    System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
     System.out.println("~~");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * DB) + 50;
       hm2HP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 240)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 239)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hm2HP > 0 && csAttk.equals("Dusk Blade") || hm2HP > 0 && csAttk.equals("D") || hm2HP > 0 && csAttk.equals("B") || hm2HP > 0 && csAttk.equals("dusk blade") || hm2HP > 0 && csAttk.equals("DUSK BLADE") || hm2HP > 0 && csAttk.equals("d") || hm2HP > 0 && csAttk.equals("b"))
     {
                                      fDamage = (int)(Math.random() * 18) + hm2A;
         if(hm2S == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
           
         
 if(characterHP <= 0)
         {
                System.out.println();
     System.out.println("You dead LOL HAHA");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                System.out.println();
     System.out.println("Sorry you didn't make it to the end play again if you want to try again");
            TimeUnit.SECONDS.sleep(3);
     System.out.println("________________________________");
           dead2 += 1;
     
                        }
       if(hm2HP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated both Ogres, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
         System.out.println();
         System.out.println("You must get to Edelrid Kingdom fast");
         TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
       
   
   
     //Level System
     XP = (int)(Math.random() * 250) + 100;
                                                                         System.out.println();
System.out.println("You have recieved " + XP + " Experience points");
     System.out.println("________________________________");
                                              TimeUnit.SECONDS.sleep(2);
if(XP < levelUP)
{
                                                                             System.out.println();
    System.out.println("You need " + levelUP + " Experience Points to level up, you only have " + XP + " Experience Points");
                                           TimeUnit.SECONDS.sleep(2);
         System.out.println("________________________________");

}
while(XP >= levelUP)
{
                                                                             System.out.println();
    cLevel += 1;
      System.out.println("You have leveled up to level " + cLevel);
  TimeUnit.SECONDS.sleep(2);
             System.out.println("________________________________");                                        
                XP -= levelUP;
                levelUP += 100;


                            System.out.println();
        System.out.println("You have gained 4 extra level up points to use on stats");
                 System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(2);
   statsP = 4;
   while(statsP > 0)
{
               System.out.println();
    System.out.print("Which would you like to assign points to (a)ttack or (s)peed? --> ");
        String letter = keyboard.nextLine();
   if(letter.equals("a") || letter.equals("attack") || letter.equals("Attack"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Attack? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
          Attack += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Attack and have " + statsP + " points left"); 
                    System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(3);
        }
    }
   if(letter.equals("s") || letter.equals("speed") || letter.equals("Speed"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Speed? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
         Speed += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Speed and have " + statsP + " points left");
                    System.out.println("________________________________");
      TimeUnit.SECONDS.sleep(3);

        }
    }
  if(statsP == 0)
  {
               System.out.println();
    System.out.println("StormRazors new stats! Attack = " + Attack + " Speed = " + Speed);
      System.out.println("________________________________");
TimeUnit.SECONDS.sleep(3);
}
 }
  } 
 }
    }            
          }  
          
           if(bDragonHP == 50)
          {
             
          System.out.println("As you were heading down the trail you heard a swoosh over head");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
          System.out.println("You fixed your eyes to the sky to see the ferocious creature");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
          System.out.println("What you saw would surely destroy the kingdom of Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
            System.out.println("It was a PAPA DRAGON");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                        System.out.println();
            System.out.println("DUN!!! DUN!!! DUN!!!");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
              System.out.println();
            System.out.println("The PAPA DRAGON flew over head to the kingdom of Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
              System.out.println();
            System.out.println("While he flew over head he threw out two of his henchmen at you to delay you from getting to Edelrid");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(4);
              System.out.println();
            System.out.println("The two henchmen were Ogres who rode on his wings");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
             System.out.println();
            System.out.println("You needed to get to the kingdom of Edelrid or everyone would surely die, but the Ogres were in your way");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(4);
               System.out.println();
            System.out.println("Because of the dire situation you gained a new ability called Dusk Blade");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
             System.out.println();
            System.out.println("Dusk Blade is a separate sword you conjure and can do tremendous amounts of damage");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
                         System.out.println();
            System.out.println("You must fight the Ogres with your new abilities to get to Edelrid kingdom");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("But wait you only have " + characterHP + " HP Left");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You decided to use a health potion you recived from defeating the wolf");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          int hPotion = 100;
            characterHP += hPotion;
            System.out.println();
            System.out.println("You have gained " + hPotion + " HP and now have " + characterHP + " HP");
   System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          }
        
          if(bDragonHP == 50)
          {
                            String csAttk;
 while(hmHP > 0 && dead2 == 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the Ogre with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l)  -Dusk Blade(d) --> ");
         csAttk = keyboard.nextLine();
                 System.out.println("________________________________");
  
   if(csAttk.equals("Quick Attack") || csAttk.equals("Q") || csAttk.equals("q") || csAttk.equals("QUICK ATTACK") || csAttk.equals("quick attack"))
{
      if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hmHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hmHP > 0 && csAttk.equals("Quick Attack") || hmHP > 0 && csAttk.equals("Q") || hmHP > 0 && csAttk.equals("q") || hmHP > 0 && csAttk.equals("QUICK ATTACK") || hmHP > 0 && csAttk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
         if(csAttk.equals("Lightning Strike") || csAttk.equals("lightning strike") || csAttk.equals("LIGHTNING STRIKE") || csAttk.equals("L") || csAttk.equals("l"))
{
            if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
      
                                                  System.out.println();
         System.out.println("you attacked the Ogre with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);



                                              System.out.println();
      System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
              TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hmHP -= lDamage;
          System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(2);
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

   }
         
              if(hmHP > 0 && csAttk.equals("Lightning Strike") || hmHP > 0 && csAttk.equals("lightning strike") || hmHP > 0 && csAttk.equals("LIGHTNING STRIKE") || hmHP > 0 && csAttk.equals("L") || hmHP > 0 && csAttk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
           System.out.println();
             System.out.println("The Ogre used Ground Pound");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                          System.out.println("________________________________");

         }
              }
           
         }
   if(csAttk.equals("Dusk Blade") || csAttk.equals("D") || csAttk.equals("B") || csAttk.equals("dusk blade") || csAttk.equals("DUSK BLADE") || csAttk.equals("d") || csAttk.equals("b"))
{
      if(Speed > hmS)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Dusk Blade");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                      System.out.println();
System.out.println("Kachow!");
             System.out.println("________________________________");
 System.out.println();
System.out.println(" _,-,");
     TimeUnit.SECONDS.sleep((long) .5);
System.out.println("T_  |");
          TimeUnit.SECONDS.sleep((long) .5);
 System.out.println("||`-'");
          TimeUnit.SECONDS.sleep((long) .5);
System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
    System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
     System.out.println("~~");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * DB) + 50;
       hmHP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 240)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 239)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hmHP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hmHP > 0 && csAttk.equals("Dusk Blade") || hmHP > 0 && csAttk.equals("D") || hmHP > 0 && csAttk.equals("B") || hmHP > 0 && csAttk.equals("dusk blade") || hmHP > 0 && csAttk.equals("DUSK BLADE") || hmHP > 0 && csAttk.equals("d") || hmHP > 0 && csAttk.equals("b"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hmS == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
           
         
 if(characterHP <= 0)
         {
                System.out.println();
     System.out.println("You dead LOL HAHA");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                System.out.println();
     System.out.println("Sorry you didn't make it to the end play again if you want to try again");
            TimeUnit.SECONDS.sleep(3);
     System.out.println("________________________________");
           dead2 += 1;
     
                        }
       if(hmHP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated the first Ogre, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
         System.out.println();
         System.out.println("Now time to battle the second");
         TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
       }
   
   if(hmHP <= 0)
   {
                            System.out.println();
     System.out.println("The Second Ogre jumps out at you");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                            System.out.println();
     System.out.println("You must defeat him to get to the kingdom of Edelrid");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
   }    
                           
 }
          }
        

                      
                       
                        if(hmHP <= 0)
          {
                            String csAttk;
 while(hm2HP > 0 && dead2 == 0)
 {
           System.out.println();
     System.out.println("Choose an attack to hit the Ogre with");
     System.out.print(" -Quick Attack(q)  -Lightning Strike(l)  -Dusk Blade(d) --> ");
         csAttk = keyboard.nextLine();
                 System.out.println("________________________________");
  
   if(csAttk.equals("Quick Attack") || csAttk.equals("Q") || csAttk.equals("q") || csAttk.equals("QUICK ATTACK") || csAttk.equals("quick attack"))
{
      if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Quick Attack");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("SLASH! SLASH! )xxxxx;;;;;;;;;>");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hm2HP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hm2HP > 0 && csAttk.equals("Quick Attack") || hm2HP > 0 && csAttk.equals("Q") || hm2HP > 0 && csAttk.equals("q") || hm2HP > 0 && csAttk.equals("QUICK ATTACK") || hm2HP > 0 && csAttk.equals("quick attack"))
     {
                                      fDamage = (int)(Math.random() * 18) + hmA;
         if(hm2S == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
         if(csAttk.equals("Lightning Strike") || csAttk.equals("lightning strike") || csAttk.equals("LIGHTNING STRIKE") || csAttk.equals("L") || csAttk.equals("l"))
{
            if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
      
                                                  System.out.println();
         System.out.println("you attacked the Ogre with Lightning Strike");
                   System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(1);



                                              System.out.println();
      System.out.println("ZAP! ZAP! ZAP!");
             System.out.println("");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/  _/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/  /");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/ __/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("_/ /");
           TimeUnit.SECONDS.sleep((long).5);  
           System.out.println("/__/");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("//");
           TimeUnit.SECONDS.sleep((long).5);
             System.out.println("/'");
           TimeUnit.SECONDS.sleep((long).5);
              TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * Attack) + 13;
       hm2HP -= lDamage;
          System.out.println("________________________________");
                        TimeUnit.SECONDS.sleep(2);
if(lDamage >= 20)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 19)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(2);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

   }
         
              if(hm2HP > 0 && csAttk.equals("Lightning Strike") || hm2HP > 0 && csAttk.equals("lightning strike") || hm2HP > 0 && csAttk.equals("LIGHTNING STRIKE") || hm2HP > 0 && csAttk.equals("L") || hm2HP > 0 && csAttk.equals("l"))
     {
                                      fDamage = (int)(Math.random() * 18) + hm2A;
         if(hm2S == 1)
         {
           System.out.println();
             System.out.println("The Ogre used Ground Pound");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                    System.out.println("________________________________");
                            System.out.println();

                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                          System.out.println("________________________________");

         }
              }
           
         }
   if(csAttk.equals("Dusk Blade") || csAttk.equals("D") || csAttk.equals("B") || csAttk.equals("dusk blade") || csAttk.equals("DUSK BLADE") || csAttk.equals("d") || csAttk.equals("b"))
{
      if(Speed > hm2S)
   {
     System.out.println();
     System.out.println("You are faster than the Ogre");
                      System.out.println("________________________________");
     TimeUnit.SECONDS.sleep(1);
   }
                     System.out.println();
         System.out.println("you attacked the Ogre with Dusk Blade");
                   System.out.println("________________________________");
                                TimeUnit.SECONDS.sleep(2);


                     System.out.println();
System.out.println("Kachow!");
             System.out.println("________________________________");
 System.out.println();
System.out.println(" _,-,");
     TimeUnit.SECONDS.sleep((long) .5);
System.out.println("T_  |");
          TimeUnit.SECONDS.sleep((long) .5);
 System.out.println("||`-'");
          TimeUnit.SECONDS.sleep((long) .5);
System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
    System.out.println("||");
          TimeUnit.SECONDS.sleep((long) .5);
     System.out.println("~~");
TimeUnit.SECONDS.sleep(1);
     lDamage = (int)(Math.random() * DB) + 50;
       hm2HP -= lDamage;
        System.out.println("________________________________");
   if(lDamage >= 240)
   {
         System.out.println();
       System.out.println("You hit a critical strike and did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________"); 
   }
   if(lDamage <= 239)
   {
          System.out.println();
       System.out.println("You did " + lDamage + " to the Ogre. " + " the Ogre has " + hm2HP + " HP");
       TimeUnit.SECONDS.sleep(3);
                        System.out.println("________________________________");
                                System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(2);
                                                          System.out.println("________________________________");

   }
   
           if(hm2HP > 0 && csAttk.equals("Dusk Blade") || hm2HP > 0 && csAttk.equals("D") || hm2HP > 0 && csAttk.equals("B") || hm2HP > 0 && csAttk.equals("dusk blade") || hm2HP > 0 && csAttk.equals("DUSK BLADE") || hm2HP > 0 && csAttk.equals("d") || hm2HP > 0 && csAttk.equals("b"))
     {
                                      fDamage = (int)(Math.random() * 18) + hm2A;
         if(hm2S == 1)
         {
                   
                                                  System.out.println();
             System.out.println("The Ogre used Mega Punch");
             
                    characterHP -= fDamage;
            System.out.println("________________________________");
            TimeUnit.SECONDS.sleep(1);
         }
         if(fDamage >= 220)
         {
                                     System.out.println();
                                    
             System.out.println("The Ogre hit a critical strike and did " + fDamage + ", You have " + characterHP + " HP");
             TimeUnit.SECONDS.sleep(3);
            System.out.println("________________________________");
            
         }
         if(fDamage <= 219)
         {
                                                               System.out.println();
             System.out.println("The Ogre did " + fDamage +  " damage. You have " + characterHP + " HP");
                          TimeUnit.SECONDS.sleep(2); 
                                      System.out.println("________________________________");
                                                                                         System.out.println();
                          System.out.println("The attack wasn't very effective");
                                       TimeUnit.SECONDS.sleep(1);
                                                          System.out.println("________________________________");

}
           }
   }
           
         
 if(characterHP <= 0)
         {
                System.out.println();
     System.out.println("You dead LOL HAHA");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
                System.out.println();
     System.out.println("Sorry you didn't make it to the end play again if you want to try again");
            TimeUnit.SECONDS.sleep(3);
     System.out.println("________________________________");
           dead2 += 1;
     
                        }
       if(hm2HP <= 0)
 {
                                                                    System.out.println();
     System.out.println("You have deafeated both Ogres, you have " + characterHP + " HP");
            TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
         System.out.println();
         System.out.println("You must get to Edelrid Kingdom fast");
         TimeUnit.SECONDS.sleep(2);
     System.out.println("________________________________");
       
   
   
     //Level System
     XP = (int)(Math.random() * 250) + 100;
                                                                         System.out.println();
System.out.println("You have recieved " + XP + " Experience points");
     System.out.println("________________________________");
                                              TimeUnit.SECONDS.sleep(2);
if(XP < levelUP)
{
                                                                             System.out.println();
    System.out.println("You need " + levelUP + " Experience Points to level up, you only have " + XP + " Experience Points");
                                           TimeUnit.SECONDS.sleep(2);
         System.out.println("________________________________");

}
while(XP >= levelUP)
{
                                                                             System.out.println();
    cLevel += 1;
      System.out.println("You have leveled up to level " + cLevel);
  TimeUnit.SECONDS.sleep(2);
             System.out.println("________________________________");                                        
                XP -= levelUP;
                levelUP += 100;


                            System.out.println();
        System.out.println("You have gained 4 extra level up points to use on stats");
                 System.out.println("________________________________");
                          TimeUnit.SECONDS.sleep(2);
   statsP = 4;
   while(statsP > 0)
{
               System.out.println();
    System.out.print("Which would you like to assign points to (a)ttack or (s)peed? --> ");
        String letter = keyboard.nextLine();
   if(letter.equals("a") || letter.equals("attack") || letter.equals("Attack"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Attack? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
          Attack += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Attack and have " + statsP + " points left"); 
                    System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(3);
        }
    }
   if(letter.equals("s") || letter.equals("speed") || letter.equals("Speed"))
    {
     System.out.println();
        System.out.print("You have " + statsP + " Points " + "How many points would you like to assign to Speed? --> ");
        int addD = keyboard.nextInt();
                   System.out.println("________________________________");
            
        if(addD > statsP)
        {
              System.out.println();
            System.out.println("Invalid number please pick a number between 1 and " + statsP);
                        System.out.println("________________________________");
                    TimeUnit.SECONDS.sleep(2);
        }
        if(addD <= statsP)
        {
         statsP -= addD;
         Speed += addD;
    System.out.println();
         System.out.println("You have added " + addD + " points to Speed and have " + statsP + " points left");
                    System.out.println("________________________________");
      TimeUnit.SECONDS.sleep(3);

        }
    }
  if(statsP == 0)
  {
               System.out.println();
    System.out.println("StormRazors new stats! Attack = " + Attack + " Speed = " + Speed);
      System.out.println("________________________________");
TimeUnit.SECONDS.sleep(3);
}
 }
  } 
 }
    }            
          }  
 //End Chapter 3 outro 
        
        }
  
     public void ch3End() throws InterruptedException
  {
       if(bDragonHP == 50 && hmHP <= 0 && hm2HP <= 0)
       {
         System.out.println();
            System.out.println("You ran as fast as you could");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2); 
      System.out.println();
            System.out.println("You must save the kingdom of Edelrid from the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("As you arrived to the gates of Edelrid everything was burnt to a crisp");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("You saw the huge PAPA DRAGON flying around the kingdom");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      System.out.println();
            System.out.println("You were quick to conjure Dusk Blade and throw it at the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      System.out.println();
            System.out.println("You landed a direct hit");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      mDrag -= 3000;
      System.out.println();
            System.out.println("You did 3,000 damage to the PAPA DRAGON he has " + mDrag + " HP left" );
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("The PAPA DRAGON flew straight for you and the fight was on");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      characterHP -= 100;
       System.out.println();
            System.out.println("The PAPA DRAGON used wing burst and did 100 damage you have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      mDrag -= 10000;
       System.out.println();
            System.out.println("You used Dusk Blade and Lightning Strike at the same time and did 10000 damage" );
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
       System.out.println();
            System.out.println("The PAPA DRAGON has " + mDrag + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
         System.out.println("You must do something quick before the PAPA DRAGON destroys everything");
     System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
         System.out.println();
         System.out.println("You have channeled your full power");
     System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
         System.out.println();
         System.out.println("You have gained 200k health");
     System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
         characterHP += 200000;
         System.out.println();
            System.out.println("The PAPA DRAGON has became enraged");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          System.out.println();
            System.out.println("The PAPA DRAGON has gained 200k health");
                        System.out.println("________________________________");
         mDrag += 200000;
          TimeUnit.SECONDS.sleep(3);
       System.out.println();
            System.out.println("The PAPA DRAGON used Meteor Strike");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("You must stop the meteors from hitting Edelrid");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("You jumped into the air and summoned multiple Dusk Blades and used them on the meteors");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(4);
             System.out.println();
            System.out.println("One giant meteor hasn't been destroyed");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          System.out.println();
          System.out.println("You have to Body Block it to save Edelrid");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           System.out.println();
         while(LOOP4 == 0)
         {
          System.out.println("Would you like to Body Block the Meteor. Type (y)es or (n)o --> ");
                    String bBlock = keyboard.nextLine();
         System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
        
         if(bBlock.equals("y") || bBlock.equals("yes") || bBlock.equals("Yes") || bBlock.equals("Y") || bBlock.equals("YES"))
         {
                         System.out.println();
            System.out.println("You destroyed the meteors and body blocked the giant meteor but took 50k damage");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          characterHP -= 50000;
          System.out.println();
            System.out.println("You have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
         System.out.println();
            System.out.println("The PAPA DRAGON used Incineration Blast");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You took 50K damage");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           characterHP -= 50000;
            System.out.println();
            System.out.println("You have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You attacked the PAPA DRAGON with Lightning Dusk Blade");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
            System.out.println();
            System.out.println("You did 50k damage to the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           mDrag -= 50000;
            System.out.println();
            System.out.println("The PAPA DRAGON has " + mDrag + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           LOOP4 += 1;
         }
         if(bBlock.equals("no") || bBlock.equals("n") || bBlock.equals("N") || bBlock.equals("No") || bBlock.equals("NO"))
         {
           System.out.println();
            System.out.println("You destroyed the meteors but didn't destroy the giant meteor");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
           System.out.println();
            System.out.println("The kingdom of Edelrid has fallen, but you still must kill the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
            System.out.println();
            System.out.println("You have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You attacked the PAPA DRAGON with Lightning Dusk Blade");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
            System.out.println();
            System.out.println("You did 50k damage to the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           mDrag -= 50000;
            System.out.println();
            System.out.println("The PAPA DRAGON has " + mDrag + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("The PAPA DRAGON used Incineration Blast");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("You took 100K damage");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           characterHP -= 100000;
            System.out.println();
            System.out.println("You have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
           LOOP4 += 1;
         }
         }
         
         System.out.println();
            System.out.println("The PAPA DRAGON swooped down and flew straight at you");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          System.out.println();
            System.out.println("You leaped with all you had left straight towards the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          System.out.println();
            System.out.println("Both of you went straight for each other");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("Who would land the killing blow??");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
          System.out.println();
            System.out.println("You both used your strongest power moves");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("The PAPA DRAGON used Yeetus Deletus");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("You used Lightning Dusk Blade");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("You both hit each other with staggering blows");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
          System.out.println();
            System.out.println("You did 3 billion damage to the PAPA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                                System.out.println();
            System.out.println("The PAPA DRAGON did 3 billlion damage to you");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
                                System.out.println();
            System.out.println("You both died but the kindgom of Edelrid was saved");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
                                System.out.println();
            System.out.println("THE END!!");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
                                System.out.println();
            System.out.println("YEET");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
    }

       
    if(bDragonHP <= 0 && hmHP <= 0 && hm2HP <= 0)
    {
     System.out.println();
            System.out.println("You ran as fast as you could");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2); 
      System.out.println();
            System.out.println("You must save the kingdom of Edelrid from the MAMA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("As you arrived to the gates of Edelrid everything was burnt to a crisp");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("You saw the huge MAMA DRAGON flying around the kingdom");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      System.out.println();
            System.out.println("You were quick to conjure Dusk Blade and throw it at the MAMA DRAGON");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      System.out.println();
            System.out.println("You landed a direct hit");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
      mDrag -= 3000;
      System.out.println();
            System.out.println("You did 3,000 damage to the MAMA DRAGON she has " + mDrag + " HP left" );
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      System.out.println();
            System.out.println("The MAMA DRAGON flew straight for you and the fight was on");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      characterHP -= 100;
       System.out.println();
            System.out.println("The MAMA DRAGON used wing burst and did 100 damage you have " + characterHP + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
      mDrag -= 10000;
       System.out.println();
            System.out.println("You used Dusk Blade and Lightning Strike at the same time and did 10000 damage" );
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
       System.out.println();
            System.out.println("The MAMA DRAGON has " + mDrag + " HP left");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(2);
       System.out.println();
            System.out.println("The MAMA DRAGON became enraged and used Yeetus Deletus");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
       System.out.println();
            System.out.println("The MAMA DRAGON has destroyed the whole kingdom of Edelrid");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
       System.out.println();
            System.out.println("You are dead LOL HAHAH YOU SUCK get SHREKT M8");
                        System.out.println("________________________________");
          TimeUnit.SECONDS.sleep(3);
                                System.out.println();
            System.out.println("THE END!!!");
          TimeUnit.SECONDS.sleep(4);
      
    }

  }
        
        public static void main(String[] args) throws InterruptedException
{
    Final game = new Final();
    game.start();
    game.bodyOfChapter1();
    game.firstBattle();
    game.chapter3();
    game.ch3End();
}

    
        }
