package Ej5;

public class MusicApp {
    public static void main(String[] args) {
        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new ITunes(), new MP3Player()};
        MusicApp app = new MusicApp();
        app.startMusic(players);
    }

    public void startMusic(MusicPlayer[] player) {
        for (MusicPlayer m : player) {

            if (m instanceof OnlineMusicPlayer) {
                ((OnlineMusicPlayer) m).stream();
            }
            if (m instanceof OfflineMusicPlayer) {
                ((OfflineMusicPlayer) m).load();
            }
            m.play();
        }
    }
}
