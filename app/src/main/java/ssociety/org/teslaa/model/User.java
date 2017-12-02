package ssociety.org.teslaa.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by seb on 2/12/17.
 */

@Entity
public class User {

    @Id
    private Long Id;
    @NotNull
    private String token;
    @NotNull
    private String login;
    @NotNull
    private Boolean valid;
    @Generated(hash = 1942086493)
    public User(Long Id, @NotNull String token, @NotNull String login,
            @NotNull Boolean valid) {
        this.Id = Id;
        this.token = token;
        this.login = login;
        this.valid = valid;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getToken() {
        return this.token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public Boolean getValid() {
        return this.valid;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
