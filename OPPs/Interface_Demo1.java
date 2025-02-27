package OPPs;
class phone{
	void sms() {
		System.out.println("make a sms");
	}
}
interface video {
	void click();
	void record();
	
	
}
interface player{
	void pause();
	void play();
	void stop();
}
class smartphone extends phone implements video,player{

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause the video");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play the video");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop the video");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click the video");
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("recod the video");
	}
	
}

public class Interface_Demo1 {
	public static void main(String args[]) {
		smartphone o=new smartphone();
		o.click();
		o.record();
		o.sms();
		o.stop();
		o.pause();
		o.play();
	}

}
