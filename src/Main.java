// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Given the price of a purchase the program computes and outputs a 5% sales tax.
        //Be sure to use output statements that clearly display the price and the computed sales tax
        //(No conditions here, the sales tax is always the same rate.)

        double doublePrice = 10.50;
        double doubleTax = 0.05;
        double doubleSaleTax = doublePrice * doubleTax;

        System.out.println("Your sales tax is: " +doubleSaleTax);

        }
    }
