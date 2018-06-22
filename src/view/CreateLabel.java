package view;

import javax.swing.*;

public class CreateLabel {
	JLabel idlab;
	JPanel idPan;

	public void create() {
		idlab = new JLabel("회원가입", JLabel.CENTER);
		idPan = new JPanel();
		idPan.add(idlab);
	}
}
