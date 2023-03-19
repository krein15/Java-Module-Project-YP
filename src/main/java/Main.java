// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int numberOfFriends = -1;
        double resultSum = 0;
        String addedProduct ="";






        while(true) {
            System.out.println("На сколько человек делить счет?");
            if (scanner.hasNextInt()) {
                numberOfFriends = scanner.nextInt();
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
                addedProduct = scanner.next();
                    if (addedProduct.equalsIgnoreCase("Завершить")){
                        break;}


                    else {

                            System.out.println("Введите стоимость товара");

                            if(scanner.hasNextDouble()){
                                double priceOfProduct = scanner.nextDouble();
                                calculator.counting(addedProduct, priceOfProduct);
                                resultSum = resultSum + priceOfProduct;
                                System.out.println("Товар добавлен!");
                                System.out.println("Вы можете добавить еще товар, для этого введите любой симовл или напишите 'Завершить'");
                                scanner.nextLine();



                            } else {
                            System.out.println("Некорректное значение Попробуйте еще раз");

                        }
                    }

        }

                String rubForm ="";
                if (calculator.sum < 2){
                    rubForm = "рубль";
                }
                else if (calculator.sum < 5){
                    rubForm = "рубля";
                }
                else {
                    rubForm = "рублей";

                }
                String result = String.format("%.2f" , calculator.sum/numberOfFriends);
                System.out.println(calculator.addedProducts);
                System.out.println("Итоговая стоимость заказа : " + resultSum);
                System.out.println("Каждый человек должен заплатить по " +result + " "+ rubForm);


    }




}


