import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replace {
	   
	     void modifyFile(String filePath, String oldString, String newString)
	    {
	    	 //here Creating a File object by passing the path of the file to be modified
	        File fileToBeModified = new File(filePath);
	        //here Initialize oldContent with an empty string.  
	        String oldContent = "";
	        //Create BufferedReader object to read the input text file line by line. 
	        BufferedReader reader = null;
	        //Read all the lines of input text file one by one and append it to oldContent 
	        FileWriter writer = null;
	         
	        try
	        {
	            reader = new BufferedReader(new FileReader(fileToBeModified));
	             
	            //Reading all the lines of input text file into oldContent
	             
	            String line = reader.readLine();
	             
	            while (line != null) 
	            {
	                oldContent = oldContent + line + System.lineSeparator();
	                 
	                line = reader.readLine();
	            }
	             
	            //here Replace all the occurrences of oldString with newString using replaceAll() method
	             
	            String newContent = oldContent.replaceAll(oldString, newString);
	            System.out.println(oldContent);
	            //here Now create FileWriter object to write newContent 
	             
	            writer = new FileWriter(fileToBeModified);
	             //here Rewrite the fileToBeModified with newContent using write() method 
	            writer.write(newContent);
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                //Closing the resources
	                 
	                reader.close();
	                 
	                writer.close();
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here creating the new object
		Replace m1 = new Replace();
		//here we are calling the modifyFile method
		 m1.modifyFile("D:/java/java1/abc.txt", "love", "Like");
         
	        System.out.println("Replacement Compelted");

	}

}
