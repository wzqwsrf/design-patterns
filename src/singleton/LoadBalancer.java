package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: wangzhenqing
 * @Date: 2014年12月27日11:42:28
 * @Description: 单例模式设计负载均衡器
 */
public class LoadBalancer {
    private static LoadBalancer loadBalancer = null;
    private List<String> serverList = null;

    public static LoadBalancer getInstance() {
        if (loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    private LoadBalancer() {
        serverList = new ArrayList<String>();
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int size = serverList.size();
        int i = random.nextInt(size);
        return serverList.get(i);
    }

    //直接写Main函数测试
    public static void main(String args[]) {
        LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;
        loadBalancer1 = getInstance();
        loadBalancer2 = getInstance();
        loadBalancer3 = getInstance();
        loadBalancer4 = getInstance();
        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("服务器负载均衡具有唯一性！");
        }
        loadBalancer1.addServer("Server 1");
        loadBalancer1.addServer("Server 2");
        loadBalancer1.addServer("Server 3");
        loadBalancer1.addServer("Server 4");

        for (int i = 0; i < 10; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("分发服务器至" + server);
        }
    }
}
