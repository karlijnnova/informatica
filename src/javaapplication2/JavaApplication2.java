/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 011538
 */
public class JavaApplication2 {

   
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// TODO code application logic here
        
        int uitkomst = vermenigvuldigFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5*6 = ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        // TODO code application logic here
    }

    public static int somFunctie(int getal1, int getal2) {
        int optelling = getal1+getal2;
        return optelling;
    }

    public static void printFunctie(String tekst, int getal) {
        System.out.println(tekst+getal);
    }
    {int uitkomst = VermenigvuldigingsFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5Ã—6 = ";
        printFunctie(begeleidendeTekst, uitkomst);
    }
     public static int vermenigvuldigFunctie (int getal1, int getal2){
        int vermenigvuldiging = getal1*getal2;
        
        return vermenigvuldiging;
    }


    private int VermenigvuldigingsFunctie(int i, int i0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static class begeleidendeTekst {

        public begeleidendeTekst() {
        }
    }
    
    
    
    
    
}
