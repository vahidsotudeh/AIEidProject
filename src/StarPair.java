/**
 * Created by ${Microsoft} on 10/04/2016.
 */
public class StarPair {
    String state;
    String pre;
    int funtion[];

    public StarPair(String state, String pre, int funtion[]) {
        this.state = state;
        this.pre = pre;
        this.funtion = funtion;
    }

    public String getState() {
        return state;
    }

    public String getPre() {
        return pre;
    }

    public int[] getFuntion() {
        return funtion;
    }
}
