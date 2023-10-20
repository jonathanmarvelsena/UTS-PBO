package UTS.main;

import UTS.controller.*;
import UTS.model.*;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.user1.showUserPosts();
        controller.user1.getPosts().get(0).showPost("reel1", controller.user1);
        controller.user1.changePostState(controller.user1.getPosts().get(1), ContentState.ARCHIVED);
        System.out.println();
        controller.user1.showUserPosts();
    }
}
