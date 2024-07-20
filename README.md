#  Chat Group JavaFX Application

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Preview](#preview)
- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [Contact](#contact)

## Introduction
The JavaFX Chat Application is a desktop application that facilitates real-time communication between multiple users over a local server. Built using JavaFX for the user interface and Java Sockets for network communication, this application serves as a robust platform for chatting and managing user connections in a local network environment.

## Features
- **User Authentication**: Secure login system for users.
- **Real-time Messaging**: Send and receive messages instantly.
- **Multiple Clients Support**: Connect multiple clients to the chat server simultaneously.
- **~User Notifications~**: Notify users of new messages and user activities. **Coming Soon** 🔄️
- **~Customizable UI~**: A user-friendly and customizable interface built with JavaFX. **Coming Soon** 🔄️
- **~Sending voice messages~**. **Coming Soon** 🔄️
- **~Attach Files and photos~**. **Coming Soon** 🔄️

## Requirements
- **Java Development Kit (JDK)** 11 or higher
- **JavaFX SDK** 11 or higher
- **Maven** (for dependency management)
- **IntelliJ IDEA** or any other Java IDE

## Setup
### 1. Clone the Repository
```sh
git clone https://github.com/your-username/javafx-chat-app.git
cd javafx-chat-app
```

### 2. Install Dependencies
Ensure you have Maven installed. Run the following command to install the necessary dependencies:
```sh
mvn clean install
```

### 3. Configure JavaFX
Ensure that JavaFX is correctly set up in your IDE and project. You may need to add the JavaFX library to your project and configure the VM options.

### 4. Build the Project
Build the project using your IDE or via Maven:
```sh
mvn clean package
```

## Usage
### Running the Server
1. Navigate to the server directory:
    ```sh
    cd server/target
    ```
2. Run the server application:
    ```sh
    java -jar server.jar
    ```

### Running the Client
1. Navigate to the client directory:
    ```sh
    cd client/target
    ```
2. Run the client application:
    ```sh
    java -jar client.jar
    ```

### Notes
- Ensure the server is running before starting any client instances.
- Clients can connect to the server using the server's IP address and the designated port.

## Contributing
We welcome contributions to improve this chat application. To contribute, follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.


## Contact
For any questions or suggestions, please contact [Aly Elesawy] at [alielesawy811@gmail.com].
