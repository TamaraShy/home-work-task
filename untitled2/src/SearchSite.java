public class SearchSite {
    private String url;

    public SearchSite(String url) {
        this.url = url;
    }

    public void search (String query){
        System.out.println(String.format("Srart search at%s for %s...",this.getClass().getSimpleName(),url, query));
    }
}

