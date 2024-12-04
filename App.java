import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);

System.out.println("Definisci il tuo cliente preferito!");

System.out.println("Nome");
String nome = sc.nextLine();

System.out.println("Cognome");
String cognome = sc.nextLine();

System.out.println("DataNascita: [dd/MM/yyyy]");
String dataNascita = sc.nextLine();

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate dataNascitaLocalDate = LocalDate.parse(dataNascitaStr, formatter);

System.out.println("nTelefono");
String nTelefono = sc.nextLine();

System.out.println("Note");
String Note = sc.nextLine();

System.out.println("email");
String email = sc.nextLine();

System.out.println("Username");
String Username = sc.nextLine();

System.out.println("Data e ora di iscrizione: [dd/MM/yyyy HH:mm]");
String DateTimeIscrizioneStr = sc.nextLine();
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dd/MM/yyyy? HH:mm);
LocalDateTime dateTimeIscrizione = LocalDateTime.parse (dataTimeIscrizioneStr, dateTimeFormatter);

sc.close();

}
    
   
}
