package wsu.sudarshan.springInAction.Chapter2;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	private String title = "Sgt. Pepper's Lonely hearts Club Band";
	private String artist = "The Beatles";
	
	
	public void play() {
		System.out.println("Playing "+title+" by "+artist);
		
	}
	
}
