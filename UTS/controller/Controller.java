package UTS.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import UTS.model.*;

public class Controller {
    public ArrayList<Comment> comments = new ArrayList<>();
    public ArrayList<Post> posts = new ArrayList<>();
    public User user1 = new User("user1", "user1_username", "password1", "#gratitudeisthebestattitude", posts);

    public Controller() {
        Comment comment1 = new Comment("comment1", "@user2 pacar cina", ContentState.SHOWED);
        Comment comment2 = new Comment("comment2", "yo buddy, still alive?", ContentState.SHOWED);
        comments.add(comment1);
        comments.add(comment2);

        Feed feed1 = new Feed("feed1", ContentState.PINNED, new Timestamp(System.currentTimeMillis()),
                ContentType.PICTURE, new ArrayList<>(Arrays.asList(comment1, comment2)), "how", 10);
        Feed feed2 = new Feed("feed2", ContentState.SHOWED, new Timestamp(System.currentTimeMillis()),
                ContentType.VIDEO, new ArrayList<>(Arrays.asList(comment1)), "certified bruh moment", 20);
        posts.add(feed1);
        posts.add(feed2);

        Reel reel1 = new Reel("reel1", ContentState.SHOWED, new Timestamp(System.currentTimeMillis()),
                ContentType.VIDEO, new ArrayList<>(Arrays.asList(comment2)), 30, 1000);
        Reel reel2 = new Reel("reel2", ContentState.SHOWED, new Timestamp(System.currentTimeMillis()),
                ContentType.VIDEO, new ArrayList<>(Arrays.asList(comment2)), 40, 1500);
        posts.add(reel1);
        posts.add(reel2);

        Story story1 = new Story("story1", ContentState.ARCHIVED, new Timestamp(System.currentTimeMillis()),
                ContentType.PICTURE, new ArrayList<>(Arrays.asList(comment1, comment2)), 15, 500);
        Story story2 = new Story("story2", ContentState.SHOWED, new Timestamp(System.currentTimeMillis()),
                ContentType.PICTURE, new ArrayList<>(Arrays.asList(comment1, comment2)), 20, 700);
        posts.add(story1);
        posts.add(story2);
    }
}
