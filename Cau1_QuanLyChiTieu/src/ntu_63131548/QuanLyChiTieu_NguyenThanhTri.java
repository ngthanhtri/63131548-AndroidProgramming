package ntu_63131548;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuanLyChiTieu_NguyenThanhTri extends JFrame {
    private DefaultListModel<String> luuds;
    private JList<String> hienthids;
    private JTextField nhapct;
    private JTextField nhapgiatrict; 
    private JTextField nhapghichu; // Thêm JTextField cho ghi chú
    private JLabel labeltongct;
    private double tongct = 0;
    private JDateChooser ngayct;

    public QuanLyChiTieu_NguyenThanhTri() {
        setTitle("Ứng dụng quản lý chi tiêu");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.setBorder(BorderFactory.createTitledBorder("DANH SÁCH CHI TIÊU"));

        luuds = new DefaultListModel<>();
        hienthids = new JList<>(luuds);
        JScrollPane scrollPane = new JScrollPane(hienthids);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        add(listPanel, BorderLayout.CENTER);

        JPanel labelnhapct = new JPanel(new GridLayout(6, 2, 5, 5)); 
        labelnhapct.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelloaict = new JLabel("Loại chi tiêu:");
        labelloaict.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labelloaict);

        nhapct = new JTextField();
        labelnhapct.add(nhapct);

        JLabel labelGiaTri = new JLabel("Giá trị chi tiêu:");
        labelGiaTri.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labelGiaTri);

        nhapgiatrict = new JTextField();
        labelnhapct.add(nhapgiatrict);

        JLabel labelngayct = new JLabel("Ngày chi tiêu:");
        labelngayct.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labelngayct);

        ngayct = new JDateChooser();
        labelnhapct.add(ngayct);
        
        JLabel labelghichu = new JLabel("Ghi chú:"); 
        labelghichu.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labelghichu);
        
        nhapghichu = new JTextField(); 
        labelnhapct.add(nhapghichu);

        JButton btnthemct = new JButton("Thêm Chi Tiêu");
        btnthemct.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnthemct.setBackground(Color.GRAY);
        btnthemct.setForeground(Color.WHITE);
        btnthemct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ct = nhapct.getText().trim();
                String giatri = nhapgiatrict.getText().trim(); 
                String ngay = ((JTextField)ngayct.getDateEditor().getUiComponent()).getText();
                String ghichu = nhapghichu.getText().trim(); 
                
                double sum = Double.parseDouble(giatri);
                luuds.addElement(ct + " - " + sum + "K" + " - " + ngay + " - " + ghichu); 
                nhapct.setText("");
                nhapgiatrict.setText("");
                nhapghichu.setText("");
                TinhTongCT(sum);
                ngayct.setCalendar(null);
            }
        });
        labelnhapct.add(btnthemct);

        labeltongct = new JLabel("Tổng chi tiêu: 0K");
        labeltongct.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labeltongct);

        add(labelnhapct, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void TinhTongCT(double sum) {
        tongct += sum; 
        labeltongct.setText("Tổng chi tiêu:" + tongct +"K");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLyChiTieu_NguyenThanhTri();
            }
        });
    }
}
