package lecture11;

public class InterfaceMain {

    public static void main(String[] args) {
        GoogleChrome googleChrome = new GoogleChrome();
        Firefox Firefox = new Firefox();
        Safari Safari = new Safari();


        User testUser = new User("Bob", googleChrome);

        testUser.searchSomeInfo("jhfjshfkhf");
        testUser.refresh();
    }
}
