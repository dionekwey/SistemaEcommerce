package model.dao;

import java.util.List;
import model.domain.Cliente;

/**
 *
 * @author Dione
 */
public interface ClienteDao {

    void excluir(Cliente cliente);

    List<Cliente> pesquisar(Cliente cliente);

    void salvarAtualizar(Cliente cliente);
    
}
