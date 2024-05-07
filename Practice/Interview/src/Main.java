//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        FacebookSystem facebookSystem = new FacebookSystem();
        facebookSystem.follow("Sahil", "Harshit1");
        facebookSystem.follow("Sahil", "Harshit2");
        facebookSystem.follow("Sahil", "Harshit3");
        facebookSystem.follow("Sahil", "Harshit4");
        facebookSystem.follow("Sahil", "Harshit5");
        facebookSystem.follow("Sahil", "Harshit6");
        facebookSystem.follow("Sahil", "Harshit7");
        facebookSystem.follow("Sahil", "Harshit8");
        facebookSystem.follow("Sahil", "Harshit9");
        facebookSystem.follow("Sahil", "Harshit10");
        facebookSystem.follow("Sahil", "Manav10");
        facebookSystem.follow("Sahil", "Lasya");
        facebookSystem.follow("Sahil", "Manav1");
        facebookSystem.follow("Sahil", "Manav2");
        facebookSystem.follow("Sahil", "Manav3");
        facebookSystem.createPost("Harshit1", 1000);
        facebookSystem.createPost("Harshit2", 1001);
        facebookSystem.createPost("Manav1", 1002);
        facebookSystem.createPost("Lasya", 1003);
        facebookSystem.createPost("Manav3", 1004);
        facebookSystem.createPost("Manav2", 1005);
        facebookSystem.createPost("Harshit7", 1006);
        facebookSystem.createPost("Harshit8", 1007);
        facebookSystem.createPost("Harshit9", 1008);
        facebookSystem.createPost("Harshit3", 1009);
        facebookSystem.createPost("Harshit4", 1010);
        facebookSystem.createPost("Harshit5", 1011);
        facebookSystem.createPost("Harshit6", 1012);
        facebookSystem.createPost("Manav10", 999);
        System.out.println("Fetching feed before deletion");
        facebookSystem.getNewsFeed("Sahil");
        facebookSystem.unfollow("Sahil","Manav10");
//        facebookSystem.deletePost("Harshit9",1008);
        System.out.println("After delete one post");
        facebookSystem.getNewsFeed("Sahil");

    }
}



/*
User
->
Post

head

tail


getNewsFeed


 */