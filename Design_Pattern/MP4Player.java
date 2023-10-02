package pog;

public class MP4Player implements AdvancedMediaPlayer{
	@Override
	public void playfile(String filename) {
		System.out.println("Playing MP4" + filename);
	}
}
