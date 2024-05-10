package thanhtri.com.navigationdrawer;

import java.util.ArrayList;
import java.util.List;

public class DSCauHoi {
    private List<CauHoi> dscauhoi;

    public DSCauHoi() {
        dscauhoi = new ArrayList<>();

        String ch1 = "Hành tinh nào trong Hệ Mặt Trời có hành tinh ngôi sao lớn nhất?";
        String[] dsda1 = {"Sao Hỏa", "Sao Thổ", "Sao Mộc", "Sao Hải Vương"};
        String dad1 = "Sao Mộc";
        dscauhoi.add(new CauHoi(ch1, dsda1, dad1));

        String ch2 = "Hiện nay Hệ Mặt Trời có bao nhiêu hành tinh?";
        String[] dsda2 = {"7", "8", "9", "10"};
        String dad2 = "8";
        dscauhoi.add(new CauHoi(ch2, dsda2, dad2));

        String ch3 = "Hành tinh nào trong Hệ Mặt Trời có thời gian quay xung quanh Mặt Trời ngắn nhất?";
        String[] dsda3 = {"Mặt Trăng", "Sao Thổ", "Sao Kim", "Mặt Trời"};
        String dad3 = "Sao Thổ";
        dscauhoi.add(new CauHoi(ch3, dsda3, dad3));

        String ch4 = "Cặp hành tinh nào trong Hệ Mặt Trời có hành tinh mặt trời nhỏ hơn?";
        String[] dsda4 = {"Mặt Trời và Sao Thổ", " Sao Thổ và Sao Kim", " Sao Kim và Trái Đất", "Trái Đất và Mặt Trăng"};
        String dad4 = "Sao Thổ và Sao Kim";
        dscauhoi.add(new CauHoi(ch4, dsda4, dad4));

        String ch5 = "Hành tinh nào trong Hệ Mặt Trời có khối lượng lớn nhất?";
        String[] dsda5 = {"Mặt Trăng", "Trái Đất", "Sao Mộc", "Mặt Trời"};
        String dad5 = "Mặt Trời";
        dscauhoi.add(new CauHoi(ch5, dsda5, dad5));

        String ch6 = "Hành tinh nào trong Hệ Mặt Trời có nhiều mặt trăng nhất?";
        String[] dsda6 = {"Sao Kim", "Sao Mộc", "Trái Đất", "Sao Thủy"};
        String dad6 = "Sao Mộc";
        dscauhoi.add(new CauHoi(ch6, dsda6, dad6));

        String ch7 = "Hành tinh nào trong Hệ Mặt Trời có bề mặt hành tinh giống Trái Đất nhất?";
        String[] dsda7 = {"Sao Thổ", "Sao Kim", "Sao Hỏa", "Sao Hải Vương"};
        String dad7 = "Sao Hỏa";
        dscauhoi.add(new CauHoi(ch7, dsda7, dad7));

        String ch8 = "Loại hành tinh nào trong Hệ Mặt Trời có vòng quỹ đạo nghiêng nhất?";
        String[] dsda8 = {"Sao Hỏa", "Sao Hải Vương", "Sao Thổ", "Sao Kim"};
        String dad8 = "Sao Hải Vương";
        dscauhoi.add(new CauHoi(ch8, dsda8, dad8));

        String ch9 = "Hành tinh nào trong Hệ Mặt Trời có nhiệt độ bề mặt cao nhất?";
        String[] dsda9 = {"Sao Hỏa", "Sao Thổ", "Sao Kim", "Sao Mộc"};
        String dad9 = "Sao Kim";
        dscauhoi.add(new CauHoi(ch9, dsda9, dad9));

        String ch10 = "Trong Hệ Mặt Trời, hành tinh nào có bề mặt được phủ bởi lớp mây dày đặc và khí hậu nóng ẩm?";
        String[] dsda10 = {"Sao Thổ", "Sao Kim", "Sao Mộc", "Sao Thổ"};
        String dad10 = "Sao Kim";
        dscauhoi.add(new CauHoi(ch10, dsda10, dad10));

    }

    public List<CauHoi> LayDSCauHoi() {
        return dscauhoi;
    }
}