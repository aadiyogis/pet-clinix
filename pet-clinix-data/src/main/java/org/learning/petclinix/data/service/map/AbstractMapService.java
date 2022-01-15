package org.learning.petclinix.data.service.map;

import org.learning.petclinix.data.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    private final Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null!!!");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Long getNextId() {
        Long id;
        try {
            id = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            id = 1L;
        }
        return id;
    }
}
