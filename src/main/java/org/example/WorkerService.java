package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/workers")
public class WorkerService {
    private static List<Worker> workers = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Worker> getWorkers() {
        return workers;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addWorker(Worker worker) {
        workers.add(worker);
        return Response.status(Response.Status.CREATED).entity(worker).build();
    }
}
