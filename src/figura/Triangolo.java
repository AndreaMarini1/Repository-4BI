package figura;

public class Triangolo {
	private float base, altezza;

	public Triangolo() {
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public float area() {
		return base*altezza;
	}
}
