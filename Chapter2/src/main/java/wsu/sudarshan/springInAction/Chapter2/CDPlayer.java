package wsu.sudarshan.springInAction.Chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;
	
	//spring tries to find the dependency matching the arguments, if it is found spring will wire them
	//if not, an exception will not be thrown
	@Autowired(required=false)
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
		
	}

}
