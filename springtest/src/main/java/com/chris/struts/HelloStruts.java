package com.chris.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chris on 16/3/20.
 */
public class HelloStruts extends ActionSupport{

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String execute() throws Exception {
        setMsg("Hello Struts2");
        return SUCCESS;
    }

    public String test(){
        setMsg("李春林是我妈,xixi");
        return SUCCESS;
    }
}
