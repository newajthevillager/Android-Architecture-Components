package com.example.movies.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity(tableName = "players")
public class Player implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @NonNull
    private int id;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @NonNull
    @ColumnInfo(name = "age")
    private int age;

    @NonNull
    @ColumnInfo(name = "country")
    private String country;

    @NonNull
    @ColumnInfo(name = "discipline")
    private String discipline;

    public Player(String name, int age, String country, String discipline) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.discipline = discipline;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public int getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public int getAge() {
        return age;
    }

    @NonNull
    public String getCountry() {
        return country;
    }

    @NonNull
    public String getDiscipline() {
        return discipline;
    }

}




