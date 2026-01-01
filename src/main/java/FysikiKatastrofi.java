public class FysikiKatastrofi {
    //Κλαση και μεθοδος που διαχειριζονται το σεναριο καποιας φυσικης καταστροφης που μπορει να προκυψει
    //Περνουμε λεφτα απο το κρατικο ταμειο (αν υπαρχουν) και τα θεωρουμε ως επιπλεον εξοδα/δαπανες για τη καταστροφη που υπεστη η χωρα
    public static void diacheirisi(KratikoTameio tameio, EisagwgiPoswn posa) {
        System.out.print("Παρακαλώ, εισάγετε το κόστος των ζημιών");
        int kostos = Main.readSafeInt();
        if (tameio.getTameio() >= kostos) { 
            tameio.prosthikiStoTameio(-kostos); //ενημερωση ταμειο
            posa.setSynolikaPragmatikaExoda(posa.getSynolikaPragmatikaExoda() + kostos); //αυξηση και καταχωρηση των ανανεωμενων συνολικων πραγματικων εξοδων
            System.out.println("Επιτυχής εκταμίευση " + kostos + "€ από το κρατικό ταμείο.");
        } else {
            System.out.println("Το απόθεμα του κρατικού ταμείου δεν επαρκεί για την κάλυψη των ζημιών!");
        }
    }
}
