package com.customer.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/customer/")
public class CustomerService {
    
    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);
    
    CamelContext context;

    @POST
    @Path("/")
    public Response postCustomerData(String xmlPayload) {
        LOG.info("CustomerServiceImpl.postCustomerData()");
        return Response.status(Status.ACCEPTED).entity(new String("Net Yet Implemented")).build();
    }

    @GET
    @Path("/")
    public Response getCustomerData() {
        LOG.info("CustomerServiceImpl.getCustomerData()");
        return Response.status(Status.ACCEPTED).entity(new String("Use Post")).build();
    }

    public CamelContext getContext() {
        return context;
    }

    public void setContext(CamelContext context) {
        this.context = context;
    }

}
