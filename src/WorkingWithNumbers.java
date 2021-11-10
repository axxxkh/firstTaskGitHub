import java.util.Scanner;

public class WorkingWithNumbers {
    public static Scanner input = new Scanner(System.in);
    static int[] array;
    public static int[][] doubleArray;

    //пошук найбільшого за допомогою циклу
    public static int maxNumberCycle() {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber = array[i] < maxNumber ? maxNumber : array[i];
        }
        return maxNumber;
    }

    //пошук максимального за допомогою рекурсії
    public static int maxNumberRec(int index) {
        if (index + 1 < array.length) {
            int max = maxNumberRec(++index);
            if (max > array[index]) {
                return max;
            }
        }
        return array[index];
    }

    // пошук мінімального за допомогою циклу
    public static int minNumberCycle() {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            minNumber = array[i] > minNumber ? minNumber : array[i];
        }
        return minNumber;
    }

    //пошук мінімального за допомогою рекурсии
    public static int minNumberRec(int index) {
        if (index + 1 < array.length) {
            int min = minNumberRec(++index);
            if (min < array[index]) {
                return min;
            }
        }
        return array[index];
    }

    // пошук суми через цикл
    public static int sumArrayCycle() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // пошук суми через рекурсію
    public static int sumArrayRec(int index) {
        if (index < array.length) {
            return array[index] + sumArrayRec(++index);
        }
        return 0;
    }

    // пошук серднього значення через цикл і виклик методу суми
    public static double averageCycle() {
        return (double) (sumArrayCycle()) / array.length;
    }

    //пошук середнього значення за допомогою рекурсіії
    public static double averageRec(int index) {
        if (index < array.length) {
            return (double) (array[index] + sumArrayRec(++index)) / array.length;
        }
        return 0;
    }

    //заповнення масиву за допомогою циклу
    public static int[] fillArrayCycle() {
        System.out.println("Enter size of an array");
        int size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // заповнення масиву за допомогою рекурсії
    public static int[] fillArrayRec(int index) {
        if (index < array.length) {
            array[index] = (int) (Math.random() * 100);
            return fillArrayRec(++index);
        }
        return array;
    }

    // заповнення двовимірного масиву за допомогою циклу
    public static int[][] fillArrayCycle(int indexX, int indexY) {
        doubleArray = new int[indexX][indexY];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return doubleArray;
    }

    /*     заповнення двовимірного масиву за допомогою рекурсії
     * спочатку пробував передавати в метод таблицю, все працювало, а потім
     * прийшов до висновку що немає в цьому змісту, а простіше створити
     * глобальну змінну до якої буде звертатись метод
     * */
    public static int[][] fillArrayRec(int indexX, int indexY) {
        if (indexX < doubleArray.length) {
            if (indexY < doubleArray[indexX].length) {
                doubleArray[indexX][indexY] = (int) (Math.random() * 100);
                return fillArrayRec(indexX, ++indexY);
            }
            return fillArrayRec(++indexX, 0);
        }
        return doubleArray;
    }

    /*
     * вивід одновимірного масива в термінал
     * застосував overload, тут він в принципі логічний, в залежновсті від того чи передається
     * одновимірний масив чи двовимірний використовується один чи другий метод
     * після того як масиви стали глобальними з цього взагалі забрав параметр одновимірного масиву
     */
    public static void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // вивід двовимірного масиву в термінал
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }

    /*
    в принципі при розумінні нічого важкого в рекурсії немає, аналог циклу за допомогою рекурсії виконується
    через if та виклик цього самого методу з передачею параметру (аналог лічильника в циклі),
    ну і відповідно зворотній шлях рекурсії немає ніяк впливати на результат, тобто або 0 в додаванні, відніманні
    або 1 у випадку множення ділення.
    Але основні проблеми рекурсії це важкість читанння та пошуку помилки, великий шанс
    створити бескінечну рекурсію. що призведе по ідеї до Stack overflow, переповнення буферу,
    якщо в JVM не вбудовано захисту від цього. тут не в курсі.
    ну і рекурсія викликає саму себе, тобто при цьому створюються нові тимчасові змінні,
    які резервують память, тому при достатньо великій глибині рекурсії обсяг памяті зростає
    пропорціонально глибині рекурсії, у той час як при використанні циклу такої проблеми немає
    при кожній ітерації використовуються ті самі змінні.

    видалив сміття, створив нову гілку на гітхабі
    */
    public static void main(String[] args) {
        int addNewVarTomakeAnotherBranch;
        fillArrayCycle();
        System.out.println("Here is your array created with cycle");
        printArray();
        System.out.println("And another array created with recursion");
        fillArrayRec(0);
        printArray();
        System.out.printf("This is cycle, max number %d, min number %d, average number %.2f, sum of all %d",
                maxNumberCycle(), minNumberCycle(), averageCycle(), sumArrayCycle());
        System.out.printf("\nThis is recursion, max number %d, min number %d, average number %.2f, sum of all %d",
                maxNumberRec(0), minNumberRec(0), averageRec(0), sumArrayRec(0));
        System.out.println("\nlet’s make two dimensional array, tape two numbers divided by enter, to set size");
        doubleArray = new int[input.nextInt()][input.nextInt()];
        System.out.println("This made with cycle");
        printArray(fillArrayCycle(doubleArray.length, doubleArray[0].length));
        System.out.println("And this one with recursion");
        printArray(fillArrayRec(0, 0));
    }
}
