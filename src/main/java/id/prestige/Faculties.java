package id.prestige;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String created;

    public Faculties() {}
    public Faculties(String name, String created) {
        this.setName(name);
        this.setCreated(created);
    }
    public Faculties(int id, String name, String created) {
        this.setId(id);
        this.setName(name);
        this.setCreated(created);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreated(String created) {
        this.created = created;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created='" + created + '\'' +
                "}";
    }
}
