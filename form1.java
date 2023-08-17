package bilgiyarışması;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {
    private JPanel panel;
    private JRadioButton radioButtonA;
    private JRadioButton radioButtonB;
    private JRadioButton radioButtonC;
    private JRadioButton radioButtonD;
    private JButton sıradakiSoruButton;
    private JLabel yanlıssy;
    private JLabel sorunoo;
    private JLabel dogrusy;
    private JTextArea textArea1;
    private JLabel dogrucv;
    private JLabel cevabımız;
    int dogru = 0;
    int soruno = 0;
    int yanlıs = 0;
    form1(){
    add(panel);
    setTitle("Bilgi Yarışması");
    setSize(600,600);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButtonA);
        bg.add(radioButtonB);
        bg.add(radioButtonC);
        bg.add(radioButtonD);

        sıradakiSoruButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dogrucv.setVisible(false);
                cevabımız.setVisible(false);
                soruno++;
                sorunoo.setText(String.valueOf(soruno));

                if (soruno == 1)
                    {
                    textArea1.setText("Cumhuriyet kaç yılında ilan edildi?");
                    radioButtonA.setText("20 Ekim 1923");
                    radioButtonB.setText("29 Kasım 1923");
                    radioButtonC.setText("29 Ekim 1922");
                    radioButtonD.setText("29 Ekim 1923");
                    dogrucv.setText("29 Ekim 1923");
                        radioButtonA.setEnabled(true);
                        radioButtonB.setEnabled(true);
                        radioButtonC.setEnabled(true);
                        radioButtonD.setEnabled(true);
                        sıradakiSoruButton.setEnabled(false);

                }
                if (soruno == 2){
                    textArea1.setText("Hangi ülkenin birden fazla başkenti vardır?");
                    radioButtonA.setText("Güney Afrika");
                    radioButtonB.setText("Cezayir");
                    radioButtonC.setText("Tunus");
                    radioButtonD.setText("Filistin");
                    dogrucv.setText("Güney Afrika");
                    radioButtonA.setEnabled(true);
                    radioButtonB.setEnabled(true);
                    radioButtonC.setEnabled(true);
                    radioButtonD.setEnabled(true);
                    sıradakiSoruButton.setEnabled(false);
                }
                if (soruno == 3){
                    textArea1.setText("Türkiye yüz ölçümü olarak dünyada kaçıncı büyük ülkedir?");
                    radioButtonA.setText("70");
                    radioButtonB.setText("10");
                    radioButtonC.setText("37");
                    radioButtonD.setText("11");
                    dogrucv.setText("37");
                    radioButtonA.setEnabled(true);
                    radioButtonB.setEnabled(true);
                    radioButtonC.setEnabled(true);
                    radioButtonD.setEnabled(true);
                    sıradakiSoruButton.setEnabled(false);
                }
            }
        });
        radioButtonA.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                radioButtonA.setEnabled(false);
                radioButtonB.setEnabled(false);
                radioButtonC.setEnabled(false);
                radioButtonD.setEnabled(false);
                sıradakiSoruButton.setEnabled(true);

                cevabımız.setText(radioButtonA.getText());

                if (dogrucv.getText() == cevabımız.getText()){
                   dogru++;
                   dogrusy.setText(String.valueOf(dogru));

                }
                else {
                    yanlıs++;
                    yanlıssy.setText(String.valueOf(yanlıs));
                }
            }
        });
        radioButtonB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                radioButtonA.setEnabled(false);
                radioButtonB.setEnabled(false);
                radioButtonC.setEnabled(false);
                radioButtonD.setEnabled(false);
                sıradakiSoruButton.setEnabled(true);

                cevabımız.setText(radioButtonB.getText());
                if (dogrucv.getText() == cevabımız.getText()){
                    dogru++;
                    dogrusy.setText(String.valueOf(dogru));

                }
                else {
                    yanlıs++;
                    yanlıssy.setText(String.valueOf(yanlıs));
                }
            }
        });
        radioButtonC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                radioButtonA.setEnabled(false);
                radioButtonB.setEnabled(false);
                radioButtonC.setEnabled(false);
                radioButtonD.setEnabled(false);
                sıradakiSoruButton.setEnabled(true);

                cevabımız.setText(radioButtonC.getText());
                if (dogrucv.getText() == cevabımız.getText()){
                    dogru++;
                    dogrusy.setText(String.valueOf(dogru));

                }
                else {
                    yanlıs++;
                    yanlıssy.setText(String.valueOf(yanlıs));
                }
            }
        });
        radioButtonD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                radioButtonA.setEnabled(false);
                radioButtonB.setEnabled(false);
                radioButtonC.setEnabled(false);
                radioButtonD.setEnabled(false);
                sıradakiSoruButton.setEnabled(true);

                cevabımız.setText(radioButtonD.getText());
                if (dogrucv.getText() == cevabımız.getText()){
                    dogru++;
                    dogrusy.setText(String.valueOf(dogru));

                }
                else {
                    yanlıs++;
                    yanlıssy.setText(String.valueOf(yanlıs));
                }
            }
        });
    }
}
