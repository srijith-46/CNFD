package pog;

public class MP3Player implements MediaPlayer{
	@Override
	public void play(String filename) {
		System.out.println("Playing MP3" + filename);
	}
}
