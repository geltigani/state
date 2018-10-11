package kidstate;

public class Kidssleeping implements KidsState {
	
	private Kids kids;
	
	public void KidsSleeping(Kids kids){
		this.kids = kids;
	}

	@Override
	public void sleeping() {
		System.out.println(" Kids are sleeping!");

	}

	@Override
	public void reading() {
		System.out.println(" Kids are reading!");
		kids.setKidsState(kids.getKidsreading());

	}

	@Override
	public void playing() {
		kids.setState();
		System.out.println(" Kids are playing!");

	}

}
