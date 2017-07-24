package Github.GCruise.MiniIqGame;

public class Curve extends Line{
	public Curve(int x,int y) {
		this.x=x;
		this.y=y;
		image=IQGame.curve;
		width=image.getWidth();
		height=image.getHeight();
		type=1;
	}

}
