package Electronic_Store;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ElectronicsStore{
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner input = new Scanner (System.in); // Scanner for input
        
        Membership mem = new Membership();
        
        System.out.println("Welcome to our store!");
        System.out.println("We require a membership to browse our system.");
        System.out.println("If you already have an account with us, please enter 1");
        System.out.println("If you would like to sign up for our free Standard membership, enter 2");
        System.out.println("If you would like to sign up for our Geek membership for a $5.99 monthly fee, enter 3");
        System.out.print("Please enter your choice now: ");
        int type = input.nextInt();

        // Opens the file and also makes a file if necessary
        File file = new File("login.txt");
        if (!file.exists())
        {
            file.createNewFile();
        }
        
 
        BufferedWriter output = new BufferedWriter(new FileWriter("login.txt", true)); // Used to write to file
        
        switch(type)
        {
            case 1:
            
            // Creates scanner for checking input with file
            Scanner inputFile = new Scanner(file);
            
            // Set up the scanner to use "/" as the delimiter
             inputFile.useDelimiter("/");
            
            System.out.print("So you have an account with us, great! Please enter your email address: ");
            String searchEmail = input.next();
 
            // Read from the file
                try
                {
                   String line = null;     //Declared a String variable to implement the split function and store the file input as it is being read through
                   String [] arr;          //Declared a String array to store
                                          // individual strings within the (txtinfo) ArrayList
                   ArrayList<String> txtinfo = new ArrayList<String>();  //Created a new ArrayList of type String to hold the text file information
                   while(inputFile.hasNextLine())
                    {                                       //while loop to traverse through the entire txt file to store it's content
                       line = inputFile.nextLine();    //store the line which that is skipped over as the file is being read
                       arr = line.split("/");          //store the string information from the file which contains forward slash delimiters
                       if(arr.length > 2)            // once the array length is greater than 2 the element values will then be placed into
                           for(int i = 0; i<arr.length;i++)     //the arrayList     (I believe there is a better method, but
                               txtinfo.add(arr[i]);                                 //...I don't know it so for now this will have to do)
                    }

                   if(txtinfo.contains(searchEmail) == true)  //if the user's input is contained within the arrayList display
                       System.out.println("Found it!");       //defined message.
                   else
                       System.out.println("Did not find it.");  //else display message that their input could not be found.
                   
                  /*for(int j=0; j<txtinfo.size();j++)             
                   {                                                  
                       //System.out.print("\n");                      
                      // System.out.print(txtinfo.size());
                       System.out.print("\n");                        //Used this piece of code to test and troubleshoot the 
                       //System.out.println(searchEmail);             //previous errors I was having with the ArrayList function
                       System.out.print(txtinfo.get(j));               //contain 
                   }*/

            System.out.print("Please enter your password: ");   //grab the user's password input
            String searchPassword = input.next();               //store the user's input into the String variable searchPassword
            
            // Read from the file

                    if(txtinfo.contains(searchPassword) == true)
                        System.out.println("Found it!");
                    else
                        System.out.println("Did not find it.");
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            break;

            case 2:
            
            // Open the data file
            
            System.out.println("You're on your way for a free membership!");
            System.out.print("Please enter your first name: ");
            String fName = input.next(); // Used for string inputs
            mem.setFName(fName);
            System.out.print("Please enter your middle initial: ");
            String mInit = input.next(); // Used for string inputs
            mem.setMInitial(mInit);
            System.out.print("Please enter your last name: ");
            String lName = input.next(); // Used for string inputs
            mem.setLName(lName);
            System.out.print("Please enter your email address: ");
            String em = input.next(); // Used for string inputs
            mem.setEmail(em);
            System.out.print("Please enter a password: ");
            String passw = input.next();
            mem.setPassword(passw);
            String nameContent = (fName + " " + mInit + " " + lName);
            output.append(em + "/" + passw + "/" + nameContent); // Inputs into file
            output.newLine();
            //output.append(nameContent); // Inputs into file
            //output.newLine();
            //output.newLine(); // New line
            output.close(); // Closes file
            break;
            
            case 3: 
            
            System.out.println("Great! You're about to get a geek membership!");
            System.out.print("Please enter your first name: ");
            String fName1 = input.next(); // Used for string inputs
            mem.setFName(fName1);
            System.out.print("Please enter your middle initial: ");
            String mInit1 = input.next(); // Used for string inputs
            mem.setMInitial(mInit1);
            System.out.print("Please enter your last name: ");
            String lName1 = input.next(); // Used for string inputs
            mem.setLName(lName1);
            System.out.print("Please enter your email address: ");
            String em1 = input.next(); // Used for string inputs
            mem.setEmail(em1);
            System.out.print("Please enter a password: ");
            String pass1 = input.next();
            mem.setPassword(pass1);
            System.out.print("Please enter your credit card's first four numbers: ");
            int cc1 = input.nextInt(); // Used for int inputs
            System.out.print("Please enter your credit card's next four numbers: ");
            int cc2 = input.nextInt(); // Used for int inputs
            System.out.print("Please enter your credit card's next four numbers: ");
            int cc3 = input.nextInt(); // Used for int inputs
            System.out.print("Please enter your credit card's last four numbers: ");
            int cc4 = input.nextInt(); // Used for int inputs
            String cc = Integer.toString(cc1) + Integer.toString(cc2) + Integer.toString(cc3) + Integer.toString(cc4);
            mem.setCCInfo(cc);
            String nameContent1 = (fName1 + " " + mInit1 + " " + lName1); 
            output.append(em1 + "/" + pass1 + "/" + nameContent1 + "/" + cc); // Writes to file
            output.newLine();
            //output.append(); // Writes to file
            //output.newLine();
            //output.append(); // Writes to file
            //output.newLine();
            //output.newLine(); // New lines
            output.close(); // Closes file
            break;           
        }
        
        System.out.println("\nGreat! Welcome to our store! Please choose a category to browse: ");
        System.out.println("Enter 1 for TVs, 2 for Cell Phones, 3 for Wearables, 4 for PC & Accessories");
        System.out.println("5 for Game Consoles, 6 for Cameras, 7 for Speakers, 8 for Musical Instruments");
        System.out.print("9 for Car Electronics, or 10 for Office Electronics: ");
        int type2 = input.nextInt();
    }
    
}