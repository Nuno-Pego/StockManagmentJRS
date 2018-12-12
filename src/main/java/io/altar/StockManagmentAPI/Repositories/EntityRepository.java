package io.altar.StockManagmentAPI.Repositories;

import java.util.List;

//Imports:
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import io.altar.StockManagmentAPI.Models.BaseEntity;

//Abstract Class - Data Base CRUD

public abstract class EntityRepository<T extends BaseEntity> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected abstract Class<T> getEntityClass();

	protected abstract String getAllEntityQueryName();

	// Fields:

	public T save(T entity) {
		return entityManager.merge(entity);
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public void removeByID(long id) {
		entityManager.remove(entityManager.find(getEntityClass(), id));
	}

	public List<T> getAll() {
		return entityManager.createNamedQuery(getAllEntityQueryName(), getEntityClass()).getResultList();
	}

}
