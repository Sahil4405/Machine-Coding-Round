import java.util.*;

public class FacebookSystem {
    private Map<String, User> userMap;
    private Integer PAGE_SIZE;
    private Integer Feed_Size;
    public static int timeStamp;

    public FacebookSystem() {
        this.userMap = new HashMap<>();
        this.PAGE_SIZE = 2;
        this.Feed_Size = 10;
        this.timeStamp = 0;
    }

    public Set<User> getFollowerList(String userId){
        User user = userMap.get(userId);
        return user.getFollowers();
    }

    public void createPost(Integer postId, String userId){
        User user = userMap.get(userId);
        if(user == null){
            user = new User(userId);
            userMap.put(userId, user);
        }

        user.createPost(postId);
    }

    public void follow(String userId, String followeeId){
        User user = userMap.get(userId);
        if (user == null){
            user = new User(userId);
            userMap.put(userId, user);
        }

        User followee = userMap.get(followeeId);
        if(followee == null){
            followee = new User(followeeId);
            userMap.put(followeeId, followee);
        }
        user.follow(followee);
    }

    private List<Post> fetchNTopFeed(String userId, Integer N){
        User currentUser = userMap.get(userId);
        Set<User> followerList = currentUser.getFollowers();
        List<Post> post = new LinkedList<>();
        PriorityQueue<Post> pq = new PriorityQueue<>((a,b) -> (b.getTimeStamp() - a.getTimeStamp()));
        for(User follower: followerList){
            Post head = follower.getHead();
            Post tail = follower.getTail();

            if(head.getNext() != tail){
                pq.add(head.getNext());
            }
        }

        Integer count = 0;
        while(!pq.isEmpty() && count < N){
            count++;
            Post currPost = pq.poll();
            post.add(currPost);

            if(currPost.getNext().getPostId() != -1){
                pq.add(currPost.getNext());
            }
        }

        return post;
    }

    public void getNeewsFeed(String userId){
        List<Post> newsFeed = fetchNTopFeed(userId, 10);
        System.out.println("scac " + newsFeed.size());

        for(Post currPost: newsFeed){
            System.out.println("post " + currPost.getPostId());
        }
    }

    public void getNewsFeedPaginated(String userId, Integer pageNumber){
        User user = userMap.get(userId);
        if(user == null){
            System.out.println("User is not present with this userId: " + userId);
            return ;
        }
        List<Post> topPosts = fetchNTopFeed(userId, Integer.MAX_VALUE);
        Integer start = pageNumber * PAGE_SIZE;
        Integer end = Math.min(start + PAGE_SIZE, topPosts.size());

        if(start > end)
            return;

        List<Post> newFeeds = topPosts.subList(start,end);

        for (Post currPost: newFeeds){
            System.out.println("currPost " + currPost.getPostId());
        }
    }
}




















