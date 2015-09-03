package rest;

import bo.ClienteBO;
import model.Cliente;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * JAX-RS
 * Created by Virmerson on 31/08/2015.
 */

@Path("/cliente")
public class ClienteResource {

    @Inject
    ClienteBO clienteBO;

    @POST
    @Path("/test")
    public void teste(){
        System.out.println("OK");
    }

    @POST
    @Path("/salvar")
    @Consumes("application/json")
    @Produces("application/json")
    public Response salvar(Cliente cliente){
        clienteBO.salvar(cliente);
        return Response.status(200).entity(cliente).build();
    }

    @GET
    @Path("/lista")
    @Produces("application/json")
    public Response lista(){

        return Response.status(200).entity(clienteBO.lista()).build();
    }
}
