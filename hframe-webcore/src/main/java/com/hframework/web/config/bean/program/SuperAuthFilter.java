package com.hframework.web.config.bean.program;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("super-auth-filter")
public class SuperAuthFilter {

	@XStreamAlias("data-set")
	private String dataSet;
	@XStreamAlias("data-field")
	private String dataField;
	@XStreamAlias("data-field-value")
	private String dataFieldValue;

    public SuperAuthFilter() {
    }

    public String getDataSet() {
     return dataSet;
    }

    public void setDataSet(String dataSet) {
     this.dataSet = dataSet;
    }

    public String getDataField() {
     return dataField;
    }

    public void setDataField(String dataField) {
     this.dataField = dataField;
    }

    public String getDataFieldValue() {
     return dataFieldValue;
    }

    public void setDataFieldValue(String dataFieldValue) {
     this.dataFieldValue = dataFieldValue;
    }
}
