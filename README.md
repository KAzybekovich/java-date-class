# Date Class Implementation in Java  

## **Project Overview**  
This project demonstrates the implementation of a `Date` class in Java, designed to handle dates and perform various operations, such as:  
- Validating dates (including leap years).  
- Updating the date values.  
- Calculating the difference between two dates in days.  
- Printing the date in a readable format (e.g., "January 1, 2023").  
- Sorting a list of `Date` objects using `Collections.sort()` by year, month, and day.  

This project also includes a `Main` class to test the functionality of the `Date` class with valid and invalid dates and demonstrates sorting and other operations.  

---

## **Features of the Date Class**  
1. **Attributes**:  
   - `day` (int): Represents the day of the date.  
   - `month` (int): Represents the month of the date.  
   - `year` (int): Represents the year of the date.  

2. **Implemented Methods**:  
   - `isValidDate()`: Checks if the date is valid (e.g., accounts for leap years and month-day boundaries).  
   - `updateDate(int d, int m, int y)`: Updates the date values after checking validity.  
   - `calculateDifference(Date otherDate)`: Calculates the difference in days between two dates, considering leap years.  
   - `printDate()`: Prints the date in a human-readable format (e.g., "January 1, 2023").  
   - `compareTo(Date otherDate)`: Implements `Comparable<Date>` to sort dates in ascending order.  
   - **(Planned Enhancement)**: `getDayOfWeek()` method to return the day of the week for a given date.  

3. **Main Class Demonstrations**:  
   - Creating valid and invalid `Date` objects.  
   - Updating a `Date` object.  
   - Calculating the difference between two dates.  
   - Sorting a list of `Date` objects using `Collections.sort()`.  

---

## **How to Compile and Run**  
1. Clone the repository:  
   ```bash  
   git clone <repository-link>  
   cd <repository-folder>  
