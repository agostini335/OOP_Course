/**
 * Classe responsabile alla gestione dell' output
 */
public class OutputHandler {
    public static boolean stampa(String parametro) {
        System.out.println(parametro);
        return true;
    }

    public static boolean stampa(String parametro, int p2) {
        for (int i = 0; i < p2; i++) {
            stampa(parametro);
        }
        return true;
    }

}
