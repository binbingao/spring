package soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{
	private String title="Sgt. Pepper's Lonely Hearts CLub Band";
	private String artist="The Beatles";
	public void play() {
		System.out.println("Playing "+title+" by "+ artist);
	}

}
