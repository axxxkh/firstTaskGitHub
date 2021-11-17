package EssentialHomeWorkTwo.AccountRestore;

public class User {
    private AuthenticationData authenticationData;
    private DataForRecovery dataForRecovery;

    public User(AuthenticationData authenticationData, DataForRecovery dataForRecovery) {
        this.authenticationData = authenticationData;
        this.dataForRecovery = dataForRecovery;
    }

    public AuthenticationData getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(AuthenticationData authenticationData) {
        this.authenticationData = authenticationData;
    }

    public DataForRecovery getDataForRecovery() {
        return dataForRecovery;
    }

    public void setDataForRecovery(DataForRecovery dataForRecovery) {
        this.dataForRecovery = dataForRecovery;
    }
}
