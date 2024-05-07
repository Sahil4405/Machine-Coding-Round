public class Post {
    private Integer postId;
    private Integer timeStamp;
    private Post next;
    private Post prev;

    public Post(Integer postId) {
        this.postId = postId;
        this.timeStamp = FacebookSystem.timeStamp++;
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

    public Post getNext() {
        return next;
    }

    public void setNext(Post next) {
        this.next = next;
    }

    public Post getPrev() {
        return prev;
    }

    public void setPrev(Post prev) {
        this.prev = prev;
    }
}
