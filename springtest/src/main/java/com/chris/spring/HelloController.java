package com.chris.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chris on 16/3/15.
 */
public class HelloController implements Controller {

    private String helloworld;

    private String viewPage;

    public ModelAndView handleRequest(HttpServletRequest req,
                                      HttpServletResponse res) throws Exception {
        Map model = new HashMap();
        model.put("helloworld",getHelloworld());

        return new ModelAndView(getViewPage(),model);
    }

    public String getHelloworld() {
        return helloworld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }

    public String getViewPage() {
        return viewPage;
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }

}