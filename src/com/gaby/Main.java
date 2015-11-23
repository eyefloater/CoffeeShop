/*The coffee shop sells 12 different drinks. The name of each drink, the price the shop charges the customer, 
and how much it costs to make each drink, are shown in the file coffee.txt. 
The data is in the format name;cost to make;price charged
example
cappuccino;1.56;3.50
Your program should read this data from coffee.txt, and store it in some kind of data structure.
Your program should ask the user how many of each drink were sold today. 
So, it might ask "How many cappuccino drinks were sold today?" and the user can type in a number. 
It will need to ask for each drink individually. You'll need to store this data somehow.
You should add input validation so that if the user enters "ten" or "10.4" or -45 then your program will respond appropriately.  
You should also deal with any file-related exceptions properly. 
Once you have gathered all the data, generate a report that will be written out to a new file called sales-report.txt. 
For each drink, record the number of drinks sold, the total that it cost to make those drinks (expenses), 
and the total amount (revenue) spent by customers on that drink. So, for example, 
if the coffee shop sold 10 cappuccinos today, you'll write a line that says
Cappuccino: Sold 10, Expenses $15.60, Revenue $35.00, Profit $19.40
And a similar line for each of the drinks, with the correct data.
At the bottom of the file, write the total expenses, total revenue, and total profit for all drinks.
*/

package com.gaby;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//create drink objects for every kind of drink
static Drink cappuccino;
static Drink espresso;
static Drink latte;
static Drink blackTea;
static Drink herbalTea;
static Drink macchiato;
static Drink americano;
static Drink coldPress;
static Drink hotChocolate;
static Drink coffee;
static Drink chaiTea;
static Drink mocha;

//sc4nn3r
static Scanner scan = new Scanner(System.in);

//one arraylist for all drink data
ArrayList<Drink> drinkList = new ArrayList<Drink>();

public static void main(String[] args){

//read coffee file into drinkList
	
//Query user for sales info, with input validation, use setters to add to Drinks
System.out.println("How many cappuccino drinks were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
cappuccino.setTotalSold(scan.nextInt());

System.out.println("How many espressos were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
espresso.setTotalSold(scan.nextInt());

System.out.println("How many lattes were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
latte.setTotalSold(scan.nextInt());

System.out.println("How many black teas were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
blackTea.setTotalSold(scan.nextInt());

System.out.println("How many herbal teas were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
herbalTea.setTotalSold(scan.nextInt());

System.out.println("How many macchiatos were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
macchiato.setTotalSold(scan.nextInt());

System.out.println("How many americanos were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
americano.setTotalSold(scan.nextInt());

System.out.println("How many cold presses were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
coldPress.setTotalSold(scan.nextInt());

System.out.println("How many hot chocolates were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
hotChocolate.setTotalSold(scan.nextInt());

System.out.println("How many coffees were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
coffee.setTotalSold(scan.nextInt());

System.out.println("How many chai teas were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
chaiTea.setTotalSold(scan.nextInt());

System.out.println("How many mochas were sold today?" );
while (!scan.hasNextInt()) {
    System.out.println("That's not an integer!");
    scan.nextInt();
}
mocha.setTotalSold(scan.nextInt());

//generate sales report using name and totalSold data from each Drink
//write the sales report to sales-report.txt
}
}
