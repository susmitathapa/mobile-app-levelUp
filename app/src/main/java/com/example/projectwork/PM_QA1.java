package com.example.projectwork;

public class PM_QA1 {
    //array of strings for questions
    public static String question[]={
            "What is project management?",
            "What are the five stages of project management?",
            "Which of the following is NOT one of the three constraints of project management?",
            "What is the triple constraint of project management?",
            "What is the purpose of a project charter?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"The process of planning and executing a specific project.","The process of planning and executing a series of projects.","The process of managing employees on a project.","The process of managing clients on a project."},
            {"Initiation, Planning, Execution, Monitoring and Control, and Closure.","Planning, Execution, Monitoring and Control, Closure, and Review.","Initiation, Planning, Execution, Closure, and Evaluation.","Planning, Execution, Evaluation, Review, and Closure."},
            {"Time","Cost","Scope","Quality"},
            {"Time, Cost, and Quality","Time, Cost, and Scope","Scope, Quality, and Resources","Time, Scope, and Resources"},
            {"To define the project's purpose and scope.","To plan the project's activities.","To execute the project's activities.","To monitor and control the project."}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "The process of planning and executing a specific project.",
            "Initiation, Planning, Execution, Monitoring and Control, and Closure.",
            "Quality",
            "Time, Cost, and Scope",
            "To define the project's purpose and scope."
    };
}
