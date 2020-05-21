package ru.iteco.mfsm.emulator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interactions")
public class InteractionEntity {
    @Id
    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "InteractionEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
