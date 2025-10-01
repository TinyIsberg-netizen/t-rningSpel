import java.util.*;


public class tarningSpel {
    public static void main(String[] args) {
        System.out.println("Välkommen till tärningsspelet! \nHär går leken ut på at ska du gissa summan av tärningnarna. \nGissa vad den totala summan blir, du får 3 försök.");
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

        }else if (gissning == sum){
            System.out.println("Du gissade rätt! Grattis!\n:)");
            break;

        }
        else{
            System.out.println("FEL! Försök igen");
            
        }
        if (i == 3){
            System.out.println("Du hadde 3 fel, du förlorade!");
        }
        
            

        }

    

           
    }


}
