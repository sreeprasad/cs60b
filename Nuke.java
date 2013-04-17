/* OpenCommercial.java */

 import java.io.*;

class Nuke {

   
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter string atleast 2 characters long: ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    String newInputLine=inputLine.substring(0,1)+inputLine.substring(2);
    System.out.println(newInputLine);
         
     
  }
}