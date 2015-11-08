package com.example.louisphan.idgame1;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DBHelper(this);
        myDb.add17Question();
        Button btnGuide = (Button)this.findViewById(R.id.btnGuide);
        Button btnPlay = (Button)this.findViewById(R.id.btnPlay);
        Button btnExit = (Button)this.findViewById(R.id.btnExit);
        final MediaPlayer mp =  MediaPlayer.create(this,R.raw.rongvang);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ArrayList<Question> allQuestions = myDb.getAllQuestions();
                ArrayList<Integer> listId = new ArrayList<Integer>();
            for(Question question : allQuestions){
                    listId.add(question.getId());
                }
                Intent intent = new Intent(MainActivity.this,PlayActivity.class);
                Collections.shuffle(listId);
                intent.putIntegerArrayListExtra("listId", listId);
                intent.putExtra("countQuestion", "0");
                intent.putExtra("point", "0");
                startActivity(intent);
                finish();
            }
        });

        btnGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Choose the right answer and get your point";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        //Log.d("Question name:",myDb.getAllQuestions().get(0).getQuestionName());
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    private DBHelper myDb;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
