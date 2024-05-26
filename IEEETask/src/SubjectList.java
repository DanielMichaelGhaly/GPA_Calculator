import java.util.*;
public class SubjectList {
    ArrayList<Subject> subjects;
    int totalCreditHours;
    double calculatingGPA;
    double finalGPA;
    String finalGrade;

    public SubjectList()
    {
        subjects = new ArrayList<Subject>();
        finalGPA = 0.0;
        calculatingGPA = 0.0;
        totalCreditHours = 0;
        finalGrade = "";

    }
    public void add(Subject subject)
    {
        subjects.add(subject);
    }

    public void calcuateGPA()
    {
        for(int i = 0; i<subjects.size(); i++)
        {
            totalCreditHours += subjects.get(i).courseWeight;
            calculatingGPA = calculatingGPA + (subjects.get(i).courseWeight*subjects.get(i).gradeMark);
        }
        finalGPA = calculatingGPA/totalCreditHours;
        finalGPA = (double) Math.round(finalGPA * 100) / 100;
    }

    public void gpaGrade()
    {
        if(finalGPA>=0.70&&finalGPA<=0.99)
            finalGrade = "A+";
        else if(finalGPA>=1.00&&finalGPA<=1.29)
            finalGrade = "A";
        else if(finalGPA>=1.30&&finalGPA<=1.69)
            finalGrade = "A-";
        else if(finalGPA>=1.70&&finalGPA<=1.99)
            finalGrade = "B+";
        else if(finalGPA>=2.00&&finalGPA<=2.29)
            finalGrade = "B";
        else if(finalGPA>=2.30&&finalGPA<=2.69)
            finalGrade = "B-";
        else if(finalGPA>=2.70&&finalGPA<=2.99)
            finalGrade = "C+";
        else if(finalGPA>=3.00&&finalGPA<=3.29)
            finalGrade = "C";
        else if(finalGPA>=3.30&&finalGPA<=3.69)
            finalGrade = "C-";
        else if(finalGPA>=3.70&&finalGPA<=3.99)
            finalGrade = "D+";
        else if(finalGPA>=4.00&&finalGPA<=4.99)
            finalGrade = "D";
        else if(finalGPA>= 5.00&&finalGPA<=6.00)
            finalGrade = "F";
    }

    public String toString()
    {
        return finalGrade + " (" + finalGPA + ")";
    }

    public String display()
    {
        String s = "";
        for(int i = 0; i<subjects.size(); i++)
            s += subjects.get(i).toString();
        return s;
    }
}
