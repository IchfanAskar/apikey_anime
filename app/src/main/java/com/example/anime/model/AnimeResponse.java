package com.example.anime.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeResponse {



    /**
     * status : 2
     * score : 8
     * tags :
     * is_rewatching : 0
     * num_watched_episodes : 1
     * anime_title : Dragon Ball Z Movie 09: Ginga Girigiri!! Bucchigiri no Sugoi Yatsu
     * anime_num_episodes : 1
     * anime_airing_status : 2
     * anime_id : 902
     * anime_studios : null
     * anime_licensors : null
     * anime_season : null
     * has_episode_video : false
     * has_promotion_video : true
     * has_video : true
     * video_url : /anime/902/Dragon_Ball_Z_Movie_09__Ginga_Girigiri_Bucchigiri_no_Sugoi_Yatsu/video
     * anime_url : /anime/902/Dragon_Ball_Z_Movie_09__Ginga_Girigiri_Bucchigiri_no_Sugoi_Yatsu
     * anime_image_path : https://cdn.myanimelist.net/r/96x136/images/anime/1730/93672.jpg?s=a069d08230f70ba97a52aa9c41effe48
     * is_added_to_list : false
     * anime_media_type_string : Movie
     * anime_mpaa_rating_string : PG-13
     * start_date_string : 03-09-16
     * finish_date_string : 03-09-16
     * anime_start_date_string : 07-10-93
     * anime_end_date_string : 07-10-93
     * days_string : 1
     * storage_string :
     * priority_string : Low
     */

    @SerializedName("status")
    private int status;
    @SerializedName("score")
    private int score;
    @SerializedName("tags")
    private String tags;
    @SerializedName("is_rewatching")
    private String isRewatching;
    @SerializedName("num_watched_episodes")
    private int numWatchedEpisodes;
    @SerializedName("anime_title")
    private String animeTitle;
    @SerializedName("anime_num_episodes")
    private int animeNumEpisodes;
    @SerializedName("anime_airing_status")
    private int animeAiringStatus;
    @SerializedName("anime_id")
    private int animeId;
    @SerializedName("anime_studios")
    private Object animeStudios;
    @SerializedName("anime_licensors")
    private Object animeLicensors;
    @SerializedName("anime_season")
    private Object animeSeason;
    @SerializedName("has_episode_video")
    private boolean hasEpisodeVideo;
    @SerializedName("has_promotion_video")
    private boolean hasPromotionVideo;
    @SerializedName("has_video")
    private boolean hasVideo;
    @SerializedName("video_url")
    private String videoUrl;
    @SerializedName("anime_url")
    private String animeUrl;
    @SerializedName("anime_image_path")
    private String animeImagePath;
    @SerializedName("is_added_to_list")
    private boolean isAddedToList;
    @SerializedName("anime_media_type_string")
    private String animeMediaTypeString;
    @SerializedName("anime_mpaa_rating_string")
    private String animeMpaaRatingString;
    @SerializedName("start_date_string")
    private String startDateString;
    @SerializedName("finish_date_string")
    private String finishDateString;
    @SerializedName("anime_start_date_string")
    private String animeStartDateString;
    @SerializedName("anime_end_date_string")
    private String animeEndDateString;
    @SerializedName("days_string")
    private int daysString;
    @SerializedName("storage_string")
    private String storageString;
    @SerializedName("priority_string")
    private String priorityString;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIsRewatching() {
        return isRewatching;
    }

    public void setIsRewatching(String isRewatching) {
        this.isRewatching = isRewatching;
    }

    public int getNumWatchedEpisodes() {
        return numWatchedEpisodes;
    }

    public void setNumWatchedEpisodes(int numWatchedEpisodes) {
        this.numWatchedEpisodes = numWatchedEpisodes;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public int getAnimeNumEpisodes() {
        return animeNumEpisodes;
    }

    public void setAnimeNumEpisodes(int animeNumEpisodes) {
        this.animeNumEpisodes = animeNumEpisodes;
    }

    public int getAnimeAiringStatus() {
        return animeAiringStatus;
    }

    public void setAnimeAiringStatus(int animeAiringStatus) {
        this.animeAiringStatus = animeAiringStatus;
    }

    public int getAnimeId() {
        return animeId;
    }

    public void setAnimeId(int animeId) {
        this.animeId = animeId;
    }

    public Object getAnimeStudios() {
        return animeStudios;
    }

    public void setAnimeStudios(Object animeStudios) {
        this.animeStudios = animeStudios;
    }

    public Object getAnimeLicensors() {
        return animeLicensors;
    }

    public void setAnimeLicensors(Object animeLicensors) {
        this.animeLicensors = animeLicensors;
    }

    public Object getAnimeSeason() {
        return animeSeason;
    }

    public void setAnimeSeason(Object animeSeason) {
        this.animeSeason = animeSeason;
    }

    public boolean isHasEpisodeVideo() {
        return hasEpisodeVideo;
    }

    public void setHasEpisodeVideo(boolean hasEpisodeVideo) {
        this.hasEpisodeVideo = hasEpisodeVideo;
    }

    public boolean isHasPromotionVideo() {
        return hasPromotionVideo;
    }

    public void setHasPromotionVideo(boolean hasPromotionVideo) {
        this.hasPromotionVideo = hasPromotionVideo;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAnimeUrl() {
        return animeUrl;
    }

    public void setAnimeUrl(String animeUrl) {
        this.animeUrl = animeUrl;
    }

    public String getAnimeImagePath() {
        return animeImagePath;
    }

    public void setAnimeImagePath(String animeImagePath) {
        this.animeImagePath = animeImagePath;
    }

    public boolean isIsAddedToList() {
        return isAddedToList;
    }

    public void setIsAddedToList(boolean isAddedToList) {
        this.isAddedToList = isAddedToList;
    }

    public String getAnimeMediaTypeString() {
        return animeMediaTypeString;
    }

    public void setAnimeMediaTypeString(String animeMediaTypeString) {
        this.animeMediaTypeString = animeMediaTypeString;
    }

    public String getAnimeMpaaRatingString() {
        return animeMpaaRatingString;
    }

    public void setAnimeMpaaRatingString(String animeMpaaRatingString) {
        this.animeMpaaRatingString = animeMpaaRatingString;
    }

    public String getStartDateString() {
        return startDateString;
    }

    public void setStartDateString(String startDateString) {
        this.startDateString = startDateString;
    }

    public String getFinishDateString() {
        return finishDateString;
    }

    public void setFinishDateString(String finishDateString) {
        this.finishDateString = finishDateString;
    }

    public String getAnimeStartDateString() {
        return animeStartDateString;
    }

    public void setAnimeStartDateString(String animeStartDateString) {
        this.animeStartDateString = animeStartDateString;
    }

    public String getAnimeEndDateString() {
        return animeEndDateString;
    }

    public void setAnimeEndDateString(String animeEndDateString) {
        this.animeEndDateString = animeEndDateString;
    }

    public int getDaysString() {
        return daysString;
    }

    public void setDaysString(int daysString) {
        this.daysString = daysString;
    }

    public String getStorageString() {
        return storageString;
    }

    public void setStorageString(String storageString) {
        this.storageString = storageString;
    }

    public String getPriorityString() {
        return priorityString;
    }

    public void setPriorityString(String priorityString) {
        this.priorityString = priorityString;
    }
}
