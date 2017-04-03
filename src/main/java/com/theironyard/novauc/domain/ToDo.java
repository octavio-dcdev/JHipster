package com.theironyard.novauc.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ToDo.
 */
@Entity
@Table(name = "to_do")
public class ToDo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "name_college")
    private String nameCollege;

    @Column(name = "pursue_mba")
    private String pursueMBA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public ToDo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNameCollege() {
        return nameCollege;
    }

    public ToDo nameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
        return this;
    }

    public void setNameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
    }

    public String getPursueMBA() {
        return pursueMBA;
    }

    public ToDo pursueMBA(String pursueMBA) {
        this.pursueMBA = pursueMBA;
        return this;
    }

    public void setPursueMBA(String pursueMBA) {
        this.pursueMBA = pursueMBA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ToDo toDo = (ToDo) o;
        if (toDo.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, toDo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ToDo{" +
            "id=" + id +
            ", firstName='" + firstName + "'" +
            ", nameCollege='" + nameCollege + "'" +
            ", pursueMBA='" + pursueMBA + "'" +
            '}';
    }
}
