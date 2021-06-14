/**
 * @author Sebastian Giovanni Bastari (1972006)
 */
 
 /**
 * Pengenalan
 */

Public class Java {
	Public static void main(String[] argos){
		System.out.println("Contoh Pemprograman java");
	}
}

 /**
 * OOP
 */ 
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat Format = NumberFormat.getNumberInstance(Locale.GERMAN);
        System.out.print("Masukkan Uang yang Hendak Didepositokan : ");
        int Uang = scanner.nextInt();
    }
}

 /**
 * Encapsulation
 */
public class Panda {
    private String name;
    private int strength;
    private int agility;
    private int energy;

    public Panda(String name){
        this.name = name ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility += agility;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy += energy;
    }
    public void training(Tiger tiger){
        tiger.sparring(Panda.this);
    }

    public void training(Grashopper grasshopper){

        grasshopper.sparring(Panda.this);
    }

    public void training(Snake snake){

        snake.sparring(Panda.this);
    }

    public void training(Monkey monkey){

        monkey.sparring(Panda.this);
    }

    public void training(Crane crane){

        crane.sparring(Panda.this);
    }

    public void training(Turtle turtle){

        turtle.sparring(Panda.this);
    }

    public void showMyStatus (){
        System.out.println("Strength : "+ strength);
        System.out.println("Agility : "+ agility);
        System.out.println("Energy : "+ energy);
    }


}
 /**
 * Array Of Object & Java Collection  
 */

Array_Type arrayName[] = new Array_Type[length]
Array_Type[] arrayName = new Array_Type[length]

Array_Type[] arrayName = (classType[]) Array.newInstance(classType, length)

/**
 * Inheritance
 */
 
 import java.util.Date;
public class Employee extends Person  {
    private String id;
    private Date joinDates;


    public Employee(String id) {
        this.id = id;
    }
    public Employee(String firstName, String lastName, String id, Date joinDate) {
        super(firstName, lastName);
        this.id = id;
        this.joinDates = joinDate;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDates;
    }

    public void setJoinDate(Date joinDates) {
        this.joinDates = joinDates;
    }
}


/**
 * Contoh abstrac
 */
 
 public abstract class Shape {
    public abstract void showDetail ();
}

/**
 * Contoh Ploymorp
 */
 
 /**
 * @author Sebastian Giovanni Bastari (1972006)
 */

import java.util.ArrayList;

public class WareHouse {
    private ArrayList<Item> itm;

    public WareHouse(){
        itm=new ArrayList<>();
    }

    public void addItemToList(Item item){
        itm.add(item);
    }

    public void showAllItemData() {
        if (itm.isEmpty()){
            System.out.println("No data");
        }

        else {
            itm.forEach(Item ->{
                if (Item instanceof Shirt) {
                    System.out.println(((Shirt) Item).toString());
                }
            });

            itm.forEach(Item -> {
                if (Item instanceof Shoe) {
                    System.out.println(((Shoe) Item).toString());
                }
            });


        }
    }
}

/**
 * Contoh Interface
 */
 
 public interface aa{
     public abstract bb ();
} 

import java.util.Random;
public class Sword extends Item implements Weapon{
    public Sword(){
        this.setName("Sword");
    }

/**
 * Contoh Advanced Class
 */
 
 private static String Regex = "^[01]+$";

    public static String convertToBinary(int number) {
        return coreConverterFromDecimal(number, 2);
    }


    public static String convertToHexa(int number) {
        return coreConverterFromDecimal(number, 16);
    }

    public static String convertToOctal(int number) {
        return coreConverterFromDecimal(number, 8);
    }

    public static int convertBinaryToDecimal(String number) {
        return coreConverterToDecimal(number, 2);

    }

