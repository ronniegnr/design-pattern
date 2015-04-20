public class Main {

    public static void main(String[] args) {
        Pool pool = new Pool();
        PooledObject pooledObject1 = pool.get();
        PooledObject pooledObject2 = pool.get();
        PooledObject pooledObject3 = pool.get();
        //System.out.println("-- 1st pring --");
        //System.out.println(pooledObject1 + " " + pooledObject2 + " " + pooledObject3);

        pool.release(pooledObject2);
        //PooledObject pooledObject4 = pool.get();
        //System.out.println("-- 2nd pring --");
        //System.out.println(pooledObject1 + " " + pooledObject3 + " " + pooledObject4);

        System.out.println(pool.toString());
    }
}
