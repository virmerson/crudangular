package rest;

import bo.ClienteBO;
import model.Cliente;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
    public void salvar(Cliente cliente){
        clienteBO.salvar(cliente);
    }

    @GET
    @Path("/lista")
    public Response lista(){

        return Response.status(200).entity(clienteBO.lista()).build();
    }
}
