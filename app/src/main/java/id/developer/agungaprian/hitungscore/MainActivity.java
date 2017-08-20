package id.developer.agungaprian.hitungscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.plus_3_a)
    Button plus3TeamA;
    @Bind(R.id.plus_2_a)
    Button plus2TeamA;
    @Bind(R.id.plus_1_a)
    Button  freeThrowTeamA;

    @Bind(R.id.plus_3_b)
    Button plus3TeamB;
    @Bind(R.id.plus_2_b)
    Button plus2TeamB;
    @Bind(R.id.plus_1_b)
    Button freeThrowTeamB;

    @Bind(R.id.team_a)
    TextView namaTeamA;
    @Bind(R.id.team_b)
    TextView namaTeamB;

    private Button resetScore;
    private TextView scoreTeamA , scoreTeamB;

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        resetScore = (Button)findViewById(R.id.reset);

        scoreTeamA = (TextView)findViewById(R.id.score_team_a);
        scoreTeamB = (TextView)findViewById(R.id.score_team_b);

        //set reset button to 0 value
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreTeamA.setText(String.valueOf(scoreA));
                scoreTeamB.setText(String.valueOf(scoreB));
            }
        });

        //display nama team
        Bundle bundle = getIntent().getExtras();
        namaTeamA.setText((CharSequence) bundle.get("team_a"));
        namaTeamB.setText((CharSequence) bundle.get("team_b"));

        setScoreTeamA();
        setScoreTeamB();
    }

    //set score a button
    public void setScoreTeamA (){
        plus3TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 3
                scoreA = scoreA + 3;
                //tampilkan score
                scoreTeamA.setText(String.valueOf(scoreA));
            }
        });

        plus2TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 2
                scoreA = scoreA + 2;
                //tampilkan score
                scoreTeamA.setText(String.valueOf(scoreA));
            }
        });

        freeThrowTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 3
                scoreA++;
                //tampilkan score
                scoreTeamA.setText(String.valueOf(scoreA));
            }
        });
    }

    //set score b button
    public void setScoreTeamB (){
        plus3TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 3
                scoreA = scoreA + 3;
                //tampilkan score
                scoreTeamB.setText(String.valueOf(scoreA));
            }
        });

        plus2TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 2
                scoreA = scoreA + 2;
                //tampilkan score
                scoreTeamB.setText(String.valueOf(scoreA));
            }
        });

        freeThrowTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tambah score jadi 3
                scoreA++;
                //tampilkan score
                scoreTeamB.setText(String.valueOf(scoreA));
            }
        });
    }
}
