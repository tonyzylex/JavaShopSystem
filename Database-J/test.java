
import java.util.ArrayList;
import java.util.Scanner;



public class test {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<User> users = new ArrayList<>();
    
    Boolean running = true;

    while (running) {
        String Choice = Menu(scanner);
        switch (Choice) {
            case "1":
                Login(scanner, users);
                break;
            case "2":
                Register(scanner, users);
                break;
            case "3":
                System.out.println("Exiting the system. Goodbye!");
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    scanner.close();
   }


   public static String Menu(Scanner scanner) {
        System.out.println("Welcome to the User Log-in/Register System");
        System.out.println("1. Log-in");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        String choice = scanner.nextLine();
        return choice;
   }

   public static void Register(Scanner scanner, ArrayList<User> users) {
        System.out.print("Input Username:");
        String name = scanner.nextLine();
        System.out.print("Password:");
        String password = scanner.nextLine();
        System.out.print("Confirm Password:");
        String confirmPassword = scanner.nextLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please try again.");
            return;
        }else {
            User newUser = new User(name,password);
            users.add(newUser);
            System.out.println("User registered successfully!");
            }
        }

        public static void Login(Scanner scanner, ArrayList<User> users) {
        System.out.print("Username:");
        String name = scanner.nextLine();
        System.out.print("Password:");
        String password = scanner.nextLine();
        boolean found = false;
        User foundUser = null;
        for (User user : users) {
            if (user.name.equals(name) && user.GetPassword().equals(password)) {
                found = true;
                foundUser = user;
                break;
            }
        }
        if (found && foundUser != null) {
            System.out.println("Login successful!");
            System.out.println("Welcome, " + name + "!");
            Dashboard(scanner, foundUser);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
   }

   public static void Dashboard(Scanner scan,User user){
    Boolean Running = true;
    while (Running) {
        System.out.println("Welcome to the User DashBoard!");
        System.out.println("1.Shop");
        System.out.println("2.Profile");
        System.out.println("3.Log Out");
        System.out.print("Choose an option: ");
        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                Shop(scan, user);
                break;
            case "2":
                Profile(scan, user);
                break;
            case "3":
                System.out.println("Logging out...");
                Running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
   }

   public static void Shop(Scanner scan, User user) {
        Shop shop = new Shop();
        System.out.println("Welcome to the Shop!");
        System.out.println("Available items:");
        for (String item : shop.ShopList.get("Fruits").keySet()) {
            System.out.println(item + ": " + shop.ShopList.get("Fruits").get(item) + " units");
        }
        System.out.print("Enter the item you want to buy: ");
        String item = scan.nextLine();
        if (shop.ShopList.get("Fruits").containsKey(item)) {
            int price = shop.ShopList.get("Fruits").get(item);
            if (user.GetBalance() >= price) {
                user.Transaction(price);
                System.out.println("You bought " + item + " for " + price + " units.");
            } else {
                System.out.println("Insufficient balance to buy " + item + ".");
            }
        } else {
            System.out.println("Item not found in the shop.");
        }
    }
    public static void Profile(Scanner scan, User user) {
          System.out.println("User Profile:");
          System.out.println("Name: " + user.name);
          System.out.println("Balance: " + user.GetBalance());   
     }
}
