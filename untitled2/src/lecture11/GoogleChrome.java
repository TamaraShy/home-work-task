package lecture11;

public class GoogleChrome extends Browser {

    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url:" + url);
        return "Open by Chrome";
    }

    @Override
    public String moveForvard() {
        System.out.println("Move forvard");
        return "Move forvard by Chrome";
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return "Move back by Chrome";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Chrome");
    }

    @Override
    public void download() {
       System.out.println("Download by Chrome");
    }
}
