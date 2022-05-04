package model.stroy;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class Story implements Serializable {
  private List<? extends DownloadLinks> downloadLinks;

  private String profilePic;

  private Integer totalStories;

  private String status;

  private Integer statusCode;

  public List<? extends DownloadLinks> getDownloadLinks() {
    return this.downloadLinks;
  }

  public void setDownloadLinks(List<? extends DownloadLinks> downloadLinks) {
    this.downloadLinks = downloadLinks;
  }

  public String getProfilePic() {
    return this.profilePic;
  }

  public void setProfilePic(String profilePic) {
    this.profilePic = profilePic;
  }

  public Integer getTotalStories() {
    return this.totalStories;
  }

  public void setTotalStories(Integer totalStories) {
    this.totalStories = totalStories;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public static class DownloadLinks implements Serializable {
    private Integer createdAt;

    private String thumbnail;

    private Integer media_type;

    private String mediaType;

    private Integer expiringAt;

    private String url;

    public Integer getCreatedAt() {
      return this.createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
      this.createdAt = createdAt;
    }

    public String getThumbnail() {
      return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
      this.thumbnail = thumbnail;
    }

    public Integer getMedia_type() {
      return this.media_type;
    }

    public void setMedia_type(Integer media_type) {
      this.media_type = media_type;
    }

    public String getMediaType() {
      return this.mediaType;
    }

    public void setMediaType(String mediaType) {
      this.mediaType = mediaType;
    }

    public Integer getExpiringAt() {
      return this.expiringAt;
    }

    public void setExpiringAt(Integer expiringAt) {
      this.expiringAt = expiringAt;
    }

    public String getUrl() {
      return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
  }
}
