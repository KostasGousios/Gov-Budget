public class Exoda {
    private int misthoi;
    private int syntakseis;
    private int loipa;
    private int exodagiaypourgeia;

    public Exoda(int misthoi, int syntakseis, int loipa, int exodagiaypourgeia) {
        this.misthoi = misthoi;
        this.syntakseis = syntakseis;
        this.loipa = loipa;
        this.exodagiaypourgeia = exodagiaypourgeia;
    }

    public int getAthroismaExodon() {
        return misthoi + syntakseis + loipa + exodagiaypourgeia;
    }
}