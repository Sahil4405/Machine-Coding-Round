public class Post {
    private Integer postId;
    private Integer timeStamp;
    private Post prev;
    private Post next;

    public Post(Integer postId) {
        this.postId = postId;
        this.timeStamp = FacebookSystem.timeStamp++;
        this.prev = null;
        this.next = null;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Post getPrev() {
        return prev;
    }

    public void setPrev(Post prev) {
        this.prev = prev;
    }

    public Post getNext() {
        return next;
    }

    public void setNext(Post next) {
        this.next = next;
    }
}
