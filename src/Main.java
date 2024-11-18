public class Main {
    public static void main(String[] args) {
        int initial = 100; // состояние счета
        int replenishment = 1100; //сумма пополнения
        if (replenishment <= 1000) {
            System.out.println((initial + replenishment) + " состояние лицевого счета ");
        } else {
            System.out.println((replenishment / 100 + initial + replenishment) + " состояние лицевого счета");
        }
    }
}