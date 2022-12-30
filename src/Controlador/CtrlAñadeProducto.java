package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vistas.frmAñadeProducto;
import Vistas.frmPrincipal;
import Vistas.frmProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CtrlAñadeProducto implements ActionListener {

    //Objetos
    Producto modPro = new Producto();
    frmAñadeProducto objAñadePro;
    ConsultasProducto mcProducto = new ConsultasProducto();

    //Constructor de la clase
    public CtrlAñadeProducto(frmAñadeProducto vistaAñadePro) {
        this.objAñadePro = vistaAñadePro;
        this.objAñadePro.tablaProductos.setModel(mcProducto.modeloTablaProductos());
        this.eventos();
    }

    public final void eventos() {
        objAñadePro.btnBuscarPro.addActionListener(this);
        objAñadePro.btnAñadePro.addActionListener(this);
        objAñadePro.btnEditaPro.addActionListener(this);
        objAñadePro.btnEliminaPro.addActionListener(this);
        objAñadePro.actualizaTabla.addActionListener(this);
        objAñadePro.tlBuscar.addActionListener(this);
        objAñadePro.tlEditar.addActionListener(this);
        objAñadePro.tlEliminar.addActionListener(this);
        objAñadePro.tlAñadirProv.addActionListener(this);
        objAñadePro.tlInsertar.addActionListener(this);
        objAñadePro.btnMenuAñadeProv.addActionListener(this);
        objAñadePro.btnInicio.addActionListener(this);
    }

    public boolean validarNumeros(String txt) {
        return txt.matches("^([0-9])*$");
    }

    public boolean validarLetras(String txt) {
        return txt.matches("[a-zA-Z]+");
    }

    public boolean validarDouble(String txt) {
        return txt.matches("^[0-9]+([.][0-9]+)?$");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        //Boton añadir
        if (evt.equals(objAñadePro.btnAñadePro) || evt.equals(objAñadePro.tlInsertar)) {
            //Validar campos vacíos
            if (objAñadePro.txtCodigoPro.getText().equals("") || objAñadePro.txtDescriPro.getText().equals("")
                    || objAñadePro.txtFecha.getText().equals("") || objAñadePro.txtNombrePro.getText().equals("")
                    || objAñadePro.txtStockPro.getText().equals("") || objAñadePro.txtValorPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                //Validar solo letras
            } else if (validarLetras(objAñadePro.txtNombrePro.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Campo nombre solo permite letras", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
                //validat solo numeros
            } else if (validarNumeros(objAñadePro.txtCodigoPro.getText()) != true
                    || validarDouble(objAñadePro.txtValorPro.getText()) != true
                    || validarNumeros(objAñadePro.txtStockPro.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Código, valor y la cantidad de productos debes ser números", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                //Enviar al modelo Producto
                modPro.setCodigo(objAñadePro.txtCodigoPro.getText());
                modPro.setNombre(objAñadePro.txtNombrePro.getText());
                modPro.setDescripcion(objAñadePro.txtDescriPro.getText());
                modPro.setValor(Double.parseDouble(objAñadePro.txtValorPro.getText()));
                modPro.setStock(Integer.parseInt(objAñadePro.txtStockPro.getText()));
                modPro.setFechaVencimiento(objAñadePro.txtFecha.getText());
                
                modPro.setIdProveedor(objAñadePro.cmbProveedores.getItemAt(objAñadePro.cmbProveedores.getSelectedIndex()).getIdProveedor());
                //Metodo para hacer INSERT
                if (mcProducto.insertarProfuctos(modPro)) {
                    JOptionPane.showMessageDialog(null, "Producto añadido correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else {

                }
                //Recargar tabla
                objAñadePro.tablaProductos.setModel(mcProducto.modeloTablaProductos());
            }

            //botones para editar
        } else if (evt.equals(objAñadePro.btnEditaPro) || evt.equals(objAñadePro.tlEditar)) {
            //Obtener fila seleccionado por el usuario
            int fila = objAñadePro.tablaProductos.getSelectedRow();

            if (fila >= 0) {
                //Validar que las casillas sean numeros o letras
                if (validarNumeros(objAñadePro.tablaProductos.getValueAt(fila, 0).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "El código debe ser un número (casilla código en la tabla)", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else if (validarDouble(objAñadePro.tablaProductos.getValueAt(fila, 3).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "El valor debe ser un número (casilla valor en la tabla)", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else if (validarNumeros(objAñadePro.tablaProductos.getValueAt(fila, 4).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser un número (casilla cantidad en la tabla)", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else if (validarLetras(objAñadePro.tablaProductos.getValueAt(fila, 1).toString()) != true) {
                    JOptionPane.showMessageDialog(null, "El nombre solo admite letras (casilla nombre en la tabla)", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //Enviar datos al modelo Producto
                    modPro.setCodigo(objAñadePro.tablaProductos.getValueAt(fila, 0).toString());
                    modPro.setNombre(objAñadePro.tablaProductos.getValueAt(fila, 1).toString());
                    modPro.setDescripcion(objAñadePro.tablaProductos.getValueAt(fila, 2).toString());
                    modPro.setValor(Double.parseDouble(objAñadePro.tablaProductos.getValueAt(fila, 3).toString()));
                    modPro.setStock(Integer.parseInt(objAñadePro.tablaProductos.getValueAt(fila, 4).toString()));
                    modPro.setFechaVencimiento(objAñadePro.tablaProductos.getValueAt(fila, 5).toString());
                    modPro.setIdProveedor(Integer.parseInt(objAñadePro.tablaProductos.getValueAt(fila, 6).toString()));
                    //metodo para UPDATE
                    if (mcProducto.editarProfuctos(modPro)) {
                        JOptionPane.showMessageDialog(null, "Producto editado correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                    } else {

                    }
                    //Actualizar tabla despues de actualizar
                    objAñadePro.tablaProductos.setModel(mcProducto.modeloTablaProductos());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes seleccionar el producto que deseas editar");
            }

            //Boton recargar tabla
        } else if (evt.equals(objAñadePro.actualizaTabla)) {
            objAñadePro.tablaProductos.setModel(mcProducto.modeloTablaProductos());
            //BOton eliminar tabla
        } else if (evt.equals(objAñadePro.btnEliminaPro) || evt.equals(objAñadePro.tlEliminar)) {
            //ventana de confirmación al eliminar
            int o = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres eliminar este producto?");
            //control de las opciones de la ventana
            if (o == 0) {
                //Fila seleccionada
                int fila = objAñadePro.tablaProductos.getSelectedRow();

                if (fila >= 0) {
                    //Capruta la id de la fila anteriormente obtenida
                    modPro.setCodigo(objAñadePro.tablaProductos.getValueAt(fila, 0).toString());
                    if (mcProducto.eliminarProfuctos(modPro)) {
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
                        objAñadePro.tablaProductos.setModel(mcProducto.modeloTablaProductos());
                    } else {

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar el producto que deseas eliminar");
                }
            } else {

            }

        } else if (evt.equals(objAñadePro.tlAñadirProv) || evt.equals(objAñadePro.btnMenuAñadeProv)) {
            frmProveedor objProvee = new frmProveedor();
            CtrlProveedor ctrlProvee = new CtrlProveedor(objProvee);
            objProvee.setVisible(true);
            objProvee.setLocationRelativeTo(null);
        }else if (evt.equals(objAñadePro.btnBuscarPro)) {
            if (objAñadePro.txtBuscarPro.getText().equals("") || validarNumeros(objAñadePro.txtBuscarPro.getText()) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacó o no es un número", "¡Mensaje informativo!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                objAñadePro.tablaProductos.setModel(mcProducto.filtrarDatosPro(1, objAñadePro.txtBuscarPro.getText()));
            }
        }else if (evt.equals(objAñadePro.tlBuscar)) {
            String codigo = JOptionPane.showInputDialog("Digita el código del producto");
            if (codigo.equals("") || validarNumeros(codigo) != true) {
                JOptionPane.showMessageDialog(null, "Campo vacío o no es un número", "¡Mensaje de error!", JOptionPane.ERROR_MESSAGE);
            } else {
                objAñadePro.tablaProductos.setModel(mcProducto.filtrarDatosPro(1, codigo));
            }
        }else if (evt.equals(objAñadePro.btnInicio)){
            frmPrincipal vPrn = new frmPrincipal();
            CtrlPrincipal cPrin = new CtrlPrincipal(vPrn);
            vPrn.setVisible(true);
            vPrn.setLocationRelativeTo(null);
            this.objAñadePro.dispose();
        }
    }
}
