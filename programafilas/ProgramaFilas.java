public class ProgramaFilas {
    
     public static void main(String[] args) throws FileNotFoundException, IOException 
     {         
         Logica metodo = new Logica(); // creamos un objeto de la clase logica
         File archivo = null; //Leemos arhivo
         FileReader fr = null;
         BufferedReader br = null;
         List<String> Cadena = new ArrayList<String>(); //Creamos una lista
         Cadena.add("La materia de estructura es dificil y no se");
         String texto = "Esto,es,una,prueba";
         String Linea;
         String[] palaOr; //Creamos arreglos que almacenan datos
         String[] palabrasAr;
         String[] palabrasCompa;
         archivo = new File("C:\\Users\\Graciela\\Desktop\\doc.txt"); //Buscamos la dirección del archivo
         fr = new FileReader(archivo);//Instanciamos las variables para leer el archivo
         br = new BufferedReader(fr);
         palaOr = texto.split(",");//Metodo split 
         palabrasAr = Cadena.get(0).split(" ");
        
         Linea = br.readLine();//Leemos el archivo de texto
         palabrasCompa = Linea.split(" ");
         metodo.verArr(palaOr);//Mostramos cadena 
         metodo.verArr(palabrasAr);//Mostramos lista
         metodo.verArr(palabrasCompa);//Mostramos fichero
         metodo.Compara(palabrasAr, palabrasCompa);//Metodo de comparación
         try 
         {
             if (null != fr) 
             {
                 fr.close();
             }
         }
         catch (Exception e)         
         {
            e.printStackTrace();
         }
     }
    
}
