package id.prestige;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int batch;
    private int id_major;
    private String name;
    private String created;

    public Classes() {}
    public Classes(int batch, int id_major, String name, String created) {
        this.setBatch(batch);
        this.setIdMajor(id_major);
        this.setName(name);
        this.setCreated(created);
    }
    public Classes(int id, int batch, int id_major, String name, String created) {
        this.setId(id);
        this.setBatch(batch);
        this.setIdMajor(id_major);
        this.setName(name);
        this.setCreated(created);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }
    public void setIdMajor(int id_major) {
        this.id_major = id_major;
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
    public int getBatch() {
        return batch;
    }
    public int getId_major() {
        return id_major;
    }
    public String getName() {
        return name;
    }
    public String getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", batch=" + batch +
                ", id_major=" + id_major +
                ", name='" + name + '\'' +
                ", created='" + created + '\'';
    }

}
