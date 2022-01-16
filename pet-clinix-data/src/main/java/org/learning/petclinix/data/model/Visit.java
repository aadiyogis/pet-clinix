package org.learning.petclinix.data.model;

import java.time.LocalDate;
import java.util.Objects;

public class Visit {
    private Pet pet;
    private LocalDate date;
    private String description;

    public Visit() {
    }

    public Visit(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(pet, visit.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet);
    }

    @Override
    public String toString() {
        return "Visit{" +
                "date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
