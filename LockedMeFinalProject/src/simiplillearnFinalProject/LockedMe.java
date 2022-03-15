package simiplillearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
	
	static final String ProjectFilesPath ="E:\\Eclipse\\ProjectFileOperations";
	
	/**
	 *  This method will display the menu for end user 
	 */
	
	public static void displaymenu() {
		System.out.println("**********************************************************************");
		System.out.println("\tWELCOME:) TO LockedMe.com SECURE APP");
		System.out.println("\tDeveloped by: Sankalp Selokar");
		System.out.println("**********************************************************************");
		System.out.println("\t1 Display all files");
		System.out.println("\t2 Add a new file");
		System.out.println("\t3 Delete a file");
		System.out.println("\t4 Search file");
		System.out.println("\t5 Exit");
		System.out.println("**********************************************************************");
	}
	
	/**
	 * This method will retrieve all the files 
	 */
	public static void getAllFiles() {
		
		File folder = new File(ProjectFilesPath);
		
		File [] listOfFiles = folder.listFiles();
		if(listOfFiles.length > 0 )
		{
		  System.out.println("FILES LIST IS BELOW:\n");
		      for(var l : listOfFiles) {
			       System.out.println(l.getName());
		       }
	    }
		else
		{
			System.out.println("The folder is empty:");
		}	
   }
	
	/**
	 * This method will read file details from user and create files
	 * @throws IOException
	 */
	
	public static void CreateFile() throws IOException 
	{	
	   Scanner obj = new Scanner(System.in);
	   String fileName;
	   System.out.println("Enter file name:");
	   fileName = obj.nextLine();
	   
	   int linesCount;
	   System.out.println("Enter how many lines in the file:");
	   linesCount = Integer.parseInt(obj.nextLine());
	   
	   FileWriter fw = new FileWriter(ProjectFilesPath+"\\"+fileName);
	   
	   //Read line by line from user
	   
	   for(int i= 1; i<=linesCount;i++)
	   {
		   System.out.println("Enter file lines:");
		   fw.write(obj.nextLine()+"\n");
	   }
	   
	   System.out.println("File created Successfully");
	   fw.close();
	
	}
	
	/**
	 * This method will read file details from user and delete files
	 */
	public static void DeleteFile()
	{
		try {
			
		
		   Scanner obj = new Scanner(System.in);
		   String fileName;
		   System.out.println("Enter file name to be deleted:");
		   fileName = obj.nextLine();
		   
		   File f = new File(ProjectFilesPath+"\\"+fileName);
		   if(f.exists())
		   {
			   f.delete();
			   System.out.println("File deleted Successfully");
		   }
		   else
		   {
			   System.out.println("File does not exists");
		   } 
		}
		catch(Exception EX)
		{
			System.out.println("unable to delete filec .please contact @admindeveloper.com");
		}
	}
	/**
	 * This method will read file details from user and Search files
	 */
	
	public static void SearchFile()
	{
		
	     Scanner obj = new Scanner(System.in);
	     String fileName;
	     System.out.println("Enter File Name");
	     fileName = obj.nextLine();
	   
	     File f = new File(ProjectFilesPath+"\\"+fileName);
	     if(f.exists())
	     {
		   
		   System.out.println("File is Found");
	     }
	     else
	     {
		   System.out.println("File Not Found");
	     } 
    }
		
  }


