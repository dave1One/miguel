
/**
 * Beschreiben Sie hier die Klasse Mitarbeiterverwaltung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mitarbeiterverwaltung
{
   
    private List<Mitarbeiter> mitarbeiterliste;
    
    /**
     * Konstruktor f?r Objekte der Klasse Mitarbeiterverwaltung
     */
    public Mitarbeiterverwaltung()
    {
        mitarbeiterliste = new List<Mitarbeiter>();
        mitarbeiterliste.append(new Mitarbeiter(2160, "Fred", "Anlagenmechaniker"));
        mitarbeiterliste.append(new Mitarbeiter(13000, "Bob", "Baumeister"));
        mitarbeiterliste.append(new Mitarbeiter(6000, "Anna", "Steuerberaterin"));
 
    }
    
    public void namenAusgeben(){
        mitarbeiterliste.toFirst();
        while(mitarbeiterliste.hasAccess()){
        System.out.println(mitarbeiterliste.getContent().gibName());
        mitarbeiterliste.next();
    }
    }
    
    public void mitarbeiterInformationen(){
        int x = 1; 
        mitarbeiterliste.toFirst();
        while(mitarbeiterliste.hasAccess() == true){
        System.out.println(x + ". Mitarbeiter");    
        System.out.println("Mitarbeitername: " + mitarbeiterliste.getContent().gibName());
        System.out.println("Funktion: " + mitarbeiterliste.getContent().gibFunktion());
        System.out.println("Gehalt: " + mitarbeiterliste.getContent().gibGehalt());
        System.out.println();
        mitarbeiterliste.next(); 
        x = x+1;
    }
    
    
    }
    public int gibSummeAllerGehaelter(){
        mitarbeiterliste.toFirst();
        int summe = 0; 
        while(mitarbeiterliste.hasAccess()){

              summe += mitarbeiterliste.getContent().gibGehalt();

            mitarbeiterliste.next();
        }
        return summe; 
    }

    public int gibHoechsteGehalt(){
        mitarbeiterliste.toFirst();
        int max = mitarbeiterliste.getContent().gibGehalt(); 
        while(mitarbeiterliste.hasAccess()){
            if(mitarbeiterliste.getContent().gibGehalt() > max){
              max = mitarbeiterliste.getContent().gibGehalt();
            }
            mitarbeiterliste.next();
        }
        return max; 
    }
    
    public boolean sucheMitarbeiterName(String pName){
        mitarbeiterliste.toFirst();

        while(mitarbeiterliste.hasAccess()){
            if(mitarbeiterliste.getContent().gibName() == pName){
                return true;
            }
            mitarbeiterliste.next();
        }
        return false;
    }
    

}
