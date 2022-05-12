package com.cabarcalab.mytask.entity;

import java.util.Date;

public class Task {

    private Long id;
    private String name;
    private String description;
    private Date create;
    private Date lastUpdate;
    private Boolean isDone;
    private Long userId;

    public Task() {}

    public Task(Long id, String name, String description, Date create, Date lastUpdate, Long userId, Boolean isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
        this.lastUpdate = lastUpdate;
        this.isDone = isDone;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
