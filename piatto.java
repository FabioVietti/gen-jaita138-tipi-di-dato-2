import java.util.Scanner;

public class esmpiop3 {
/**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);

System.out.println("nome del piatto");  
String piatto = sc.nextLine();
    
System.out.println("descrizione");
String descrizione = sc.nextLine();
    
System.out.println("prezzo");
double prezzo = sc.nextDouble();
    
System.out.println("disponibile");
boolean disponibile = sc.nextBoolean();
    
System.out.println("tipologia");
Byte tipologia = sc.nextByte();
    
System.out.println("allergeni");
String allergeni = sc.nextLine();
    
System.out.println("foto");
String foto = sc.nextLine();
    
System.out.println("calorie");
short calorie = sc.nextShort();
    
System.out.println("variazioni");
String variazioni = sc.nextLine();
    
sc.close();   
}

}

