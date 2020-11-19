package dao;

import java.util.List;

/**
 *
 * @author Diego Palacios <diego.palacios2@catolica.edu.sv>
 */
public interface IDAO<T, K> {

    void insert(T o);

    void update(T o);

    void delete(T o);

    List<T> getAll();

    T find(K id);
}