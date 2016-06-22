package br.com.brunobrasilweb.api.service;

import br.com.brunobrasilweb.api.model.AbstractModel;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public abstract class AbstractService<T extends AbstractModel<Long>, Long extends Serializable> {

    protected abstract JpaRepository<T, Long> getRepository();

    public List<T> listar() {
        return getRepository().findAll();
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public T get(Long id) {
        T entity = getRepository().findOne(id);
        return entity;
    }

    public void delete(Long id) {
        try {
            getRepository().delete(id);
        } catch (EmptyResultDataAccessException e) {}
    }

    public void put(T entity) {
        T getEntity = getRepository().findOne(entity.getId());
        getRepository().save(entity);
    }

}