public class YahooSearchSite {
    private static final String YAHOO_URL = "https://www.yahoo.com/";

    public YahooSearchSite (){
        super(YAHOO_URL);

    }
@Override
    public void search(String query){

}

private void autorize(){
        System.out.println(String.format("%s-> Login to Yahoo",this.getClass().getSimpleName()));
}
}
