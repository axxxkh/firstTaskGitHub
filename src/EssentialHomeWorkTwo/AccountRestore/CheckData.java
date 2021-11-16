package EssentialHomeWorkTwo.AccountRestore;

public class CheckData {
    private DataForRecovery dataForRecovery = new DataForRecovery();
    private AuthenticationData authenticationData = new AuthenticationData();
    private User realUserData; // = new User(authenticationData, dataForRecovery);
    private int answerWeight;

    public CheckData() {
        authenticationData.setLogin("admin");
        authenticationData.setPassword("12345");

        dataForRecovery.setBirthYear(1900);
        dataForRecovery.setSecretQuestion("Who");
        dataForRecovery.setSecretAnswer("me");
        dataForRecovery.setLastOrder(12345);
        dataForRecovery.setFavoriteColour("red");

        realUserData = new User(authenticationData, dataForRecovery);
    }


    private AuthenticationData authenticationDataReal = new AuthenticationData();
    //private User currentUserData = new User(authenticationData, dataForRecovery);

    public boolean checkAuthentication(AuthenticationData authenticationDataCurrentUser) {
        if (realUserData.getAuthenticationData().getLogin().equals(authenticationDataCurrentUser.getLogin()) &&
                realUserData.getAuthenticationData().getPassword().equals(authenticationDataCurrentUser.getPassword())) {
            System.out.println("Your login and password correct. You've signed up");
            return true;
        }
        return false;
    }

    public boolean compareAnswers(DataForRecovery dataForRecovery) {
        answerWeight = 0;
        if (dataForRecovery.getBirthYear() == realUserData.getDataForRecovery().getBirthYear()) {
            answerWeight += AnswerWeight.birthYear;
        }

        if (dataForRecovery.getSecretQuestion().equals(realUserData.getDataForRecovery().getSecretQuestion())) {
            answerWeight += AnswerWeight.secretQuestion;
        }

        if (dataForRecovery.getSecretAnswer().equals((realUserData.getDataForRecovery().getSecretAnswer()))) {
            answerWeight += AnswerWeight.secretAnswer;
        }

        if (dataForRecovery.getFavoriteColour().equals(realUserData.getDataForRecovery().getFavoriteColour())) {
            answerWeight += AnswerWeight.lastOrder;
        }

        if (answerWeight > 60) {
            return true;
        }
        return false;
    }

    public void checkData() {
        CollectData collectData = new CollectData();
        CheckData checkData = new CheckData();
        for (int i = 0; i < 3; i++) {
            System.out.println("Your data is incorect, answer additional questions");
            if (compareAnswers(collectData.collectDataForRecovery())) {
                System.out.println("Ok. Your answers is right. You can restore your accaunt");
                return;
            }
        }
        System.out.println("Too many mistakes. sorry but you cant restore your account");
    }
}
