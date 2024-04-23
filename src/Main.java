

//Livello base: gestione di una singola squadra.
import static tools.Utility.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int choiceMenu=0;
        final int numPpl = 11;

        //Visualizza elenco completo.
        String [] mainMenu={"MENU PRINCIPALE",
                      "[1] Inserimento",
                       "[2] Cancellazione ",
                       "[3] Visualizzazione",
                       "[4] Ricerca"
        };

        String [] insertMenu={"INSERIMENTO:",
                "[1] Inserisci giocatore",
                "[2] Inserisci riserva",
                "[3] Inserisci allenatore",
                "[4] Inserisci personale staff"
        };



        //Array di  persone oggetti
        /*DATI: la squadra formata da 5 giocatori, 3 riserve, 1 allenatore e 2 dello staff;
         */

        Squadra[] persona = new Squadra[numPpl];

        boolean fine=true;

        do{

            switch(menu(mainMenu,keyboard)){
                case 1:


                    switch(menu(insertMenu,keyboard)){
                        case 1:

                            break;

                        case 2 :

                        break;

                        case 3 :

                            break;




                    }

                    break;


                case 2:

                    break;

                case 3 :

                    break;












            }







            /*default:
                fine =false
                break; */




        }while(fine);







    }



}