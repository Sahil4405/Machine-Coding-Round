import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String userName;
    private List<User> followers;
    private Post head;
    private Post tail;
    private Map<Integer, Post> postMap;

    public User(String userName) {
        this.userName = userName;
        this.followers = new ArrayList<>();
        this.head = new Post(-1);
        this.tail = new Post(-1);
        this.postMap = new HashMap<>();

        head.setNext(tail);
        tail.setPrev(head);
    }

    public void follow(User followee){
        this.followers.add(followee);
    }

    public void unfollow(User followee){
        followers.remove(followee);
    }

    public void createPost(Integer postId){
//        postMap.put(post.getPostId(), post);
        Post newPost = new Post(postId);
        postMap.put(postId, newPost);

        Post next = head.getNext();
        head.setNext(newPost);
        next.setPrev(newPost);

        newPost.setPrev(head);
        newPost.setNext(next);
    }

    public void deletePost(Integer postId){
        Post post = postMap.get(postId);
        postMap.remove(postId);

        Post prev = post.getPrev();
        Post next = post.getNext();

        prev.setNext(next);
        prev.setPrev(prev);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
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

    public Map<Integer, Post> getPostMap() {
        return postMap;
    }

    public void setPostMap(Map<Integer, Post> postMap) {
        this.postMap = postMap;
    }
}
