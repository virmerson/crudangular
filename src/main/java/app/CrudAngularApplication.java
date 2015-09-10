package app;

import rest.ClienteResource;
import rest.ProdutoResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Virmerson on 31/08/2015.
 */
@ApplicationPath("/ws")
public class CrudAngularApplication extends Application {
    /**
     * Definindo os Resources
     * @return
     */
    public Set<Class<?>> getClasses(){
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(ClienteResource.class);
        classes.add(ProdutoResource.class);
        return  classes;
    }
}
