# Programming Exercise: Vehicle

Write a menu-driven program that uses an ArrayList to hold Vehicles. The menu should offer the following options:

1. Add a vehicle 
2. Display a list of vehicle details 
3. Delete a vehicle 
4. Sort vehicle list by age 
5. Quit

![UML Vehicle](https://raw.githubusercontent.com/clydeatusep/IC124/main/M4/exercise/vehicle/UML_Vehicle.png)

### Sample Run

```mathematica
Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 1
Enter registration number: ABC123
Enter make: Toyota
Enter year of manufacture: 2018
Enter value: 25000
Vehicle added successfully!

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 1
Enter registration number: XYZ456
Enter make: Honda
Enter year of manufacture: 2020
Enter value: 18000
Vehicle added successfully!

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 1
Enter registration number: DEF789
Enter make: Ford
Enter year of manufacture: 2015
Enter value: 30000
Vehicle added successfully!

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 2
List of vehicle details:
Reg No: ABC123, Make: Toyota, Year of Manufacture: 2018, Value: Php25000.0
Reg No: XYZ456, Make: Honda, Year of Manufacture: 2020, Value: Php18000.0
Reg No: DEF789, Make: Ford, Year of Manufacture: 2015, Value: Php30000.0

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 4
Sort Menu:
1. Sort by age (ascending)
2. Sort by age (descending)
3. Back to main menu
Enter your choice: 1
List of vehicle details sorted by age (ascending):
Reg No: DEF789, Make: Ford, Year of Manufacture: 2015, Value: Php30000.0
Reg No: ABC123, Make: Toyota, Year of Manufacture: 2018, Value: Php25000.0
Reg No: XYZ456, Make: Honda, Year of Manufacture: 2020, Value: Php18000.0

Sort Menu:
1. Sort by age (ascending)
2. Sort by age (descending)
3. Back to main menu
Enter your choice: 2
List of vehicle details sorted by age (descending):
Reg No: XYZ456, Make: Honda, Year of Manufacture: 2020, Value: Php18000.0
Reg No: ABC123, Make: Toyota, Year of Manufacture: 2018, Value: Php25000.0
Reg No: DEF789, Make: Ford, Year of Manufacture: 2015, Value: Php30000.0

Sort Menu:
1. Sort by age (ascending)
2. Sort by age (descending)
3. Back to main menu
Enter your choice: 3
Returning to main menu...

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 3
Enter the index of the vehicle to delete: 1
Vehicle deleted successfully!

Menu:
1. Add a vehicle
2. Display a list of vehicle details
3. Delete a vehicle
4. Sort vehicle list by age
5. Quit
Enter your choice: 5
Exiting program...
```
