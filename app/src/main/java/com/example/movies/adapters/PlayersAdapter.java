package com.example.movies.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.models.Player;

import java.util.List;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayersViewHolder> {

    List<Player> players;

    public PlayersAdapter(List<Player> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public PlayersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_item, parent, false);
        return new PlayersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayersViewHolder holder, int position) {
        Player player = players.get(position);
        holder.setData(player);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    class PlayersViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv, ageTv, countryTv, disciplineTv;

        public PlayersViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTv = itemView.findViewById(R.id.tvName);
            ageTv = itemView.findViewById(R.id.tvAge);
            countryTv = itemView.findViewById(R.id.tvNationality);
            disciplineTv = itemView.findViewById(R.id.tvDiscipline);
        }

        public void setData(Player player) {
            nameTv.setText("Name :" + player.getName());
            ageTv.setText("Age :" + String.valueOf(player.getAge()));
            countryTv.setText("Country :" + player.getCountry());
            disciplineTv.setText("Discipline :" + player.getDiscipline());
        }

    }

}
