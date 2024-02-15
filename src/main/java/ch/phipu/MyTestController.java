package ch.phipu;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class MyTestController {

    @Path("test")
    @POST
    public Response testMultipart(@FormParam("firstParam") final String firstParam, @FormParam("secondParam") final String secondParam) {
        return Response.ok().build();
    }
}
