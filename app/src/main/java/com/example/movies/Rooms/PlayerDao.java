package com.example.movies.Rooms;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.movies.models.Player;

import java.util.List;

@Dao
public interface PlayerDao {

    @Insert
    void insertPlayer(Player player);

    @Query("SELECT * FROM players")
    LiveData<List<Player>> getAllPlayers();

}
