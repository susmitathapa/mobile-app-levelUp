package com.example.projectwork;

public class Ai_QA2 {
    //array of strings for questions
    public static String question[]={
            "Which of the following is a search algorithm used in problem-solving in AI?",
            "Which of the following is a heuristic search algorithm used in problem-solving in AI?",
            "Which of the following is an uninformed search algorithm used in problem-solving in AI?",
            "Which of the following is a constraint satisfaction algorithm used in problem-solving in AI?",
            "Which of the following is a game-playing algorithm used in problem-solving in AI?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Naive Bayes","Decision Tree","Breadth-first search","Random forest"},
            {"Breadth-first search","Depth-first search","A* search","Hill climbing"},
            {"Breadth-first search","A* search","Depth-first search","Hill climbing"},
            {"Genetic algorithm","Simulated annealing","Constraint logic programming","Q-learning"},
            {"K-means clustering","Minimax algorithm","PCA (Principal Component Analysis)","Linear regression"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Breadth-first search",
            "A* search",
            "Breadth-first search",
            "Constraint logic programming",
            "Minimax algorithm"
    };
}
