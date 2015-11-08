package com.example.louisphan.idgame1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayActivity extends AppCompatActivity {

    private DBHelper myDb;
    private ArrayList<Integer> listId;
    private Integer point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        myDb = new DBHelper(this);
        Intent intent = getIntent();
        final Integer countQuestion = Integer.parseInt(intent.getStringExtra("countQuestion"));
        point = Integer.parseInt(intent.getStringExtra("point"));
        listId = intent.getIntegerArrayListExtra("listId");
        TextView questionTitle = (TextView)this.findViewById(R.id.questionTitle);
        TextView questionName = (TextView)this.findViewById(R.id.questionName);

        Button btnNext = (Button) this.findViewById(R.id.btnNext);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.yeah);

        final RadioButton answer1 = (RadioButton)this.findViewById(R.id.answer1);
        final RadioButton answer2 = (RadioButton)this.findViewById(R.id.answer2);
        final RadioButton answer3 = (RadioButton)this.findViewById(R.id.answer3);
        final RadioButton answer4 = (RadioButton)this.findViewById(R.id.answer4);
        questionTitle.setText("Question " + (countQuestion + 1) + " :");
        ImageView questionImage = (ImageView)this.findViewById(R.id.questionImage);

        TextView textPoint = (TextView)this.findViewById(R.id.textPoint);
        textPoint.setText("Your score: " + point );

        final Question question = myDb.getQuestionData(listId.get(countQuestion));
        questionName.setText(question.getQuestionName());
        //questionImage.setImageResource(R.drawable.a1);
        if(question.getImage().equalsIgnoreCase("1")){
            questionImage.setImageResource(R.drawable.a1);
        }else if(question.getImage().equalsIgnoreCase("2")){
            questionImage.setImageResource(R.drawable.a2);
        }else if(question.getImage().equalsIgnoreCase("3")){
            questionImage.setImageResource(R.drawable.a3);
        }
        else if(question.getImage().equalsIgnoreCase("4")){
            questionImage.setImageResource(R.drawable.a4);
        }
        else if(question.getImage().equalsIgnoreCase("5")){
            questionImage.setImageResource(R.drawable.a5);
        }
        else if(question.getImage().equalsIgnoreCase("6")){
            questionImage.setImageResource(R.drawable.a6);
        }
        else if(question.getImage().equalsIgnoreCase("7")){
            questionImage.setImageResource(R.drawable.a7);
        }
        else if(question.getImage().equalsIgnoreCase("8")){
            questionImage.setImageResource(R.drawable.a8);
        }
        else if(question.getImage().equalsIgnoreCase("9")){
            questionImage.setImageResource(R.drawable.a9);
        }
        else if(question.getImage().equalsIgnoreCase("10")){
            questionImage.setImageResource(R.drawable.a10);
        }
        else if(question.getImage().equalsIgnoreCase("11")){
            questionImage.setImageResource(R.drawable.a11);
        }
        else if(question.getImage().equalsIgnoreCase("12")){
            questionImage.setImageResource(R.drawable.a12);
        }
        else if(question.getImage().equalsIgnoreCase("13")){
            questionImage.setImageResource(R.drawable.a13);
        }
        else if(question.getImage().equalsIgnoreCase("14")){
            questionImage.setImageResource(R.drawable.a14);
        }else if(question.getImage().equalsIgnoreCase("15")){
            questionImage.setImageResource(R.drawable.a15);
        }else if(question.getImage().equalsIgnoreCase("16")){
            questionImage.setImageResource(R.drawable.a16);
        }else {
            questionImage.setImageResource(R.drawable.a17);
        }
        answer1.setChecked(true);
        answer1.setText(question.getAnswer1());
        answer2.setText(question.getAnswer2());
        answer3.setText(question.getAnswer3());
        answer4.setText(question.getAnswer4());

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberQuestion = countQuestion + 1;
                if(numberQuestion <10){
                    if(question.getAnswerTrue().equalsIgnoreCase("1") && answer1.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("2") && answer2.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("3") && answer3.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("4") && answer4.isChecked()){
                        point+=10;
                        mp.start();
                    }

                    Intent intent = new Intent(PlayActivity.this,PlayActivity.class);
                    intent.putIntegerArrayListExtra("listId", listId);
                    intent.putExtra("countQuestion", numberQuestion + "");
                    intent.putExtra("point", point + "");
                    startActivity(intent);
                    finish();
                }
                else{
                    if(question.getAnswerTrue().equalsIgnoreCase("1") && answer1.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("2") && answer2.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("3") && answer3.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    if(question.getAnswerTrue().equalsIgnoreCase("4") && answer4.isChecked()){
                        point+=10;
                        mp.start();
                    }
                    Intent intent = new Intent(PlayActivity.this,ResultActivity.class);
                    intent.putExtra("point",point + "");
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
