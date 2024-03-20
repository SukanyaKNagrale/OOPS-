# Shopping Project

This is a simple shopping project that allows users to create accounts, log in, browse products, add products to the shopping cart, view the shopping cart, and place orders. The project demonstrates various principles of object-oriented programming and design patterns.

## Features

- **User Authentication:** Users can create accounts with unique usernames, passwords, and emails. They can also log in to their accounts securely.
- **Product Catalog:** Products are organized into categories and stored in a catalog. Users can browse through available products and view details such as name, price, description, and quantity in stock.
- **Shopping Cart:** Users can add products to their shopping cart, view the items in the cart, and calculate the total price of the items.
- **Order Placement:** Once users have selected the desired products, they can place an order and choose from various payment methods, including credit card, debit card, cash, Apple Pay, Samsung Pay, and Google Pay.

## Project Structure

The project is organized into several Java classes:

1. **Main:** Entry point of the application. It provides a menu-driven interface for users to interact with the system.
2. **UserAuthentication:** Manages user registration and login functionalities. It ensures secure authentication using username, password, and email validation.
3. **Catalog:** Stores and manages the product catalog. Users can browse through available products and view their details.
4. **ShoppingCart:** Represents the user's shopping cart. Users can add products to the cart, view the cart contents, and calculate the total price.
5. **ProductFactory:** An interface implemented by various product classes. It defines methods for retrieving product information such as name, price, description, and quantity in stock.
6. **ProductLoader:** Loads initial product data into the system.
7. **Logger:** Handles logging operations throughout the application. It logs user registrations, logins, and other system events.
8. **PaymentProcessor:** Processes payment transactions using different payment methods. It ensures secure and reliable payment processing.
9. **FileLogger:** A concrete implementation of the Logger interface that logs messages to a file.

## Getting Started

To run the shopping project, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile and run the Main class.
4. Follow the on-screen instructions to interact with the application.

## Technologies Used

- Java
- Object-Oriented Programming
- Design Patterns (e.g., Singleton)
- File I/O
- Command-Line Interface (CLI)

## Contributors

This project was created by Sukanya. Contributions are welcome through pull requests.

## License

This project is licensed under the [MIT License](LICENSE).
