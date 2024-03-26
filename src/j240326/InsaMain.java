package j240326;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsaMain extends JFrame{
	JLabel lblNewLabel,lblImage;
	JButton btnInput,btnSearch,btnList,btnExit;
	
	public InsaMain() {
		super("인사관리 메뉴");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 80);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		lblNewLabel = new JLabel("인사관리 프로그램(v1.0)");
		lblNewLabel.setFont(new Font("a옛날목욕탕B", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 760, 60);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 79, 784, 402);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(InsaMain.class.getResource("/insa/images/28_가로.jpg")));
		lblImage.setBounds(0, 0, 784, 402);
		pn2.add(lblImage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 481, 784, 80);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("사원등록");
		btnInput.setForeground(new Color(0, 0, 0));
		btnInput.setBackground(new Color(131, 188, 205));
		btnInput.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		btnInput.setBounds(28, 21, 160, 35);
		pn3.add(btnInput);
		
		btnSearch = new JButton("개별조회");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		btnSearch.setBackground(new Color(131, 188, 205));
		btnSearch.setBounds(216, 21, 160, 35);
		pn3.add(btnSearch);
		
		btnList = new JButton("전체조회");
		btnList.setForeground(Color.BLACK);
		btnList.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		btnList.setBackground(new Color(131, 188, 205));
		btnList.setBounds(404, 21, 160, 35);
		pn3.add(btnList);
		
		btnExit = new JButton("종 료");
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("08서울남산체 M", Font.PLAIN, 17));
		btnExit.setBackground(new Color(131, 188, 205));
		btnExit.setBounds(592, 21, 160, 35);
		pn3.add(btnExit);
		
		// ---------------------------------------위쪽은 UI----------------------------------
		setLocationRelativeTo(null); // 실행시 윈도우 창이 가운데에 팝업 됨
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// ---------------------------------------아래쪽은 메소드------------------------------
		
		// 사원등록
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new InsaInput();
			}
		});
		
		// 개별조회
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 전체조회
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new InsaMain();
	}
}
