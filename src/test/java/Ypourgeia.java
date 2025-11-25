package src.test.java;
import java.util.Scanner;

public abstract class Ypourgeia {
    protected String onoma;
    protected static final Scanner s = new Scanner(System.in);
    public Ypourgeia(String onoma) {
        this.onoma = onoma;
    }
    public String getOnoma() {
        return onoma;
    }
    //θελω μενου επιλογων εδω
    public double eisagwgiProipologismou() {
    System.out.println("Δώσε τον προϋπολογισμό σου: ");
    return s.nextDouble();
    }
}
