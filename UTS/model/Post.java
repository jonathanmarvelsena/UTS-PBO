package UTS.model;

import java.util.ArrayList;
import java.sql.Timestamp;

public abstract class Post {
    private String postId;
    private ContentState status;
    private Timestamp timeUpload;
    private ContentType postType;
    private ArrayList<Comment> comments;

    public Post(String postId, ContentState status, Timestamp timeUpload, ContentType postType,
            ArrayList<Comment> comments) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
        this.comments = comments;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public ContentState getStatus() {
        return status;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ContentType getPostType() {
        return postType;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public void showPost(String id, User user) {
        for (Post p : user.getPosts()) {
            if (p instanceof Reel) {
                Reel reel = (Reel) p;
                if (reel.getPostId().equals(id)) {
                    System.out.println("Post ID: " + reel.getPostId() +
                            ", Status: " + reel.getStatus() +
                            ", Type: " + reel.getPostType() +
                            ", Time Upload: " + reel.getTimeUpload() +
                            ", Duration: " + reel.getDuration() +
                            ", Play Count: " + reel.getPlayCount());
                    break;
                } else {
                    if (p instanceof Story) {
                        Story story = (Story) p;
                        if (story.getPostId().equals(id)) {
                            System.out.println("Post ID: " + story.getPostId() +
                                    ", Status: " + story.getStatus() +
                                    ", Type: " + story.getPostType() +
                                    ", Time Upload: " + story.getTimeUpload() +
                                    ", Duration: " + story.getDuration() +
                                    ", Views: " + story.getView());
                            break;
                        }
                    } else {
                        if (p instanceof Feed) {
                            Feed feed = (Feed) p;
                            if (feed.getPostId().equals(id)) {
                                System.out.println("Post ID: " + feed.getPostId() +
                                        ", Status: " + feed.getStatus() +
                                        ", Type: " + feed.getPostType() +
                                        ", Time Upload: " + feed.getTimeUpload() +
                                        ", Caption: " + feed.getCaption() +
                                        ", Likes: " + feed.getLikes());
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
