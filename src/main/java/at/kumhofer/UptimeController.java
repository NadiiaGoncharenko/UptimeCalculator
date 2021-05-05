package at.kumhofer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/api/uptime")

public class UptimeController {

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
}