package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MinusAccountBean;
import serviceImpl.*;
import service.*;

public class AccountController {
	public void account() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account = new AccountBean();
		account.setName(JOptionPane.showInputDialog("Name?"));
		account.setUid(JOptionPane.showInputDialog("ID?"));
		account.setPass(JOptionPane.showInputDialog("Pass?"));
		service.createAccount(account);
	}
	public void minusAccount() {
		AccountService2 service = new AccountServiceImpl2();
		MinusAccountBean minusAccount = null;
		minusAccount = new MinusAccountBean();
		minusAccount.setName(JOptionPane.showInputDialog("Name?"));
		minusAccount.setUid(JOptionPane.showInputDialog("ID?"));
		minusAccount.setPass(JOptionPane.showInputDialog("Pass?"));
		minusAccount.setLimit(Integer.parseInt(JOptionPane.showInputDialog("Limit?")));
		service.createMinus(minusAccount);
	}
	
	public void list() {
		AccountService2 service = new AccountServiceImpl2();
		JOptionPane.showMessageDialog(null, service.list());
	}

	public void findByName() {
		AccountService2 service = new AccountServiceImpl2();
		JOptionPane.showMessageDialog(null, service.findByName((JOptionPane.showInputDialog("Name?"))));
	}

	public void findById() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		JOptionPane.showMessageDialog(null, service.findById(account));
	}

	public void changePass() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		account.setPass((JOptionPane.showInputDialog("old Pass?") + "/" + (JOptionPane.showInputDialog("New Pass?"))));
		service.update(account);
	}

	public void deleteAccount() {
		AccountService2 service = new AccountServiceImpl2();
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		service.delete(account);
	}
}