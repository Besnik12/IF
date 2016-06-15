
public class Character1 {
	public int findChar(char c, String s)
	{ int index = 0;
	while ( index < s.length() )
	{ // c nuk është asnjë nga karakterët 0...(index-1)
	if (s.charAt(index) == c)
	{ break; }
	else { index = index + 1; }
	}
	if ( !(index < s.length()) )
	{ index = -1; }
	return index;
	}
	public static void main(String[] args)
	{ Character1 ch = new Character1();
	  System.out.println(ch.findChar('i', "Bakki"));
	}
}

