package lecture11;

public class User {

    private String name;
    private IBrowser browser;
    private FileDownload fileDownload;

    public User(String name, Browser browser) {
        this.name = name;
        this.browser = browser;
        this.fileDownload = browser;
    }

    public User(String name, IBrowser browser ) {
        this.name = name;
        this.browser = browser;
    }

    public void searchSomeInfo(String url){
        System.out.println("User" + name + "search Info...");
        browser.navigateToUrl(url);
    }

    public void refresh(){
        System.out.println("User" + name + "refresh page...");
        browser.refresh();
    }

    public void downloadFile(){
        if (fileDownload == null){
            System.out.println("Unsopposted browser type!");
            return;
        }
        System.out.println("User " + name + "download file..");
        fileDownload.download();
    }
}
