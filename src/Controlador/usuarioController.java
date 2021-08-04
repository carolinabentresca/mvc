/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.usuario;
import Modelo.usuarioDao;
import Vista.usuarioFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author EXO
 */
public class usuarioController implements ActionListener {

    private usuarioFrm view;
    private usuario model;
    private usuarioDao modelDao;

    public usuarioController() {
    }

    public usuarioController(usuarioFrm view, usuario model, usuarioDao modelDao) {
        this.view = view;
        this.model = model;
        this.modelDao = modelDao;
        this.view.btnRegistrar1.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnEliminar.addActionListener(this);
        this.view.btnBuscar.addActionListener(this);
        this.view.btnLimpiar.addActionListener(this);
    }

    public void iniciar() {
        this.view.setTitle("Datos del Usuario");
        this.view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnRegistrar1) {
            model.setId(Integer.parseInt(view.txtId.getText()));
            model.setNombre(view.txtNombre.getText());
            model.setEmail(view.txtEmail.getText());
            if (modelDao.registrar(model)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado!!!");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar!!!");
                limpiar();
            }
        }

        if (e.getSource() == view.btnModificar) {
            model.setId(Integer.parseInt(view.txtId.getText()));
            model.setNombre(view.txtNombre.getText());
            model.setEmail(view.txtEmail.getText());
            if (modelDao.modificar(model)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado!!!");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar!!!");
                limpiar();
            }
        }

        if (e.getSource() == view.btnEliminar) {
            model.setId(Integer.parseInt(view.txtId.getText()));
            if (modelDao.eliminar(model)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado!!!");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar!!!");
                limpiar();
            }
        }

        if (e.getSource() == view.btnBuscar) {
            model.setId(Integer.parseInt(view.txtId.getText()));
            if (modelDao.buscar(model)) {
                view.txtId.setText(String.valueOf(model.getId()));
                view.txtNombre.setText(String.valueOf(model.getNombre()));
                view.txtEmail.setText(String.valueOf(model.getEmail()));
            } else {
                JOptionPane.showMessageDialog(null, "Error al Buscar!!!");
                limpiar();
            }
        }

        if (e.getSource() == view.btnLimpiar) {
            limpiar();
        }

    }

    public void limpiar() {
        view.txtId.setText("");
        view.txtNombre.setText("");
        view.txtEmail.setText("");
    }

}
