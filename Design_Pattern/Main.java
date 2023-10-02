package pog;

public class Main{
	public static void main(String[] args) {
		MediaPlayer player = new MP3Player();
		player.play("test mp3 file,mp3");
	    player = new MediaPlayerAdapter(new MP4Player());
	    player.play("test mp4 file.mp4");
	}
}
	 
