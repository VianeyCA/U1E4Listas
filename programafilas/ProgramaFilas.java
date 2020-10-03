package programafilas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ProgramaFilas {

    public static void main(String[] args) throws FileNotFoundException, IOException {         
         String a,b;
 
      
         BufferedReader br = new BufferedReader (new FileReader ("C:\\Users\\Graciela\\Desktop\\mate.txt"));
 
         a = br.readLine();
 
         int numTokens = 0;
         StringTokenizer st = new StringTokenizer (a);

         while (st.hasMoreTokens())
         {
            b = st.nextToken();
            numTokens++;
            
            System.out.println (b);
         }
    }
    
}
