import java.sql.Timestamp;
import java.util.Date;

public class PooledObject {

    private Timestamp created;
    private double id;
    private static int count = 0;

    public PooledObject() {
        this.created = new Timestamp(new Date().getTime());
        this.id = Math.random();
        count++;
    }

    @Override
    public String toString() {
        return "PooledObject{" +
                "created=" + created +
                ", id=" + id +
                '}';
    }
}
