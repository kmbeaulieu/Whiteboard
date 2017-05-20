
import DShape.*;
import DShapeModel.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krystle
 */
public class WhiteBoardEditor extends javax.swing.JFrame {

    private static Color currentColor = Color.GRAY;
    // private CurrentShape currentShapeSelected = CurrentShape.NONE;
    private int startX = 0;
    private int startY = 0;
    private final int defaultSize = 60;
    private int shapeSpacing = 10;
    private int nextFreeX = shapeSpacing;
    private int nextFreeY = shapeSpacing;
    private int xBound = 368;
    private int yBound = 398;
    private boolean resizing = false;
    String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    private boolean moving = false;
    private int knobPoint = 0;
    private Rectangle origSize = null;

    private void addToTable(DRectModel r) {
        //TODO
//        int numColumns = currentShapesTable.getColumnCount();
//         Object[] row = new Object[4];//{r.getX(),r.getY(),r.getW(),r.getH()};
//         row[0] = r.getX();
//         row[1]= r.getY();
//         row[2]=r.getW();
//         row[3]=r.getH();
//                DefaultTableModel model = new DefaultTableModel();
//                model.addRow(row);

    }

//    private enum CurrentShape {
//        RECTANGLE("RECTANGLE"), OVAL("OVAL"), LINE("LINE"), TEXT("TEXT"), NONE("");
//
//        String shapeName;
//
//        CurrentShape(String s) {
//            shapeName = s.toUpperCase();
//        }
//
//        public String getName() {
//            return shapeName;
//        }
//    }
    /**
     * Creates new form WhiteBoardEditor
     */
    public WhiteBoardEditor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        box = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        createShapeLabel = new javax.swing.JLabel();
        shapePanel1 = new javax.swing.JPanel();
        addRectangleButton = new javax.swing.JButton();
        addOvalButton = new javax.swing.JButton();
        addLineButton = new javax.swing.JButton();
        textPanel = new javax.swing.JPanel();
        textButton = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        fontChooser = new java.awt.Choice();
        currentShapesLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        currentShapesTable = new javax.swing.JTable();
        colorPickerPanel = new javax.swing.JPanel();
        colorChooserButton = new javax.swing.JButton();
        currentColorPreviewPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        mouseButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        canvas = new Canvas();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        saveFileMenuItem = new javax.swing.JMenuItem();
        openFileMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        startServerMenuItem = new javax.swing.JMenuItem();
        startClientMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        box.setBackground(new java.awt.Color(204, 255, 204));
        box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        box.setMinimumSize(new java.awt.Dimension(600, 400));
        box.setPreferredSize(new java.awt.Dimension(600, 400));
        box.setLayout(new java.awt.BorderLayout());

        controlPanel.setBackground(new java.awt.Color(153, 255, 204));
        controlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        controlPanel.setMinimumSize(new java.awt.Dimension(200, 400));

        createShapeLabel.setFont(createShapeLabel.getFont().deriveFont(createShapeLabel.getFont().getSize()+3f));
        createShapeLabel.setText("1. Pick a Shape");

        addRectangleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addRectangleButton.setText("Rectangle");
        addRectangleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addRectangleButtonMousePressed(evt);
            }
        });

        addOvalButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addOvalButton.setText("Oval");
        addOvalButton.setMaximumSize(new java.awt.Dimension(93, 25));
        addOvalButton.setMinimumSize(new java.awt.Dimension(93, 25));
        addOvalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addOvalButtonMousePressed(evt);
            }
        });
        addOvalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOvalButtonActionPerformed(evt);
            }
        });

        addLineButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addLineButton.setText("Line");
        addLineButton.setMaximumSize(new java.awt.Dimension(93, 25));
        addLineButton.setMinimumSize(new java.awt.Dimension(93, 25));
        addLineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addLineButtonMousePressed(evt);
            }
        });

        textButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textButton.setText("Text");

        textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textField.setText("Enter Text");
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        fontChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        for (String font : fonts) {
            fontChooser.add(font);
        }

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addComponent(textButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(fontChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(textPanelLayout.createSequentialGroup()
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fontChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout shapePanel1Layout = new javax.swing.GroupLayout(shapePanel1);
        shapePanel1.setLayout(shapePanel1Layout);
        shapePanel1Layout.setHorizontalGroup(
            shapePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePanel1Layout.createSequentialGroup()
                .addComponent(addRectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOvalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(shapePanel1Layout.createSequentialGroup()
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shapePanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addOvalButton, addRectangleButton});

        shapePanel1Layout.setVerticalGroup(
            shapePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePanel1Layout.createSequentialGroup()
                .addGroup(shapePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRectangleButton)
                    .addComponent(addOvalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        shapePanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addLineButton, addOvalButton, addRectangleButton});

        currentShapesLabel.setFont(currentShapesLabel.getFont().deriveFont(currentShapesLabel.getFont().getSize()+3f));
        currentShapesLabel.setText("Current Shapes");

        currentShapesTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currentShapesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "X", "Y", "Width", "Height"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(currentShapesTable);

        colorPickerPanel.setLayout(new java.awt.BorderLayout());

        colorChooserButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        colorChooserButton.setText("Open Color Chooser");
        colorChooserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorChooserButtonMouseClicked(evt);
            }
        });
        colorPickerPanel.add(colorChooserButton, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout currentColorPreviewPanelLayout = new javax.swing.GroupLayout(currentColorPreviewPanel);
        currentColorPreviewPanel.setLayout(currentColorPreviewPanelLayout);
        currentColorPreviewPanelLayout.setHorizontalGroup(
            currentColorPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        currentColorPreviewPanelLayout.setVerticalGroup(
            currentColorPreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        colorPickerPanel.add(currentColorPreviewPanel, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getSize()+3f));
        jLabel1.setText("2. Pick a color");

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearButtonMousePressed(evt);
            }
        });

        mouseButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mouseButton.setText("Select");
        mouseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseButtonMouseClicked(evt);
            }
        });
        mouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shapePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colorPickerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addComponent(createShapeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mouseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton))
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(currentShapesLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createShapeLabel)
                    .addComponent(clearButton)
                    .addComponent(mouseButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shapePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(colorPickerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentShapesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );

        box.add(controlPanel, java.awt.BorderLayout.WEST);

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvasMouseDragged(evt);
            }
        });
        canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvasMouseReleased(evt);
            }
        });
        canvas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                canvasComponentResized(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        box.add(canvas, java.awt.BorderLayout.CENTER);

        jMenu3.setText("File");

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFileMenuItem.setText("save file");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(saveFileMenuItem);

        openFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFileMenuItem.setText("open file...");
        openFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(openFileMenuItem);
        jMenu3.add(jSeparator1);

        startServerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        startServerMenuItem.setText("start server");
        startServerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServerMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(startServerMenuItem);

        startClientMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        startClientMenuItem.setText("start client");
        startClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startClientMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(startClientMenuItem);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addShapeToCanvas(String shapeType) {
        if (shapeType.equals("rectangle")) {
            canvas.addShape(new DRectModel(nextFreeX, nextFreeY, defaultSize, defaultSize, Color.GRAY));
        } else if (shapeType.equals("oval")) {
            canvas.addShape(new DOvalModel(nextFreeX, nextFreeY, defaultSize, defaultSize, Color.GRAY));
        } else if (shapeType.equals("line")) {
            canvas.addShape(new DLineModel(nextFreeX, nextFreeY, nextFreeX + defaultSize, nextFreeY + defaultSize, Color.GRAY));
        } else if (shapeType.equals("text")) {

        } else {
            //nothing
        }
        canvas.repaint();
        nextFreeX += defaultSize + shapeSpacing;
        if (nextFreeX > xBound - defaultSize) {
            nextFreeX = shapeSpacing;
            nextFreeY += defaultSize + shapeSpacing;
        }
        if (nextFreeY > yBound) {
            nextFreeY = shapeSpacing;
        }
    }
    private void colorChooserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorChooserButtonMouseClicked
        // TODO add your handling code here:
        currentColor = JColorChooser.showDialog(rootPane, "Pick a color", currentColor);
        if (currentColor != null) {
            currentColorPreviewPanel.setBackground(currentColor);
            if (canvas.selectedShape != null) {
                canvas.selectedShape.setColor(currentColor);
                canvas.repaint();
            }
        }
    }//GEN-LAST:event_colorChooserButtonMouseClicked

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed
    private boolean clickedWithinShape(Point p) {
        int shapeCount = canvas.list.size();
        for (int i = 0; i < shapeCount; i++) {
            DShape shape = canvas.list.get(i);
            if (shape.getBounds().contains(p)) {
                //select the shape
                canvas.selectedShape = shape;
                //refresh to draw the x on the shape
                repaint();
                origSize = new Rectangle(shape.getX(), shape.getY(), shape.getW(), shape.getH());
                return true;
            }
        }
        return false;
    }
    private void canvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMousePressed
        // start a drag
        startX = evt.getX();
        startY = evt.getY();
        Point p = new Point(evt.getX(), evt.getY());
        if (clickedWithinShape(p)) {
            System.out.println("within shape");
            return;
        }
        // if dragging within the knobs resize shape
        Knob knobs = canvas.selectedShape.getKnobs();
        if (knobs != null) {
            resizing = knobs.contains(p); // resize shape
            // move shape

            DShape cShape = canvas.selectedShape; // current selected shape
            // if dragging within the knobs resize shape
            if (cShape != null) {
                knobPoint = cShape.getKnobs().getKnobPoint(p);
                if (knobPoint != 0) {
                    resizing = true;
                    origSize = new Rectangle(cShape.getX(), cShape.getY(), cShape.getW(), cShape.getH());
                    return;

                } else { // move shape
                    moving = true;
                    origSize = new Rectangle(cShape.getX(), cShape.getY(), cShape.getW(), cShape.getH());
                }
            }

            if (clickedWithinShape(p)) {
                moving = true;
                return;
            }
            canvas.selectedShape = null; // unselect the shape if clicked on white area
            repaint(); // refresh canvas
    }//GEN-LAST:event_canvasMousePressed
    }


    private void canvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseReleased
        canvas.selectedShape = null;
        resizing = false;
        knobPoint = 0;
        origSize = null;
        moving = false;
    }//GEN-LAST:event_canvasMouseReleased

    private void mouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mouseButtonActionPerformed

    private void mouseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseButtonMouseClicked
        // TODO add your handling code here:
