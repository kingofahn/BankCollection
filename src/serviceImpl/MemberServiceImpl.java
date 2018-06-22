package serviceImpl;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import repository.MemberDAO;
import repositoryImpl.MemberDAOImpl;
import service.*;

public class MemberServiceImpl implements MemberService {
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {return instance;}
	private MemberServiceImpl() {}
	List<MemberBean> list;

	@Override
	public void createUser(UserBean member) {
		System.out.println("==========멤버서비스==========");
		System.out.println("컨트롤러에서 넘어온 객체 : "+member);
		member.setCreditRating("7등급");
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public String login(MemberBean member) {
		String a = "";
		MemberBean mbr = new MemberBean();
		for (MemberBean e : list) {
			if (member.getUid().equals(e.getUid())) {
				mbr = e;
				a="로그인 성공";
				break;
			}
		}
		return a;
	}

	@Override
	public void updatePassword(MemberBean member) { // new pass만 가지고 있을 것 같음
		list = new ArrayList<MemberBean>();
		String oldPass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		MemberBean mbr = new MemberBean();
		mbr.setPass(oldPass);
		list.get(list.indexOf(login(mbr))).setPass(newPass);
	}

	@Override
	public void deleteMember(MemberBean member) {
		list = new ArrayList<MemberBean>();
		list.remove(list.indexOf(login(member)));
	}
}
