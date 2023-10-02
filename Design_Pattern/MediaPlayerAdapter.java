package pog;

public class MediaPlayerAdapter implements MediaPlayer{
	private AdvancedMediaPlayer advancedMediaPlayer;
	public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
		}
	@Override
	public void play(String filename) {
		System.out.println("Using media player Adapter");
		advancedMediaPlayer.playfile(filename);	
		}
}
