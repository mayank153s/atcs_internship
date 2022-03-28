package atcs_cs2;

public class Video extends MediaItem {

	private String creator;
	private String genre;
	private int release;
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	public Video(String creator, String genre, int release) {
		super();
		this.creator = creator;
		this.genre = genre;
		this.release = release;
	}
	@Override
	public String toString() {
		return "Video [creator=" + creator + ", genre=" + genre + ", release=" + release + "]";
	}
	

	

}
