import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;
import net.sf.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by BaIcy on 2016/12/16.
 */

public class Test {

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    private String csvFilePathCoupon;

    private String fileName;


    public void process() {
//        String filepath = csvFilePathCoupon;

        try {
//            String[] roots = new String[]{filepath};//定义Groovy脚本引擎的根路径

            GroovyScriptEngine engine = new GroovyScriptEngine("groovy-test/target/classes/");
            Binding binding = new Binding();
            binding.setProperty("customerId","000108915961");
            binding.setProperty("dataSource",dataSource);
            Object value = engine.run("oldDb.groovy", binding);
            JSONObject jsonObject = JSONObject.fromObject(value);
            System.out.print(jsonObject.toString());

        }catch (IOException e){
            log.print("老用户完成交易查询异常"+e);
            return;

        }catch (ScriptException e){
            log.print("老用户完成交易查询异常"+e);
            return;
        }catch (ResourceException e){
            log.print("老用户完成交易查询异常"+e);
            return;
        }
    }

    public static void main(String[] args){
        ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
        Test test = (Test) factory.getBean("test");
//        test.process();
        String path = test.getClass().getResource("").toString();
        System.out.println(path);
    }
}
