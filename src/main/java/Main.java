// dev branch for Y.Practicum
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int numberOfFriends = -1;
        String addedProduct ="";






        while(true) {
            System.out.println("На сколько человек делить счет?");
            if (scanner.hasNextInt()) {
                numberOfFriends = scanner.nextInt();
                scanner.nextLine();
                if (numberOfFriends == 1) {
                    System.out.println("Количество равно 1, нет смысла делить счет.");
                } else if (numberOfFriends < 1) {
                    System.out.println("Введите количество больше одного человека");
                } else if (numberOfFriends > 1) {
                    break;
                }
            } else {
                System.out.println("Некорректное значение. Введите значение больше одного.");
                scanner.nextLine();
            }
        }

            while(true){

                System.out.println("Введите название товара. Для того, чтобы получить итог напишите 'Завершить'");
                addedProduct = scanner.nextLine();
                    if (addedProduct.equalsIgnoreCase("Завершить")){
                        break;}


                    else {

                            System.out.println("Введите стоимость товара");

                            if(scanner.hasNextDouble()){
                                double priceOfProduct = scanner.nextDouble();
                                scanner.nextLine();
                                if (priceOfProduct<0){
                                    System.out.println("Некорректное значение повторите ввод.");
                                }
                                else {
                                    calculator.counting(addedProduct, priceOfProduct);
                                    System.out.println("Товар добавлен!");
                                    System.out.println("Вы можете добавить еще товар, для этого введите любой симовл или напишите 'Завершить'");

                                }



                            } else {
                            System.out.println("Некорректное значение Попробуйте еще раз");

                        }
                    }

        }



                double resultSum = calculator.sum/numberOfFriends;
                String result = String.format("%.2f" , resultSum);
                String resultRubFormat = rubFormatter(resultSum);

                System.out.println(calculator.addedProducts);
                System.out.println("Итоговая стоимость заказа : " + calculator.sum +" " + rubFormatter(calculator.sum));

                System.out.println("Каждый человек должен заплатить по " +result + " "+ resultRubFormat);


    }
    public static String rubFormatter(double x) {
        String rubForm = " ";
        int value = (int) x;
        if ((value %100 >= 11) && (value % 100<=20)){
            rubForm = "рублей";
        }
        else if(value %10 == 1){
            rubForm = "рубль";
        }
        else if((value %10 >= 2)&&(value %10 <=4)){
            rubForm = "рубля";

        }
        return rubForm;
    }




}


