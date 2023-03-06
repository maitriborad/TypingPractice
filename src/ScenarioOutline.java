public class ScenarioOutline {
    public static void main(String[] args) {
        System.out.println("Feature: Book category");
        System.out.println();
        System.out.println("Background: I should be on homepage");
        System.out.println("Given       I enter URL https://demo.nopcommerce.com/ in browser");
        System.out.println("And         I am on homepage");
        System.out.println();
        System.out.println("Scenario Outline: I am able to see all options on menu bar");
        System.out.println("When              I am on homepage");
        System.out.println("Then              I can see all <Categories> on menu bar");
        System.out.println("Examples:");
        System.out.println("         |   Categories   |");
        System.out.println("         |    Computer    |");
        System.out.println("         |   Electronics  |");
        System.out.println("         |     Apparel    | ");
        System.out.println("         |Digital Download|");
        System.out.println("         |      Books     |");
        System.out.println("         |    Jewellery   |");
        System.out.println("         |    Gift Card   |");
        System.out.println();
        System.out.println("Scenario Outline: I should be able to see all filters on book page");
        System.out.println("When              I select Books option from menu bar");
        System.out.println("Then              I should be navigated to books category page");
        System.out.println("Then              I should be able see <Filters>");
        System.out.println("Examples:");
        System.out.println("         |  Filters  |");
        System.out.println("         |  Sort by  |");
        System.out.println("         |  Display  |");
        System.out.println("         | Grid view |");
        System.out.println("         | List view |");
        System.out.println();
        System.out.println("Scenario Outline: I should be able to see list of terms for each filter");
        System.out.println("Given             I am on a book page");
        System.out.println("When              I click on <Filter>");
        System.out.println("Then              I should be able to see <List terms> in drop down list");
        System.out.println("Examples:");
        System.out.println("        |  Filter   |        List terms                                                             |");
        System.out.println("        | Sort by   | Name: A to Z, Name: Z to A, Price: High to Low, Price: Low to High, Created On|");
        System.out.println("        | Display   | 3, 6, 9                                                                       |");
        System.out.println();
        System.out.println("Scenario Outline: I should be able to choose any filter option with specific result");
        System.out.println("Given             I am on Book page");
        System.out.println("When              I click on <filter>");
        System.out.println("And               I choose any <option>");
        System.out.println("Then              I should be able to choose option");
        System.out.println("And               I am able to see the <result>");
        System.out.println("Examples:");
        System.out.println("        |    filter    |       option       |   result                                                          |");
        System.out.println("        |    Sort by   |   Name: A to Z     | sorted product with the product name in alphabetical order A to Z |");
        System.out.println("        |    Sort by   |   Name: Z to A     | sorted product with the product name in alphabetical order Z to A |");
        System.out.println("        |    Sort by   | Price: Low to High | sorted product with the price in descending order                 |");
        System.out.println("        |    Sort by   | Price: High to Low | sorted product with the price in ascending order                  |");
        System.out.println("        |    Sort by   | Created on         | sorted by date of added, recently added shows first               |");
        System.out.println("        |    Display   |           3        | 3 products display per page                                       |");
        System.out.println("        |    Display   |           6        | 6 products display per page                                       |");
        System.out.println("        |    Display   |           9        | 9 products display per page                                       |");
        System.out.println();
        System.out.println("Scenario Outline: I am able to see display format as per icon selection");
        System.out.println("Given             I am on homepage");
        System.out.println("When              I click display format <icon>");
        System.out.println("Then              I can see <Result in format>");
        System.out.println("Examples:");
        System.out.println("        |    icon    |   Result ib format            |");
        System.out.println("        |  grid view | products display in grid view |");
        System.out.println("        |  List view | products display in list view |");



    }
}