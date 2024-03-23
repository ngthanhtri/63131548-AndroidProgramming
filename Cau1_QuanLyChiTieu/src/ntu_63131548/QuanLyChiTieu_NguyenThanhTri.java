package ntu_63131548;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuanLyChiTieu_NguyenThanhTri extends JFrame {
    private DefaultListModel<String> luuds;
    private JList<String> hienthids;
    private JTextField nhapct;
    private JTextField nhapgiatrict; 
    private JLabel labeltongct;
    private double tongct = 0;

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
		
		JPanel labelnhapct = new JPanel(new GridLayout(5, 2, 5, 5));
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
				
		
		JButton btnthemct = new JButton("Thêm Chi Tiêu");
        btnthemct.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnthemct.setBackground(Color.GRAY);
        btnthemct.setForeground(Color.WHITE);
		btnthemct.addActionListener(new ActionListener() {
		@Override
			public void actionPerformed(ActionEvent e) {
	            String ct = nhapct.getText().trim();
	            String giatri = nhapgiatrict.getText().trim(); 
	           
	            double sum = Double.parseDouble(giatri);
	            luuds.addElement(ct + " - " + sum + "K");
	            nhapct.setText("");
	            nhapgiatrict.setText("");
	            TinhTongCT(sum);
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

