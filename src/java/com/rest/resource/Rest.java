/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.resource;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import dao.StudentDao;
import javax.inject.Inject;


/**
 *
 * @author Mobile Apps
 */
@Path("/students")
public class Rest {

    @Inject
    StudentDao dao;

    @GET
    @Produces("text/html")
    public String getAlls() {
        return dao.getAllStudent().toString();
    }
;
}
