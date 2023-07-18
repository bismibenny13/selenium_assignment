package week1.day2;

public class Mobile {
	public void sendSms() {
		System.out.println("Message from Oppo");
	}
	public long makeCall(long phoneNo) {
		System.out.println(phoneNo);
		return phoneNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob= new Mobile();
		mob.sendSms();
		mob.makeCall(99445556677l);
}

}
