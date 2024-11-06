Hotel Booking System
A console-based hotel booking system that allows users to book rooms, manage bookings, and process payments. The system follows key design patterns to provide a structured, scalable solution for hotel management.
Features
Room Booking: Book different room types (Single, Double, Family) with guest recommendations based on room capacity.
Booking Management: View and manage existing bookings.
Payment Processing: Securely process payments via an adapter pattern for extensible payment methods.
Booking Iteration: Easily iterate over bookings for display or processing.
Design Patterns Used
Singleton: BookingManager is implemented as a singleton to manage and store all bookings.
Factory: RoomFactory handles room creation based on room type, improving scalability and flexibility.
Adapter: PaymentAdapter adapts the payment service for ease of integration.
Proxy: BookingServiceProxy controls access to the booking management.
Command: AddBookingCommand encapsulates booking actions, allowing flexibility in executing booking commands.
Iterator: The Iterator pattern simplifies navigating through bookings, enhancing code readability and iteration control.
System Overview
Classes
BookingDetails: Model class to store information about each booking.
Room: Abstract base class with concrete classes SingleRoom, DoubleRoom, and FamilyRoom.
RoomFactory: Factory class to instantiate room objects.
BookingCLI: Console interface for user interaction, acting
PaymentAdapter: Handles payment processing.
BookingServiceProxy: Provides access to booking operations with controlled management.
Usage
To start the application, run the Main class. The console interface (BookingCLI) will guide you through the options to book a room, view bookings, or process payments.

Requirements
Java 8 or higher
Example
Book a room, specifying details such as check-in/out dates, number of guests, breakfast, and parking options.
View all current bookings.
Make a payment using the booking ID.

