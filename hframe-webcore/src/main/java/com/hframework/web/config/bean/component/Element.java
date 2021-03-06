package com.hframework.web.config.bean.component;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("element")
public class Element   {

	@XStreamImplicit
    @XStreamAlias("element")
	private List<Element> elementList;
	@XStreamAsAttribute
    @XStreamAlias("id")
	private String id;
	@XStreamAsAttribute
    @XStreamAlias("type")
	private String type;
	@XStreamAsAttribute
    @XStreamAlias("default-value")
	private String defaultValue;
	@XStreamAsAttribute
    @XStreamAlias("rel")
	private String rel;
	@XStreamAsAttribute
    @XStreamAlias("position")
	private String position;

    public Element() {
    }
   
 	 	 
     public List<Element> getElementList(){
     	return elementList;
     }

     public void setElementList(List<Element> elementList){
     	this.elementList = elementList;
     }
	 	 	 
     public String getId(){
     	return id;
     }

     public void setId(String id){
     	this.id = id;
     }
	 	 	 
     public String getType(){
     	return type;
     }

     public void setType(String type){
     	this.type = type;
     }
	 	 	 
     public String getDefaultValue(){
     	return defaultValue;
     }

     public void setDefaultValue(String defaultValue){
     	this.defaultValue = defaultValue;
     }
	 	 	 
     public String getRel(){
     	return rel;
     }

     public void setRel(String rel){
     	this.rel = rel;
     }
	 	 	 
     public String getPosition(){
     	return position;
     }

     public void setPosition(String position){
     	this.position = position;
     }
	 
}
