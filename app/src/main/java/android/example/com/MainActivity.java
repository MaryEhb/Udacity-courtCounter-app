package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    int scoreTeamA = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneTeamA(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoTeamA(View view){
        scoreTeamA+= 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View view){
        scoreTeamA+= 3;
        displayForTeamA(scoreTeamA);
    }

    int scoreTeamB = 0;

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneTeamB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoTeamB(View view){
        scoreTeamB+= 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View view){
        scoreTeamB+= 3;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}