import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Peril.
 */
public class Loader extends JApplet {
	
	private static final long serialVersionUID = -3815183950296997504L;

	public static boolean isRS = false;
	
	public static final int SUB_VERSION = 8;
	
	public static boolean rsaDisabled = true, isaacDisabled = true;

    public static String IP = "127.0.0.1";
	
	public static int PORT = 34567;
    
    public static boolean LOBBY_ENABLED = false;

    private Properties params;

    public static void main(String[] args) {
        if(args != null) {
            if(args.length > 0 && Boolean.valueOf(args[0]))
                IP = "127.0.0.1";
        }
        new Loader().doFrame();
    }
	
	@Override
	public void init() {
        final String webclient = super.getParameter("webclient");     
		if(webclient != null && Boolean.valueOf(webclient)) {
			final JButton button = new JButton("Launch");
			button.setPreferredSize(new Dimension(150, 40));
			this.add(button);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					remove(button);
					doFrame();
				}
			});
			return;
		}
		setParams();
		startClient();
	}

    public void doFrame() {
        setParams();
        openFrame();
        startClient();
    }

    private void openFrame() {
        JFrame client_frame = new JFrame("RuneNova");
        client_frame.setLayout(new BorderLayout());
        JPanel client_panel = new JPanel();
        client_panel.setLayout(new BorderLayout());
        client_panel.add(this);
        client_panel.setPreferredSize(new Dimension(800, 554));
        client_frame.getContentPane().add(client_panel, "Center");
        client_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        client_frame.pack();
        client_frame.setVisible(true);
    }

    private void startClient() {
        client c = new client();
        c.supplyApplet(this);
        c.init();
        c.start();
    }

    public void setParams() {
        params = new Properties();
        params.put("separate_jvm", "true");
        params.put("image", "http://www.runescape.com/img/game/splash2.gif");
        params.put("centerimage", "true");
        params.put("boxborder", "false");
        params.put("java_arguments", "-Xmx256m-Xss2m-Dsun.java2d.noddraw=true-XX:CompileThreshold=1500-Xincgc-XX:+UseConcMarkSweepGC-XX:+UseParNewGC");
        params.put("boxbgcolor", "black");
        params.put("5", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
        params.put("11", "0");
        params.put("34", "225");
        params.put("30", "MpanIDx68ZShS/0wQc60lSvsuExhgYKEW");
        params.put("9", "false");
        params.put("32", "7E38D137C0C97EAC1B89C07E1823D93B92621D5FF287F27135B71ECF61D4B07BDF4D957CA0C90F16707EE156B23C4365");
        params.put("25", "false");
        params.put("0", "gBY1FFD2PtHXiWDimCyWmg");
        params.put("12", "false");
        params.put("21", "true");
        params.put("28", "t6VmPGef1q2SfGVu5*Boi1FauurdIIXIIXzRjGVy4Yo");
        params.put("7", "0");
        params.put("35", "0");
        params.put("24", "");
        params.put("-1", "7KYq*VzZDycfkn7KXq98Xg");
        params.put("23", "");
        params.put("1", "410601069");
        params.put("13", "0");
        params.put("29", "");
        params.put("18", "1");
        params.put("6", "28348");
        params.put("26", "true");
        params.put("10", isRS ? "lobby8.runescape.com" : IP);
        params.put("4", "");
        params.put("33", "0");
        params.put("3", ".runescape.com");
        params.put("16", "0");
        params.put("15", "false");
        params.put("8", "1107");
        params.put("14", "false");
        params.put("20", "0");
        params.put("27", "false");
        params.put("2", "");
        params.put("haveie6", "false");
    }

    @Override
    public String getParameter(String paramString) {
        return (String) params.get(paramString);
    }

    @Override
    public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        try {
            return isRS ? new URL("http://world1.runescape.com") : new URL("http://" + IP);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
