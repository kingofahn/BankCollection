package service;
import java.util.List;
import domain.*;
public interface MemberService {
	public void createUser(UserBean user);
	public String login(MemberBean user);
	public void updatePassword(MemberBean member);
	public void deleteMember(MemberBean member);
}
