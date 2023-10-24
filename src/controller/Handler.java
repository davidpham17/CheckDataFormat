/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithms;
import common.Library;
import view.View;

public class Handler extends View<String> {

    protected Library library;
    protected Algorithms algorithm;

    public Handler() {
        super("=====Validate Program=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute() {
        String phone;
        do {
            phone = library.getString("Phone: ");
            if (!algorithm.checkPhoneNumberFormat(phone).equals("")) {
                System.out.println(algorithm.checkPhoneNumberFormat(phone));
            } else {
                break;
            }
        } while (true);

        String email;
        do {
            email = library.getString("Email: ");
            if (!algorithm.checkEmailFormat(email).equals("")) {
                System.out.println(algorithm.checkEmailFormat(email));
            } else {
                break;
            }
        } while (true);

        String date;
        do {
            date = library.getString("Date: ");
            if (!algorithm.checkDateFormat(date).equals("")) {
                System.out.println(algorithm.checkDateFormat(date));
            } else {
                break;
            }
        } while (true);

    }
}
