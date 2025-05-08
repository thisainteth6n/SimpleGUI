1. Classes and Objects [20%]
  The program uses multiple classes to organize functionality and structure, following the principles of Object-Oriented Programming (OOP).
  For example, there are three primary classes in this project: Main.java, TemperatureConverter.java, and ConverterGUI.java.
  Each class has specific roles and is designed using objects and fields that represent their respective attributes and behaviors.
  The TemperatureConverter class contains methods like fahrenheitToCelsius and celsiusToFahrenheit, which are used to convert temperatures.
  The ConverterGUI class is responsible for the graphical user interface and contains various fields like inputField, toCelsiusButton, and
  resultLabel that store data and interact with the user. Methods such as addActionListener are used to respond to user actions, like button clicks.
  This modular use of classes and objects ensures that the program is easy to understand, maintain, and expand.

2. Class Diagram [15%]
  The class diagram represents the structure of the program, showing the relationships between the various classes.
  In the diagram, the Main class serves as the entry point, where the program begins execution.
  The ConverterGUI class is responsible for the user interface and works closely with the TemperatureConverter class,
  which handles the logic of temperature conversion. The diagram illustrates the methods in each class,
  such as fahrenheitToCelsius and celsiusToFahrenheit in TemperatureConverter and the event listener methods in ConverterGUI.
  The diagram visually explains how objects in the program communicate with each other and how the overall system is structured.
  This structure follows best practices for object-oriented design, ensuring that the program is scalable and modular.

3. Four OOP Principles [35%]
   Abstraction: Abstraction is achieved by hiding the complex logic of temperature conversion in the
                TemperatureConverter class and exposing only the relevant methods to the user. For instance, the methods
                fahrenheitToCelsius and celsiusToFahrenheit perform the calculations internally and return the result to the
                ConverterGUI class without revealing how the conversion is performed, thus simplifying the user’s interaction
                with the program.

   Encapsulation: The program uses encapsulation to bundle data and methods that operate on the data within a class. 
                  For example, fields like inputField, toCelsiusButton, and resultLabel in the ConverterGUI class 
                  are encapsulated within the class. These fields are protected from external modification, 
                  and any changes to them are done via methods like addActionListener or setters, 
                  maintaining control over the program's internal state.

   Inheritance: Although the current project doesn’t feature traditional inheritance (e.g., extending another class),  
                one can see inheritance concepts used in Java's built-in components, such as JButton and JLabel. 
                These components inherit from the JComponent class, which provides common behavior for all UI elements in Swing. 
                In this project, you indirectly benefit from Java’s Swing library, which utilizes inheritance for UI element management.

   Polymorphism: Polymorphism is demonstrated in the program through the use of the ActionListener interface. 
                 Both the toCelsiusButton and toFahrenheitButton use the same method (addActionListener) to handle button clicks, 
                 but the implementation of the listener differs. Each button triggers different functionality 
                 (temperature conversion) based on the context, showcasing how polymorphism allows the same method to behave differently.

4. Exception Handling [10%]\
   The program uses exception handling to catch errors and prevent the program from crashing.
   For example, when the user enters invalid input (e.g., a non-numeric value), the program throws a NumberFormatException.
   This exception is caught by the catch block, and a message is displayed to the user, prompting them to enter a valid number.
   The JOptionPane.showMessageDialog method is used to display the error message in a user-friendly way,
   ensuring that the program handles errors gracefully without crashing.

6. File Handling [5%]
   Although the project doesn’t have a file-saving mechanism in its current form,
   a simple extension can include file handling to save the user’s temperature conversion history.
   For instance, after a conversion, the program can write the original temperature, the result,
   and the conversion type (Celsius or Fahrenheit) to a file. The program can also read from a
   file to load previous data when the application is opened again. This would involve using file
   handling methods such as FileWriter, BufferedWriter, and FileReader to store and retrieve data.

7. Graphical User Interface [15%]
  The graphical user interface (GUI) of the program is designed to be user-friendly and visually organized.
  The ConverterGUI class uses Swing components such as JButton, JTextField, and JLabel to create a simple interface.
  The layout of the interface uses BoxLayout to stack the components vertically, ensuring that the input field
  appears below the "Enter Temperature" label. The buttons are clearly labeled ("To Celsius" and "To Fahrenheit"),
  and the result is displayed prominently on the window. The overall design is neat, straightforward,
  and suits the purpose of the application, allowing the user to interact with the program easily.
