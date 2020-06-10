package com.yangsan.lifecycle.entity.senior;

public class LifeCycleTask{

    private String guid;

    private String sql;

    public LifeCycleTask(String guid, String sql) {
        this.guid = guid;
        this.sql = sql;
    }

    public LifeCycleTask() {
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "LifeCycleTask{" +
                "guid='" + guid + '\'' +
                ", sql='" + sql + '\'' +
                ", time='" + System.currentTimeMillis() + '\'' +
                '}';
    }
}
