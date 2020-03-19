import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
    private int frequentDrinks[] = {-1,-1,-1,-1};
    private int frequentSnacks[] = {-1,-1,-1,-1};
    private String drinksName[] = {"Milkshake" , "OrangeJuice", "Lemonade","Coke"};
    private String snacksName[] = {"Cashew","Cracker ","PotatoChips","PopCorn"};
    private int drinks[] = {15,11,10,7};
    private int snacks[] = {15,12,10,5};

    public Machine(){

    }


    public void calculate(int cost) {
        int minimum = cost;
        int drinkItemIndex = -1 ;
        int snackItemIndex = -1;


        for(int i = 0  ; i < 4;i++) {

            int currentDrinkCost = cost;
                if(currentDrinkCost - snacks[i] >= 0){
            }
            else if (currentDrinkCost - drinks[i] < 0) {
                continue;
            } else {
                currentDrinkCost -= drinks[i];
                    //checking the minimum transaction
                    if (currentDrinkCost >= 0 && minimum > currentDrinkCost) {
                        minimum = currentDrinkCost;
                        drinkItemIndex = i;
                        snackItemIndex = -1;
                    }
            }



            for (int j = 0; j < 4; j++) {

                int currentSnackCost = currentDrinkCost;

                if (currentSnackCost - snacks[j] < 0) {
                    continue;
                } else {
                    currentSnackCost -= snacks[j];
                }

                //Checking the minimum transaction
                if (currentSnackCost >= 0 && minimum > currentSnackCost) {
                    minimum = currentSnackCost;
                    drinkItemIndex = i;
                    snackItemIndex = j;
                }
            }
        }

        printResult(drinkItemIndex,snackItemIndex,minimum);
        mostFrequentItem();

    }

        private void printResult(int drinkItemIndex, int snackItemIndex, int balance){
            if(drinkItemIndex >= 0){
                System.out.print(" "+drinksName[drinkItemIndex]);
                frequentDrinks[drinkItemIndex]++;
            }
            if(snackItemIndex >= 0){
                System.out.print(" "+snacksName[snackItemIndex]);
                frequentSnacks[snackItemIndex]++;
            }

            if(balance > 0){
                System.out.print(" Rs."+balance+".00");
            }
            System.out.println();
        }

        private void mostFrequentItem(){
            int freqDrinkItem = -1;
            int freqSnackItem = -1;
            int max1 = -1;
            int max2 = -1;
            for(int i = 0 ; i < 4 ; i++){

                if(max1 < frequentDrinks[i]){
                    max1 = frequentDrinks[i];
                    freqDrinkItem = i;
                }

                if(max2 < frequentSnacks[i]){
                    max2 = frequentSnacks[i];
                    freqSnackItem = i;
                }

            }

            if(freqDrinkItem > -1){
                System.out.print("Today's Fav Drink: "+ drinksName[freqDrinkItem]);
                System.out.println();
            }

            if(freqSnackItem > -1){
                System.out.println("Today's Fav Snack :" + snacksName[freqSnackItem]);
                System.out.println();
            }
        }


    }
