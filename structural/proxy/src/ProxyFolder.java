public class ProxyFolder implements Folder {

    private RealFolder realFolder;
    private User user;

    public ProxyFolder(User user) {
        this.user = user;
    }

    @Override
    public void performOperation() {
        if(true) { // perform user credential check here
            if (realFolder == null) {
                realFolder = new RealFolder();
            }
            realFolder.performOperation();
        }
        else {
            System.out.println("Unauthorized access to the file.");
        }

    }

}
