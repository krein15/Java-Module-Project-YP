// dev branch for Y.Practicum
import java.util.Scanner;
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

                String rubForm ="рублей";
                String resultRubForm ="рублей";
                int intSum = (int)calculator.sum;
                int resultSum =(int)calculator.sum/numberOfFriends;
                if (intSum % 10 ==1){
                    rubForm = "рубль";
                }
                else if ((intSum %10 >= 2) && (intSum %10 <=4)){
                    rubForm = "рубля";
                }
                else if ((intSum % 100 >=11)&& (intSum %100 <=20)){
                    rubForm = "рублей";
                    if (resultSum % 10 ==1){
                        resultRubForm = "рубль";
                    }
                    else if ((resultSum %10 >= 2) && (resultSum %10 <=4)){
                        resultRubForm= "рубля";
                    }
                    else if ((resultSum % 100 >=11)&& (resultSum %100 <=20)){
                        resultRubForm = "рублей";}

                }
                String result = String.format("%.2f" , calculator.sum/numberOfFriends);

                System.out.println(calculator.addedProducts);
                System.out.println("Итоговая стоимость заказа : " + calculator.sum +" " +rubForm);

                System.out.println("Каждый человек должен заплатить по " +result + " "+ resultRubForm);


    }




}


