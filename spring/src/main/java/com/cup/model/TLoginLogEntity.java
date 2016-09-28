package com.cup.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by reifurther on 16/9/23.
 */
@Entity
@Table(name = "t_login_log", schema = "sampledb")
public class TLoginLogEntity {
    private int loginLogId;
    private Integer userId;
    private String ip;
    private Date loginDatetime;

    @Id
    @Column(name = "login_log_id", nullable = false)
    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ip", nullable = true, length = 32)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "login_datetime", nullable = true)
    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TLoginLogEntity that = (TLoginLogEntity) o;

        if (loginLogId != that.loginLogId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (loginDatetime != null ? !loginDatetime.equals(that.loginDatetime) : that.loginDatetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loginLogId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (loginDatetime != null ? loginDatetime.hashCode() : 0);
        return result;
    }
}
