
package com.sun.mdm.index.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2015-09-21T11:26:31.652-04:00
 * Generated source version: 2.7.0.redhat-610379
 */

@WebFault(name = "ProcessingException", targetNamespace = "http://webservice.index.mdm.sun.com/")
public class ProcessingException_Exception extends Exception {
    
    private com.sun.mdm.index.webservice.ProcessingException processingException;

    public ProcessingException_Exception() {
        super();
    }
    
    public ProcessingException_Exception(String message) {
        super(message);
    }
    
    public ProcessingException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessingException_Exception(String message, com.sun.mdm.index.webservice.ProcessingException processingException) {
        super(message);
        this.processingException = processingException;
    }

    public ProcessingException_Exception(String message, com.sun.mdm.index.webservice.ProcessingException processingException, Throwable cause) {
        super(message, cause);
        this.processingException = processingException;
    }

    public com.sun.mdm.index.webservice.ProcessingException getFaultInfo() {
        return this.processingException;
    }
}