//        currentShapeSelected = CurrentShape.NONE;
        canvas.selectedShape = null;
        repaint();
    }//GEN-LAST:event_mouseButtonMouseClicked

    private void canvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseDragged
        int endX = evt.getX();
        int endY = evt.getY();
        int sY = Math.min(startY, endY);
        int sX = Math.min(startX, endX);
        int w = Math.abs(startX - endX);
        int h = Math.abs(startY - endY);
        // if shape is currently selected
        if (resizing) {
            if (knobPoint == 1) {
                if (canvas.selectedShape instanceof DLine) {
                    canvas.selectedShape.setY(origSize.y - (startY - endY));
                    canvas.selectedShape.setX(origSize.x - (startX - endX));
                } else {
                    canvas.selectedShape.setY(origSize.y - (startY - endY));
                    canvas.selectedShape.setX(origSize.x - (startX - endX));
                    canvas.selectedShape.setH(origSize.height + (startY - endY));
                    canvas.selectedShape.setW(origSize.width + (startX - endX));
                }
            } else if (knobPoint == 2) {
                if (canvas.selectedShape instanceof DLine) {
                    canvas.selectedShape.setH(origSize.height - (startY - endY));
                    canvas.selectedShape.setW(origSize.width - (startX - endX));
                } else {
                    canvas.selectedShape.setY(origSize.y - (startY - endY));
                    canvas.selectedShape.setH(origSize.height + (startY - endY));
                    canvas.selectedShape.setW(origSize.width - (startX - endX));
                }
            } else if (knobPoint == 3) {
                canvas.selectedShape.setX(origSize.x - (startX - endX));
                canvas.selectedShape.setH(origSize.height - (startY - endY));
                canvas.selectedShape.setW(origSize.width + (startX - endX));
            } else if (knobPoint == 4) {
                canvas.selectedShape.setH(origSize.height - (startY - endY));
                canvas.selectedShape.setW(origSize.width - (startX - endX));
            } else {

            }
            repaint();
            return;
        }
        if (moving && canvas.selectedShape != null) {
            if (canvas.selectedShape instanceof DLine) {
                canvas.selectedShape.setX(origSize.x - (startX - endX));
                canvas.selectedShape.setY(origSize.y - (startY - endY));
                canvas.selectedShape.setW(origSize.width - (startX - endX));
                canvas.selectedShape.setH(origSize.height - (startY - endY));
            } else {
                canvas.selectedShape.setX(origSize.x - (startX - endX));
                canvas.selectedShape.setY(origSize.y - (startY - endY));
            }
            repaint();
        }
    }//GEN-LAST:event_canvasMouseDragged

    private void addOvalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOvalButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addOvalButtonActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        canvas.remove();
    }//GEN-LAST:event_deleteButtonMouseClicked


    private void startClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startClientMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("you clicked start client!");

    }//GEN-LAST:event_startClientMenuItemActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("you clicked save!");
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void openFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("you clicked open!");
    }//GEN-LAST:event_openFileMenuItemActionPerformed

    private void startServerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServerMenuItemActionPerformed
        String port = JOptionPane.showInputDialog(this, "Enter Port Number", "Server Setup", JOptionPane.QUESTION_MESSAGE);
        startServer(port);
    }//GEN-LAST:event_startServerMenuItemActionPerformed

    private void addRectangleButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRectangleButtonMousePressed
        addShapeToCanvas("rectangle");
    }//GEN-LAST:event_addRectangleButtonMousePressed

    private void addOvalButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOvalButtonMousePressed
        addShapeToCanvas("oval");
    }//GEN-LAST:event_addOvalButtonMousePressed

    private void addLineButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLineButtonMousePressed
        addShapeToCanvas("line");
    }//GEN-LAST:event_addLineButtonMousePressed

    private void canvasComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_canvasComponentResized
        Rectangle r = canvas.getBounds();
        xBound = r.width;
        yBound = r.height;
    }//GEN-LAST:event_canvasComponentResized

    private void clearButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMousePressed
        // TODO add your handling code here:
        canvas.clear();
        currentShapesTable.removeAll();
        shapeSpacing = 10;
        nextFreeX = shapeSpacing;
        nextFreeY = shapeSpacing;
    }//GEN-LAST:event_clearButtonMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WhiteBoardEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhiteBoardEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhiteBoardEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhiteBoardEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WhiteBoardEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLineButton;
    private javax.swing.JButton addOvalButton;
    private javax.swing.JButton addRectangleButton;
    private javax.swing.JPanel box;
    private Canvas canvas;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton colorChooserButton;
    private javax.swing.JPanel colorPickerPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel createShapeLabel;
    private javax.swing.JPanel currentColorPreviewPanel;
    private javax.swing.JLabel currentShapesLabel;
    private javax.swing.JTable currentShapesTable;
    private javax.swing.JButton deleteButton;
    private java.awt.Choice fontChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton mouseButton;
    private javax.swing.JMenuItem openFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    private javax.swing.JPanel shapePanel1;
    private javax.swing.JMenuItem startClientMenuItem;
    private javax.swing.JMenuItem startServerMenuItem;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton textButton;
    private javax.swing.JTextField textField;
    private javax.swing.JPanel textPanel;
    // End of variables declaration//GEN-END:variables

    private void startServer(String port) {
        int p;
        if (port.isEmpty()) {
            //default port
            p = 39587;
        } else {
            try {
                //set the custom port number;
                p = Integer.valueOf(port);
                if (p > 65535 || p < 0) {
                    //too high or low so use default port
                    p = 39587;
                }
            } catch (java.lang.NumberFormatException nfe) {
                int num = JOptionPane.showConfirmDialog(this, "the port you entered was invalid, using default port 39587.");
                if (num == JOptionPane.OK_OPTION) {
                    //ok to use default port
                    p = 39587;
                } else {
                    return;
                }
            }
        }

        System.out.println(p);
//            Server server = new Server(p);
//            server.listen();
    }
}
