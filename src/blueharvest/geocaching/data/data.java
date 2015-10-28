/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueharvest.geocaching.data;

/**
 *
 * @author jmb
 * @param <T> generic type
 */
public interface data<T> {

    public abstract T create(Object... o);
    
    public abstract T get(java.util.UUID id);

    public abstract boolean insert(T obj);

    public abstract boolean update(T obj);

    public abstract boolean delete(java.util.UUID id);

}
