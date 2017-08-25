package strategy_pattern;


/**
 * Created by BaIcy on 2016/12/20.
 */

/**
 * 处理字符串，处理方式可变
 * 策略模式：主要是一系列不同的策略（不同的处理字符串的方式）
 */
interface Processor{
    String name();
    Object process(Object s);
}

abstract class ProcessorImpl implements Processor{
    public String name(){
        return getClass().getSimpleName();
    }
}

/*策略一*/
class Upcase extends ProcessorImpl{

    public Object process(Object s){
        return ((String)s).toUpperCase();
    }
}

/*策略二*/
class Downcase extends ProcessorImpl{
    public Object process(Object s){
        return ((String)s).toLowerCase();
    }
}


public class Apply {

    /**
     * 固定的部分，选择一种Processor 对Object s进行process处理
     * @param processor
     * @param s
     */
    public void process(Processor processor, Object s){
        System.out.print("using processor: "+ processor.name()+"--->");
        System.out.println( processor.process(s));
    }


    public static void main(String[] args){
        Processor upcase = new Upcase();
        Processor downcase = new Downcase();
        Apply apply = new Apply();
        apply.process(upcase,"Hello,Pattern Design!");
        apply.process(downcase,"Hello,Pattern Design!");
    }
}
