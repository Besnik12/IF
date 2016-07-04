

	public class Test2
	{
	public static void main(String[] args)
	{ CardDeck pakoja = new CardDeck();
	for ( int i = 1; i <= 53; i = i+1 )
	{ Card k = pakoja.newCard();
	System.out.println(k.getCount() + " with " + k.getSuit());
	}
	}

}
