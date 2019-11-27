package lecture11;

public class Firefox extends Browser {
    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url:" + url);
        return "Open by Firefox";
    }

    @Override
    public String moveForvard() {
        System.out.println("Move forvard");
        return "Move forvard by Firefox";
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return "Move back by Firefox";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Firefox");
    }

    @Override
    public void download() {
        System.out.println("Download by Chrome");
    }
}

