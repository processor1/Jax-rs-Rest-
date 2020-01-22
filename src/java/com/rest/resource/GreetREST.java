/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.resource;

/**
 *
 * @author Mobile Apps
 */
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import entity.EnglishGreet;

@Path("/greet")
public class GreetREST {

    @Inject
    private EnglishGreet greet;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return greet.greet();
    }
}
