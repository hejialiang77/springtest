package com.chris.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chris on 16/3/20.
 */
public class HelloWorldMultiAcionController extends MultiActionController {

    private String viewPage;

    public ModelAndView insert(HttpServletRequest req, HttpServletResponse res){
        ModelAndView mav = new ModelAndView();
        String str = req.getParameter("helloWorld");
        mav.setViewName(getViewPage());
        mav.addObject("helloworld", "this is add servlet" + str);
        return mav;
    }

    public ModelAndView delete(HttpServletRequest req, HttpServletResponse res){
        ModelAndView mav = new ModelAndView();
        String str = req.getParameter("helloWorld");
        mav.setViewName(getViewPage());
        mav.addObject("helloworld", "this is delete servlet" + str);
        return mav;
    }

    public ModelAndView update(HttpServletRequest req, HttpServletResponse res){
        ModelAndView mav = new ModelAndView();
        String str = req.getParameter("helloWorld");
        mav.setViewName(getViewPage());
        mav.addObject("helloworld", "this is update servlet" + str);
        return mav;
    }

    public String getViewPage() {
        return viewPage;
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }
}
