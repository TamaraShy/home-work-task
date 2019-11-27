public class duckDuckGo {
    public class GoogleSearchSite  extends SearchSite {

        public GoogleSearchSite(String url) {
//        this.url=url;
            super(url);
        }

        public class DuckDuckGo extends SearchSite {

            private static final String DUCKDUCK_URL="https://www.duckduck.com";

            public DuckDuckGo() {
                super(DUCKDUCK_URL);
            }
        }
   }
}