    public static int convertHexaToDecimal(String number) {
        return coreConverterToDecimal(number, 16);
    }

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ConverterCalculator {
    private static String Regex = "^[01]+$";

    public static String convertToBinary(int number) {
        return coreConverterFromDecimal(number, 2);
    }


    public static String convertToHexa(int number) {
        return coreConverterFromDecimal(number, 16);
    }

    public static String convertToOctal(int number) {
        return coreConverterFromDecimal(number, 8);
    }

    public static int convertBinaryToDecimal(String number) {
        return coreConverterToDecimal(number, 2);

    }

    public static int convertHexaToDecimal(String number) {
        return coreConverterToDecimal(number, 16);
    }

    private static String coreConverterFromDecimal(int number, int radix) {
        StringBuilder stringbuilder = new StringBuilder();
        int cekspasi = 0;
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int ambilchars;
        while (number > 0) {
            if ((cekspasi % 4 == 0 && radix == 2) || (cekspasi % 4 == 0 && radix == 16)) {
                stringbuilder.append(" ");
            } else if (cekspasi % 3 == 0 && radix == 8) {
                stringbuilder.append(" ");
            }

            if (radix == 16) {
                ambilchars = number % radix;
                stringbuilder.append(hexchars[ambilchars]);
                number = number / radix;
                cekspasi = cekspasi + 1;
            } else if (radix == 8) {
                stringbuilder.append(number % radix);
                number = number / radix;
                cekspasi = cekspasi + 1;
            } else {
                stringbuilder.append(number % radix);
                number = number / radix;
                cekspasi = cekspasi + 1;
            }

        }

        return String.valueOf(stringbuilder.reverse());
    }

    private static int coreConverterToDecimal(String numberString, int radix) {
        numberString = numberString.toUpperCase();
        Pattern patternmatcher = Pattern.compile(Regex);
        Matcher patternmatchera = patternmatcher.matcher(numberString);
        int hasil1 = 0;
        if (patternmatchera.matches() == true && radix == 2) {
            double hasil2 = 0;
            for (int i = 0; i < numberString.length(); i++) {
                if (numberString.charAt(i) == '1') {
                    hasil2 = hasil2 + Math.pow(2, numberString.length() - 1 - i);
                }
            }
            hasil1 = (int) hasil2;
        } else if (patternmatchera.matches() == false && radix == 16) {
            String hexa = "0123456789ABCDEF";
            for (int i = 0; i < numberString.length(); i++) {
                char huruf = numberString.charAt(i);
                int hexaindex = hexa.indexOf(huruf);
                hasil1 = 16 * hasil1 + hexaindex;
            }
        }
        return hasil1;
    }

}

public class ConverterCalculatorDemo {
    public static void main(String[] args) {
        int number = 20000;
        System.out.println(ConverterCalculator.convertToBinary(number));
        System.out.println(ConverterCalculator.convertToHexa(number));
        System.out.println(ConverterCalculator.convertToOctal(number));
        String string1 = "FF";
        System.out.println(ConverterCalculator.convertHexaToDecimal(string1));
        String string2 = "256a";
        System.out.println(ConverterCalculator.convertHexaToDecimal(string2));
        String string3 = "1112";
        System.out.println(ConverterCalculator.convertBinaryToDecimal(string3));
        String string4 = "110011001111";
        System.out.println(ConverterCalculator.convertBinaryToDecimal(string4));
    }
}

/**
 * Contoh Exception and Package 
 */
 
 package com.sebastian.exceptions;
/**
 * @author Sebastian 1972006
 */
public class ArrayException extends Exception{
    public ArrayException(String message){
        super(message);
    }
}

/**
 * Contoh Komponen Swing & JDBC 
 */
 
package com.sebastian.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * author Sebastian (1972006)
 */
public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/demodb3 " ;
    private static final String USERNAME ="root";
    private static final String PASSWORD ="";

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        connection.setAutoCommit(false);
        return connection;

    }
}

package com.sebastian.util;
import java.util.List ;
import java.sql.SQLException;
/**
 * author Sebastian (1972006)
 */
public interface DaoService <T>{
    List <T> fetchAll() throws SQLException,ClassNotFoundException;

    int addData(T t) throws SQLException, ClassNotFoundException;

    int updateData(T t ) throws  SQLException, ClassNotFoundException ;

    int deleteData(T t ) throws  SQLException,ClassNotFoundException ;
}
@Override
    public List<Department> fetchAll() throws SQLException, ClassNotFoundException {
        List <Department> departments = new ArrayList<>();
        String query = " SELECT id, name FROM department";
        try (Connection connection = MySQLConnection.createConnection()){
            try(PreparedStatement ps = connection.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        Department department = new Department();
                        department.setId(rs.getInt("id"));
                        department.setName(rs.getString("name"));
                        departments.add(department);

                    }
                }
            }
        }
        return departments;
    }

