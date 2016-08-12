package org.khmeracademy.v3.entities.elearning;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/*import org.kaapi.app.forms.RecommendedVideos;*/

public class Playlist {

	@JsonProperty("PLAY_LISTEID")
	private int playlistid;
	@JsonProperty("PLAY_LISTNAME")
	private String playlistname;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("USER_ID")
	private int userid;
	@JsonProperty("THUMBNAIL_URL")
	private String thumbnailurl;
	@JsonProperty("PUBLIC_VIEW")
	private boolean publicview;
	@JsonProperty("MAIN_CATEGORY")
	private int maincategory;
	@JsonProperty("BG_IMAGE")
	private String bgimage;
	@JsonProperty("COLOR")
	private String color;
	@JsonProperty("STATUS")
	private boolean status;
	@JsonProperty("DURATION")
	private double duration;
	@JsonProperty("VIDEOS")
	private List<Video> videos;
	
	
	
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
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
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	


}
