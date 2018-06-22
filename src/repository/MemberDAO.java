package repository;
import java.util.List;
import domain.*;
public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectMemberList();
	public List<MemberBean> selectMemberByName(String name);
	public MemberBean selectMembeId(String id);
	public MemberBean login(MemberBean member); //특수한것은 자체적인 이름사용
	public int countMembers();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
}
