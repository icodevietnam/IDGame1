package com.example.louisphan.idgame1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by louisphan on 11/1/2015.
 */
public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "IDGame.db";

    //Question TABLE
    public static final String QUESTION_TABLE = "question";
    public static final String QUESTION_ID = "id";
    public static final String QUESTION_NAME = "question_name";
    public static final String ANSWER_1 = "answer1";
    public static final String ANSWER_2 = "answer2";
    public static final String ANSWER_3 = "answer3";
    public static final String ANSWER_4 = "answer4";
    public static final String ANSWER_TRUE = "answer_true";
    public static final String QUESTION_IMAGE = "question_image";

    // RESULT TABLE

    public static final String RESULT_TABLE = "result";
    public static final String RESULT_ID = "id";
    public static final String RESULT_PLAYER_NAME = "player_name";
    public static final String RESULT_POINT = "point";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }


    //Create SQLite
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create table QUESTION if not exist
        db.execSQL("create table " + QUESTION_TABLE + " ( " +QUESTION_ID + " integer primary key autoincrement not null ,"+QUESTION_NAME +" text ,"+ ANSWER_1 +" text ," + ANSWER_2 + " text ,"+ANSWER_3 +" text ," +ANSWER_4 + " text ,"+ANSWER_TRUE + " text ,"+ QUESTION_IMAGE + " text )");
        //Create table RESULT if not exist
        db.execSQL("create table " + RESULT_TABLE + " ( " + RESULT_ID + " integer primary key autoincrement not null ," + RESULT_PLAYER_NAME + " text," + RESULT_POINT + " text)");
        Log.d("Init database:","Init two tables successfully");
    }

    // OnUpgrade SQLite
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " +QUESTION_TABLE);
        db.execSQL("DROP TABLE IF EXIST " +RESULT_TABLE);
        onCreate(db);
    }

    public void add17Question(){
        if(getAllQuestions().size() == 0){
            //Insert question 1
            Question question1 = new Question();
            question1.setQuestionName("What this place?");
            question1.setAnswer1("Ben Thanh Market");
            question1.setAnswer2("Ben Thanh super market");
            question1.setAnswer3("Ben Thanh");
            question1.setAnswer4("Ben Thanh store");
            question1.setAnswerTrue("1");
            question1.setImage("1");
            insertQuestion(question1);


            //Insert question 2
            Question question2 = new Question();
            question2.setQuestionName("What this place?");
            question2.setAnswer1("Dam Sen park");
            question2.setAnswer2("Ho Tay park");
            question2.setAnswer3("Suoi tien park");
            question2.setAnswer4("Ben Thanh store");
            question2.setAnswerTrue("1");
            question2.setImage("2");
            insertQuestion(question2);

            //Insert question 3
            Question question3 = new Question();
            question3.setQuestionName("What the name of food?");
            question3.setAnswer1("Pizza");
            question3.setAnswer2("Pho");
            question3.setAnswer3("Noodle");
            question3.setAnswer4("Pepper");
            question3.setAnswerTrue("2");
            question3.setImage("3");
            insertQuestion(question3);

            //Insert question 4
            Question question4 = new Question();
            question4.setQuestionName("What this place?");
            question4.setAnswer1(" Ben Thanh market");
            question4.setAnswer2("Movie Theater");
            question4.setAnswer3("Post office SaiGon");
            question4.setAnswer4("Park");
            question4.setAnswerTrue("3");
            question4.setImage("4");
            insertQuestion(question4);

            //Insert question 5
            Question question5 = new Question();
            question5.setQuestionName("What the name of fruit?");
            question5.setAnswer1("Mangosteen");
            question5.setAnswer2("Apple");
            question5.setAnswer3("Mango");
            question5.setAnswer4("Grape");
            question5.setAnswerTrue("1");
            question5.setImage("5");
            insertQuestion(question5);

            //Insert question 6
            Question question6 = new Question();
            question6.setQuestionName("Where and name of bridge?");
            question6.setAnswer1("District 8, Ong Lanh bridge");
            question6.setAnswer2("District 12, Tham Luong bridge");
            question6.setAnswer3("District 8, Chanh Hung bridge");
            question6.setAnswer4("District 7, Star bridge");
            question6.setAnswerTrue("1");
            question6.setImage("6");
            insertQuestion(question6);

            //Insert question 7
            Question question7 = new Question();
            question7.setQuestionName("What the name of event?");
            question7.setAnswer1("Mid-Autumn");
            question7.setAnswer2("Halloween");
            question7.setAnswer3("Friday Night party");
            question7.setAnswer4("Beach party");
            question7.setAnswerTrue("1");
            question7.setImage("7");
            insertQuestion(question7);

            //Insert question 8
            Question question8 = new Question();
            question8.setQuestionName("What are these?");
            question8.setAnswer1("Paper");
            question8.setAnswer2("Lanterns");
            question8.setAnswer3("Motobike");
            question8.setAnswer4("Fire");
            question8.setAnswerTrue("2");
            question8.setImage("8");
            insertQuestion(question8);

            //Insert question 9
            Question question9 = new Question();
            question9.setQuestionName("Where are these?");
            question9.setAnswer1("District 11");
            question9.setAnswer2("District 6");
            question9.setAnswer3("District 4");
            question9.setAnswer4("District 5");
            question9.setAnswerTrue("4");
            question9.setImage("9");
            insertQuestion(question9);

            //Insert question 10
            Question question10 = new Question();
            question10.setQuestionName("What the name of famous singer live in SaiGon?");
            question10.setAnswer1("Lam Truong");
            question10.setAnswer2("Justin bieber");
            question10.setAnswer3("DevuSki");
            question10.setAnswer4("Dam Vinh Hung");
            question10.setAnswerTrue("1");
            question10.setImage("10");
            insertQuestion(question10);
            //Insert question 11
            Question question11 = new Question();
            question11.setQuestionName("What the name of event?");
            question11.setAnswer1("Summer vacation");
            question11.setAnswer2("Mid- autumn");
            question11.setAnswer3("Tet holiday");
            question11.setAnswer4("Noel");
            question11.setAnswerTrue("3");
            question11.setImage("11");
            insertQuestion(question11);

            //Insert question 12
            Question question12 = new Question();
            question12.setQuestionName("What the name of food?");
            question12.setAnswer1("Pumkin");
            question12.setAnswer2("Candy");
            question12.setAnswer3("Porn cake");
            question12.setAnswer4("Cake");
            question12.setAnswerTrue("3");
            question12.setImage("12");
            insertQuestion(question12);

            //Insert question 13
            Question question13 = new Question();
            question13.setQuestionName("Where this place?");
            question13.setAnswer1("Municipal Theater, Sai Gon");
            question13.setAnswer2("Opera theater, Ha Noi");
            question13.setAnswer3("Opera theater, Sai Gon");
            question13.setAnswer4("Park, Ha Noi");
            question13.setAnswerTrue("1");
            question13.setImage("13");
            insertQuestion(question13);

            //Insert question 14
            Question question14 = new Question();
            question14.setQuestionName("Where this place?");
            question14.setAnswer1("Opera theater, Sai Gon");
            question14.setAnswer2("Post office SaiGon");
            question14.setAnswer3("Duc Ba church, Sai Gon");
            question14.setAnswer4("Parkson, SaiGon");
            question14.setAnswerTrue("3");
            question14.setImage("14");
            insertQuestion(question14);

            //Insert question 15
            Question question15 = new Question();
            question15.setQuestionName("What country was built church?");
            question15.setAnswer1("Japan");
            question15.setAnswer2("Usa");
            question15.setAnswer3("VietNam");
            question15.setAnswer4("France");
            question15.setAnswerTrue("4");
            question15.setImage("15");
            insertQuestion(question15);

            //Insert question 16
            Question question16 = new Question();
            question16.setQuestionName("How many km2 at district 10");
            question16.setAnswer1("6");
            question16.setAnswer2("50");
            question16.setAnswer3("114");
            question16.setAnswer4("5");
            question16.setAnswerTrue("1");
            question16.setImage("16");
            insertQuestion(question16);

            //Insert question 17
            Question question17 = new Question();
            question17.setQuestionName("How many km2 in SaiGon?");
            question17.setAnswer1("2.095,6");
            question17.setAnswer2("2.095,5");
            question17.setAnswer3("2.090,1");
            question17.setAnswer4("2.095,9");
            question17.setAnswerTrue("1");
            question17.setImage("17");
            insertQuestion(question17);

            Log.d("Insert question","Thanh cong tuyet doi");
        }
        else {
            Log.d("Insert question", "Du lieu da ton tai");
        }
    }

    // Insert question
    public boolean insertQuestion(Question question){
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(QUESTION_NAME,question.getQuestionName());
            contentValues.put(ANSWER_1,question.getAnswer1());
            contentValues.put(ANSWER_2,question.getAnswer2());
            contentValues.put(ANSWER_3,question.getAnswer3());
            contentValues.put(ANSWER_4,question.getAnswer4());
            contentValues.put(ANSWER_TRUE, question.getAnswerTrue());
            contentValues.put(QUESTION_IMAGE,question.getImage());
            db.insert(QUESTION_TABLE,null,contentValues);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    // Insert Result
    public boolean insertResult(String playerName,String point){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RESULT_PLAYER_NAME, playerName);
        contentValues.put(RESULT_POINT, point);
        db.insert(RESULT_TABLE, null, contentValues);
        return true;
    }


    //Update question
    public boolean updateQuestion(Integer id,String questionName,String answer1,String answer2,String answer3,String answer4,String answerTrue,String city){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(QUESTION_NAME,questionName);
        contentValues.put(ANSWER_1,answer1);
        contentValues.put(ANSWER_2,answer2);
        contentValues.put(ANSWER_3,answer3);
        contentValues.put(ANSWER_4,answer4);
        contentValues.put(ANSWER_TRUE,answerTrue);
        db.update(QUESTION_TABLE,contentValues,QUESTION_ID + " = ? ",new String[]{Integer.toString(id)});
        return true;
    }

    // Update result
    public boolean updateResult(Integer id,String playerName,String point){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RESULT_PLAYER_NAME, playerName);
        contentValues.put(RESULT_POINT, point);
        db.update(RESULT_TABLE, contentValues, RESULT_ID + " = ? ", new String[]{Integer.toString(id)});
        return true;
    }



    // Delete question by id
    public Integer deleteQuestion(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(QUESTION_TABLE,QUESTION_ID + " = ? ",new String[]{Integer.toString(id)});
    }

    // Delete result by id
    public Integer deleteResult(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(RESULT_TABLE,RESULT_ID + " = ? ",new String[]{Integer.toString(id)});
    }



    //Get All Questions
    public ArrayList<Question> getAllQuestions(){
        ArrayList<Question> allQuestions = new ArrayList<Question>();
        //Create new HashMap
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from " +QUESTION_TABLE,null);
        cursor.moveToFirst();

        while (cursor.isAfterLast() == false){
            Integer id = cursor.getInt(cursor.getColumnIndex(QUESTION_ID));
            String questionName = cursor.getString(cursor.getColumnIndex(QUESTION_NAME));
            String answer1 = cursor.getString(cursor.getColumnIndex(ANSWER_1));
            String answer2 = cursor.getString(cursor.getColumnIndex(ANSWER_2));
            String answer3 = cursor.getString(cursor.getColumnIndex(ANSWER_3));
            String answer4 = cursor.getString(cursor.getColumnIndex(ANSWER_4));
            String answerTrue = cursor.getString(cursor.getColumnIndex(ANSWER_TRUE));
            String questionImage = cursor.getString(cursor.getColumnIndex(QUESTION_IMAGE));
            Question question = new Question();
            question.setId(id);
            question.setQuestionName(questionName);
            question.setAnswer1(answer1);
            question.setAnswer2(answer2);
            question.setAnswer3(answer3);
            question.setAnswer4(answer4);
            question.setAnswerTrue(answerTrue);
            question.setImage(questionImage);
            allQuestions.add(question);
            cursor.moveToNext();
        }
        Log.d("Size Of Question",allQuestions.size() +"");
        return allQuestions;
    }

    //Get All Results
    public ArrayList<Point> getAllResults(){
        ArrayList<Point> allResults = new ArrayList<Point>();
        //Create new HashMap
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from " +RESULT_TABLE,null);
        cursor.moveToFirst();

        while (cursor.isAfterLast() == false){
            Integer id = cursor.getInt(cursor.getColumnIndex(RESULT_ID));
            String playerName  = cursor.getString(cursor.getColumnIndex(RESULT_PLAYER_NAME));
            String point = cursor.getString(cursor.getColumnIndex(RESULT_POINT));
            Point result = new Point();
            result.setId(id);
            result.setPlayerName(playerName);
            result.setPoint(point);
            allResults.add(result);
            cursor.moveToNext();
        }
        return allResults;
    }

    public Question getQuestionData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(" select * from " + QUESTION_TABLE + " where id = " + id + "", null);
        cursor.moveToFirst();
        Question question = new Question();
        question.setId(cursor.getInt(cursor.getColumnIndex(QUESTION_ID)));
        question.setQuestionName(cursor.getString(cursor.getColumnIndex(QUESTION_NAME)));
        question.setImage(cursor.getString(cursor.getColumnIndex(QUESTION_IMAGE)));
        question.setAnswerTrue(cursor.getString(cursor.getColumnIndex(ANSWER_TRUE)));
        question.setAnswer1(cursor.getString(cursor.getColumnIndex(ANSWER_1)));
        question.setAnswer2(cursor.getString(cursor.getColumnIndex(ANSWER_2)));
        question.setAnswer3(cursor.getString(cursor.getColumnIndex(ANSWER_3)));
        question.setAnswer4(cursor.getString(cursor.getColumnIndex(ANSWER_4)));
        return question;
    }


    public Cursor getResultData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(" select * from " + RESULT_TABLE + " where id = " + id + "",null);
        return cursor;
    }

}
