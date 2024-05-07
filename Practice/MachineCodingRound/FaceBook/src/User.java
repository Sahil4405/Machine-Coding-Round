import java.util.*;

public class User {
    private String userId;
    private Set<User> followers;
    private Post head;
    private Post tail;
    private Map<Integer, Post> postMap;

    public User(String userId) {
        this.userId = userId;
        this.followers = new HashSet<>();
        this.postMap = new HashMap<>();
        this.head = new Post(-1);
        this.tail = new Post(-1);

        head.setNext(tail);
        head.setPrev(null);

        tail.setPrev(head);
        tail.setNext(null);
    }

    public void createPost(Integer postId){
        Post post = new Post(postId);
        postMap.put(postId, post);

        Post next = head.getNext();
        head.setNext(post);
        next.setPrev(post);

        post.setNext(next);
        post.setPrev(head);
    }

    public void follow(User follower){
        followers.add(follower);
    }

    public void unfollow(User follower){
        followers.remove(follower);
    }

    public Set<User> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<User> followers) {
        this.followers = followers;
    }

    public Post getHead() {
        return head;
    }

    public void setHead(Post head) {
        this.head = head;
    }

    public Post getTail() {
        return tail;
    }

    public void setTail(Post tail) {
        this.tail = tail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
