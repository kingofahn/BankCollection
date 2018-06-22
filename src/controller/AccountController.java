package controller;

import javax.swing.JOptionPane;

import domain.*;
import serviceImpl.*;
import service.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getIntance() {return instance;}
	public AccountController() {}

	public void account(AccountBean account) {
		AccountServiceImpl.getInstance().createAccount(account);
		System.out.println("account " + account);
	}

	public void minusAccount(MinusAccountBean minusAccount) {
		minusAccount = new MinusAccountBean();
		// service.createMinus(minusAccount);
	}

	public void findById() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		JOptionPane.showMessageDialog(null, AccountServiceImpl.getInstance().findById(account));
	}

	public void changePass() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		account.setPass((JOptionPane.showInputDialog("old Pass?") + "/" + (JOptionPane.showInputDialog("New Pass?"))));
		AccountServiceImpl.getInstance().update(account);
	}

	public void deleteAccount() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		AccountServiceImpl.getInstance().delete(account);
	}
}