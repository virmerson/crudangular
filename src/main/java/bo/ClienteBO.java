package bo;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virmerson on 31/08/2015.
 */
public class ClienteBO {

   static  List<Cliente> clientes = new ArrayList<Cliente>();

    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> lista(){
        return clientes;
    }
}
