import java.awt.*;
import javax.swing.*;
public class Ex08 extends JFrame
{
private JCheckBox jCheckBox1, jCheckBox2; 
private JButton jButton_OK;
private JPanel checkJPanel, buttonJPanel; 
private JPanel fieldJPanel;

public Ex08 () {
super("Exemplo JCheckBox");
// construção do checkJPanel
jCheckBox1 = new JCheckBox( "ITEM 1" );
jCheckBox2 = new JCheckBox("ITEM 2" );
checkJPanel = new JPanel(); //criação de um painel para checkbox 
checkJPanel.setLayout( new GridLayout(2, 1)); 
checkJPanel.add( jCheckBox1 );
checkJPanel.add( jCheckBox2 );

//construcao field pane
fieldJPanel = new JPanel();
fieldJPanel.setLayout ( new BorderLayout());

// Construção do button Panel
jButton_OK = new JButton("Ok" );

buttonJPanel = new JPanel(); // criação de um painel para botões

buttonJPanel.setLayout( new FlowLayout (FlowLayout.CENTER, 10, 5)); 
buttonJPanel.add( jButton_OK);

//usando flowlayout alinhado ao centro e adicionando componentes //centro, espaçamento borda vertical, horizontal
setLayout(new FlowLayout ( FlowLayout.CENTER, 10, 30 ) ); 
add (checkJPanel );
add(buttonJPanel );
}
public static void main(String[] args) {
Ex08 teste = new Ex08 ();
teste.setDefaultCloseOperation (EXIT_ON_CLOSE);
teste.setSize (350,150);
teste.setVisible(true);
}
}