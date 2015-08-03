package facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 15:05:31
 * @description: 放大器, 扩音器
 */
public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int sound) {
        System.out.println("Top-O-Line Amplifier setting volume to " + sound);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}
