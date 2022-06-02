package bikeproject;

public interface RoadParts {
	// constant declaration
	public final String TERRAIN = "track_racing";

	// required methods
	public int getTyreWidth();

	public void setTyreWidth(int newValue);

	public int getPostHeight();

	public void setPostHeight(int newValue);
}
