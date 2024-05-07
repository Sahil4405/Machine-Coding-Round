import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FacebookSystem facebookSystem = new FacebookSystem();
        facebookSystem.follow("100", "200");
        facebookSystem.follow("100", "201");
        facebookSystem.follow("100", "202");
        facebookSystem.follow("100", "203");
        facebookSystem.follow("100", "204");
        facebookSystem.follow("100", "205");
        facebookSystem.follow("100", "206");
        facebookSystem.follow("100", "207");
        facebookSystem.follow("100", "208");
        facebookSystem.follow("100", "209");
        facebookSystem.follow("100", "210");
        facebookSystem.follow("100", "211");
        facebookSystem.follow("100", "212");
        facebookSystem.follow("100", "213");
        facebookSystem.createPost(10001,"100");
        facebookSystem.createPost(1002,"200");
        facebookSystem.createPost(1003,"201");
        facebookSystem.createPost(1004,"202");
        facebookSystem.createPost(1005,"203");
        facebookSystem.createPost(1006, "204");
        facebookSystem.createPost(1007, "205");
        facebookSystem.getNeewsFeed("100");
        facebookSystem.getNewsFeedPaginated("100",2);
    }
}