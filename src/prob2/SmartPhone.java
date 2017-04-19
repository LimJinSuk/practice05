package prob2;

public class SmartPhone extends MusicPhone {
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			playApp();
			return;
		}
		//부분 재정의로 나머지부분은 뮤직폰과 동일
		super.execute( function );
	}
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	protected void playApp() {
		System.out.println("앱실행");
	}
}
