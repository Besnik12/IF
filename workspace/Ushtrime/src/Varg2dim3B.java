
public class Varg2dim3B {
	public static void main(String[] args)
	{	int[][] r = new int[4][4];
	for ( int i = 0; i != 4; i = i + 1 )
	{ for ( int j = 0; j != 4; j = j + 1 )
	{ if ( j >= i )
	{ r[i][j] = i + j + 1; }
	else { r[i][j] = 0; }
	 System.out.print( r[i][j] + " " ); }
	System.out.println();
	}

}
	}

