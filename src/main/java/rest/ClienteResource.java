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

    @GET
    @Path("/init")
    public void teste(){



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

    @DELETE
    @Path("/{indice}")
    public void remover (@PathParam("indice") int indice){
        clienteBO.remover(indice);
    }
}
