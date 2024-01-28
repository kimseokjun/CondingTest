package condingtest.ct.week01;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		
		rc = new Radio();
		
		
		rc.turnOff();
		//stack 에는 rc가 들어있고 힙에는 티비와 라디오가 다 들어있다.
	}
}
