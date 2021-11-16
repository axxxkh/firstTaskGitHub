package EssentialHomeWorkTwo.AccountRestore;

public class DataForRecovery {
    private int birthYear;
    private String secretQuestion;
    private String secretAnswer;
    private int lastOrder;

    public int getBirthYear() {
        return birthYear;
    }

    public DataForRecovery() {
    }

    public DataForRecovery(int birthYear, String secretQuestion, String secretAnswer, int lastOrder, String favoriteColour) {
        this.birthYear = birthYear;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.lastOrder = lastOrder;
        this.favoriteColour = favoriteColour;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public int getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(int lastOrder) {
        this.lastOrder = lastOrder;
    }

    public String getFavoriteColour() {
        return favoriteColour;
    }

    public void setFavoriteColour(String favoriteColour) {
        this.favoriteColour = favoriteColour;
    }

    private String favoriteColour;


}
