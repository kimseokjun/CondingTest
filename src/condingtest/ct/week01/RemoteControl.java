package condingtest.ct.week01;

public interface RemoteControl {
// 인터페이스는 public
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;	
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
