import java.util.ArrayList;

public class MemberHandler {
    private ArrayList<Member> memberList = new ArrayList();

    public void addMember(Member member){
        memberList.add(member);
    }

    @Override
    public String toString() {
        return "MemberHandler" + memberList;
    }
}
