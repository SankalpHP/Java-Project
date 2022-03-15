package simiplillearnFinalProject;

import java.io.IOException;
import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) throws IOException {
		
		Scanner obj = new Scanner(System.in);
		int ch;
		do {
	
		LockedMe.displaymenu();
		System.out.println("Enter Your Choice:");
		ch = Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
		  case 1: LockedMe.getAllFiles();
		          break;
		  case 2: LockedMe.CreateFile();
		          break;
		  case 3: LockedMe.DeleteFile();
		          break;
		  case 4: LockedMe.SearchFile();
		          break;
		  case 5: System.exit(0);
		          break;
		  default : System.out.println("Invalid Option");        
		}
		
		}
		while(ch > 0);
		
		obj.nextLine();
		obj.close();
          
	}

}
