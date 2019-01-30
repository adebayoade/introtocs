package introtocs.objects;

/*
{><}_____ Rules _____{><}
*/

public class DiscordRules {
    public enum Behavior {
	FRIENDLY, RUDE
    }

    public static void main(String[] args) {

	User you = new User();
	you.setUserBehavior(Behavior.RUDE);

	System.out.println("Enjoy your time here, use !code for information on how to post code, "
		+ "if its really long use https://gist.github.com/ or similar");

	System.out.println("We have Beginner/Experienced/Expert roles, if you want one of those just mention it "
		+ "in the \"demand_a_title\" channel");

	System.out.println("Go nuts asking for help, or saving the ones in need!");

	System.out.println("Feel free to share this channel! The more the merrier :)!");

	while (true) {

	    if (you.getUserBehaviour() == Behavior.RUDE) {
		you.kick();
	    } else {
		you.learn();
	    }
	}
    }

    public static class User {
	private Behavior behavior;
	private int knowledge;

	public void setUserBehavior(Behavior behavior) {
	    this.behavior = behavior;
	}

	public Behavior getUserBehaviour() {
	    return behavior;
	}

	public void learn() {
	    knowledge++;
	}

	public void kick() {
	    // delete this;? System.Exit(-1)?;
	}
    }
}
// credits to user @B14m3m3#4586 for polishing the rules