package prob2;

public class PhoneApp {

	public static void main(String[] args) {
		Phone phone = new SmartPhone();

		phone.execute("음악");//오버라이딩
		phone.execute("통화");
		phone.execute("앱");//기능추가
	}
}