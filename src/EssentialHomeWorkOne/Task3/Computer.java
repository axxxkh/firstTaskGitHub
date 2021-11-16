package EssentialHomeWorkOne.Task3;

public class Computer {
    public int computerNumber;
    public int globalAdressOfTheComputer;

    public static void main(String[] args) {
        Computer[] computersDatabase = new Computer[5];
        computersDatabase[0] = new Computer();
        computersDatabase[1] = new Computer();
        computersDatabase[2] = new Computer();
        computersDatabase[3] = new Computer();
        computersDatabase[4] = new Computer();

        for (int i = 0; i < computersDatabase.length; i++) {
            computersDatabase[i].computerNumber = i + 1;
            computersDatabase[i].globalAdressOfTheComputer = (int) (Math.random() * 10000000);
        }
        for (int i = 0; i < computersDatabase.length; i++) {
            System.out.println(computersDatabase[i].computerNumber + " " + computersDatabase[i].globalAdressOfTheComputer);
        }
    }
}
