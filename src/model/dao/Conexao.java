package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dione
 */
public class Conexao {
    
    private static EntityManagerFactory emf;
    private static Conexao conexao;
    
    private Conexao() {
        emf = Persistence.createEntityManagerFactory("SistemaEcommercePU");
    }
    
    public synchronized static EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return emf.createEntityManager();
    }
    
}
