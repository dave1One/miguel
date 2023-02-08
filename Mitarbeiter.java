
/**
 * Beschreiben Sie hier die Klasse Mitarbeiter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mitarbeiter
{
    
    private String name;
    private int gehalt;
    private String funktion;

    /**
     * Konstruktor f?r Objekte der Klasse Mitarbeiter
     */
    public Mitarbeiter(int pGehalt, String pName, String pFunktion)
    {
        name = pName;
        gehalt = pGehalt;
        funktion = pFunktion;
    }
    
    public String gibName(){
        return name;
    }
    
     public int gibGehalt(){
        return gehalt;
    }

     public String gibFunktion(){
        return funktion;
    }


   
}
