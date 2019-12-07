package com.example.movies.views;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.movies.R;
import com.example.movies.adapters.PlayersAdapter;
import com.example.movies.models.Player;
import com.example.movies.viewmodels.PlayersViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class PlayersActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    public static final int ADD_PLAYER = 1;
    public static final String NEW_PLAYER = "New_Player";
    PlayersViewModel playersViewModel;
    PlayersAdapter playersAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        recyclerView = findViewById(R.id.rvPlayers);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        floatingActionButton = findViewById(R.id.fab);
        playersViewModel = ViewModelProviders.of(this).get(PlayersViewModel.class);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayersActivity.this, NewPlayerActivity.class);
                startActivityForResult(intent, ADD_PLAYER);
            }
        });

        playersViewModel.showAllPlayers().observe(this, new Observer<List<Player>>() {
            @Override
            public void onChanged(List<Player> players) {
                playersAdapter = new PlayersAdapter(players);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(playersAdapter);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Player player = (Player) data.getSerializableExtra(NEW_PLAYER);
            playersViewModel.addPlayer(player);
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error!!", Toast.LENGTH_SHORT).show();
        }
    }
}
