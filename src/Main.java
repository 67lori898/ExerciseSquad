

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
                "[2] Inserisci allenatore",
                "[3] Inserisci personale staff"
        };

        String [] ricercaMenu={
                "[1] RICERCA",
                "[2] Ricerca panchinaro",

        };
        String [] menuRuolo={
                "INSERISCI IL RUOLO DEL GIOCATORE: ",
                "[1] Portiere.",
                "[2] Difensore.",
                "[3] Centrocampista.",
                "[3] Attaccante.",
        };



        //Array di  persone oggetti
        /*DATI: la squadra formata da 5 giocatori, 3 riserve, 1 allenatore e 2 dello staff;
           */
           //Ricerca panchinaro ritorna un int.
        Squadra[] persona = new Squadra[numPpl];
        boolean fine=true;



        do{

            switch(menu(mainMenu,keyboard)){
                case 1:


                    System.out.println("Inserisci il nome del giocatore\n");
                    persone.nome=keyboard.nextLine();
                    System.out.println("Inserisci il cognome del giocatore\n");
                    persone.cognome=keyboard.nextLine();

                    switch(menu(insertMenu,keyboard)){
                        case 1:

                            final int maxPlayer=5;
                            int numbOfPlayer=0;

                            Giocatore[] arrPlayer=new Giocatore[maxPlayer];
                            if(numbOfPlayer<maxPlayer){
                                arrPlayer[numbOfPlayer]=inserisciGiocatore(keyboard, menuRuolo;
                                numbOfPlayer++;
                            }
                            else{
                                System.out.println("Posti per giocatore terminati.");
                            }

                            break;

                            case 2:
                            //Inserimento riserva:max 3 riserve
                                final int maxRis=3;

                                if(maxRis<3) {
                                    inserisciRiserva();
                                }
                                else{
                                    System.out.println("Posti per riserva terminati.");
                                }
                                break;

                            case 3 :

                              break;

                    default:
                    fine =false;
                break;
            }
            //End case 1
                case 2:

                    break;



                default:
                    break;


            }

        }while(fine);




    }
    private static Giocatore inserisciGiocatore(Scanner keyboard, String [] menuRuolo){
            boolean isRiserva = false;
            Giocatore giocatore = new Giocatore();
            //Chiediamo all'utente il ruolo del giocatore
            switch (menu(menuRuolo, keyboard)) {
                case 1 -> giocatore.ruolo = ruoloGiocatore.portiere;

                case 2 -> giocatore.ruolo = ruoloGiocatore.difensore;

                case 3 -> giocatore.ruolo = ruoloGiocatore.centrocampista;

                case 4 -> giocatore.ruolo = ruoloGiocatore.attacante;

                case 5 -> {
                    giocatore.ruolo = ruoloGiocatore.riserva;
                    isRiserva = true;
                    break;
                }
            }
            if (!isRiserva) {
                System.out.println("Inserisci il numero di maglia del giocatore\n");
                giocatore.numMaglia = keyboard.nextLine();
                System.out.println("Inserisci il ruolo in campo del giocatore\n");
                giocatore.ruoloCampo = keyboard.nextLine();
                System.out.println("Inserisci i gol segnati del giocatore\n");
                giocatore.golSegnati = keyboard.nextLine();
                System.out.println("Inserisci i minuti giocati del giocatore\n");
                giocatore.minutiGiocati = keyboard.nextLine();
                System.out.println("Inserisci i minuti giocati del giocatore\n");
                giocatore.minutiGiocati = keyboard.nextLine();
                System.out.println("Inserisci i cartellini totali del giocatore\n");
                giocatore.cartellini = keyboard.nextLine();
                System.out.println("Inserisci gli assist totali del giocatore\n");
                giocatore.numAssist = keyboard.nextLine();
            }
            else{
                System.out.println("Inserisci l'infortunio per cui il giocatore è stato messo in riserva:\n");
                giocatore.numAssist = keyboard.nextLine();

            }
                //scanner.nextLine();//svuotiamo il buffer;

                return giocatore;

        }
    private static Giocatore inserisciAllenatore(Scanner keyboard, String [] menuRuolo){
        Allenatore allenatore= new Allenatore();
        System.out.println("Inserisci il  nome dell'allenatore\n");
        allenatore.numMaglia = keyboard.nextLine();
        System.out.println("Inserisci il cognome dell'allenatore");
        giocatore.ruoloCampo = keyboard.nextLine();
        System.out.println("Inserisci i gol segnati del giocatore\n");
        giocatore.golSegnati = keyboard.nextLine();
        System.out.println("Inserisci i minuti giocati del giocatore\n");
        giocatore.minutiGiocati = keyboard.nextLine();
        System.out.println("Inserisci i minuti giocati del giocatore\n");
        giocatore.minutiGiocati = keyboard.nextLine();
        System.out.println("Inserisci i cartellini totali del giocatore\n");
        giocatore.cartellini = keyboard.nextLine();
        System.out.println("Inserisci gli assist totali del giocatore\n");
        giocatore.numAssist = keyboard.nextLine();


    }


}