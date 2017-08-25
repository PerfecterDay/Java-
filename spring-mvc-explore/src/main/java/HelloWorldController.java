import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by BaIcy on 2016/12/14.
 */
@Controller
public class HelloWorldController{


//    public ModelAndView handleRequest(HttpServletRequest request,
//                                      HttpServletResponse response)
//                                      throws Exception{
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message","HelloWorld");
//        modelAndView.setViewName("hello");
//
//        return modelAndView;
//    }

    @RequestMapping(value = "/app")
    public String test(HttpServletRequest request, HttpServletResponse response,
                        Model model) throws Exception{
//        System.out.println(host);
//        System.out.println(cookie);
        model.addAttribute("message","HelloWorld");
        return "hello";
    }


    @RequestMapping(value = "/hello")
    public String test(HttpServletRequest request, HttpServletResponse response) throws Exception{

        System.out.println("HelloWorld");
        return "hello";
    }
}
