import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSV {

	   public void TraiterCSV (FileReader file) throws IOException
	   {
		 int i = 1;
	     String chemin = "C:\"Users\"Xavier\"Desktop\"Documents\"fichier.csv";
	     BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
	     String chaine;
	     while((chaine = fichier_source.readLine())!= null)
	     {
	      if(i > 1)
	      {
	         String[] tabChaine = chaine.split(";");
	         //Tu effectues tes traitements avec les données contenues dans le tableau
	         //La première information se trouve à l'indice 0
	      }
	      i++;
	   }
	   fichier_source.close();           
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
