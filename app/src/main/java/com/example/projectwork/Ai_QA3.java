package com.example.projectwork;

public class Ai_QA3 {
    //array of strings for questions
    public static String question[]={
            "Which of the following search techniques is used to traverse a graph or tree data structure?",
            "Which of the following search techniques uses heuristics to guide the search towards the goal state?",
            "Which of the following search techniques can find the shortest path in an unweighted graph or tree data structure?",
            "Which of the following search techniques can find the deepest node in a graph or tree data structure?",
            "Which of the following search techniques is used to solve optimization problems?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Breadth-first search","Depth-first search","Best-first search","A* search"},
            {"Breadth-first search","Depth-first search","A* search","Hill climbing"},
            {"Breadth-first search","Depth-first search","Best-first search","A* search"},
            {"Breadth-first search","Depth-first search","Hill climbing","A* search"},
            {"Breadth-first search","Depth-first search","Best-first search","A* search"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Breadth-first search",
            "A* search",
            "Breadth-first search",
            "Depth-first search",
            "Hill climbing"
    };
}
