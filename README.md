💧 Smart Water Bottle Tracker
A simple, console-based Java application designed to help users track their daily water intake and stay hydrated.

🚀 Features
User Profiles: Tracks water consumption for a specific user.
Real-time Updates: Allows users to log water intake multiple times in one session.
Goal Tracking: Compares total consumption against a daily health goal of 2000ml.
Instant Feedback: Notifies the user whether they have met their hydration target for the day.

🛠️ How it Works
The application utilizes two main components:

Main.java: Handles the user interface, input scanning, and the application logic loop.

WaterBottleTracker.java: Manages the data, including the user's name, the math for adding water, and checking goal status.

Code Logic Flow,
The user enters their name.
A while loop runs, accepting integer inputs for water in milliliters (ml).
Entering 0 breaks the loop and triggers the final summary.

💻 Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher.
An IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal.

Installation & Execution
Clone the repository:
git clone https://github.com/supunsubodha/water-bottle-tracker.git

Navigate to the folder:
cd water-bottle-tracker

Compile the files:
javac Main.java WaterBottleTracker.java

Run the application:
java Main

📝 Example Usage
Welcome to Smart Water Bottle Tracker
Daily Water Goal: 2000 ml
--------------------------------------
User Name: Alex

Enter water consumed (ml) (0 to stop): 500
Enter water consumed (ml) (0 to stop): 1000
Enter water consumed (ml) (0 to stop): 600
Enter water consumed (ml) (0 to stop): 0

username: Alex
total water consumed: 2100
Daily goal reached. Good job!
