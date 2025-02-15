import java.io.*; import java.net.*;
 
public class cc {
public static void main(String[] args) { String host = "localhost";
int port = 12346;
try (Socket socket = new Socket(host, port);
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) { String userInput, serverResponse;
while (true) { System.out.print("Client: "); userInput = stdIn.readLine(); out.println(userInput);
if (userInput.equalsIgnoreCase("bye")) { System.out.println("You have left the chat."); break;
}
serverResponse = in.readLine(); System.out.println("Server: " + serverResponse);
}
} catch (IOException e) { e.printStackTrace();
}
}
}
