package org.khmeracademy.v3.entities.elearning;

/*import org.kaapi.app.forms.RecommendedVideos;*/

public class Playlist {

	private int playlistid;
	private String playlistname;
	private String description;
	private int userid;
	private String thumbnailurl;
	private boolean publicview;
	private String color;
	private boolean status;
	private int maincategory;
	private String bgimage;
	
	public int getPlaylistid() {
		return playlistid;
	}
	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}
	public String getPlaylistname() {
		return playlistname;
	}
	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getThumbnailurl() {
		return thumbnailurl;
	}
	public void setThumbnailurl(String thumbnailurl) {
		this.thumbnailurl = thumbnailurl;
	}
	public boolean isPublicview() {
		return publicview;
	}
	public void setPublicview(boolean publicview) {
		this.publicview = publicview;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getMaincategory() {
		return maincategory;
	}
	public void setMaincategory(int maincategory) {
		this.maincategory = maincategory;
	}
	public String getBgimage() {
		return bgimage;
	}
	public void setBgimage(String bgimage) {
		this.bgimage = bgimage;
	}

}
