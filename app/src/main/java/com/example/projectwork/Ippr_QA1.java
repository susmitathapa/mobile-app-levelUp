package com.example.projectwork;

public class Ippr_QA1 {
    //array of strings for questions
    public static String question[]={
            "What is digital image processing?",
            "Which of the following is not a step in the digital image processing workflow?",
            "Which of the following image processing operations is used to reduce the amount of noise in an image?",
            "Which of the following image processing operations is used to divide an image into regions or objects with similar properties?",
            "Which of the following image processing operations is used to extract features from an image, such as edges or corners?"
    };

    //array of strings for choices/options, 2d array for 4 choices
    public static String choices[][]={
            {"The process of converting an analog image into a digital image","The process of analyzing and manipulating digital images using mathematical algorithms","The process of compressing digital images for storage and transmission","The process of printing digital images onto physical media"},
            {"Image acquisition","Image enhancement","Image compression","Image interpretation"},
            {"Filtering","Thresholding","Segmentation","Morphological processing"},
            {"Filtering","Thresholding","Segmentation","Morphological processing"},
            {"Filtering","Thresholding","Segmentation","Feature extraction"},
    };

    //array of strings for answers
    public static String correctAnswers[]={
            "The process of analyzing and manipulating digital images using mathematical algorithms",
            "Image compression",
            "Filtering",
            "Executing",
            "Feature extraction"
    };
}
