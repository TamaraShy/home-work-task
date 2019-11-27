public class InheritanceMain2 { public static void main(String[] args){
    SearchSite google = new googleSearchSite();
        google.search("Java");

        SearchSite duckduckgo = new duckDuckGo();
        google.search("Java");

        SearchSite yahoo = new YahooSearchSite();
        google.search("Java");
    }
}
