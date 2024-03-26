package j240326;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class InsaInput extends JFrame{
	InsaDAO dao = new InsaDAO();
	InsaVO vo = null;
	int res = 0;
	private JTextField txtName,txtAge;
	JButton btnSubmit,btnReset,btnCancel;
	JLabel lblTitle1,lblTitle2,lblTitle3,lblTitle4,lblName,lblAge,lblGender,lblIpsail;
	JRadioButton rbFemale,rbMale;
	JComboBox cbYY,cbMM,cbDD;
	
	public InsaInput() {
		super("사원등록");
		getContentPane().setBackground(new Color(131, 188, 205));
		setSize(800, 600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(231, 230, 218));
		pn1.setBounds(12, 10, 160, 541);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblTitle1 = new JLabel("사");
		lblTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle1.setFont(new Font("a옛날목욕탕B", Font.PLAIN, 40));
		lblTitle1.setBounds(12, 33, 136, 93);
		pn1.add(lblTitle1);
		
		lblTitle2 = new JLabel("원");
		lblTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle2.setFont(new Font("a옛날목욕탕B", Font.PLAIN, 40));
		lblTitle2.setBounds(12, 159, 136, 93);
		pn1.add(lblTitle2);
		
		lblTitle3 = new JLabel("등");
		lblTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle3.setFont(new Font("a옛날목욕탕B", Font.PLAIN, 40));
		lblTitle3.setBounds(12, 285, 136, 93);
		pn1.add(lblTitle3);
		
		lblTitle4 = new JLabel("록");
		lblTitle4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle4.setFont(new Font("a옛날목욕탕B", Font.PLAIN, 40));
		lblTitle4.setBounds(12, 411, 136, 93);
		pn1.add(lblTitle4);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(231, 230, 218));
		pn2.setBounds(184, 10, 588, 475);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblName = new JLabel("이 름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		lblName.setBounds(12, 54, 121, 40);
		pn2.add(lblName);
		
		lblAge = new JLabel("나 이");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		lblAge.setBounds(12, 127, 121, 40);
		pn2.add(lblAge);
		
		lblGender = new JLabel("성 별");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		lblGender.setBounds(12, 209, 121, 40);
		pn2.add(lblGender);
		
		lblIpsail = new JLabel("입 사 일");
		lblIpsail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIpsail.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		lblIpsail.setBounds(12, 299, 121, 40);
		pn2.add(lblIpsail);
		
		txtName = new JTextField();
		txtName.setBounds(187, 54, 250, 40);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(187, 127, 250, 40);
		pn2.add(txtAge);
		
		rbFemale = new JRadioButton("여자");
		rbFemale.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		rbFemale.setBackground(new Color(231, 230, 218));
		rbFemale.setSelected(true);
		rbFemale.setBounds(187, 209, 118, 40);
		pn2.add(rbFemale);
		
		rbMale = new JRadioButton("남자");
		rbMale.setFont(new Font("08서울남산체 M", Font.PLAIN, 15));
		rbMale.setBackground(new Color(231, 230, 218));
		rbMale.setBounds(309, 209, 118, 40);
		pn2.add(rbMale);
		
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi = 0;
		for(int i=0; i<yy.length; i++) {
			imsi = 2024 - i;
			yy[i] = imsi + "";
		}
		for(int i=0; i<mm.length; i++) {
			mm[i] = (i+1) + "";
		}
		for(int i=0; i<dd.length; i++) {
			dd[i] = (i+1) + "";
		}
		
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		cbYY.setBounds(187, 299, 80, 35);
		pn2.add(cbYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		cbMM.setBounds(282, 299, 70, 35);
		pn2.add(cbMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		cbDD.setBounds(367, 299, 70, 35);
		pn2.add(cbDD);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(231, 230, 218));
		pn3.setBounds(184, 495, 588, 55);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnSubmit = new JButton("등록하기");
		btnSubmit.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		btnSubmit.setBounds(54, 10, 124, 35);
		pn3.add(btnSubmit);
		
		btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		btnReset.setBounds(232, 10, 124, 35);
		pn3.add(btnReset);
		
		btnCancel = new JButton("취 소");
		btnCancel.setFont(new Font("08서울남산체 M", Font.PLAIN, 20));
		btnCancel.setBounds(410, 10, 124, 35);
		pn3.add(btnCancel);
		
		// ---------------------------------------위쪽은 UI----------------------------------
		setLocationRelativeTo(null); // 실행시 윈도우 창이 가운데에 팝업 됨
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// ---------------------------------------아래쪽은 메소드------------------------------
		
		// 등록하기
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText().trim();
				String age = txtAge.getText().trim();
				String gender = "";
				String ipsail = cbYY.getSelectedItem()+"-"+cbMM.getSelectedItem()+"-"+cbDD.getSelectedItem();
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요");
					txtName.requestFocus();
				}
				else if(Pattern.matches("^[0-9]+$", age)) {
					JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요.");
					txtAge.requestFocus();
				}
			}
		});
		
		// 다시입력
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtName.requestFocus();
			}
		});
		
		// 취소
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaMain();
			}
		});
	}
}
