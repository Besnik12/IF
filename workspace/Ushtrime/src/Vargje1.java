
public class Vargje1 {
	public static void main(String[] args)
	{int[] r = new int[6];
	r[0] = 1;
	for ( int i = 1; i < r.length; i++ )
	{ r[i] = r[i - 1] * 2; 
	System.out.println(r[i]);}
	}
      }
