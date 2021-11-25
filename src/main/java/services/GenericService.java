package services;

import javax.persistence.EntityManager;

public class GenericService {
    public static Object salvar(Object objeto, EntityManager entityManager) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            objeto = entityManager.merge(objeto);
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return objeto;
    }
}
