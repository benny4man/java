package GuessTheNumber;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.security.SecureRandom;
import java.awt.Color;

public class GuessTheNumber extends JFrame{
    
    private final JLabel label;
    private final JLabel label2;
    private final JTextField guessTextField;
    private final JButton button;
    private int randomNum;
    private int distance;
    private int lastDistance;
    
    public GuessTheNumber(){
        super("Guess-the-Number Game");
        
        randomizeNum();
        setLayout(new GridLayout(4,1,5,5));
        
        guessTextField = new JTextField();
        label = new JLabel("   I have a number between 1 and 1000, can you guess my number?");
        label2 = new JLabel("   Please enter your first guess");
        button = new JButton("New Game");
        add(label);
        add(label2);
        add(guessTextField);
        add(button);
        
        TextFieldHandler tHandler = new TextFieldHandler();
        guessTextField.addActionListener(tHandler);
        
        ButtonHandler bHandler = new ButtonHandler();
        button.addActionListener(bHandler);
        
        getContentPane().setBackground(Color.WHITE);
    }
    
    private class TextFieldHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            int dist = getLastDistance();
            int num = getRandomNum();
            System.out.println(num);
            
            int guess = Integer.valueOf(event.getActionCommand());
            
            
            if (guess > num) {
                label2.setText("   Too high");
            }
            if (guess < num) {
                label2.setText("   Too low");
            } 
            if (Math.abs(num - guess) > lastDistance) {
                getContentPane().setBackground(Color.CYAN);
            }
            if (Math.abs(num - guess) < lastDistance) {
                getContentPane().setBackground(Color.RED);
            }
            if(guess == num){
                label2.setText("   Correct!");
                guessTextField.setEditable(false);
                getContentPane().setBackground(Color.GREEN);
            }
            setLastDistance(Math.abs(num - guess));
            
        }
    }
    
    private class ButtonHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            getContentPane().setBackground(Color.WHITE);
            label2.setText("   Please enter your first guess");
            randomizeNum();
            guessTextField.setEditable(true);
        }
    }
    
    public void setLastDistance(int dist){this.lastDistance = dist;}
    
    public int getLastDistance(){return lastDistance;}
    
    public void randomizeNum(){
        SecureRandom random = new SecureRandom();
        randomNum = random.nextInt(1000);
    }
    
    public int getRandomNum(){return randomNum;}
    
    
    public static void main(String[] args) {
        
        GuessTheNumber window = new GuessTheNumber();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,200);
        window.setVisible(true);
    }
}
