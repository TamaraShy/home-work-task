public class googleSearchSite {
    public class GoogleSearchSite  extends SearchSite {

        private static final String GOOGLE_URL="https://www.google.com";

        public GoogleSearchSite() {
//        this.url=url;
            super(GOOGLE_URL);
// super - use any Parent method/data
        }

        public void showHints() {
            System.out.println("May be you search for JDK");
            System.out.println("May be you search for Idea");
            System.out.println("May be you search for JavaRush");
        }

    }

}
