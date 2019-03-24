package id.prestige;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Majors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int id_faculty;
    private String created;

    public Majors() {}
    public Majors(String name, int id_faculty, String created) {
        this.setId(id);
        this.setName(name);
        this.setIdFaculty(id_faculty);
        this.setCreated(created);
    }
    public Majors(int id, String name, int id_faculty, String created) {
        this.setId(id);
        this.setName(name);
        this.setIdFaculty(id_faculty);
        this.setCreated(created);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdFaculty(int id_faculty) {
        this.id_faculty = id_faculty;
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
    public int getId_faculty() {
        return id_faculty;
    }
    public String getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_faculty='" + id_faculty + '\'' +
                ", created='" + created + '\'' +
                "}";
    }
}
