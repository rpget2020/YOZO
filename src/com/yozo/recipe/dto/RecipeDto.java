package com.yozo.recipe.dto;

import oracle.sql.DATE;

public class RecipeDto {

		private int recipe_no;
		private String recipe_main_photo;
		private String member_id;
		private String recipe_title;
		private String recipe_photo;
		private String recipe_detail;
		private DATE recipe_regdate;
		private String recipe_material_one;
		private String recipe_theme;
		private String recipe_kind;
		private String recipe_material;
		private int recipe_likecount;
		public RecipeDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RecipeDto(int recipe_no, String recipe_main_photo, String member_id, String recipe_title,
				String recipe_photo, String recipe_detail, DATE recipe_regdate, String recipe_material_one,
				String recipe_theme, String recipe_kind, String recipe_material, int recipe_likecount) {
			super();
			this.recipe_no = recipe_no;
			this.recipe_main_photo = recipe_main_photo;
			this.member_id = member_id;
			this.recipe_title = recipe_title;
			this.recipe_photo = recipe_photo;
			this.recipe_detail = recipe_detail;
			this.recipe_regdate = recipe_regdate;
			this.recipe_material_one = recipe_material_one;
			this.recipe_theme = recipe_theme;
			this.recipe_kind = recipe_kind;
			this.recipe_material = recipe_material;
			this.recipe_likecount = recipe_likecount;
		}
		public int getRecipe_no() {
			return recipe_no;
		}
		public void setRecipe_no(int recipe_no) {
			this.recipe_no = recipe_no;
		}
		public String getRecipe_main_photo() {
			return recipe_main_photo;
		}
		public void setRecipe_main_photo(String recipe_main_photo) {
			this.recipe_main_photo = recipe_main_photo;
		}
		public String getMember_id() {
			return member_id;
		}
		public void setMember_id(String member_id) {
			this.member_id = member_id;
		}
		public String getRecipe_title() {
			return recipe_title;
		}
		public void setRecipe_title(String recipe_title) {
			this.recipe_title = recipe_title;
		}
		public String getRecipe_photo() {
			return recipe_photo;
		}
		public void setRecipe_photo(String recipe_photo) {
			this.recipe_photo = recipe_photo;
		}
		public String getRecipe_detail() {
			return recipe_detail;
		}
		public void setRecipe_detail(String recipe_detail) {
			this.recipe_detail = recipe_detail;
		}
		public DATE getRecipe_regdate() {
			return recipe_regdate;
		}
		public void setRecipe_regdate(DATE recipe_regdate) {
			this.recipe_regdate = recipe_regdate;
		}
		public String getRecipe_material_one() {
			return recipe_material_one;
		}
		public void setRecipe_material_one(String recipe_material_one) {
			this.recipe_material_one = recipe_material_one;
		}
		public String getRecipe_theme() {
			return recipe_theme;
		}
		public void setRecipe_theme(String recipe_theme) {
			this.recipe_theme = recipe_theme;
		}
		public String getRecipe_kind() {
			return recipe_kind;
		}
		public void setRecipe_kind(String recipe_kind) {
			this.recipe_kind = recipe_kind;
		}
		public String getRecipe_material() {
			return recipe_material;
		}
		public void setRecipe_material(String recipe_material) {
			this.recipe_material = recipe_material;
		}
		public int getRecipe_likecount() {
			return recipe_likecount;
		}
		public void setRecipe_likecount(int recipe_likecount) {
			this.recipe_likecount = recipe_likecount;
		}
		@Override
		public String toString() {
			return "RecipeDto [recipe_no=" + recipe_no + ", recipe_main_photo=" + recipe_main_photo + ", member_id="
					+ member_id + ", recipe_title=" + recipe_title + ", recipe_photo=" + recipe_photo
					+ ", recipe_detail=" + recipe_detail + ", recipe_regdate=" + recipe_regdate
					+ ", recipe_material_one=" + recipe_material_one + ", recipe_theme=" + recipe_theme
					+ ", recipe_kind=" + recipe_kind + ", recipe_material=" + recipe_material + ", recipe_likecount="
					+ recipe_likecount + "]";
		}
	
		
		
		
}
