package Github.GCruise.MiniIqGame;

public class Straight extends Line{
	public Straight(int x,int y) {
		this.x=x;
		this.y=y;
		image=IQGame.straight;
		width=image.getWidth();
		height=image.getHeight();
		type=4;
	}

}
