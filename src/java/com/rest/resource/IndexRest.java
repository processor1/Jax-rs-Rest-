/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.resource;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 *
 * @author Mobile Apps
 */
@Path("/")
public class IndexRest {

    @GET
    @Produces("text/html")
    public String welcome() {
        return "<center><h2><b>Welcome Restendpoint</b></h2>" +"<a href=\"students\">student rest</a>|<a href=\"greet\">student rest</a>|"+"</center>";
    }

}
