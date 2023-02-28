package com.example.projectwork;

public class Ai_QA1 {
    //array of strings for questions
    public static String question[]={
           "Which of the following is a branch of artificial intelligence?",
            "Which of the following is a learning technique used in machine learning?",
            "Which of the following is a type of artificial neural network architecture?",
            "Which of the following is a technique used in natural language processing (NLP)?",
            "Which of the following is an example of an unsupervised learning technique in machine learning?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Biology","Chemistry","Robotics","Economics"},
            {"Linear algebra","Gradient descent","Quantum mechanics","Newton's laws"},
            {"Convolutional Neural Network (CNN)","Random Forest","K-Nearest Neighbor (KNN)","Support Vector Machine (SVM)"},
            {"Convolutional Neural Network (CNN)","K-Nearest Neighbor (KNN)","Recurrent Neural Network (RNN)","Decision Tree"},
            {"Linear regression","Naive Bayes","Support vector machine (SVM)","K-means clustering"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Robotics",
           "Gradient descent",
           "Convolutional Neural Network (CNN)",
           "Recurrent Neural Network (RNN)",
           "K-means clustering"
    };
}
