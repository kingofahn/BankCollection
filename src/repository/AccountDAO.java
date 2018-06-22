package repository;

import java.util.List;

import domain.AccountBean;

public interface AccountDAO {
	public void insertAccount(AccountBean account);
	public List<AccountBean> selectAccountList();
	public List<AccountBean> selectAccountByName(String name);
	public AccountBean selectId(String id);
	public int countAccounts();
	public void updateAccount(AccountBean account);
	public void updateDelete(AccountBean account);
}
