
/**
 * Beschreiben Sie hier die Klasse Obst.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Obst
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int kalorien;
    private String name;

    /**
     * Konstruktor f?r Objekte der Klasse Obst
     */
    public Obst(String pName, int pKalorien)
    {
        name = pName;
        kalorien = pKalorien;
    }

     public int getKalorien()
    {
        return kalorien;
    }
    
      public String getName()
    {
        return name;
    }
}
