import javax.swing.*;
public class IF {
	/** hourToSecond konverton orët në sekonda
	* @param hours - orët
	* @return ekuvalenti në sekonda */
	public int hourToSecond(int hours)
	{ int seconds = 0;
	if ( hours < 0 )
	{ String error = "Gabim: orët " + hours;
	JOptionPane.showMessageDialog(null, error);
	throw new RuntimeException(error);
	}
	else { seconds = hours * 60 * 60; }
	return seconds;
}
	public static void main(String[] args)
	{ IF i = new IF();
	   System.out.println(i.hourToSecond(24));
	}
}
