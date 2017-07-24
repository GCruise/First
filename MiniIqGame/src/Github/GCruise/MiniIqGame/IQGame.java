package Github.GCruise.MiniIqGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderableImage;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class IQGame extends JPanel{
	public static final int WIDTH=1200;
	public static final int HEIGHT=760;
	
	public static BufferedImage curvedouble;
	public static BufferedImage curve;
	public static BufferedImage end;
	public static BufferedImage straightdouble;
	public static BufferedImage straight;
	public static BufferedImage background;
	Line[] line= {};

	int level=1; 
	String code;
   
	static {
		try {
			curvedouble=ImageIO.read(IQGame.class.getResource("/curve-double.png"));
			curve=ImageIO.read(IQGame.class.getResource("/curve.png"));
			end=ImageIO.read(IQGame.class.getResource("/end.png"));
			straightdouble=ImageIO.read(IQGame.class.getResource("/straight-double.png"));
			straight=ImageIO.read(IQGame.class.getResource("/straight.png"));
			background=ImageIO.read(IQGame.class.getResource("/background.png"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		IQGame game=new IQGame();
		game.gameLevel();
		frame.add(game);//将面板添加到窗上
		frame.setSize(WIDTH, HEIGHT);//设置窗的大小
		frame.setAlwaysOnTop(true);//设置面板始终在最上层
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭操作（窗口关闭时自动关闭程序）
		frame.setLocationRelativeTo(null);//设置居中显示
		frame.setVisible(true);//设置窗口可见，尽快调用paint()方法
		game.action();
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(background, 0, 0,null);
		g.drawImage(line[0].image,line[0].x,line[0].y,null);
		g.drawImage(line[1].image,line[1].x,line[1].y,null);
		g.drawImage(line[2].image,line[2].x,line[2].y,null);
		g.drawImage(line[3].image,line[3].x,line[3].y,null);
		g.drawImage(line[4].image,line[4].x,line[4].y,null);
		g.drawImage(line[5].image,line[5].x,line[5].y,null);
		g.drawImage(line[6].image,line[6].x,line[6].y,null);
		g.drawImage(line[7].image,line[7].x,line[7].y,null);
		g.drawImage(line[8].image,line[8].x,line[8].y,null);
		g.drawImage(line[9].image,line[9].x,line[9].y,null);
		g.drawImage(line[10].image,line[10].x,line[10].y,null);
		g.drawImage(line[11].image,line[11].x,line[11].y,null);
		g.drawImage(line[12].image,line[12].x,line[12].y,null);
		g.drawImage(line[13].image,line[13].x,line[13].y,null);
		g.drawImage(line[14].image,line[14].x,line[14].y,null);
	}
	
	public void checkLocation(int x,int y) {
		if(x>=100&&x<=300&&y>=100&&y<=300) {
			line[0].image=line[0].rotateImage(line[0], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=300&&x<=500&&y>=100&&y<=300) {
			line[1].image=line[1].rotateImage(line[1], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=500&&x<=700&&y>=100&&y<=300) {
			line[2].image=line[2].rotateImage(line[2], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=700&&x<=900&&y>=100&&y<=300) {
			line[3].image=line[3].rotateImage(line[3], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=900&&x<=1100&&y>=100&&y<=300) {
			line[4].image=line[4].rotateImage(line[4], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=100&&x<=300&&y>=300&&y<=500) {
			line[5].image=line[5].rotateImage(line[5], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=300&&x<=500&&y>=300&&y<=500) {
			line[6].image=line[6].rotateImage(line[6], 90);
			System.out.println(code);
			repaint();

		}
		else if(x>=500&&x<=700&&y>=300&&y<=500) {
			line[7].image=line[7].rotateImage(line[7], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=700&&x<=900&&y>=300&&y<=500) {
			line[8].image=line[8].rotateImage(line[8], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=900&&x<=1100&&y>=300&&y<=500) {
			line[9].image=line[9].rotateImage(line[9], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=100&&x<=300&&y>=500&&y<=700) {
			line[10].image=line[10].rotateImage(line[10], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=300&&x<=500&&y>=500&&y<=700) {
			line[11].image=line[11].rotateImage(line[11], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=500&&x<=700&&y>=500&&y<=700) {
			line[12].image=line[12].rotateImage(line[12], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=700&&x<=900&&y>=500&&y<=700) {
			line[13].image=line[13].rotateImage(line[13], 90);
			System.out.println(code);
			repaint();
		}
		else if(x>=900&&x<=1100&&y>=500&&y<=700) {
			line[14].image=line[14].rotateImage(line[14], 90);
			System.out.println(code);
			repaint();
		}
	}
	public void gameLevel() {
		switch(level){
		case 1:
			line=new Line[15];
			line[0]=new End(100,100);
			line[1]=new Line();
			line[2]=new Curve(500,100);
			line[3]=new Curve(700,100);
			line[4]=new Line();
			line[5]=new Curve(100,300);
			line[6]=new Straight(300,300);
			line[7]=new Curve(500,300);
			line[8]=new End(700,300);
			line[9]=new Line();
			line[10]=new Line();
			line[11]=new Line();
			line[12]=new Line();
			line[13]=new Line();
			line[14]=new Line();
			break;
		case 2:
			line=new Line[15];
			line[0]=new Curve(100,100);
			line[1]=new End(300,100);
			line[2]=new End(500,100);
			line[3]=new Line();
			line[4]=new Line();
			line[5]=new Curve(100,300);
			line[6]=new Straight(300,300);
			line[7]=new CurveDouble(500,300);
			line[8]=new Straight(700,300);
			line[9]=new Curve(900,300);
			line[10]=new Line();
			line[11]=new Line();
			line[12]=new Curve(500,500);
			line[13]=new Straight(700,500);
			line[14]=new Curve(900,500);
			break;
		case 3:
			line=new Line[15];
			line[0]=new Line();
			line[1]=new Line();
			line[2]=new End(500,100);
			line[3]=new Line();
			line[4]=new Line();
			line[5]=new Curve(100,300);
			line[6]=new Straight(300,300);
			line[7]=new CurveDouble(500,300);
			line[8]=new Straight(700,300);
			line[9]=new Curve(900,300);
			line[10]=new Line();
			line[11]=new Line();
			line[12]=new Curve(500,500);
			line[13]=new Straight(700,500);
			line[14]=new Curve(900,500);
			break;
		}
		
	}
	public boolean passCheck() {
		boolean flag=false;
		switch(level) {
		case 1:
			code=null;
			for(int i=0;i<line.length;i++) {
				if(line[i].type==2||line[i].type==4) {
				code+=String.valueOf(line[i].checkIndex%2);
				}else if(line[i].type==5) {
				code+=String.valueOf(line[i].checkIndex%1);	
				}
				else {
				code+=String.valueOf(line[i].checkIndex%4);
				}
			}
			if(code.equals("null112311003111111")) {
				flag=true;
			}
			break;
		case 2:
			code=null;
			for(int i=0;i<line.length;i++) {
				if(line[i].type==2||line[i].type==4) {
				code+=String.valueOf(line[i].checkIndex%2);
				}else if(line[i].type==5) {
				code+=String.valueOf(line[i].checkIndex%1);	
				}
				else {
				code+=String.valueOf(line[i].checkIndex%4);
				}
			}
			if(code.equals("null221111010311100")) {
				flag=true;
			}
			break;
			
		}
		return flag;
	}
	public void action() {
		MouseAdapter l = new MouseAdapter(){ //创建侦听器对象
			/** 重写mouseClicked()鼠标点击 */
			public void mouseClicked(MouseEvent e){
				int x=e.getX();
				int y=e.getY();
				
				if(passCheck()) {
					level++;
					line=null;
					gameLevel();
				}
				checkLocation(x,y);
				
				
			}
		};
		this.addMouseListener(l); //处理鼠标操作事件
		this.addMouseMotionListener(l); //处理鼠标滑动事件
		
	}

}
