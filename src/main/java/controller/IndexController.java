package controller;

import obj.Child;
import obj.Parent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.AppContext;

import javax.annotation.Resource;

/**
 * Create with IDEA 2020
 * Time : 2021-04-16
 * author : drc
 */
@RestController
public class IndexController {

    @Resource
    AppContext appContext;

    @GetMapping("/index")
    public String index(){
        Parent p = (Parent)appContext.getBean("parent");
        System.out.println(p);
        Child c = (Child)appContext.getBean("child");
        return "test";
    }
}
