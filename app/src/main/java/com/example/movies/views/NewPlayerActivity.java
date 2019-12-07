package com.example.movies.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.movies.R;
import com.example.movies.models.Player;

import java.io.Serializable;

public class NewPlayerActivity extends AppCompatActivity {

    EditText nameEt, ageEt, countryEt, disciplineEt;
    Button saveBtn;
    String name, country, discipline;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_player);

        nameEt = findViewById(R.id.etName);
        ageEt = findViewById(R.id.etAge);
        countryEt = findViewById(R.id.etCountry);
        disciplineEt = findViewById(R.id.etDiscipline);
        saveBtn = findViewById(R.id.btnSave);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                name = nameEt.getText().toString();
                country = countryEt.getText().toString();
                discipline = disciplineEt.getText().toString();
                age = Integer.parseInt(ageEt.getText().toString());

                if (TextUtils.isEmpty(nameEt.getText().toString())) {
                    nameEt.setError("Name Cant be Empty");
                } else {
                    Player player = new Player(name, age, country, discipline);
                    intent.putExtra(PlayersActivity.NEW_PLAYER, player);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });

    }
}
