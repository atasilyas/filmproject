package com.pounds.io.assignment.filmproject.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@MappedSuperclass
@EqualsAndHashCode(of = {"id", "version"})
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * version of the entity
     */
    @Version
    private Integer version;
    /**
     * created time of the entity
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    /**
     * create user of the entity
     */
    @CreatedBy
    private String createUser = "LOCAL_USER";

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    private String updateUser = "LOCAL_USER";
    private String updateUserIP;


    @PreUpdate
    private void setUpdateTime() {
        this.updateTime = new Date();
    }

}
