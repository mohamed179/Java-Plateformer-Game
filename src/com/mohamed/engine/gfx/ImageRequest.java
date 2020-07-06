package com.mohamed.engine.gfx;

public class ImageRequest {
	private Image image;
	private int offX, offY, zDepth;
	
	public ImageRequest(Image image, int zDepth, int offX, int offY) {
		this.image = image;
		this.zDepth = zDepth;
		this.offX = offX;
		this.offY = offY;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getOffX() {
		return offX;
	}

	public void setOffX(int offX) {
		this.offX = offX;
	}

	public int getOffY() {
		return offY;
	}

	public void setOffY(int offY) {
		this.offY = offY;
	}

	public int getzDepth() {
		return zDepth;
	}

	public void setzDepth(int zDepth) {
		this.zDepth = zDepth;
	}
}
