public class Main {
    public static void main(String[] args) {
        int summerCost = 500;
        int fallCost = 350;
        int winterCost = 550;
        int springCost = 250;
        int totalMaintenance = summerCost + fallCost + winterCost + springCost;

        System.out.println("The maintenance cost for summer was " + summerCost +
                ",\nthe maintenance cost for fall was " + fallCost +
                ",\nthe maintenance cost for winter was " + winterCost +
                ",\nthe maintenance cost for spring was " + springCost +
                ",\nmaking the total maintenance for the year " + totalMaintenance);
    }
}