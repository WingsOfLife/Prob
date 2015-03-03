import java.util.*;

public class Prob {

    static int heads = 0;
    static int tails = 0;

    static Random rnd = new Random();

    public static void main(String[] args) {

	for (int i = 0; i < Integer.valueOf(args[0]); i++) {
	
	    float random = rnd.nextFloat();
	    if (random <= .49) heads++;
	    else tails++;
	}

	System.out.println("Heads: " + heads + " Tails: " + tails);
	System.out.println("Probability: " + ((float) Math.min(heads, tails)) / ((float) Math.max(heads, tails)));
    }
}
