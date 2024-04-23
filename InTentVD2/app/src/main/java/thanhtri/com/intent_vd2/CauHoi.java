package thanhtri.com.intent_vd2;

public class CauHoi {
    private String ch;
    private String[] dsdapan;
    private String dapandung;

    public CauHoi(String ch, String[] dsdapan, String dapandung) {
        this.ch = ch;
        this.dsdapan = dsdapan;
        this.dapandung = dapandung;
    }

    public String LayCauHoi() {
        return ch;
    }

    public String[] LayDSDapAn() {
        return dsdapan;
    }

    public String LayDapAnDung() {
        return dapandung;
    }
}

