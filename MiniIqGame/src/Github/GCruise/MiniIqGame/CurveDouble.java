package Github.GCruise.MiniIqGame;

public class CurveDouble extends Line{
	public CurveDouble(int x,int y) {
		this.x=x;
		this.y=y;
		image=IQGame.curvedouble;
		width=image.getWidth();
		height=image.getHeight();
		type=2;
	}

}
