package prob5;

public class MyStackException extends Exception{
	public MyStackException(){
		super("MyException Occur");
		//기본 메세지 지정
	}
	public MyStackException(String message){
		super(message);
		//사용자 지정 메세지
	}
}
