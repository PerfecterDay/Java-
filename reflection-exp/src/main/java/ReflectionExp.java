import net.sf.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by BaIcy on 2016/12/13.
 */
public class ReflectionExp {

    private String name;
    private int age;
    private Map testMap;
    private String a;
    private String b;


    public static void main(String[] args) throws Exception{

        String str = new String();
        ReflectionExp reflectionExp = new ReflectionExp();

        Class rfClazz = str.getClass();
        Field[] fields = rfClazz.getDeclaredFields();
        System.out.println(fields.length);
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Map<String ,String > map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");

        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println(jsonObject.toString());

    }

}
