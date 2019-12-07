package com.example.movies.Rooms;


import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.movies.models.Player;

@Database(entities = Player.class, version = 1)
public abstract class PlayerDatabase extends RoomDatabase {

    public abstract PlayerDao playerDao();

    private static volatile PlayerDatabase noteRoomInstance;

    public static PlayerDatabase getDatabase(final Context context) {
        if (noteRoomInstance == null) {
            synchronized (PlayerDatabase.class) {
                noteRoomInstance = Room.databaseBuilder(context.getApplicationContext(),
                        PlayerDatabase.class, "note_database")
                        .build();
            }
        }
        return noteRoomInstance;
    }

}
