package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore=0;
    int teamARedCards=0;
    int teamAYellowCards=0;
    int teamAFouls=0;
    int teamBScore=0;
    int teamBRedCards=0;
    int teamBYellowCards=0;
    int teamBFouls=0;

    public void printScoreA(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamASc);
        ta.setText(String.valueOf(score));
    }

    public void printYellowA(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamAYellow);
        ta.setText(String.valueOf(score));
    }

    public void printRedA(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamARed);
        ta.setText(String.valueOf(score));
    }
    public void printFoulA(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamAFoul);
        ta.setText(String.valueOf(score));
    }



    public void printScoreB(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamBSc);
        ta.setText(String.valueOf(score));
    }
    public void printYellowB(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamBYellow);
        ta.setText(String.valueOf(score));
    }
    public void printRedB(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamBRed);
        ta.setText(String.valueOf(score));
    }
    public void printfoulB(int score)
    {
        TextView ta=(TextView) findViewById(R.id.teamBFoul);
        ta.setText(String.valueOf(score));
    }


    public void teamAGoal(View v)
    {
        teamAScore += 1;
        printScoreA(teamAScore);
    }

    public void teamAyellowCard(View v)
    {
        teamAYellowCards += 1;
        printYellowA(teamAYellowCards);
    }

    public void teamARedCard(View v)
    {
        teamARedCards += 1;
        printRedA(teamARedCards);
    }
    public void teamAFoul(View v)
    {
        teamAFouls += 1;
        printFoulA(teamAFouls);
    }




    public void teamBGoal(View v)
    {
        teamBScore += 1;
        printScoreB(teamBScore);
    }
    public void teamAByellowCard(View v)
    {
        teamBYellowCards += 1;
        printYellowB(teamBYellowCards);
    }

    public void teamBRedCard(View v)
    {
        teamBRedCards += 1;
        printRedB(teamBRedCards);
    }
    public void TeamBFouls(View v)
    {
        teamBFouls += 1;
        printfoulB(teamBFouls);
    }



    public void resetScore(View v){


        teamAScore=0;
        teamARedCards=0;
        teamAYellowCards=0;
        teamAFouls=0;
        teamBScore=0;
        teamBRedCards=0;
        teamBYellowCards=0;
        teamBFouls=0;

        printScoreA(teamAScore);
        printYellowA(teamAYellowCards);
        printRedA(teamARedCards);
        printFoulA(teamAFouls);

        printScoreB(teamBScore);
        printYellowB(teamBYellowCards);
        printRedB(teamBRedCards);
        printfoulB(teamBFouls);

    }


}
