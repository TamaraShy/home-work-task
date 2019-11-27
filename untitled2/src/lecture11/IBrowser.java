package lecture11;

public interface IBrowser {

    String navigateToUrl(String url);

    String moveForvard();

    String moveBack();

    void refresh();

}
