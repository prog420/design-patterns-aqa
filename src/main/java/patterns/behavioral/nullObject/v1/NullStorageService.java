package patterns.behavioral.nullObject.v1;

/**
 * Override every method from our base class in the null object
 */
public class NullStorageService extends StorageService {
    @Override
    public void save(Report report) {
        System.out.println("Null object save method. Doing nothing");
    }
}
