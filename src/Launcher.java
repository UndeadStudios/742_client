import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Peril.
 */
public class Launcher extends JApplet {

	private boolean loaded;
			    
    public static void main(String[] args) {
        new Launcher();
    }
	
	public Launcher() {
		display();
	}
	
    public void display() {
        JButton button = new JButton("Launch");
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launch();
            }
        });
    }
    
    private void launch() {
        if(!loaded) {
            loaded = true;
			new Loader().doFrame();
		}
        else
            JOptionPane.showMessageDialog(this, "You can only launch one client at a time!");
    }
	
}
