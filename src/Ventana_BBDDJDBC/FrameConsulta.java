package Ventana_BBDDJDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class FrameConsulta extends JFrame {

    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;

    public FrameConsulta(){
        setTitle("Consulta a BBDD");
        setBounds(500,300,400,400);
        setLayout(new BorderLayout());

        JPanel menus = new JPanel();
        menus.setLayout(new FlowLayout());

        secciones = new JComboBox();
        secciones.setEditable(false);
        secciones.addItem("Todos");

        paises = new JComboBox();
        paises.setEditable(false);
        paises.addItem("Todos");

        resultado = new JTextArea(4,50);
        resultado.setEditable(false);

        //add(resultado);
        menus.add(secciones);
        menus.add(paises);
        add(menus, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);

        JButton botonConsulta = new JButton("Consulta");
        add(botonConsulta, BorderLayout.SOUTH);


        // --------------   Conexion a la base de datos  ----------------------------------------
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");
            Statement myStatementTest = myConnection.createStatement();

            // extraemos las secciones para el primer comboBox (UNIQUE)
            String query = "SELECT DISTINCTROW section FROM products";

            // construimos el resultSet donde almacenar lo que devuelve la consulta
            ResultSet rs=myStatementTest.executeQuery(query);

            // Recorremos el resultSet, agregando los campos al comboBox secciones
            while (rs.next()){
                secciones.addItem(rs.getString(1));
            }
            // liberamos el resultSet
            rs.close();

            // --------- carga paises para el 2o comboBox----------
            query = "SELECT DISTINCTROW country FROM products";
            rs=myStatementTest.executeQuery(query);
            while (rs.next()){
                paises.addItem(rs.getString(1));
            }
            rs.close();

        }catch (Exception e){

        }

    }

}
