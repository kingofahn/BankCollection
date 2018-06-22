package controller;

import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;
import service.*;

public class AdminController {
	private static AdminController instnace = new AdminController();
	public static AdminController getInstnace() {return instnace;}
	private AdminController() {}

	public void accountList() {
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstnace().accountList());
	}

	public void memberList() {
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstnace().memberList());
	}

	public void findAccountByName() {
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstnace().findAccountByName((JOptionPane.showInputDialog("Name?"))));
	}

	public void findMemberByName() {
		JOptionPane.showMessageDialog(null, AdminServiceImpl.getInstnace().findMemberByName(JOptionPane.showInputDialog("name?")));
	}

	public void findMemberById() {
		MemberBean member = null;
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("ID?"));
		// JOptionPane.showMessageDialog(null, service.login(member));
	}

	public void add() {
		MemberBean member = null;
		member = new StaffBean();
		member.setName(JOptionPane.showInputDialog("Name?"));
		member.setUid(JOptionPane.showInputDialog("ID?"));
		member.setPass(JOptionPane.showInputDialog("Pass?"));
		member.setSsn(JOptionPane.showInputDialog("SSN?"));
		member.setAddr(JOptionPane.showInputDialog("ADRS?"));
		member.setPhone(JOptionPane.showInputDialog("PHONE?"));
		member.setEmail(JOptionPane.showInputDialog("EMAIL?"));
		AdminServiceImpl.getInstnace().createStaff((StaffBean) member);
	}

}