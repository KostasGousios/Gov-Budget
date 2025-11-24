package src.test.java;
import java.util.Scanner;

public abstract class Ypourgeia {
    protected String onoma;
    public Ypourgeia(String onoma) {
        this.onoma = onoma;
    }
    public String getOnoma() {
        return onoma;
    }
    //θελω μενου επιλογων εδω
    public double eisagwgiProipologismou() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Δώσε τον προϋπολογισμό σου");
            return s.nextDouble();
        }
    }
}

