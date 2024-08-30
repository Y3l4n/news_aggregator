/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package JavaBlockchain;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicButtonUI;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author User
 */
public class RecentNews extends javax.swing.JPanel implements ImplementNews {
    
    private int page;
    private JSONObject jsonobject;
    private JSONArray jsonArray;
    private MouseAdapter mouseListener;
    private ArrayList<JComponent> newsList1 = new ArrayList<JComponent>();
    private ArrayList<JComponent> newsList2 = new ArrayList<JComponent>();
    private ArrayList<JComponent> newsList3 = new ArrayList<JComponent>();
    private ArrayList<JComponent> newsList4 = new ArrayList<JComponent>();
    public RecentNews(JSONArray jsonArray) 
    {
        initComponents();
        newsList1.add(title1);
        newsList1.add(author1);
        newsList1.add(subtitle1);
        newsList1.add(type1);
        newsList1.add(image1);
        newsList2.add(title2);
        newsList2.add(author2);
        newsList2.add(subtitle2);
        newsList2.add(type2);
        newsList2.add(image2);
        newsList3.add(title3);
        newsList3.add(author3);
        newsList3.add(subtitle3);
        newsList3.add(type3);
        newsList3.add(image3);
        newsList4.add(title4);
        newsList4.add(author4);
        newsList4.add(subtitle4);
        newsList4.add(type4);
        newsList4.add(image4);
        
        
        
        page =0;
        JButton[] btns = {nextbutton,backbutton};
        for (JButton btn:btns)
        {
        btn.setBackground(new Color(30,40,44));
        btn.setUI(new BasicButtonUI());
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
            }
        });
        }
        
        currentpage.setText("Page "+ (page+1) +" out of 6" );
        this.jsonArray = jsonArray;
        jsonobject = (JSONObject)jsonArray.get(page*4);
        testfunction(newsList1, jsonobject);
        jsonobject =  (JSONObject)jsonArray.get(page*4+1);
        testfunction(newsList2, jsonobject);
        jsonobject = (JSONObject)jsonArray.get(page*4+2);
        testfunction(newsList3, jsonobject);
        jsonobject = (JSONObject)jsonArray.get(page*4+3);
        testfunction(newsList4, jsonobject);
    }
    public void showform(Component comp)
        {
            this.removeAll();
            this.add(comp);
            this.repaint();
            this.revalidate();
        }
    private ArrayList<JComponent> news;
    @Override
    public void testfunction(ArrayList<JComponent> components, JSONObject jsonarray)
    {
        this.news=components;
        ((JLabel) news.get(0)).setText( (String) jsonarray.get("title"));
        ((JLabel) news.get(1)).setText( (String) jsonarray.get("author"));
        ((JLabel) news.get(2)).setText( (String) jsonarray.get("creationDate"));
        ((JLabel) news.get(3)).setText( (String) jsonarray.get("type"));
        try {
                URL url = new URL((String)jsonarray.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                ((JLabel) news.get(4)).setIcon(icon);
            } 
        catch (IOException e) 
            {
               e.printStackTrace();
            }
        this.mouseListener =  new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews(jsonarray));
            }
            };
        ((JLabel) news.get(0)).addMouseListener(mouseListener);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        currentpage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        categorycombobox = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        news1 = new JavaBlockchain.RoundedPanel();
        image1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        author1 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        news2 = new JavaBlockchain.RoundedPanel();
        image2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        author2 = new javax.swing.JLabel();
        subtitle2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        news3 = new JavaBlockchain.RoundedPanel();
        image3 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        author3 = new javax.swing.JLabel();
        subtitle3 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        news4 = new JavaBlockchain.RoundedPanel();
        image4 = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        author4 = new javax.swing.JLabel();
        subtitle4 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 40, 44));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(30, 40, 44));
        jPanel1.setPreferredSize(new java.awt.Dimension(581, 40));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBackground(new java.awt.Color(30, 40, 44));
        jPanel6.setPreferredSize(new java.awt.Dimension(160, 40));

        currentpage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        currentpage.setForeground(new java.awt.Color(255, 255, 255));
        currentpage.setText("Page 1 out of 6");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Overview_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentpage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6);

        backbutton.setBackground(new java.awt.Color(30, 40, 44));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Back To.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RECENT NEWS");
        jPanel1.add(jLabel3);

        nextbutton.setBackground(new java.awt.Color(30, 40, 44));
        nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Next page.png"))); // NOI18N
        nextbutton.setBorder(null);
        nextbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(nextbutton);

        jPanel5.setBackground(new java.awt.Color(30, 40, 44));

        categorycombobox.setBackground(new java.awt.Color(30, 40, 44));
        categorycombobox.setForeground(new java.awt.Color(255, 255, 255));
        categorycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "News", "Article", "Blog" }));

        search.setBackground(new java.awt.Color(30, 40, 44));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(categorycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categorycombobox))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(30, 40, 44));
        jPanel2.setPreferredSize(new java.awt.Dimension(25, 285));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(30, 40, 44));
        jPanel3.setPreferredSize(new java.awt.Dimension(25, 285));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(30, 40, 44));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        news1.setBackground(new java.awt.Color(102, 102, 102));
        news1.setRoundBottomLeft(30);
        news1.setRoundBottomRight(30);
        news1.setRoundTopLeft(30);
        news1.setRoundTopRight(30);
        news1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thumbnail.jpg"))); // NOI18N
        image1.setText("jLabel4");
        image1.setPreferredSize(new java.awt.Dimension(122, 80));
        news1.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title1.setText("Title: ");
        title1.setToolTipText("See Detail\n");
        news1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author1.setText("Author:");
        news1.add(author1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle1.setText("Creation Date: ");
        news1.add(subtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type1.setText("Type");
        news1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news1);

        news2.setBackground(new java.awt.Color(102, 102, 102));
        news2.setRoundBottomLeft(30);
        news2.setRoundBottomRight(30);
        news2.setRoundTopLeft(30);
        news2.setRoundTopRight(30);
        news2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thumbnail.jpg"))); // NOI18N
        image2.setText("jLabel4");
        image2.setPreferredSize(new java.awt.Dimension(122, 80));
        news2.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title2.setText("Title: ");
        title2.setToolTipText("See Detail\n");
        news2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author2.setText("Author:");
        news2.add(author2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle2.setText("Creation Date: ");
        news2.add(subtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type2.setText("Type");
        news2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news2);

        news3.setBackground(new java.awt.Color(102, 102, 102));
        news3.setRoundBottomLeft(30);
        news3.setRoundBottomRight(30);
        news3.setRoundTopLeft(30);
        news3.setRoundTopRight(30);
        news3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thumbnail.jpg"))); // NOI18N
        image3.setText("jLabel4");
        image3.setPreferredSize(new java.awt.Dimension(122, 80));
        news3.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title3.setText("Title: ");
        title3.setToolTipText("See Detail\n");
        news3.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author3.setText("Author: ");
        news3.add(author3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle3.setText("Creation Date: ");
        news3.add(subtitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type3.setText("Type");
        news3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news3);

        news4.setBackground(new java.awt.Color(102, 102, 102));
        news4.setRoundBottomLeft(30);
        news4.setRoundBottomRight(30);
        news4.setRoundTopLeft(30);
        news4.setRoundTopRight(30);
        news4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thumbnail.jpg"))); // NOI18N
        image4.setText("jLabel4");
        image4.setPreferredSize(new java.awt.Dimension(122, 80));
        news4.add(image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title4.setText("Title:");
        title4.setToolTipText("See Detail\n");
        news4.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author4.setText("Author: ");
        news4.add(author4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle4.setText("Creation Date:");
        news4.add(subtitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type4.setText("Type");
        news4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news4);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed

        if (page==5)
         {
             return;
         }
         else
         {
                page = page +1;
                jsonobject = (JSONObject)jsonArray.get(page*4);
                testfunction(newsList1, jsonobject);
                jsonobject = (JSONObject)jsonArray.get(page*4+1);
                testfunction(newsList2, jsonobject);
                jsonobject = (JSONObject)jsonArray.get(page*4+2);
                testfunction(newsList3, jsonobject);
                jsonobject = (JSONObject)jsonArray.get(page*4+3);
                testfunction(newsList4, jsonobject);
                currentpage.setText("Page "+ (page+1) +" out of 6" );
         }
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        if (page ==0)
        {
            return;
        }
        else
        {
            page = page-1;
            jsonobject = (JSONObject)jsonArray.get(page*4);
            testfunction(newsList1, jsonobject);
            jsonobject = (JSONObject)jsonArray.get(page*4+1);
            testfunction(newsList2, jsonobject);
            jsonobject = (JSONObject)jsonArray.get(page*4+2);
            testfunction(newsList3, jsonobject);
            jsonobject = (JSONObject)jsonArray.get(page*4+3);
            testfunction(newsList4, jsonobject);
            currentpage.setText("Page "+ (page+1) +" out of 6" );
              
        }
        
    }//GEN-LAST:event_backbuttonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        this.jsonArray = new GetRecent().printserver((String)this.categorycombobox.getSelectedItem());
        page=0;
        currentpage.setText("Page "+ (page+1) +" out of 6" );
        jsonobject = (JSONObject)jsonArray.get(page*4);
        testfunction(newsList1, jsonobject);
                
        jsonobject = (JSONObject)jsonArray.get(page*4+1);
        testfunction(newsList2, jsonobject);
        
        jsonobject = (JSONObject)jsonArray.get(page*4+2);
        testfunction(newsList3, jsonobject);
        
        jsonobject = (JSONObject)jsonArray.get(page*4+3);
        testfunction(newsList4, jsonobject);
        currentpage.setText("Page "+ (page+1) +" out of 6" );
    
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author1;
    private javax.swing.JLabel author2;
    private javax.swing.JLabel author3;
    private javax.swing.JLabel author4;
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> categorycombobox;
    private javax.swing.JLabel currentpage;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private JavaBlockchain.RoundedPanel news1;
    private JavaBlockchain.RoundedPanel news2;
    private JavaBlockchain.RoundedPanel news3;
    private JavaBlockchain.RoundedPanel news4;
    private javax.swing.JButton nextbutton;
    private javax.swing.JButton search;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    private javax.swing.JLabel subtitle3;
    private javax.swing.JLabel subtitle4;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type4;
    // End of variables declaration//GEN-END:variables
}
