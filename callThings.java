package NewDarkAge;


import java.io.*;
import java.util.*;
import Pirmohamed.InputHandler;

public class callThings {
   public static Scanner sc = new Scanner(System.in);
   public static NDACHARSHEET man = new NDACHARSHEET();

    public static void main(String[] args) throws IOException {
      // man.buildCharacter();
    //  System.out.println(InputHandler.getInt(sc));
    man.buildCharacter();
    System.out.println("Enter the name of the output filename\nnew FileName --> ");
    PrintStream output = new PrintStream(new File(sc.nextLine()));
      CreateSheet sheet = new CreateSheet(man,output);
      sheet.buildCharacter();
    
    }
}
