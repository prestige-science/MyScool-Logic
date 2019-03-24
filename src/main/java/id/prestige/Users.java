package id.prestige;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private int status;
    private String created_at;
    private String updated_at;

    public Users() {}
    public Users(String username, String password, int status, String created_at, String updated_at) {
        this.setUsername(username);
        this.setPassword(password);
        this.setStatus(status);
        this.setCreatedAt(created_at);
        this.setUpdatedAt(updated_at);
    }
    public Users(int id, String username, String password, int status, String created_at, String updated_at) {
        this.setId(id);
        this.setUsername(username);
        this.setPassword(password);
        this.setStatus(status);
        this.setCreatedAt(created_at);
        this.setUpdatedAt(updated_at);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }
    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getStatus() {
        return status;
    }
    public String getCreated_at() {
        return created_at;
    }
    public String getUpdated_at() {
        return updated_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                "}";
    }

}
