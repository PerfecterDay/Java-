package weather;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BaIcy on 2016/12/2.
 */
public class QueryWeather {

    private Map param;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    private String query(String cityCode){

        param = new HashMap<String,String>();
        param.put("ts",sdf.format(new Date()));
        param.put("ttl","30");
        param.put("uid","UD62113B95");
        return null;

    }

    private String map2String(Map<String,String> map){

        StringBuilder stringBuilder = new StringBuilder();
        for (String key : map.keySet()){
            stringBuilder.append(key+"="+map.get(key));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        try{
            URL url = new URL("https://api.thinkpage.cn/v3/weather/now.json?" +
                    "key=zlrmseakahexufhv&location=shanghai&language=zh-Hans&unit=c");

            URLConnection connection = url.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
