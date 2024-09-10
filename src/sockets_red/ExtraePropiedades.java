/** InetAddress para la manipulación y conocimiento de direcciones y dominios.
 * Representa una dirección IP.
 */
// package sockets_red;

import java.net.*;
public class ExtraePropiedades {
    public static void main(String[] args) {
        try {
            System.out.println("-> Direccion IP de una URL, por nombre");
            InetAddress address = InetAddress.getByName("www.google.com");
// Se imprime el objeto InetAddress obtenido
            System.out.println(address);
            System.out.println("-> Nombre a partir de la direccion");
            int temp = address.toString().indexOf('/');
            address = InetAddress.getByName(address.toString().substring(0, temp));
            System.out.println(address);
            System.out.println("-> Direccion IP actual de LocalHost");
            address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println("-> Nombre de LocalHost a partir de la direccion");
            temp = address.toString().indexOf('/');
            address = InetAddress.getByName(address.toString().substring(0, temp));
            System.out.println(address);
            System.out.println("-> Nombre actual de LocalHost");
            System.out.println(address.getHostName());
            System.out.println();
        } catch (UnknownHostException e) {
            System.out.println(e);
            System.out.println("Debes estar conectado para que esto funcione bien.");
        }
    }
}
