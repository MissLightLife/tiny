package cn.tiny.wf.controller;

import cn.tiny.wf.common.StudentProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author tiny
 * @date 2018/12/18 15:31
 */
//@RestController
@Controller
@EnableAutoConfiguration
public class HelloController {

    @Resource
    private StudentProperties studentProperties;

//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World";
//    }
//
//    @RequestMapping("/hello_age")
//    public String hellAge(){
//        return "大家好，我叫"+studentProperties.getName()+",今年"+studentProperties.getAge()+"岁了";
//    }
         @RequestMapping("/helloJsp")
        public String helloJsp(Model model){
            model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
            //model.addAttribute("now", 111);
            return "hello";

    }



}
