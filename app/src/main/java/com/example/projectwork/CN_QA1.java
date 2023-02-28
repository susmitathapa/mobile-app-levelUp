package com.example.projectwork;

public class CN_QA1 {
    //array of strings for questions
    public static String question[]={
            "What is a computer network?",
            "What is the purpose of a network protocol?",
            "Which of the following network topologies involves connecting each device to a central hub or switch?",
            "Which of the following network devices is used to connect two or more networks together?",
            "Which of the following network technologies is used for wireless communication?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"A group of computers connected by wires or wireless means to share information and resources"," A program that allows computers to communicate with each other"," A type of computer hardware used to connect two or more devices","A computer that is dedicated to providing network services to other computers"},
            {"To connect two or more devices to a network","To translate data into a format that can be transmitted over a network","To provide security for network communications","To govern the format and timing of communication between devices on a network"},
            {"Bus topology","Ring topology","Star topology","Mesh topology"},
            {" Hub","Switch","Router","Repeater"},
            {"Ethernet","Bluetooth","Fiber optic","Coaxial cable"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "A group of computers connected by wires or wireless means to share information and resources",
            "To govern the format and timing of communication between devices on a network",
            "Star topology",
            "Router",
            "Bluetooth"
    };
}
