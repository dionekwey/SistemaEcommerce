package model.service;

import model.dao.ClienteDao;
import model.dao.ClienteDaoImpl;

/**
 *
 * @author Dione
 */
public class ServiceLocator {

    public static ClienteDao getClienteDao() {
        return new ClienteDaoImpl();
    }
    
}
