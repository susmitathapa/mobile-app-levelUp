package com.example.projectwork;

public class CN_QA2 {
    //array of strings for questions
    public static String question[]={
            "Which of the following reference models is used for Internet communication?",
            "Which of the following layers in the OSI reference model is responsible for establishing, maintaining and terminating connections between applications?",
            "Which of the following layers in the TCP/IP reference model is responsible for routing and forwarding data between networks?",
            "Which of the following reference models has only three layers?",
            "Which of the following layers in the OSI reference model is responsible for translating data from one format to another?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"OSI reference model","TCP/IP reference model","IEEE 802 reference model","X.25 reference model"},
            {"Presentation layer","Session layer","Transport layer","Application layer"},
            {"Network layer","Transport layer","Application layer","Physical layer"},
            {"OSI reference model","TCP/IP reference model","IEEE 802 reference model","X.25 reference model"},
            {"Presentation layer","Session layer","Transport layer","Application layer"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "TCP/IP reference model",
            "Session layer",
            "Network layer",
            "IEEE 802 reference model",
            "Presentation layer"
    };
}
