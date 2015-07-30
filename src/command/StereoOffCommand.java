package command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:55:56
 * @description: 音响控制
 */
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
