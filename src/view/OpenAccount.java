package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.AccountController;
import controller.MemberController;
import domain.*;

public class OpenAccount extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel topLab, nameLab, idLab, passLab; // 값을 입력하는 곳에 라벨( 값을 못 받음)
			;
	JTextField idTxt, passTxt, nameTxt; // 값을 입력하는 곳
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, // 안내판에 조각 조각 중 한 조각
			namePan;
	JComboBox<?> combo; // <?> generic임
	String[] menu = { "기본통장", "마이너스통장" };

	public OpenAccount() {
		makeGui(); // 화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}

	// uid,pass,name,ssn,phone,email,addr;
	public void makeGui() {
		topLab = new JLabel("통장개설", JLabel.CENTER);

		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);

		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);


		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);

		addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AccountBean user = new AccountBean();
				user.setName(idTxt.getText());
				user.setUid(idTxt.getText());
				user.setPass(passTxt.getText());
				if (((String) combo.getSelectedItem()).equals(menu[0])) {
					AccountController.getIntance().account(user);
				} else {
//					AccountController.getIntance().account(user);
				}
			}
		});

		bottomPan = new JPanel();
		bottomPan.add(addBtn);

		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}

}