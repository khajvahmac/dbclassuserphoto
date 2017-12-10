package uni.homework.userphoto.model;

/**
 * Created by khajvah on 12/10/17.
 */
public class Response<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
