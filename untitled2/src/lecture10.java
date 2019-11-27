public class lecture10 {

    public static void main(String[]args){
        SearchSite searchSite = new SearchSite("https://www.google.com/");
        searchSite.search("Java");

        SearchSite searchSite1 = new SearchSite("https://www.duckduck.com");
        searchSite.search("Java");

        SearchSite searchSite2 = new SearchSite("https://www.yahoo.com/");
        searchSite.search("Java");
    }
}
