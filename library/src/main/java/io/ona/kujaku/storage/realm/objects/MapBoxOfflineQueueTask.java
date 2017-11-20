package io.ona.kujaku.storage.realm.objects;

import android.support.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jason Rogena - jrogena@ona.io on 11/17/17.
 */

public class MapBoxOfflineQueueTask extends RealmObject {
    @PrimaryKey
    private String id = UUID.randomUUID().toString();
    private String taskType;
    private String packageName;
    private int taskStatus;
    private String task;
    private Date dateCreated;
    private Date dateUpdated;

    public String getId() {
        return id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public JSONObject getTask() throws JSONException {
        return new JSONObject(task);
    }

    public void setTask(@NonNull JSONObject task) {
        this.task = task.toString();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
