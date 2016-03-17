/**
 * Created by mandy on 2/19/2016.
 */
public class card
{
    public enum Suit
    {
        Clubs(1), Spades (2), Hearts (3), Diamonds(4);
        int val;
        private Suit(int v)
        {
            val = v;
        }
    }


}
