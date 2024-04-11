import java.util.*; // initialize utils

public class VehicleManagement {
   public static void main(String[] args) {
      ArrayList<Vehicle> vehicleList = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);
      int currentYear = 2024; // accessible current year
      
      int choice;
      do {
         System.out.println("Menu:");
         System.out.println("1. Add a vehicle");
         System.out.println("2. Display a list of vehicle details");
         System.out.println("3. Delete a vehicle");
         System.out.println("4. Sort vehicle list by age");
         System.out.println("5. Quit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();
         scanner.nextLine(); 
      
         switch (choice) {
            case 1:
               // add vehicle here
               String reg, make;
               int year;
               double val;
               System.out.print("Enter registration number: "); reg = scanner.nextLine();
               System.out.print("Enter make: "); make = scanner.nextLine();
               System.out.print("Enter year of manufacture: "); year = scanner.nextInt();
               System.out.print("Enter value: "); val = scanner.nextDouble();
               Vehicle newVehicle = new Vehicle(reg, make, year, val);
               vehicleList.add(newVehicle);
               System.out.println("Vehicle added successfully!\n");
               break;
            case 2:
               // display vehicle list
               for (int i = 0; i < vehicleList.size(); i++){
                  System.out.println(vehicleList.get(i).toString());
               }
               System.out.println();
               break;
            case 3:
               // delete vehicle
               int index;
               System.out.print("Enter the index of the vehicle to delete: "); index = scanner.nextInt();
               vehicleList.remove(index-1);
               System.out.println("Vehicle deleted successfully!\n");
               break;
            case 4:
               // sort vehicle list by age
               int sort;
               do {
               System.out.print("Sort Menu:\n" +
               "1. Sort by age (ascending)\n" + 
               "2. Sort by age (descending)\n" +
               "3. Back to main menu\n" + 
               "Enter your choice: "); sort = scanner.nextInt();
               if (sort == 1){
                  Collections.sort(vehicleList, Comparator.comparingInt(v -> v.calculateAge(currentYear)));
                  System.out.println("List of vehicle details sorted by age (ascending):");
                  for (Vehicle v : vehicleList){
                     System.out.println(v.toString());
                  }
                  System.out.println();
               }
               else if (sort == 2){
                  Collections.sort(vehicleList, (v1, v2) -> v2.calculateAge(currentYear) - v1.calculateAge(currentYear));
                  System.out.println("List of vehicle details sorted by age (descending):");
                  for (Vehicle v : vehicleList){
                     System.out.println(v.toString());
                  }
                  System.out.println();
               }
               else if (sort == 3){
                  System.out.println("Returning To Main Menu...\n");
                  break;
               }
               else {
                  System.out.println("Invalid Choice. Try again.\n");
               } 
               } while (sort != 3);
               break;
            case 5:
               System.out.println("Exiting program...");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while (choice != 5);
   
      scanner.close();
   }

}
