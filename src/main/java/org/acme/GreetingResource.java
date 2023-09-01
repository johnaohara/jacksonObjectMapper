package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.Instant;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{msg}")
    public TimedMsg hello(@PathParam("msg") String msg) {
        TimedMsg timedMsg = new TimedMsg();
        timedMsg.msg = msg;
        timedMsg.timestamp = Instant.now();
        return timedMsg;
    }

}
