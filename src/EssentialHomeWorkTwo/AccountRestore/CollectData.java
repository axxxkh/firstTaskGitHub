package EssentialHomeWorkTwo.AccountRestore;

import java.util.Scanner;

public class CollectData {
    private AuthenticationData authenticationData = new AuthenticationData();
    private DataForRecovery dataForRecovery = new DataForRecovery();
    private User user = new User(authenticationData, dataForRecovery);
    Scanner input = new Scanner(System.in);

    public AuthenticationData collectAuthenticationData() {
        System.out.println("Enter your login and password divided by Enter");
        this.authenticationData.setLogin(input.next());
        this.authenticationData.setPassword(input.next());
        return authenticationData;
    }

    public DataForRecovery collectDataForRecovery() {
        System.out.println("Enter your year of birth");
        this.dataForRecovery.setBirthYear(input.nextInt());
        System.out.println("Enter your secret question");
        this.dataForRecovery.setSecretQuestion(input.next());
        System.out.println("Enter your answer for secret question");
        this.dataForRecovery.setSecretAnswer(input.next());
        System.out.println("Enter your favorite colour");
        this.dataForRecovery.setFavoriteColour(input.next());
        return dataForRecovery;
    }
}
