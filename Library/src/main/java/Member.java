

public class Member {
    private String memberName;
    private int memberID;
    private String memberAddress;


    public Member (String memberName, int memberID, String memberAddress)
    {
        this.memberName = memberName;
        this.memberID = memberID;
        this.memberAddress = memberAddress;
    }


    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    @Override
    public String toString() {
        return ("Name:" + memberName + " " +  "Id:" + memberID + " " + "Address:" + memberAddress);
    }


    }
