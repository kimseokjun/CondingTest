package condingtest.ct.week01;



public class Television implements RemoteControl {
	int volume = 0;		//클래스 내의 전역변수
	
	@Override	//재사용
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume; 
	}
}
