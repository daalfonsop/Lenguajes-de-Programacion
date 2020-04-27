/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaAdmin;

import Vista.Login1;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author walter
 */
public class HomeAdmin extends javax.swing.JPanel {

    /**
     * Creates new form HomeAdmin
     */
    private Login1 login;
    public HomeAdmin(Login1 login) {
        initComponents();
        this.login=login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panele = new rojeru_san.rspanel.RSPanelGradiente();
        boton_salir = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_home = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_odontologos = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_auxiliares = new RSMaterialComponent.RSButtonMaterialIconUno();
        jSeparator1 = new javax.swing.JSeparator();
        boton_pacientes = new RSMaterialComponent.RSButtonMaterialIconUno();
        panel = new rojerusan.RSPanelsSlider();
        panelHome = new javax.swing.JPanel();
        rSCalendar2 = new rojeru_san.rsdate.RSCalendar();
        jPanel2 = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        panelOdon = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMaterialIconUno1 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno2 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno3 = new RSMaterialComponent.RSButtonMaterialIconUno();
        jPanel3 = new javax.swing.JPanel();
        rSLabelHora2 = new rojeru_san.rsdate.RSLabelHora();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table = new rojerusan.RSTableMetro1();
        persona = new necesario.TextField();
        panelPaci = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rSButtonMaterialIconUno7 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno8 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno9 = new RSMaterialComponent.RSButtonMaterialIconUno();
        jPanel7 = new javax.swing.JPanel();
        rSLabelHora4 = new rojeru_san.rsdate.RSLabelHora();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        rSTableMetro14 = new rojerusan.RSTableMetro1();
        persona1 = new necesario.TextField();
        panelAux = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        persona2 = new necesario.TextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro12 = new rojerusan.RSTableMetro1();
        rSButtonMaterialIconUno4 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno5 = new RSMaterialComponent.RSButtonMaterialIconUno();
        rSButtonMaterialIconUno6 = new RSMaterialComponent.RSButtonMaterialIconUno();
        jPanel5 = new javax.swing.JPanel();
        rSLabelHora3 = new rojeru_san.rsdate.RSLabelHora();
        jLabel3 = new javax.swing.JLabel();

        boton_salir.setBackground(new java.awt.Color(0, 37, 64));
        boton_salir.setText("Salir");
        boton_salir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        boton_home.setBackground(new java.awt.Color(0, 37, 64));
        boton_home.setText("Home");
        boton_home.setToolTipText("");
        boton_home.setAutoscrolls(true);
        boton_home.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        boton_home.setSelected(true);
        boton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_homeActionPerformed(evt);
            }
        });

        boton_odontologos.setBackground(new java.awt.Color(0, 37, 64));
        boton_odontologos.setText("Odontologos");
        boton_odontologos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_odontologos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_odontologosActionPerformed(evt);
            }
        });

        boton_auxiliares.setBackground(new java.awt.Color(0, 37, 64));
        boton_auxiliares.setText("Auxiliares");
        boton_auxiliares.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_auxiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_auxiliaresActionPerformed(evt);
            }
        });

        boton_pacientes.setBackground(new java.awt.Color(0, 37, 64));
        boton_pacientes.setText("Pacientes");
        boton_pacientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneleLayout = new javax.swing.GroupLayout(panele);
        panele.setLayout(paneleLayout);
        paneleLayout.setHorizontalGroup(
            paneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(boton_odontologos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(boton_auxiliares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(boton_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(boton_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        paneleLayout.setVerticalGroup(
            paneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(boton_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(boton_odontologos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(boton_auxiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setName("panelHome"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));
        jPanel2.setForeground(new java.awt.Color(0, 112, 192));
        jPanel2.setToolTipText("");

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.add(panelHome, "card2");

        panelOdon.setName("panelOdon"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonMaterialIconUno1.setText("Agregar");
        rSButtonMaterialIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE_OUTLINE);
        rSButtonMaterialIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconUno1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconUno2.setText("Modificar");
        rSButtonMaterialIconUno2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CACHED);

        rSButtonMaterialIconUno3.setText("Eliminar");
        rSButtonMaterialIconUno3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        rSLabelHora2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Odontólogos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(rSLabelHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido(s)", "Dirección", "Correo", "Contacto", "Usuario", "Contraseña", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Table);

        persona.setEditable(false);
        persona.setPlaceholder("DefaultUsuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(persona, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonMaterialIconUno1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconUno1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persona, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelOdonLayout = new javax.swing.GroupLayout(panelOdon);
        panelOdon.setLayout(panelOdonLayout);
        panelOdonLayout.setHorizontalGroup(
            panelOdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelOdonLayout.setVerticalGroup(
            panelOdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel.add(panelOdon, "card4");

        panelPaci.setName("panelPaci"); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonMaterialIconUno7.setText("Agregar");
        rSButtonMaterialIconUno7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE_OUTLINE);

        rSButtonMaterialIconUno8.setText("Modificar");
        rSButtonMaterialIconUno8.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CACHED);

        rSButtonMaterialIconUno9.setText("Eliminar");
        rSButtonMaterialIconUno9.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);

        jPanel7.setBackground(new java.awt.Color(0, 112, 192));

        rSLabelHora4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pacientes");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        rSTableMetro14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido(s)", "Dirección", "Correo", "Contacto", "Usuario", "Contraseña", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(rSTableMetro14);

        persona1.setEditable(false);
        persona1.setPlaceholder("DefaultUsuario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(persona1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonMaterialIconUno7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconUno7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persona1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPaciLayout = new javax.swing.GroupLayout(panelPaci);
        panelPaci.setLayout(panelPaciLayout);
        panelPaciLayout.setHorizontalGroup(
            panelPaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelPaciLayout.setVerticalGroup(
            panelPaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel.add(panelPaci, "card3");

        panelAux.setName("panelAux"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        persona2.setEditable(false);
        persona2.setPlaceholder("DefaultUsuario");

        rSTableMetro12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido(s)", "Dirección", "Correo", "Contacto", "Usuario", "Contraseña", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(rSTableMetro12);

        rSButtonMaterialIconUno4.setText("Agregar");
        rSButtonMaterialIconUno4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE_OUTLINE);

        rSButtonMaterialIconUno5.setText("Modificar");
        rSButtonMaterialIconUno5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CACHED);

        rSButtonMaterialIconUno6.setText("Eliminar");
        rSButtonMaterialIconUno6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);

        jPanel5.setBackground(new java.awt.Color(0, 112, 192));

        rSLabelHora3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Auxiliares");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(persona2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(rSButtonMaterialIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialIconUno6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconUno6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persona2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAuxLayout = new javax.swing.GroupLayout(panelAux);
        panelAux.setLayout(panelAuxLayout);
        panelAuxLayout.setHorizontalGroup(
            panelAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelAuxLayout.setVerticalGroup(
            panelAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel.add(panelAux, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        login.regresarALogin(this);
    }//GEN-LAST:event_boton_salirActionPerformed

    private void boton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_homeActionPerformed
        this.boton_home.setSelected(true);
        this.boton_odontologos.setSelected(false);
        this.boton_auxiliares.setSelected(false);
        this.boton_pacientes.setSelected(false);

        panel.setPanelSlider(1, panelHome, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_homeActionPerformed

    private void boton_odontologosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_odontologosActionPerformed

        this.boton_home.setSelected(false);
        this.boton_odontologos.setSelected(true);
        this.boton_auxiliares.setSelected(false);
        this.boton_pacientes.setSelected(false);
        panel.setPanelSlider(1, panelOdon, RSPanelsSlider.DIRECT.LEFT);

    }//GEN-LAST:event_boton_odontologosActionPerformed

    private void boton_auxiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_auxiliaresActionPerformed
        this.boton_home.setSelected(false);
        this.boton_odontologos.setSelected(false);
        this.boton_auxiliares.setSelected(true);
        this.boton_pacientes.setSelected(false);

        panel.setPanelSlider(1, panelAux, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_auxiliaresActionPerformed

    private void boton_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pacientesActionPerformed
        this.boton_home.setSelected(false);
        this.boton_odontologos.setSelected(false);
        this.boton_auxiliares.setSelected(false);
        this.boton_pacientes.setSelected(true);

        panel.setPanelSlider(1, panelPaci, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_pacientesActionPerformed

    private void rSButtonMaterialIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconUno1ActionPerformed
        new Login1(login).setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconUno1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro1 Table;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_auxiliares;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_home;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_odontologos;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_pacientes;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSPanelsSlider panel;
    private javax.swing.JPanel panelAux;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelOdon;
    private javax.swing.JPanel panelPaci;
    private rojeru_san.rspanel.RSPanelGradiente panele;
    private necesario.TextField persona;
    private necesario.TextField persona1;
    private necesario.TextField persona2;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno1;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno2;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno3;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno4;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno5;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno6;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno7;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno8;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno9;
    private rojeru_san.rsdate.RSCalendar rSCalendar2;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora2;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora3;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora4;
    private rojerusan.RSTableMetro1 rSTableMetro12;
    private rojerusan.RSTableMetro1 rSTableMetro14;
    // End of variables declaration//GEN-END:variables
}
