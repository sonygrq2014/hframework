package com.hframework.web.config.bean.module;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("appendElement")
public class AppendElement   {

	@XStreamAsAttribute
    @XStreamAlias("type")
	private String type;
	@XStreamAsAttribute
    @XStreamAlias("param")
	private String param;

    public AppendElement() {
    }
   
 	 	 
     public String getType(){
     	return type;
     }

     public void setType(String type){
     	this.type = type;
     }
	 	 	 
     public String getParam(){
     	return param;
     }

     public void setParam(String param){
     	this.param = param;
     }
	 
}
