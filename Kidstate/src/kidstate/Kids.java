package kidstate;

public class Kids implements KidsState {
	
	private KidsState kidssleeping;
	private KidsState kidsreading;
	private KidsState kidsplaying;
	
	private KidsState state;
	
	public Kids() {
		
		this.kidssleeping = new Kidssleeping();
		this.kidsreading = new Kidsreading();
		this.kidsplaying = new Kidsplaying();
		
		this.state = kidssleeping;
	}
	
    public void setKidsState(KidsState state){
    	this.state = state;
    }
    
    @Override
    public void sleeping(){
    	state.sleeping();
    }
    
    @Override
    public void reading(){
    	state.reading();
    }
    
    @Override
    public void playing(){
    	state.playing();
    }
    
    public KidsState getKidssleeping() {
		return kidssleeping;   	
    }
    public void setKidssleeping(KidsState kidssleeping) {
    	this.kidssleeping = kidssleeping;
    }
   
    
    public KidsState getKidsreading() {
		return kidsreading;
    }
    public void setKidsreading(KidsState kidsreading) {
    	this.kidsreading = kidsreading;
    }
    	
    public KidsState getKidsplaying() {
		return kidsplaying;
    }
    public void setKidsplaying(KidsState kidsplaying) {
    	this.kidsplaying = kidsplaying;
    }	
    
    
    public KidsState getState() {
		return state;
    	
    }
    
    public void setState() {
    	this.state = state;
    }
    }
