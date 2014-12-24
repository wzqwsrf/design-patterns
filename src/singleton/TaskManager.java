package singleton;

/**
 * @Author: wangzhenqing
 * @Date: 2014年12月24日22:34:21
 * @Description: 单例模式初探
 */
public class TaskManager {

    private static TaskManager taskManager = null;

    public static TaskManager getInstance(){
        if (taskManager == null){
            taskManager = new TaskManager();
        }
        return taskManager;
    }

//  other functions
    public void displayProcess(){

    }

    public void displayServoces(){

    }

}
