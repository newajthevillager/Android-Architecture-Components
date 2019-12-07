package com.example.movies.viewmodels;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.movies.Rooms.PlayerDao;
import com.example.movies.Rooms.PlayerDatabase;
import com.example.movies.models.Player;

import java.util.List;

public class PlayersViewModel extends AndroidViewModel {

    PlayerDao playerDao;
    private PlayerDatabase playerRoomDatabase;

    public PlayersViewModel(@NonNull Application application) {
        super(application);

        playerRoomDatabase = PlayerDatabase.getDatabase(application);
        playerDao = playerRoomDatabase.playerDao();
    }

    public void addPlayer(Player player) {
        new InsertAsyncTask(playerDao).execute(player);
    }

    public LiveData<List<Player>> showAllPlayers() {
        return playerDao.getAllPlayers();
    }

    private class InsertAsyncTask extends AsyncTask<Player, Void, Void> {

        PlayerDao playerDao;

        public InsertAsyncTask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Player... players) {
            playerDao.insertPlayer(players[0]);
            return null;
        }
    }

}
