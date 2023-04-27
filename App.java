package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    

    public static void main( String[] args )
    {

        // create a List<CashCard> variable to store cashcard objects in main()
        List<CashCard> cardList = new ArrayList<>();
        InitCardList(cardList);

        //create scanner for user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please key in the user id:");
        String command = scan.nextLine();

        CashCard card1 = Search(cardList, command);
        if (card1 != null){
            System.out.println("Card Balance: " + card1.getBalance());
            System.out.println("How much would you like to deduct?");

            int deductAmt = scan.nextInt();
            card1.deduct(deductAmt);

            System.out.println("Deduction successful! Current balance : " + card1.getBalance());


        } else {
            System.out.println("Card not found!");
        }
            

        for (CashCard eachCard : cardList){
            System.out.println(eachCard.getId() + " " + eachCard.getBalance());
        }
    }

    // create InitCardList() method to create 5 objects
    // add them to cardList
    static void InitCardList(List<CashCard> cardList){
        cardList.add(new CashCard("001", 25));
        cardList.add(new CashCard("002", 25));
        cardList.add(new CashCard("003", 30));
        cardList.add(new CashCard("004", 30));
        cardList.add(new CashCard("005", 50));

    }

    static CashCard Search(List<CashCard> cardList, String targetId){
        for (CashCard card : cardList){
            if (card.getId().equals(targetId)){
                return card;
            }
        } return null;
    }
}
