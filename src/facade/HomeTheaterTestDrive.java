package facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 16:19:46
 * @description: 测试类
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade( amplifier,
                         tuner,  dvdPlayer,
                         cdPlayer,  projector,
                         theaterLights,
                         screen,  popcornPopper);
        String movie = "Raiders of the Lost Ark";
        homeTheaterFacade.watchMovie(movie);
        homeTheaterFacade.endMovie(movie);
    }
}
