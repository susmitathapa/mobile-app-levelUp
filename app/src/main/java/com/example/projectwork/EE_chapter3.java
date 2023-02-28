package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EE_chapter3 extends AppCompatActivity implements View.OnClickListener{
    TextView totalQuestions, question;
    Button ansA, ansB, ansC, ansD, submit_btn;

    int score=0;
    int totalQn= EE_QA3.question.length;
    int currentQuestionIndex=0;
    String selectedAnswer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee_chapter3);

        totalQuestions=findViewById(R.id.totalQuestions);
        question= findViewById(R.id.question);
        ansA= findViewById(R.id.ans_A);
        ansB= findViewById(R.id.ans_B);
        ansC= findViewById(R.id.ans_C);
        ansD= findViewById(R.id.ans_D);
        submit_btn= findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submit_btn.setOnClickListener(this);

        totalQuestions.setText("Total questions :"+totalQn);

        //to load qn and ans
        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);
        Button clickedButton = (Button) view;
        if (clickedButton.getId()==R.id.submit_btn){

            if (selectedAnswer.equals(EE_QA3.correctAnswers[currentQuestionIndex])){
                score++;
            }
            //increase the score if correct ans
            currentQuestionIndex++;
            //submit btn clicked, load new qn
            loadNewQuestion();


        }else{
            //choices clicked, check correct option
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }
    }

    void loadNewQuestion(){
        if (currentQuestionIndex == totalQn){
            finishQuiz();
            return;
        }

        question.setText(EE_QA3.question[currentQuestionIndex]);
        ansA.setText(EE_QA3.choices[currentQuestionIndex][0]);
        ansB.setText(EE_QA3.choices[currentQuestionIndex][1]);
        ansC.setText(EE_QA3.choices[currentQuestionIndex][2]);
        ansD.setText(EE_QA3.choices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus = "";
        if (score > totalQn*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQn)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .show();
    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
}