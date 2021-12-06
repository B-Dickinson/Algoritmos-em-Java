package adicao;

/*

falta o mod e consertar os erros de ultimo valor + resultado e etc...


*/

import java.util.*;

public final class Calculadora extends javax.swing.JFrame {

    public List<Integer>numeros = new ArrayList<>();
    private int resultado;
    private int adicao;
    private int subtracao;
    private int mult;
    private int div; 
    public boolean somando = false;
    public boolean subtraindo = false;
    public boolean multiplicando = false;
    public boolean dividindo = false;
    public boolean mod = false;
    
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int getAdicao() {
        return adicao;
    }

    public void setAdicao(int adicao) {
        this.adicao = adicao;
    }

    
    
    public Calculadora() {
        initComponents();
        horarioAtual();
    }
    
    public void horarioAtual(){
        Calendar horas = Calendar.getInstance();
        int hora = 0;
        int minuto = 0;
        hora = horas.getTime().getHours();
        minuto = horas.getTime().getMinutes();
        lblTime.setText(hora + ":" + minuto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTime = new javax.swing.JLabel();
        btnZero = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnMoreOrLess = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnParent = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        lblSpace = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTime.setBackground(new java.awt.Color(102, 102, 102));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnZero.setBackground(new java.awt.Color(51, 51, 51));
        btnZero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnZero.setForeground(new java.awt.Color(255, 255, 255));
        btnZero.setText("0");
        btnZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnZero.setBorderPainted(false);
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnPoint.setBackground(new java.awt.Color(51, 51, 51));
        btnPoint.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnPoint.setText(".");
        btnPoint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPoint.setBorderPainted(false);
        btnPoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEquals.setBackground(new java.awt.Color(0, 0, 0));
        btnEquals.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(0, 153, 255));
        btnEquals.setText("=");
        btnEquals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEquals.setBorderPainted(false);
        btnEquals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setBorderPainted(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setBorderPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 255));
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setBorderPainted(false);
        btnAdd.setMaximumSize(new java.awt.Dimension(28, 47));
        btnAdd.setMinimumSize(new java.awt.Dimension(28, 47));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(51, 51, 51));
        btn6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setBorderPainted(false);
        btn6.setMaximumSize(new java.awt.Dimension(28, 47));
        btn6.setMinimumSize(new java.awt.Dimension(28, 47));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(51, 51, 51));
        btn5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setBorderPainted(false);
        btn5.setMaximumSize(new java.awt.Dimension(28, 47));
        btn5.setMinimumSize(new java.awt.Dimension(28, 47));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setBorderPainted(false);
        btn4.setMaximumSize(new java.awt.Dimension(28, 47));
        btn4.setMinimumSize(new java.awt.Dimension(28, 47));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnSub.setBackground(new java.awt.Color(0, 0, 0));
        btnSub.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSub.setForeground(new java.awt.Color(0, 153, 255));
        btnSub.setText("-");
        btnSub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSub.setBorderPainted(false);
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(51, 51, 51));
        btn9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setBorderPainted(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(51, 51, 51));
        btn8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setBorderPainted(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(51, 51, 51));
        btn7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setBorderPainted(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnMult.setBackground(new java.awt.Color(0, 0, 0));
        btnMult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMult.setForeground(new java.awt.Color(0, 153, 255));
        btnMult.setText("X");
        btnMult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMult.setBorderPainted(false);
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnMoreOrLess.setBackground(new java.awt.Color(51, 51, 51));
        btnMoreOrLess.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMoreOrLess.setForeground(new java.awt.Color(255, 255, 255));
        btnMoreOrLess.setText("+/-");
        btnMoreOrLess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMoreOrLess.setBorderPainted(false);
        btnMoreOrLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreOrLessActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(0, 0, 0));
        btnDiv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(0, 153, 255));
        btnDiv.setText("<html>&divide;</html>");
        btnDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiv.setBorderPainted(false);
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(0, 0, 0));
        btnMod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMod.setForeground(new java.awt.Color(0, 153, 255));
        btnMod.setText("%");
        btnMod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMod.setBorderPainted(false);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnParent.setBackground(new java.awt.Color(0, 0, 0));
        btnParent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnParent.setForeground(new java.awt.Color(0, 153, 255));
        btnParent.setText("( )");
        btnParent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnParent.setBorderPainted(false);
        btnParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentActionPerformed(evt);
            }
        });

        btnLimpa.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpa.setForeground(new java.awt.Color(0, 153, 255));
        btnLimpa.setText("C");
        btnLimpa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpa.setBorderPainted(false);
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        lblSpace.setEditable(false);
        lblSpace.setBackground(new java.awt.Color(51, 51, 51));
        lblSpace.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSpace.setForeground(new java.awt.Color(204, 51, 0));
        lblSpace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));
        lblSpace.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMoreOrLess, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnParent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPoint, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(btnMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnMult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(btnSub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnParent)
                        .addComponent(btnLimpa))
                    .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8)
                        .addComponent(btn9)
                        .addComponent(btnMult)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPoint)
                        .addComponent(btnEquals))
                    .addComponent(btnZero)
                    .addComponent(btnMoreOrLess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        
        lblSpace.setText(lblSpace.getText() + 0);
        this.numeros.add(0);
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 1);
        this.numeros.add(1);
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        lblSpace.setText(lblSpace.getText() + " + ");
        
        this.somando = true;
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
       
        
        
        
        // adicao
        if(this.somando == true){
            
        if(this.getResultado() == 0){
         
        for(int x : this.numeros)
        {
            this.setAdicao(x);
            this.setResultado(this.getResultado() + this.getAdicao());
        }
        

    } else {
            int p = numeros.get(numeros.size() - 1);
            this.setResultado(this.getResultado() + p);            
            
    }
        
            lblSpace.setText(Integer.toString(this.getResultado()));            
        
    }
    

        // subtracao
        if(subtraindo == true)
            
        {
            
        for(int x : this.numeros)
        {
          
          this.setSubtracao((-1) * x);
          this.setResultado(this.getSubtracao() - this.getResultado());
            
        }            

            lblSpace.setText(Integer.toString(this.getResultado()));        
        
        } 
        
        
        // multiplicacao        
        if(multiplicando == true){
            
        if(this.getResultado() == (this.getResultado() + 0)){            
         
        for(int x : this.numeros)
        {
            
            this.setMult(x);   
          
        if(this.getResultado() == 0){
            this.setResultado((this.getResultado() + 1) * this.getMult());  
        }else{
            this.setResultado(this.getResultado() * this.getMult());  
        }
        
        }
        
        } else {
            
            int p = numeros.get(numeros.size() - 1);
            this.setResultado(this.getResultado() * p);            
            
        } 
            
            
            lblSpace.setText(Integer.toString(this.getResultado()));
    }        
        
        // divisao
        if(dividindo == true)
        
        {
            int p = this.getResultado() + 1;
        for(int x : this.numeros)
        {
            this.setDiv(x);
            
        if(this.getResultado() == 0){    
            this.setResultado((this.getResultado() - (- this.getDiv())) / p);
        }else{
            this.setResultado(this.getResultado() / (this.getDiv() / p));
        }    
        }
        
            lblSpace.setText(Integer.toString(this.getResultado()));
            
        }
        
        
        
        // resto
        if(mod == true)
        
        {
            
        }
        
            
        
        
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 2);
        this.numeros.add(2);
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 3);
        this.numeros.add(3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 4);
        this.numeros.add(4);  
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 5);
        this.numeros.add(5);        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 6);
        this.numeros.add(6);        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 7);
        this.numeros.add(7);        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 8);
        this.numeros.add(8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + 9);
        this.numeros.add(9);        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + " - ");
        subtraindo = true;
        
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + " x ");
        multiplicando = true;
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + " / ");
        dividindo = true;        
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
       
        
        lblSpace.setText(lblSpace.getText() + " % ");
        mod = true;   
        
    }//GEN-LAST:event_btnModActionPerformed

    private void btnParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentActionPerformed
       
    }//GEN-LAST:event_btnParentActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
       
        
        lblSpace.setText("");
        this.numeros.clear();
        this.setResultado(0);
        this.setAdicao(0);
        this.setSubtracao(0);
        this.setMult(0);
        this.setDiv(0);
        
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnMoreOrLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreOrLessActionPerformed
       
    }//GEN-LAST:event_btnMoreOrLessActionPerformed

    
    
    
    
    
    public int getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(int subtracao) {
        this.subtracao = subtracao;
    }

    public int getMult() {
        return mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }    
    
    


    
    
    
    
    
    
    
    
    
    public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMoreOrLess;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnParent;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnZero;
    private javax.swing.JTextField lblSpace;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
