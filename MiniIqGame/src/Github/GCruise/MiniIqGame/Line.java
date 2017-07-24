package Github.GCruise.MiniIqGame;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
/**
 * 所有线条的父类
 * @author Lu
 *
 */
public class Line {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	protected int checkIndex=1;
	protected int type;
	/**
	 * 旋转图片
	 * @param bufferedimage 
	 * @param degree 角度
	 * @return
	 */
	public BufferedImage rotateImage(Line line,
            int degree) {
        int w = line.width;
        int h = line.height;
        int type = line.image.getColorModel().getTransparency();
        BufferedImage img;
        Graphics2D graphics2d;
        (graphics2d = (img = new BufferedImage(w, h, type))
                .createGraphics()).setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.rotate(Math.toRadians(degree), w / 2, h / 2);
        graphics2d.drawImage(line.image, 0, 0, null);
        graphics2d.dispose();
        line.checkIndex++;
        return img;
    }
}

