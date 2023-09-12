## NOTE
Tried to make GUI for this metro application. It could only get you shortest distance for now. 
To access the entire application, use rest of the java programs and igonre downloading **MetroGraphGUI.java**

# DELHI METRO RAIL APP
With the provided program, the user can perform various operations on the metro graph, including:

1. Displaying the list of metro stations in the graph.
2. Showing the metro map with station connections.
3. Finding the shortest distance between two metro stations along with the cost of travel.
4. Finding the shortest time to reach between two metro stations.
5. Exiting the application.

Here's a brief explanation of each operation:

1. Displaying the list of metro stations: The user can choose this option to view a list of all the metro stations present in the metro graph. This can help the user identify available stations for further operations.

2. Showing the metro map: This option displays the metro map, including the station connections. The map is shown in a tabular format, indicating the interchange station and destination station for each station.

3. Finding the shortest distance and cost of travel: The user can input two metro stations (source and destination) to find the shortest distance and the corresponding cost of travel between them. The program uses Dijkstra's algorithm to calculate the shortest distance and displays the result along with the path.

4. Finding the shortest time: Similar to the previous option, the user can input two metro stations (source and destination) to find the shortest time to reach the destination from the source. The program uses Dijkstra's algorithm with time considerations to calculate the shortest time and displays the result.

5. Exiting the application: If the user wants to exit the application, they can choose this option, and the program will terminate.

The program provides an interactive command-line interface for the user to select these options and interact with the metro graph effectively. The user can choose any of these operations based on their requirements and explore the metro graph's details and connections.

## How to run this project and get output
In the provided Java code, the user can enter inputs through the command-line interface. The program prompts the user with different options and instructions, and the user can enter their inputs accordingly.

Here's a breakdown of how the user can interact with the program and enter inputs:

Display Stations List:

The program will display a list of metro stations present in the metro graph.
The user doesn't need to enter any input for this option.
Show Metro Map:

The program will display the metro map with station connections in a tabular format.
The user doesn't need to enter any input for this option.
Get Shortest Distance and Cost of Travel:

The program will prompt the user to enter the source and destination stations (case-sensitive).
The user needs to enter the names of the source and destination stations separated by pressing the "Enter" key after each entry.
For example:
ENTER THE SOURCE STATION: Noida Sector 62~B
ENTER THE DESTINATION STATION: Rajouri Garden~BP
Get Shortest Time to Reach:

The program will prompt the user to enter the source and destination stations (case-sensitive).
The user needs to enter the names of the source and destination stations separated by pressing the "Enter" key after each entry.
For example:

```
ENTER THE SOURCE STATION: Noida Sector 62~B
ENTER THE DESTINATION STATION: Rajouri Garden~BP
Exit the Application:
```

The user can select this option to exit the application.
The user doesn't need to enter any input for this option.
The program provides clear instructions for each option, and the user can simply type their inputs as requested. After entering the inputs, the program will perform the corresponding operations and display the results accordingly.

Please note that the input stations should be entered exactly as they appear in the stations list, including the abbreviation (e.g., "B" for Blue Line, "Y" for Yellow Line, etc.) and the interchange station information (e.g., "Noida Sector 62B", "Rajouri GardenBP", etc.). Any typos or incorrect station names may lead to errors or invalid results
