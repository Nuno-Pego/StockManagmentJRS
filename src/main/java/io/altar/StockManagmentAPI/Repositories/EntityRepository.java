package io.altar.StockManagmentAPI.Repositories;

//Imports:
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import io.altar.StockManagmentAPI.Models.BaseEntity;

//Abstract Class - Data Base CRUD

public abstract class EntityRepository<T extends BaseEntity> {

	@PersistenceContext
	protected EntityManager entityManager;

	public void removeByID(long id) {
		// entityManager.remove(entity);
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public T save(T entity) {
		return entityManager.merge(entity);
	}

	// // Fields:
	// private Map<Long, T> baseDeDados = new HashMap<Long, T>();
	//
	// private long actualID = 0;
	//
	// // Get ID:
	// public long getActualID() {
	// return actualID;
	// }
	//
	// // Prepare for next ID
	// public long nextID() {
	// return actualID++;
	// }
	//
	// // Check if is empty:
	// public boolean isEmpty() {
	// if (em.persist.isEmpty()) {
	// return true;
	// } else {
	// return false;
	// }
	// }
	//
	// // Save:
	// public T save(T entity) {
	// entity.setId(actualID);
	// baseDeDados.put(entity.getId(), entity);
	// nextID();
	// return entity;
	// }
	//
	// // Find by id:
	// public T findByID(Long id) {
	// return baseDeDados.get(id);
	// }
	//
	// // Get all:
	// public Collection<T> getAll() {
	// return baseDeDados.values();
	// }
	//
	// // Update:
	// public void update(T entity) {
	// baseDeDados.replace(entity.getId(), entity);
	// }
	//
	// // Remove by id:
	// public void removeByID(Long id) {
	// baseDeDados.remove(id);
	// }
	//
	// // Remove all:
	// public void removeAll() {
	// baseDeDados.clear();
	// }
}
