package Github.GCruise.MiniIqGame;



public class End extends Line{
	public End(int x,int y) {
		this.x=x;
		this.y=y;
		image=IQGame.end;
		width=image.getWidth();
		height=image.getHeight();
		type=3;
	}

}
