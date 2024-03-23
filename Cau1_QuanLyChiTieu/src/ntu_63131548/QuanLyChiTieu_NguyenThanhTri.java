package ntu_63131548;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuanLyChiTieu_NguyenThanhTri extends JFrame {
    private DefaultListModel<String> luuds;
    private JList<String> hienthids;
    private JTextField nhapct;
    private JLabel totalAmountLabel;
    private double totalAmount = 0.0;

    public QuanLyChiTieu_NguyenThanhTri() {
        setTitle("Ứng dụng quản lý chi tiêu");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel labelhienthids = new JPanel(new BorderLayout());
        labelhienthids.setBorder(BorderFactory.createTitledBorder("DANH SÁCH CHI TIÊU"));
        luuds = new DefaultListModel<>();
        hienthids = new JList<>(luuds);
        JScrollPane scrollPane = new JScrollPane(hienthids);
        labelhienthids.add(scrollPane, BorderLayout.CENTER);
        add(labelhienthids, BorderLayout.CENTER);

        JPanel labelnhapct = new JPanel(new GridLayout(5, 2, 5, 5));
        labelnhapct.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelloaict = new JLabel("Loại Chi Tiêu:");
        labelloaict.setFont(new Font("Times New Roman", Font.BOLD, 14));
        labelnhapct.add(labelloaict);

        nhapct = new JTextField();
        labelnhapct.add(nhapct);

        JButton btnthemct = new JButton("Thêm Chi Tiêu");
        btnthemct.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnthemct.setBackground(Color.GRAY);
        btnthemct.setForeground(Color.WHITE);
        btnthemct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ct = nhapct.getText().trim();
              
                    luuds.addElement(ct);
                    nhapct.setText("");                               
            }
        });
        labelnhapct.add(btnthemct);
       
        add(labelnhapct, BorderLayout.SOUTH);

        setVisible(true);
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
