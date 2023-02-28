package com.example.projectwork;

public class CN_QA3 {
    //array of strings for questions
    public static String question[]={
            "What is the primary function of the physical layer in a computer network?",
            "Which of the following physical layer characteristics affects the distance data can be transmitted over a medium?",
            "Which of the following physical layer technologies uses light to transmit data over a fiber optic cable?",
            "Which of the following physical layer technologies is used for wireless communication?",
            "Which of the following physical layer devices is used to convert digital signals into analog signals for transmission over a medium?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"To transmit data between devices","To route data between networks","To provide error correction for transmitted data","To establish, maintain and terminate connections between applications"},
            {"Bandwidth","Modulation","Attenuation","Noise"},
            {"Ethernet","Wi-Fi"," Bluetooth","Optical fiber"},
            {"Coaxial cable"," Fiber optic cable","Twisted pair cable","Radio waves"},
            {"Modem","Router","Switch","Repeater"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "To transmit data between devices",
            "Attenuation",
            "Optical fiber",
            "Radio waves",
            "Modem"
    };
}
