package server_client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by BaIcy on 2016/12/2.
 */
public class Server {

    public static void main(String[] args) throws Exception{
        /**
         * 基于TCP协议的Socket通信，实现用户登录，服务端
         */
//1、创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
        ServerSocket serverSocket = new ServerSocket(10086);//1024-65535的某个端口
        System.out.println("服务器开始等待链接...");
//2、调用accept()方法开始监听，等待客户端的连接
        int count = 0;
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread thread = new ServerThread(socket);
            thread.start();
            System.out.println(++count);
        }

    }
}


class ServerThread extends Thread{
    private Socket socket;

    ServerThread(Socket s){
        socket = s;
    }
    @Override
    public void run(){
        try{
            InputStream is = socket.getInputStream();
            InputStreamReader isr =new InputStreamReader(is);
            BufferedReader br =new BufferedReader(isr);
            String info =null;
            while((info=br.readLine())!=null){
                System.out.println("我是服务器，客户端说："+info);
            }
//            socket.shutdownInput();//关闭输入流
//4、获取输出流，响应客户端的请求
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("欢迎您！");
            pw.flush();

//5、关闭资源
//            pw.close();
//            os.close();
//            br.close();
//            isr.close();
//            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
