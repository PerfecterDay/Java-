import com.sun.org.apache.xerces.internal.util.URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by BaIcy on 2016/12/2.
 */
public class NtpUtil {

    public void inetAddrTest(){
        try{
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println(addr.getHostName());
            System.out.println(addr.getHostAddress());
            byte[] bytes =  addr.getAddress();

            System.out.println(bytes);

            InetAddress addr1 = InetAddress.getByName("Wzz-Laptop");
            InetAddress addr2 = InetAddress.getByName("172.16.26.86");
            System.out.println(addr1);
            System.out.println(addr2);

        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }

    public void urlTest(){
        try{
            URL baidu =new URL("http://www.baidu.com:80");
            URL url =new URL(baidu,"/index.html?username=tom#test");//？表示参数，#表示锚点
            log.println(url.getProtocol());//获取协议
            log.println(url.getHost());            ;//获取主机
            log.println(url.getPort());;//如果没有指定端口号，根据协议不同使用默认端口。此时getPort()方法的返回值为 -1
            log.println(url.getPath());;
            log.println(url.getFile());//文件名，包括文件路径+参数
            log.println(url.getRef());//相对路径，就是锚点，即#号后面的内容
            log.println(url.getQuery());//查询字符串，即参数

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public String getPageByUrl(String url){
        try{
            URL pageUrl = new URL(url);
            InputStream is = pageUrl.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();

            while (data != null){
                System.out.println(data);
                data = br.readLine();
            }

            br.close();
            isr.close();
            is.close();

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return  null;
    }

    public static void main(String[] args){
        NtpUtil ntpUtil = new NtpUtil();
        ntpUtil.inetAddrTest();
        ntpUtil.urlTest();
        String page = ntpUtil.getPageByUrl("http://m.weather.com.cn/mweather/101110101.shtml");
        System.out.println(page);

    }
}
