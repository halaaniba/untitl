//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creare due oggetti User
        User utente1 = new User("mario",30);
        User utente2 = new User("giovanni",45);

        // Stampare le informazioni di default del primo utente
        System.out.println("Informazioni di default del primo utente:");
        utente1.stampaInformazioni();

        // Cambiare le informazioni del secondo utente
        utente2.setNome("NuovoUtente");
        utente2.setEta(40);

        // Stampare le informazioni del secondo utente dopo la modifica
        System.out.println("\nInformazioni modificate del secondo utente:");
        utente2.stampaInformazioni();
        }
    }
