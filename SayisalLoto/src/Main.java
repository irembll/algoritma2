import javax.swing.JOptionPane;
import java.util.*;

public class Main extends javax.swing.JFrame {
    // Constructor - arayüz bileşenlerini başlatır
    public Main() {
        initComponents();
    }

    // Arayüz bileşenlerini tanımlar ve yerleştirir
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Label ve buton tanımlamaları
        lbl1 = new javax.swing.JLabel();
        kullanicigir = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        cekilis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sonuclbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Sayı gösterim etiketlerinin ayarlanması
        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Kullanıcı giriş butonu
        kullanicigir.setText("Kullanıcı Giriş");
        kullanicigir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kullanicigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicigirActionPerformed(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl6.setFont(new java.awt.Font("Segoe UI", 0, 18));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Çekiliş butonu
        cekilis.setText("Çekiliş");
        cekilis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cekilis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekilisActionPerformed(evt);
            }
        });

        // Başlık label'ı
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sayısal Loto Uygulaması");

        // Sonuç göstergesi label
        sonuclbl.setFont(new java.awt.Font("Segoe UI", 0, 18));
        sonuclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sonuclbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Arayüz düzeni (layout)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(sonuclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(kullanicigir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cekilis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(kullanicigir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cekilis)))
                                .addGap(18, 18, 18)
                                .addComponent(sonuclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }

    // Kullanıcı ve rastgele sayıların tutulduğu listeler
    ArrayList<Integer> randomsayilar = new ArrayList<Integer>();
    ArrayList<Integer> alinansayilar = new ArrayList<Integer>();
    int index = 0;

    // Çekiliş butonuna tıklanınca çalışacak olay
    private void cekilisActionPerformed(java.awt.event.ActionEvent evt) {
        // 1-50 arası rastgele 6 sayı üret
        Random rand = new Random();
        int bir = rand.nextInt(50) + 1;
        int iki = rand.nextInt(50) + 1;
        int uc = rand.nextInt(50) + 1;
        int dort = rand.nextInt(50) + 1;
        int bes = rand.nextInt(50) + 1;
        int alti = rand.nextInt(50) + 1;

        // Sayıları ekranda göster
        lbl1.setText(String.valueOf(bir));
        lbl2.setText(String.valueOf(iki));
        lbl3.setText(String.valueOf(uc));
        lbl4.setText(String.valueOf(dort));
        lbl5.setText(String.valueOf(bes));
        lbl6.setText(String.valueOf(alti));

        // Rastgele sayıları listeye ekle
        randomsayilar.add(bir);
        randomsayilar.add(iki);
        randomsayilar.add(uc);
        randomsayilar.add(dort);
        randomsayilar.add(bes);
        randomsayilar.add(alti);

        // Eşleşen sayıların sayısını hesapla
        int eslesensayilar = 0;
        for (int i = 0; i < 6; i++) {
            if (randomsayilar.get(i) == alinansayilar.get(i)) {
                eslesensayilar++;
            }
        }

        // Eşleşme yüzdesini hesapla ve göster
        eslesensayilar = eslesensayilar * 100 / 6;
        sonuclbl.setText(String.valueOf("Eslesme yüzdesi = " + eslesensayilar));
    }

    // Kullanıcının sayı girişi yaptığı olay
    private void kullanicigirActionPerformed(java.awt.event.ActionEvent evt) {
        // 6 sayı girene kadar kullanıcıdan sayı al
        while (index < 6) {
            String al = JOptionPane.showInputDialog(this, (index + 1) + ". sayıyı girin:");
            int sayi = Integer.parseInt(al);
            if (sayi <= 1 || sayi >= 50) {
                JOptionPane.showMessageDialog(this, "Lütfen 1 ile 50 arasında bir sayı girin.");
                continue;
            }

            // Tekrar girilen sayı kontrolü
            boolean tekrarVar = false;
            for (int i = 0; i < alinansayilar.size(); i++) {
                if (alinansayilar.get(i) == sayi) {
                    tekrarVar = true;
                    break;
                }
            }

            // Eğer sayı daha önce girildiyse uyarı ver
            if (tekrarVar) {
                JOptionPane.showMessageDialog(this, "Bu sayı zaten girildi. Lütfen farklı bir sayı girin.");
            } else {
                // Sayıyı listeye ekle
                alinansayilar.add(sayi);
                index++;
            }
        }
    }

    // Ana metod: uygulamayı başlatır
    public static void main(String args[]) {
        // Arayüz temasını Nimbus yap
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Uygulama penceresini başlat
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Değişken tanımlamaları
    private javax.swing.JButton cekilis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kullanicigir;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel sonuclbl;
}
