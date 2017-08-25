import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by BaIcy on 2016/12/23.
 */
public class PortScanner {
    private int Count;
    private int minPort;
    private int maxPort;

    ExecutorService executorService = Executors.newCachedThreadPool();


    public static void main(String[] args) throws Exception{
        Socket socket = new Socket();
        Scanner sc = new Scanner(System.in);
        String strIp = sc.next();
        int minPort = sc.nextInt();
        int maxPort = sc.nextInt();
//        InetAddress ipAddress = InetAddress.getByName(args[0]);
        InetAddress ipAddress = InetAddress.getByName(strIp);
        for (int port = minPort; port < maxPort; port++) {
            InetSocketAddress soketAddr = new InetSocketAddress(ipAddress,port);
            try{
                socket.connect(soketAddr);
                System.out.println("Port "+ port + " is opened.");
            }catch (Exception e){
                System.out.println("Port "+ port + " is not open.");
            }
        }
//        for (int port = Integer.valueOf(args[1]); port <= Integer.valueOf(args[2]); port++) {
//            InetSocketAddress soketAddr = new InetSocketAddress(ipAddress,port);
//            try{
//                socket.connect(soketAddr);
//                System.out.println("Port "+ port + " is opened.");
//            }catch (Exception e){
//                System.out.println("Port "+ port + " is not open.");
//            }
//        }
    }

}
