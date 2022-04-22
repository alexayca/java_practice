package Ventana_BBDDJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class FrameConsulta extends JFrame {

    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;

    private Connection myConnection;

    private PreparedStatement enviaConsultaSeccion;
    private PreparedStatement enviaConsultaPais;
    private PreparedStatement enviaConsultaTodo;
    private final String consultaSeccion = "SELECT articleName, section, price, country " +
                                             "FROM products WHERE section=?";
    private final String consultaPais ="SELECT articleName, section, price, country "  +
                                        "FROM products WHERE country=?";
    private final String consultaTodo ="SELECT articleName, section, price, country "  +
                                        "FROM products WHERE section=? AND country=? ";

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
        // ponemos el boton a la escucha
        botonConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutaConsulta();
            }
        });
        add(botonConsulta, BorderLayout.SOUTH);


        // --------------   Conexion a la base de datos  ----------------------------------------
        try {
            myConnection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","alexa","");
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

    } // END CONSTRUCTOR

    private void ejecutaConsulta(){

         ResultSet rs = null;

         try {

             resultado.setText("");
             String seccion = (String)secciones.getSelectedItem();
             String pais = (String)paises.getSelectedItem();

             if(!seccion.equals("Todos") && pais.equals("Todos")) {
                 enviaConsultaSeccion = myConnection.prepareStatement(consultaSeccion);
                 enviaConsultaSeccion.setString(1, seccion);
                 rs = enviaConsultaSeccion.executeQuery();
             }else if(seccion.equals("Todos") && !pais.equals("Todos")){
                 enviaConsultaPais = myConnection.prepareStatement(consultaPais);
                 enviaConsultaPais.setString(1, seccion);
                 rs = enviaConsultaPais.executeQuery();
             }else  if(!seccion.equals("Todos") && !pais.equals("Todos")){
                 enviaConsultaTodo = myConnection.prepareStatement(consultaTodo);
                 // Tiene dos parametros la consulta
                 enviaConsultaTodo.setString(1, seccion);
                 enviaConsultaTodo.setString(2, pais);
                 rs = enviaConsultaTodo.executeQuery();
             }

             while (rs.next()){
                resultado.append(rs.getString(1));
                resultado.append(", ");
                resultado.append(rs.getString(2));
                resultado.append(", ");
                resultado.append(rs.getString(3));
                resultado.append(", ");
                resultado.append(rs.getString(4));
                resultado.append("\n");
             }
             rs.close();

         }catch (Exception e){

         }


    }

}
