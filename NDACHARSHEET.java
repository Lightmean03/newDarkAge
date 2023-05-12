package NewDarkAge;
import java.util.Random;
import Pirmohamed.InputHandler;

import java.util.*;
public class NDACHARSHEET {


    public NDACHARSHEET(String NAME){
        Name = NAME;
    }
    public NDACHARSHEET(){}

    static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public String Name;
    public  String Species;
    public  int Hp = 0, Spd = 0, Ms = 0, Def = 0, MDef = 0, Tgh = 0, Inti = 0, Str = 0, Agl = 0;
     String[] skillNames = {"Martial", "Ranged", "Magic", "Dodge", "Crossbows", "Hide", "Quiet", "Assassination", "Sleight", "Lock", "Disguise", "Charm", "Persuasion", "Intrigue", "Intimidate", "Orate", "Act","Art","Instrument", "Sing", "Dance", "Mercantile", "Evaluate", "Spotting", "Listen", "Insight", "FirstAid", "lore", "Religion", "Theorem", "Craft", "Customs","Foreign Language","Read/Write","Survival", "Track", "Climbing", "Riding", "Animal", "Botany", "Trap", "Sailing", "Swimming"};
    int skill[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public  int Martial = 0, Ranged = 0, Magic = 0, Dodge = 0, Crossbows = 0, Hide = 0, Quiet = 0, Assassination = 0, Sleight = 0, Lock = 0, Disguise = 0, Charm = 0, Persuasion = 0, Intrigue = 0, Intimidate = 0, Orate = 0, Act = 0, Sing = 0, Dance = 0, Mercantile = 0, Evaluate = 0, Spotting = 0, Listen = 0, Insight = 0, FirstAid = 0, lore = 0, Religion = 0, Theorem = 0, Craft = 0, Survival = 0, Track = 0, Climbing = 0, Riding = 0, Animal = 0, Botany = 0, Trap = 0, Sailing = 0, Swimming = 0;

     
    public  void SetAttribute(){
        System.out.println("would you like to point buy or  roll dice for your Attributes: 1:Points, 2:Dice ");
        int choice = InputHandler.getIntInRange(sc, 1, 2);

        switch (choice) {
            case 1: atriBuy(); break;
            case 2: rollAtribute(); break;
        }
    
    }

    public  void atriBuy(){
            int points = 12;
            for (int i =0; i < points; i++){
                System.out.printf("you have %d points to spend select 1-4 to add point\n 1.Tgh:%d\n 2.Agl:%d\n 3.Str:%d\n 4.Int:%d\n", (points-i),Tgh,Agl,Str,Inti);
                switch(InputHandler.getIntInRange(sc,1,4)){
                    case 1: 
                        if(Tgh<5){ Tgh++;
                        }else { System.out.println("You already have a max of 5 points here"); points++;
                    } break;
                    case 2: 
                    if(Agl<5){ Agl++;
                    }else { System.out.println("You already have a max of 5 points here"); points++;
                }break;
                    case 3: 
                    if(Str<5){ Str++;
                    }else { System.out.println("You already have a max of 5 points here"); points++;
                }break;
                    case 4: 
                    if(Inti<5){ Inti++;
                    }else { System.out.println("You already have a max of 5 points here"); points++;
                }break;
                    default: points++; System.out.println("Invalid Input!!!!"); break;
                }

            }
            System.out.printf(" Your final Atribute Score\nTgh:%d\n Agl:%d\n Str:%d\n Int:%d\n", Tgh,Agl,Str,Inti);
    }

    public  void rollAtribute(){
        int rolls[] = {D4(), D4(), D6() , D6()};
        int reRolls = 1;
        int dice =4;
        System.out.printf("your rolls\n D4:%d D4:%d D6:%d D6:%d\nWould you like to re-roll etither of your D6 rolls? y/n\n", rolls[0],rolls[1],rolls[2],rolls[3]);
        while(reRolls>0){
            switch(sc.nextLine()){
            case "y":
                System.out.printf("you have %d re-rolls left would you like to re-roll 1:%d or 2:%d\n", reRolls, rolls[2],rolls[3]);
                switch (sc.nextInt()){
                case 1:
                    rolls[2] = D6();
                    reRolls--;  
                    break;
                case 2: 
                    rolls[3] = D6();
                    reRolls--;
                    break;
                default : System.out.println("INVALID INPUT"); break;

                }
                break;
            case "n":
            reRolls = 0;
            break;
            default: System.out.println("INVALID INPUT\nwould you like to re-roll y/n\n"); break;
            }
            System.out.printf("your d6 rolls %d and %d\n", rolls[2],rolls[3]);
            System.out.printf("you have %d re-rolls left would you like to re-roll y/n\n", reRolls);
        }

            for (int i = 0; i < dice; i++) {
                System.out.printf("Where would you like to put your %d point dice\n 1.Tgh:%d\n 2.Agl:%d\n 3.Str:%d\n 4.Int:%d\n", rolls[i],Tgh,Agl,Str,Inti); //error here
                switch(sc.nextInt()){
                    case 1: 
                        if(Tgh == 0){
                            Tgh = rolls[i];
                        } else{
                             System.out.println("You have already put a dice here"); 
                             i--;
                            }
                        break;
                    case 2:
                        if(Agl == 0){
                            Agl = rolls[i];
                        } else{
                            System.out.println("You have already put a dice here"); 
                            i--;
                            }
                        break;
                    case 3:
                        if(Str == 0){
                            Str = rolls[i];
                        } else{
                            System.out.println("You have already put a dice here"); 
                            i--;
                            }
                        break;
                    case 4:
                        if(Inti == 0){
                            Inti = rolls[i];
                        } else{
                            System.out.println("You have already put a dice here"); 
                            i--;
                            }
                        break;

                }
            }
            System.out.printf(" Your final Atribute Score\nTgh:%d\n Agl:%d\n Str:%d\n Int:%d\n", Tgh,Agl,Str,Inti);
    }

    public  void SetSpecies(){
        System.out.println("What Species would you like to be 1.Troll 2.Veteris 3.Kobold 4.Human 5.Catalyst");
        switch(InputHandler.getInt(sc)){
            case 1: Hp = 7; Ms = 40; Spd = 4; Def =3; MDef = 1; Species = "Troll"; Str++; break;
            case 2: Hp = 10; Ms = 40; Spd = 4; Def =0; MDef = 0; Species = "Veteris"; Str++;  break;
            case 3: Hp = 4; Ms = 45; Spd = 5; Def =2; MDef = 2; Species = "Kobold";  break;
            case 4: Hp = 5; Ms = 40; Spd = 4; Def =0; MDef = 0; Species = "Human"; break;
            case 5: Hp = 4; Ms = 45; Spd = 5; Def =1; MDef = 3; Species = "Catalyst"; break;
            default:  System.out.println("Invalid input try again"); SetSpecies(); break;

        }
        System.out.printf("you are a %s your stats are\n HP:%d Ms:%d%% Def:%d MDef:%d\n", Species,Hp,Ms,Def,MDef);
    }

    public void pickSkill(){
        System.out.printf("choose Skill Category 1: ");
    }

    public void setSkills(){
        for(int i=20;i>0;i--){
            printSkills();
                System.out.printf("You have %d skill points left\nHow many points would you like to spend\n ",i);

            int amount = InputHandler.getIntInRange(sc, 1, i);
               System.out.println( "What skill would you like to increase\n1-43 -->");
            skill[(InputHandler.getIntInRange(sc, 1, 43)-1)] += amount;


        }
    }

    /**
     * 
     */
    public  void printSkills(){

        for(int i=0;i<skillNames.length;i++){
            if(i==0){
                System.out.println("Combat Skills\n");
            }else if(i==5){
                System.out.printf("\n\nStealth Skills\n");
            }else if(i==11){
                System.out.printf("\n\nPersonality Skills\n");
            }else if(i==23){
                System.out.printf("\n\nAwareness Skills\n");
            }else if(i==26){
                System.out.printf("\n\nKnowledge Skills\n");
            }else if(i==34){
                System.out.printf("\n\nNature Skills\n");
            }
          //  System.out.print(i);
            System.out.printf("%d:%s:%d\n",i,skillNames[i],skill[i]);
        }
    }

    public void setName(String name){
        Name = name;
    }

    public void setName(){
        System.out.println("What is your charcters name: ");
        Name = sc.nextLine();
    }

    



    public  void buildCharacter(){
        
        setName();
        SetAttribute();
        SetSpecies();
        System.out.println("disperse 20 Skill Points to any skills you wish");
        setSkills();
        System.out.printf("\n\n\n\n\nYour Character Sheet\nName:%s\nSpecies:%s\nHp:%d\nMs:%d%%\nDef:%d\nMDef:%d\n",Name,Species,Hp,Ms,Def,MDef);
        System.out.printf("Atribute Score\nTgh:%d\nAgl:%d\nStr:%d\nInt:%d\n",Tgh,Agl,Str,Inti);
       printSkills();
       System.out.println("Your Character Sheet has been successfully created");

    }


    public static int D4(){ return rand.nextInt(4-1+1)+1; }

    public static int D6(){ return rand.nextInt(6-1+1)+1; }

    public static int D8(){ return rand.nextInt(8-1+1)+1; }

    public static int D10(){ return rand.nextInt(10-1+1)+1; }

    public static int D12(){ return rand.nextInt(12-1+1)+1; }

    public static int D100(){ return rand.nextInt(100-1+1)+1; }

}
