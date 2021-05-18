package at.kumhofer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/api/uptime")

public class UptimeController {

    private static int counter=0;

    @GET
    @Path("/{percentage}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime(@PathParam("percentage") double percentage){
        double minutesOfMonth = 60*24*30;
        double definedUptimeInPercentage = percentage /100;
        double uptimeInMinutes = minutesOfMonth * definedUptimeInPercentage;
        return String.format("%.2f", uptimeInMinutes);
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime(){
        return this.calculateUptime(99.95);
    }


    @POST
    @Path("/delta/{delta}")
    @Produces(MediaType.TEXT_PLAIN)
    public String SampleMethodWithDelta(@PathParam("delta") int delta){
        counter = counter + delta;
        System.out.println("Call to POST");
        return "sample" + counter;
    }

}