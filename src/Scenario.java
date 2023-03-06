public class Scenario {
    public static void main(String [] args){
        System.out.println("Feature: Demo Nopcommerce's topmenu acceptance criteria");
        System.out.println("As a user I would like to check acceptance criteria of Nopcommerce top menu");
        System.out.println();
        System.out.println("Background: User is on given URL");
        System.out.println("Given       User type URL https://demo.nopcommerce.com");
        System.out.println("And         User click on enter button");
        System.out.println("Then        User is on given URL");
        System.out.println();
        System.out.println("Scenario: Verify that user can navigate to Books category page");
        System.out.println("Given     User is on home page");
        System.out.println("When      User click on Books category");
        System.out.println("Then      User is navigated to books category page");
        System.out.println();
        System.out.println("Scenario: Verify user can see \"Sort by\" filter on books category page");
        System.out.println("When      User is on Books category page");
        System.out.println("And       Check \"Sort by\" filter is present");
        System.out.println("Then      \"Sort by\" filter is present on books category page");
        System.out.println();
        System.out.println("Scenario: Verify user can see \"Display\" filter on books category page");
        System.out.println("When      User is on Books category page");
        System.out.println("And       Check \"Display\" filter is present");
        System.out.println("Then      \"Display\" filter is present on books category page");
        System.out.println();
        System.out.println("Scenario: Verify user can see \"Grid view\" icon on books category page");
        System.out.println("When      User is on Books category page");
        System.out.println("And       Check \"Grid view\" icon is present");
        System.out.println("Then      \"Grid view\" icon is present on books category page");
        System.out.println();
        System.out.println("Scenario: Verify user can see \"List view\" icon on books category page");
        System.out.println("When      User is on Books category page");
        System.out.println("And       Check \"List view\" icon is present");
        System.out.println("Then      \"List view\" icon is present on books category page");
        System.out.println();
        System.out.println("Scenario: Verify that user can see 'Name: A to Z' selection is present in 'Sort by' filter");
        System.out.println("When      User click on \"Sort by\" filter");
        System.out.println("And       check 'A to Z' selection is available on \"Sort by\" filter");
        System.out.println("Then      'A to Z' is available on \"Sort by\" filter");
        System.out.println();
        System.out.println("Scenario: Verify that user can see 'Name: Z to A' selection is present in 'Sort by' filter");
        System.out.println("When      User click on \"Sort by\" filter");
        System.out.println("And       check 'Z to A' selection is available on \"Sort by\" filter");
        System.out.println("Then      'Z to A' is available on \"Sort by\" filter");
        System.out.println();
        System.out.println("Scenario: Verify that 'Name: A to Z' filter is functioning as expected");
        System.out.println("When      User click on \"Sort by\" filter");
        System.out.println("And       User click on 'Name: A to Z' option");
        System.out.println("Then      All products are displayed in alphabetical order");
        
    }
}
