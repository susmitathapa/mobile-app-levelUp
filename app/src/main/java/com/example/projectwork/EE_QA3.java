package com.example.projectwork;

public class EE_QA3 {
    //array of strings for questions
    public static String question[]={
            "What is the time value of money?",
            "Which of the following factors affects the time value of money?",
            "What is present value?",
            "What is the formula for calculating the future value of a lump sum?",
            "What is the difference between annuities and perpetuities?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"The idea that money loses value over time due to inflation.","The idea that money gains value over time due to compound interest.","The idea that money has the same value regardless of when it is received or paid.","The idea that money has a greater value when it is received sooner rather than later."},
            {"The amount of money involved","The interest rate","The length of time involved","All of the above"},
            {"The value of a sum of money in the future, adjusted for inflation.","The value of a sum of money today, adjusted for inflation.","The value of a sum of money in the future, not adjusted for inflation.","The value of a sum of money today, not adjusted for inflation."},
            {"FV = PV x (1 + i)^n","FV = PV / (1 + i)^n","FV = PV + (1 + i)^n"," FV = PV - (1 + i)^n"},
            {"An annuity has a finite number of payments, while a perpetuity has an infinite number of payments.","An annuity has an infinite number of payments, while a perpetuity has a finite number of payments."," An annuity has a fixed payment amount, while a perpetuity has a variable payment amount.","An annuity has a variable payment amount, while a perpetuity has a fixed payment amount."}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "The idea that money has a greater value when it is received sooner rather than later.",
            "All of the above",
            "The value of a sum of money today, adjusted for inflation.",
            "FV = PV x (1 + i)^n",
            "An annuity has a finite number of payments, while a perpetuity has an infinite number of payments."
    };
}
