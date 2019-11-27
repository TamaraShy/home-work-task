package lecture11;

public class Safari implements IBrowser{
    @Override
    public String navigateToUrl(String url) {
        System.out.println("Open url:" + url);
        return "Open by Safari";
    }

    @Override
    public String moveForvard() {
        System.out.println("Move forvard");
        return "Move forvard by Safari";
    }

    @Override
    public String moveBack() {
        System.out.println("Move back");
        return "Move back by Safari";
    }

    @Override
    public void refresh() {
        System.out.println("Refresh by Safari");
    }
}

