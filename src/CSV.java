import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSV {

	   public void TraiterCSV () throws IOException
	   {
		 int i = 1;
	     String chemin = "/home/b1103452/workspace/Pretty CSV/src/test.csv";
	     BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
	     String chaine;
	     while((chaine = fichier_source.readLine())!= null)
	     {
	      if(i%4 == 0 || i <= 1)
	      {
	         String[] tabChaine = chaine.split(";");
	         
	         System.out.println("| " + tabChaine[0] + " |");
	         i++;
	      }
	      if(i%3 == 0){
	    	  
	    	  String[] tabChaine = chaine.split(";");
		         
		      System.out.println(tabChaine[0] + " |" +"\n");
	      }
	      
	         String[] tabChaine = chaine.split(";");
	         
	         System.out.println(tabChaine[0] + " |");
	      
	      i++;
	    }
	   fichier_source.close();           
	   }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CSV cs = new CSV();
		cs.TraiterCSV();
		
		
	}

}
