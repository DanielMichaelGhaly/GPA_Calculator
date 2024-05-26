
public class Subject {
    int courseWeight;
    String grade;
    double gradeMark;
    public Subject(int courseWeight, String grade)
    {
        this.courseWeight = courseWeight;
        this.grade = grade;
        gradeMark = 0.0;
    }
    public void convertGrade()
    {
        switch(this.grade)
        {
            case "A+": this.gradeMark = 0.7; break;
            case "A":  this.gradeMark = 1.0; break;
            case "A-": this.gradeMark = 1.3; break;
            case "B+": this.gradeMark = 1.7; break;
            case "B":  this.gradeMark = 2.0; break;
            case "B-": this.gradeMark = 2.3; break;
            case "C+": this.gradeMark = 2.7; break;
            case "C":  this.gradeMark = 3.0; break;
            case "C-": this.gradeMark = 3.3; break;
            case "D+": this.gradeMark = 3.7; break;
            case "D":  this.gradeMark = 4.0; break;
            case "F":  this.gradeMark = 5.0; break;
        }
    }
    public String toString()
    {
        return "(" + courseWeight + ", " + grade + ")";
    }


}
