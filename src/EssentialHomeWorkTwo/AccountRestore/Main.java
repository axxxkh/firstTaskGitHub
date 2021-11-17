package EssentialHomeWorkTwo.AccountRestore;

public class Main {
    public static void main(String[] args) {
        CollectData collectData = new CollectData();
        CheckData checkData = new CheckData();

        if (!checkData.checkAuthentication(collectData.collectAuthenticationData())) {
            checkData.checkData();
        }
    }
}
