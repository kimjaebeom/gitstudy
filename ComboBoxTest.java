package combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame implements ActionListener{
	JComboBox<String> combo;
	String[] money= {"�޷�","��","����","����"};
	JLabel lbl;
	
	public ComboBoxTest() {
		combo =new JComboBox<>(money);
		lbl = new JLabel("ȭ�� ����");
		
		getContentPane().add(combo,"North");
		getContentPane().add(lbl,"Center");
		
		setLocation(300,300);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxTest();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String result =combo.getSelectedObjects().toString();
				lbl.setText(result +"�� �����ϼ̽��ϴ�.");
		
		
	}

}
