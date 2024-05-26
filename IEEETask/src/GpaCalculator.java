import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GpaCalculator implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField title,creditHours;
    JLabel EntercreditHours, subjectstillnow, GPA, gpaanswer;
    JButton EnterButton, ResetButton, finish;
    JRadioButton Aplus, A, Aminus, Bplus, B, Bminus, Cplus, C, Cminus, Dplus, D, F;
    ButtonGroup group;
    Font fontTitle, fonttillnow;
    ImageIcon img;
    int weight;
    String gradeChosen;
    Subject s;
    SubjectList subjects;
    public GpaCalculator()
    {
        subjects = new SubjectList();
        frame = new JFrame("GPA Calculator");
        frame.setSize(420,400);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,390,390));
        //panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        img = new ImageIcon("C:\\Users\\Michael.DESKTOP-NC8TSSN\\Desktop/gpa.png");
        frame.setIconImage(img.getImage());

        EntercreditHours = new JLabel("Enter Subject's Credit Hours");
        EntercreditHours.setBounds(170,80,200,50);
        panel.add(EntercreditHours);

        creditHours = new JTextField();
        creditHours.setBounds(180,120,140,30);
        panel.add(creditHours);

        subjectstillnow = new JLabel();
        subjectstillnow.setBounds(140,160,260,30);
        subjectstillnow.setFont(fonttillnow);
        panel.add(subjectstillnow);

        GPA = new JLabel("Your GPA");
        GPA.setBounds(220,220,60,30);
        panel.add(GPA);

        gpaanswer = new JLabel();
        gpaanswer.setBounds(230,245,60,30);
        panel.add(gpaanswer);

        fontTitle = new Font("SansSerif", Font.BOLD,20);

        fonttillnow = new Font("SansSerif",Font.ITALIC,10);

        title = new JTextField("GUC GPA Calculator");
        title.setBounds(90,30,200,40);
        title.setFont(fontTitle);
        //title.setBackground(Color.ORANGE);
        title.setBorder(null);
        title.setEditable(false);
        panel.add(title);

        EnterButton = new JButton("Enter");
        EnterButton.setBounds(40,280,70,40);
        EnterButton.addActionListener(this);
        panel.add(EnterButton);

        finish = new JButton("Finish");
        finish.setBounds(215,280,70,40);
        finish.addActionListener(this);
        panel.add(finish);

        ResetButton = new JButton("Reset");
        ResetButton.setBounds(300,280,70,40);
        ResetButton.addActionListener(this);
        panel.add(ResetButton);

        Aplus = new JRadioButton("A+");
        Aplus.setBounds(30,100,50,15);
        Aplus.addActionListener(this);

        A = new JRadioButton("A");
        A.setBounds(90,100,50,15);
        A.addActionListener(this);

        Aminus = new JRadioButton("A-");
        Aminus.setBounds(30,130,50,15);
        Aminus.addActionListener(this);

        Bplus = new JRadioButton("B+");
        Bplus.setBounds(90,130,50,15);
        Bplus.addActionListener(this);

        B = new JRadioButton("B");
        B.setBounds(30,160,50,15);
        B.addActionListener(this);

        Bminus = new JRadioButton("B-");
        Bminus.setBounds(90,160,50,15);
        Bminus.addActionListener(this);

        Cplus = new JRadioButton("C+");
        Cplus.setBounds(30,190,50,15);
        Cplus.addActionListener(this);

        C = new JRadioButton("C");
        C.setBounds(90,190,50,15);
        C.addActionListener(this);

        Cminus = new JRadioButton("C-");
        Cminus.setBounds(30,220,50,15);
        Cminus.addActionListener(this);

        Dplus = new JRadioButton("D+");
        Dplus.setBounds(90,220,50,15);
        Dplus.addActionListener(this);

        D = new JRadioButton("D");
        D.setBounds(30,250,50,15);
        D.addActionListener(this);

        F = new JRadioButton("F");
        F.setBounds(90,250,50,15);
        F.addActionListener(this);

        group = new ButtonGroup();

        group.add(Aplus);
        group.add(A);
        group.add(Aminus);
        group.add(Bplus);
        group.add(B);
        group.add(Bminus);
        group.add(Cplus);
        group.add(C);
        group.add(Cminus);
        group.add(Dplus);
        group.add(D);
        group.add(F);

        panel.add(Aplus);
        panel.add(A);
        panel.add(Aminus);
        panel.add(Bplus);
        panel.add(B);
        panel.add(Bminus);
        panel.add(Cplus);
        panel.add(C);
        panel.add(Cminus);
        panel.add(Dplus);
        panel.add(D);
        panel.add(F);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        GpaCalculator gpa = new GpaCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Aplus)
            gradeChosen = "A+";
        else if(e.getSource()==A)
            gradeChosen = "A";
        else if(e.getSource()==Aminus)
            gradeChosen = "A-";
        else if(e.getSource()==Bplus)
            gradeChosen = "B+";
        else if(e.getSource()==B)
            gradeChosen = "B";
        else if(e.getSource()==Bminus)
            gradeChosen = "B-";
        else if(e.getSource()==Cplus)
            gradeChosen = "C+";
        else if(e.getSource()==C)
            gradeChosen = "C";
        else if(e.getSource()==Cminus)
            gradeChosen = "C-";
        else if(e.getSource()==Dplus)
            gradeChosen = "D+";
        else if(e.getSource()==D)
            gradeChosen = "D";
        else if(e.getSource()==F)
            gradeChosen = "F";
        if(e.getSource()==EnterButton) {
            weight = Integer.parseInt(creditHours.getText());
            s = new Subject(weight,gradeChosen);
            s.convertGrade();
            subjects.add(s);
            subjectstillnow.setText(subjects.display());

        }
        if(e.getSource()==finish)
        {
            subjects.calcuateGPA();
            subjects.gpaGrade();
            gpaanswer.setText(subjects.toString());
        }
        if(e.getSource()==ResetButton)
        {
            subjects = new SubjectList();
            gpaanswer.setText("");
            subjectstillnow.setText("");
            creditHours.setText("");
        }
    }
}
