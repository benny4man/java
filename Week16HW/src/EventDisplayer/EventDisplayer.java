package EventDisplayer;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class EventDisplayer extends JFrame {

    private final JLabel eventLabel;
    private final JButton button;
    private final JTextField textField;
    private final JPanel panel;
    private final JCheckBox checkBox;
    private final JList<String> list;

    private static final String[] listContent = {"Option1", "Option2"};

    public EventDisplayer() {
        super("Event Displayer");
        setLayout(new GridLayout(3, 3, 15, 15));

        textField = new JTextField(10);
        eventLabel = new JLabel("Event Display");
        button = new JButton("Button");
        panel = new JPanel();
        panel.setBackground(Color.white);
        list = new JList<String>(listContent);
        checkBox = new JCheckBox("Check Box");

        add(eventLabel);
        add(textField);
        add(button);
        add(panel);
        add(list);
        add(checkBox);

        CheckBoxHandler cHandler = new CheckBoxHandler();
        checkBox.addItemListener(cHandler);

        MouseHandler Mhandler = new MouseHandler();
        panel.addMouseListener(Mhandler);
        panel.addMouseMotionListener(Mhandler);

        ListSelectionHandler lHandler = new ListSelectionHandler();
        list.addListSelectionListener(lHandler);

        ButtonHandler bHandler = new ButtonHandler();
        button.addActionListener(bHandler);

        KeyHandler kHandler = new KeyHandler();
        textField.addKeyListener(kHandler);
        
        TextFieldHandler tHandler = new TextFieldHandler();
        textField.addActionListener(tHandler);
    }

    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            eventLabel.setText(event.toString());
        }
    }

    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (checkBox.isSelected()) {
                eventLabel.setText(event.toString());
            }
        }
    }

    private class MouseHandler implements MouseListener,
            MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        // handle event when mouse pressed
        @Override
        public void mousePressed(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        // handle event when mouse released 
        @Override
        public void mouseReleased(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        // handle event when mouse exits area
        @Override
        public void mouseExited(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        @Override
        public void mouseDragged(MouseEvent event) {
            eventLabel.setText(event.toString());
        }

        @Override
        public void mouseMoved(MouseEvent event) {
            eventLabel.setText(event.toString());
        }
    }

    private class ListSelectionHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent event) {
            eventLabel.setText(event.toString());

        }
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            eventLabel.setText(event.toString());

        }
    }

    private class KeyHandler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent event) {
            eventLabel.setText(event.toString());
        }

        @Override
        public void keyPressed(KeyEvent event) {
            eventLabel.setText(event.toString());
        }

        @Override
        public void keyReleased(KeyEvent event) {
            eventLabel.setText(event.toString());
        }
    }

    public static void main(String[] args) {

        EventDisplayer window = new EventDisplayer();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 200);
        window.setVisible(true);
    }
}
