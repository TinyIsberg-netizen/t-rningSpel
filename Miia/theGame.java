package Miia;
import java.util.*;
import java.lang.*;
public class theGame{
    static void theFormula(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        
        //Slår en tärning (1-6)
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int sum = dice1 + dice2;

        for(int i = 1; i <= 3; i++){

        int gissning = scanner.nextInt();

            if (gissning < 1 || gissning > 12 ){
            
            System.out.println("Fel värde! Bara tal mellan 1 och 12");
            }
            else if (gissning == sum){
            System.out.println("Du gissade rätt! Grattis!\n:)");
            break;
            }
            else if (i == 3){
            System.out.println("Du hadde 3 fel, du förlorade!");
            }
            else{
            System.out.println("FEL! Försök igen");
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till tärningsspelet! \nHär går leken ut på at ska du gissa summan av tärningnarna. \nGissa vad den totala summan blir, du får 3 försök.");
        boolean on = true;
        
        do{
        theFormula();

        System.out.println("Vill du spela igen? Ja / Nej");
        String restart = scanner.nextLine();
        switch (restart){
            case "Ja":
            case "ja":
            case "JA":
            System.out.println("Ny runda");
            
            case "Nej":
            case "nej":
            case "NEJ":
            System.out.println("Tack, hare gött ännaa");
            on = false;
            break;
            
            default:
            System.out.println("Ogiltlig input");
            break;}
        while(on == true);
    }

    }


}

