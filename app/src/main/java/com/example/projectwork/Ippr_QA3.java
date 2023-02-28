package com.example.projectwork;

public class Ippr_QA3 {
    //array of strings for questions
    public static String question[]={
            "Which of the following is NOT a technique for image enhancement in frequency domain?",
            "What is the purpose of image enhancement in frequency domain?",
            "Which of the following filters is used to enhance the edges in an image in frequency domain?",
            "Which of the following is an advantage of using frequency domain methods for image enhancement?",
            "Which of the following is a limitation of frequency domain methods for image enhancement?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Fourier Transform","Low Pass Filtering","High Pass Filtering","Edge Detection"},
            {"To improve the quality of the image","To compress the image","To segment the image","To encode the image"},
            {"High Pass Filter","Low Pass Filter","Band Pass Filter","Band Stop Filter"},
            {"They are computationally efficient","They are more effective than spatial domain methods for certain types of images","They do not require any prior information about the image","They do not introduce any artifacts or noise into the image"},
            {"They are computationally intensive","They may introduce artifacts or noise into the image","They require prior knowledge about the image","They are not effective for certain types of images"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Edge Detection",
            "To improve the quality of the image",
            "High Pass Filter",
            "They are more effective than spatial domain methods for certain types of images",
            "They may introduce artifacts or noise into the image"
    };
}
