package service;
import java.util.List;

import domain.*;
public interface AccountService {
	public void createAccount(AccountBean account);
	public List<AccountBean> list();
	public List<AccountBean> findByName(String param);
	public AccountBean findById(AccountBean account);
	public void delete(AccountBean account);
	public void update(AccountBean account);
	public String createRandom(int start, int end);
	public String createDate();
	public String createAccountNo();
}