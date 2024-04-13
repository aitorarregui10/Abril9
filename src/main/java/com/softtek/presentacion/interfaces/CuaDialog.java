package com.softtek.presentacion.interfaces;


import javax.swing.*;
import java.util.function.Consumer;

class cuaDialog {
    public static void main(String[] args) {
        String mensaje = "Hoy hace una mañana preciosa";
        showDialogBox(mensaje);
    }

    public static void showDialogBox(String message) {
        Consumer<String> showMessage = (msg) -> JOptionPane.showMessageDialog(null, msg);
        showMessage.accept(message);
    }
}