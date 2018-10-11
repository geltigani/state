package kidstate;

public class Kidsplaying implements KidsState {
	
	private final Kids kids;
	
	
	public Kidsplaying(Kids kids) {
		this.kids = kids;
	}
	@Override
	public void sleeping() {
		System.out.println("Kids are sleeping!");
		kids.setKidsState(kids.getKidssleeping());
	}

	@Override
	public void reading() {
		System.out.println("Kids can not read while playing!");

	}

	@Override
	public void playing() {
		System.out.println("Kids are actively playing!");

	}

}
