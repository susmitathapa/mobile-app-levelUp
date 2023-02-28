package com.example.projectwork;

public class Ippr_QA2 {
    //array of strings for questions
    public static String question[]={
            "Which of the following is NOT a technique for image enhancement in spatial domain?",
            "What is the purpose of image enhancement in spatial domain?",
            "What is the main advantage of using spatial domain methods for image enhancement?",
            "Which of the following techniques is used for contrast stretching in spatial domain?",
            "Which of the following techniques is used for sharpening an image in spatial domain?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"Histogram Equalization","Spatial Filtering","Fourier Transform","Contrast Stretching"},
            {"To improve the quality of the image","To compress the image","To segment the image","To encode the image"},
            {"They are computationally efficient","They do not require any prior information about the image","They can be applied to any type of image","They do not require any specialized hardware"},
            {"Laplacian Filtering","Sobel Filtering","Median Filtering","Gamma Correction"},
            {"Gaussian Filtering","Median Filtering","Laplacian Filtering","High Pass Filtering"}
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "Fourier Transform",
            "To improve the quality of the image",
            "They do not require any prior information about the image",
            "Gamma Correction",
            "Laplacian Filtering"
    };
}
