package id.prestige;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int id_user;
    private String name;
    private String serial;
    private int id_class;
    private String created;
    private String updated;

    public Students() {}
    public Students(int id_user, String name, String serial, int id_class, String created, String updated) {
        this.setIdUser(id_user);
        this.setName(name);
        this.setSerial(serial);
        this.setIdClass(id_class);
        this.setCreated(created);
        this.setUpdated(updated);
    }
    public Students(int id, int id_user, String name, String serial, int id_class, String created, String updated) {
        this.setId(id);
        this.setIdUser(id_user);
        this.setName(name);
        this.setSerial(serial);
        this.setIdClass(id_class);
        this.setCreated(created);
        this.setUpdated(updated);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public void setIdClass(int id_class) {
        this.id_class = id_class;
    }
    public void setCreated(String created) {
        this.created = created;
    }
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getId() {
        return id;
    }
    public int getId_user() {
        return id_user;
    }
    public String getName() {
        return name;
    }
    public String getSerial() {
        return serial;
    }
    public int getId_class() {
        return id_class;
    }
    public String getCreated() {
        return created;
    }
    public String getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", name='" + name + '\'' +
                ", serial='" + serial + '\'' +
                ", id_class=" + id_class +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                "}";
    }

}
