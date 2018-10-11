package kidstate;

public class Kidsreading implements KidsState {
	
	private final Kids kids;
	

	public Kidsreading(Kids kids) {
		
		this.kids = kids;
	}

	@Override
	public void sleeping() {
		System.out.println("Kids are still reading!");
		kids.setKidsState(kids.getKidsplaying());

	}

	@Override
	public void reading() {
		System.out.println(" Kids are reading!");

	}

	@Override
	public void playing() {
		System.out.println(" Kids can not play now!");

	}

}
