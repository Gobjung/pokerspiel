
public class Spieler 
{
  
	// Erh�lt 2 Karten
	public Karte[] erhalten(Deck deck)
	{
		Karte[] hand = deck.deal();
		return hand;
	}

}