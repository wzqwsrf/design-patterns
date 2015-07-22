package observer;

/**
 * @author: wangzhenqing
 * @date:
 * @description:
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
