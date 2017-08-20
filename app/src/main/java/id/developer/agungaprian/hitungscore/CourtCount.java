package id.developer.agungaprian.hitungscore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CourtCount extends AppCompatActivity {
    @Bind(R.id.start_button)
    Button startTheGame;
    @Bind(R.id.nama_team_a)
    EditText namaTeamA;
    @Bind(R.id.nama_team_b)
    EditText namaTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_count);

        ButterKnife.bind(this);

        startTheGame();
    }

    public void startTheGame(){
        startTheGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourtCount.this,MainActivity.class);
                intent.putExtra("team_a",String.valueOf(namaTeamA.getText().toString().trim()));
                intent.putExtra("team_b",String.valueOf(namaTeamB.getText().toString().trim()));

                startActivity(intent);
            }
        });
    }
}
