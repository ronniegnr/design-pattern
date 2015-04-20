import java.util.ArrayList;
import java.util.List;


public class Pool {

    private int poolSize;
    private List<PooledObject> availableObjects;
    private List<PooledObject> blockedObjects;

    public Pool() {
        this.poolSize = 50;
        availableObjects = new ArrayList<PooledObject>();
        blockedObjects = new ArrayList<PooledObject>();
    }

    public Pool(int poolSize) {
        this.poolSize = poolSize;
    }

    public PooledObject get() {
        if (getAvailableObjectCount() > 0) {
            PooledObject pooledObject = availableObjects.get(0);
            if (availableObjects.remove(pooledObject)) {
                blockedObjects.add(pooledObject);
                return pooledObject;
            } else {
                return getNewPooledObject();
            }
        } else {
            return getNewPooledObject();
        }
    }

    public void release(PooledObject pooledObject) {
        if (blockedObjects.remove(pooledObject)) {
            availableObjects.add(pooledObject);
        }
    }

    public int getAvailableObjectCount() {
        return this.availableObjects.size();
    }

    public int getBlockedObjectCountr() {
        return this.blockedObjects.size();
    }

    private PooledObject getNewPooledObject() {
        addObjectToPool();
        return get();
    }

    private void addObjectToPool() {
        PooledObject pooledObject = new PooledObject();
        this.availableObjects.add(pooledObject);
    }

    @Override
    public String toString() {
        return "Pool{" +
                "  \n\tpoolSize=" + poolSize +
                ", \n\tavailableObjects=" + availableObjects +
                ", \n\tblockedObjects=" + blockedObjects +
                "\n}";
    }
}
