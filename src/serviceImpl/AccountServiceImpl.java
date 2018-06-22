package serviceImpl;

import java.util.ArrayList;
import java.util.List;
import domain.*;
import service.AccountService;
import service.AdminService;

public class AccountServiceImpl implements AccountService {
	private static AccountServiceImpl instance = new AccountServiceImpl(); 
	public static AccountServiceImpl getInstance() {return instance;}
	private AccountServiceImpl() {}
	@Override
	public void createAccount(AccountBean account) {
		account.setCreateDate(AdminServiceImpl.getInstnace().createDate());
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setAccountNo(AdminServiceImpl.getInstnace().createAccountNo());
		System.out.println("account " + account);
//		list.add(account);
	}
	
	@Override
	public AccountBean findById(AccountBean account) {
//		AccountBean acc = new AccountBean();
//		for (AccountBean e : list) {
//			if (account.getUid().equals(e.getUid())) {
//				acc = e;break;
//			}
//		}
//	}
//		return acc;
		return null;
	}
	
	@Override
	public void delete(AccountBean account) {
//		list.remove(list.indexOf(findById(account)));
	}

	@Override
	public void update(AccountBean account) {
//		list.get(list.indexOf(findById(account))).setPass(account.getPass());
	}

}