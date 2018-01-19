package org.programming.mitra;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import static org.programming.mitra.Action.*;

/**
 * @author Naresh Joshi
 */

public class FileEntityListener {

    @PrePersist
    public void prePersist(File target) {
        addAuditLog(target, INSERTED);
    }

    @PreUpdate
    public void preUpdate(File target) {
        addAuditLog(target, UPDATED);
    }

    @PreRemove
    public void preRemove(File target) {
        addAuditLog(target, DELETED);
    }

    private void addAuditLog(File target, Action action) {
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new FileHistory(target, action));
    }

}
