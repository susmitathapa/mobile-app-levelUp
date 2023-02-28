package com.example.projectwork;

public class MA_QA {
    //array of strings for questions
    public static String question[]={
            "Which of the following is NOT a type of mobile application?",
            "What is a native mobile application?",
            "What is the main advantage of a web-based mobile application?",
            "Which of the following is a disadvantage of hybrid mobile applications?",
            "What is the main advantage of a native mobile application over a web-based application?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Native","Web-based","Desktop-based","Hybrid"},
            {"An application that runs on a web browser","An application that is installed directly on a mobile device","An application that is designed to run on a desktop computer","An application that is built using hybrid technology"},
            {"It can be easily downloaded and installed on a mobile device","It can be accessed from any device with a web browser","It provides a better user experience than a native application","It can access the device hardware and features more easily"},
            {"They are difficult to develop","They cannot access the device hardware and features","They have poor performance compared to native applications","They are not compatible with all mobile devices"},
            {"It can be accessed from any device with a web browser","It can be developed more quickly and easily","It provides a better user experience and performance","It does not require an internet connection to function"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Desktop-based",
            "An application that is installed directly on a mobile device",
            "It can be accessed from any device with a web browser",
            "They have poor performance compared to native applications",
            "It provides a better user experience and performance"
    };
}
