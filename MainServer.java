/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.IOException;
/**
* start a server. Reads the server's port from the command line argument
* @author Remi Watrigant
*
*/
public class MainServer {
/**
* creates a new server
* @param args
*  * Objectif du serveur : 
 *  - Accepter les nouvelles connexions de clients
 *  - Recevoir les messages de chaque client, et les diffuser à tout le monde
 *	- Notifier les clients des nouvelles conexions et des déconnexions d'autres clients
*/
public static void main(String[] args) {
try {
if (args.length != 1) {
printUsage();
} else {
Integer port = new Integer(args[0]);
Server server = new Server(port);
}
} catch (IOException e1) {
e1.printStackTrace();
}
}
private static void printUsage() {
System.out.println("java server.Server <port>");
System.out.println("\t<port>: server's port");
}
}