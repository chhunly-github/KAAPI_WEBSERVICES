package com.khmeracademy.forum.entities;

public class Vote {
	private int vote_id;
	private int post_id;
	private int user_id;
	private int comment_id;
	private int vote_date_create;
	private int vote_active;
	
	public Vote() {
		// TODO Auto-generated constructor stub
	}
	
		
	
	public Vote(int vote_id, int post_id, int user_id, int comment_id, int vote_date_create, int vote_active) {
		super();
		this.vote_id = vote_id;
		this.post_id = post_id;
		this.user_id = user_id;
		this.comment_id = comment_id;
		this.vote_date_create = vote_date_create;
		this.vote_active = vote_active;
	}



	public int getVote_id() {
		return vote_id;
	}

	public void setVote_id(int vote_id) {
		this.vote_id = vote_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public int getVote_date_create() {
		return vote_date_create;
	}

	public void setVote_date_create(int vote_date_create) {
		this.vote_date_create = vote_date_create;
	}

	public int getVote_active() {
		return vote_active;
	}

	public void setVote_active(int vote_active) {
		this.vote_active = vote_active;
	}
	
	
}
