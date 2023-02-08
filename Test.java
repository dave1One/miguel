
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private List<String> beispielListe;
    private List<String> beispielListe2;

    /**
     * Konstruktor f?r Objekte der Klasse Test
     */
    public Test()
    {
        beispielListe = new List<String>();
        beispielListe.insert("Hund");
        beispielListe.append("Katze");
        beispielListe.toLast();
        beispielListe.insert("Maus");
        beispielListe.toFirst();
        beispielListe.next();
        System.out.println(beispielListe.getContent());
        beispielListe2 = new List<String>();
        beispielListe2.insert("Pascal");
        beispielListe2.append("Joel");
        beispielListe.concat(beispielListe2);
        beispielListe.toFirst();
        beispielListe.next();
        beispielListe.next();
        beispielListe.next();
        System.out.println(beispielListe.getContent());
        beispielListe.toFirst();
        beispielListe.remove();
        
        
    }

   
}
