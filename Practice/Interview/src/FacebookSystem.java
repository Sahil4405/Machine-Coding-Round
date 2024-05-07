import java.util.*;

public class FacebookSystem {
    private User user;
    private Map<String, User> userMap;
    public static int timeStamp;

    public FacebookSystem() {
        this.user = new User("0");
        this.userMap = new HashMap<>();
        this.timeStamp = 0;
    }

    public void follow(String mainUserName, String followerName){
        User mainUser = userMap.get(mainUserName);

        if(mainUser == null){
            mainUser = new User(mainUserName);
            userMap.put(mainUserName, mainUser);
        }

        User follower = userMap.get(followerName);

        if(follower == null){
            follower = new User(followerName);
            userMap.put(followerName, follower);
        }
        mainUser.follow(follower);
    }

    public void unfollow(String userName, String followeeName){
        User user = userMap.get(userName);
        User followee= userMap.get(followeeName);

        if(user == null || followee == null){
            System.out.println("User or followee is incorrect!!");
            return;
        }
        user.unfollow(followee);
    }

    public void createPost(String userName, Integer postId){
        User user = userMap.get(userName);

        if(user == null) {
            user = new User(userName);
            userMap.put(userName, user);
        }
        user.createPost(postId);
    }

    public void deletePost(String userName, Integer postId){
        User user = userMap.get(userName);

        if(user == null){
            System.out.println("Given user ID is not present");
            return;
        }

        user.deletePost(postId);
    }

    private List<Post> fetchTopNFeed(String userName, Integer numberOfFeed){
        User user = userMap.get(userName);
        List<User> follower = user.getFollowers();
        List<Post> posts = new ArrayList<>();
        Integer count = 0;

        PriorityQueue<Post> pq = new PriorityQueue<>((a,b) -> b.getTimeStamp() - a.getTimeStamp());

        for(User currentUser: follower){
            Post head = currentUser.getHead();
            Post tail = currentUser.getTail();

            if(head.getNext() != tail){
                pq.add(head.getNext());
            }
        }

        while(!pq.isEmpty() && count < numberOfFeed){
            Post topPost = pq.poll();
            posts.add(topPost);

            if(topPost.getNext().getPostId() != -1){
                pq.add(topPost.getNext());
            }
        }

        return posts;
    }

    public void getNewsFeed(String userName){
        List<Post> newsFeed = fetchTopNFeed(userName, 100);

        for(Post post: newsFeed){
            System.out.println("Post: " + post.getPostId());
        }
    }
}


























