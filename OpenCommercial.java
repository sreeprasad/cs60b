/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

       URL oracle = new URL("http://www."+inputLine+".com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        int lineNumber=0;
        String []array = new String[5];
        while ((inputLine = in.readLine()) != null){ 
            if(lineNumber>4) break;
            System.out.println("line number "+lineNumber);
            array[lineNumber]=inputLine;
            lineNumber++;
          }
        in.close();
        for (int i=array.length-1;i>=0 ;i--) {
          System.out.println(array[i]);
        }
        
         
     
  }
}