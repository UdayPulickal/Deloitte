package com.codetest.todolist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

    @Id
    Integer userid;
    String username;
    String description;
    String is_done;
    String target_date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String DESCRIPTION) {
        this.description = DESCRIPTION;
    }

    public String getIs_done() {
        return is_done;
    }

    public void setIs_done(String is_done) {
        this.is_done = is_done;
    }

    public String getTarget_date() {
        return target_date;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setTarget_date(String target_date) {
        this.target_date = target_date;
    }

    @Override
    public String toString() {
        return "{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", is_done='" + is_done + '\'' +
                ", target_date='" + target_date + '\'' +
                '}';
    }
}
