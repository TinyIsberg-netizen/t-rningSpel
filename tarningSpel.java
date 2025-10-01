import java.util.*;


public class tarningSpel {
    public static void main(String[] args) {
        System.out.println("Välkommen till tärningsspelet! \nHär går leken ut på at ska du gissa summan av tärningnarna.");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int gissning = scanner.nextInt();
        
        //Slår en tärning (1-6)
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int sum = dice1 + dice2;

        for(int i = 1; i <= 3; i++){
        
            if (gissning < 1 || gissning > 12 ){
            
            System.out.println("Fel värde! Bara tal mellan 1 och 12");

        }else if (gissning == sum){
            System.out.println("Du gissade rätt! Grattis!\n:)");

        }
        else{
            System.out.println("FEL! Försök igen");
        }
            

        }

    

           
    }


}
