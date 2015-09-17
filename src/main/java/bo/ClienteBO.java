package bo;

import model.Cliente;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virmerson on 31/08/2015.
 */
@Dependent
public class ClienteBO {

   static  List<Cliente> clientes = new ArrayList<Cliente>();
    static long id =1 ;

    {

        clientes.add(new Cliente("Jão", "j@gmail.com"));
        clientes.add(new Cliente("Zé", "ze@gmail.com"));
        clientes.add(new Cliente("Maria", "maria@gmail.com"));

    }

    public ClienteBO(){
        }

    public void salvar(Cliente cliente){
        cliente.setId(id++);
        clientes.add(cliente);
    }

    public List<Cliente> lista(){
        return clientes;
    }

    public void remover(int indice){
        clientes.remove(indice);
    }
}
