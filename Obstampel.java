
/**
 * Beschreiben Sie hier die Klasse Obstampel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Obstampel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Queue<Obst> obstschlange;

    /**
     * Konstruktor f?r Objekte der Klasse Obstampel
     */
    public Obstampel()
    {
        obstschlange = new Queue<Obst>();
       
    }
    
    public void obstHinzufuegen(String pName, int pKalorien){
        obstschlange.enqueue(new Obst(pName,pKalorien));
    }
    
    public void zeigeObstsortiment(){
        
        if(!obstschlange.isEmpty()){
            Obst erstesObst = obstschlange.front();
            System.out.println(erstesObst.getName());
            obstschlange.dequeue();
            obstschlange.enqueue(erstesObst);
            while(obstschlange.front()!=erstesObst){
            System.out.println(obstschlange.front().getName());
            obstschlange.enqueue(obstschlange.front());
            obstschlange.dequeue();
            }
        }
    }
    
    public double durchschnittsKalorien(){
        int summe = 0;
        int zaehler = 0;
        if(!obstschlange.isEmpty()){
            Obst erstesObst = obstschlange.front();
            summe += erstesObst.getKalorien();
            zaehler++;
            obstschlange.dequeue();
            obstschlange.enqueue(erstesObst);
            while(obstschlange.front()!=erstesObst){
            summe += obstschlange.front().getKalorien();
            zaehler++;
            obstschlange.enqueue(obstschlange.front());
            obstschlange.dequeue();
            }
        }
        return summe/zaehler;
    }

    
}
