package ntu.thanhtri63131548;

import java.util.List;

public class CauHoi {
    private String cauhoi;
    private int cautraloi;
    private List<Integer> dsDapAn;

    public CauHoi(String cauhoi, List<Integer> dsDapAn) {
        this.cauhoi = cauhoi;
        this.dsDapAn = dsDapAn;
    }

    public String ChonCauHoi() {
        return cauhoi;
    }

    public List<Integer> ChonDapAn() {
        return dsDapAn;
    }
    public int ChonCauTraLoi() {
        return cautraloi;
    }
}

