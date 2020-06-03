package awtsample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangCalc extends JFrame implements ActionListener{
	private static float USD =1225.60F;
	private static float JPY =1137.92F;
	private static float EUR =1363.66F;
	private static float CNY =171.89F;
	
	JComboBox<String> combo;
	String[] money = {"�޷�","��","����","����"};
	JPanel pane1,pane2;
	JLabel lbl;
	JTextField txt;
	JButton btn;
	
	public ExchangCalc() {
		setTitle("ȯ�� ����");
		pane1 = new JPanel();
		pane2 = new JPanel();
		txt=new JTextField(10);
		combo = new JComboBox<>(money);
		btn = new JButton("�� ȯ" );
		lbl= new JLabel("��ȯ ���");
		
		
		pane1.add(new JLabel("��ȭ"));
		pane1.add(txt);
		pane1.add(combo);
		pane1.add(btn);
		
		pane2.add(lbl);
		
		add(pane1,"North");
		add(pane2,"Center");
		
		setBounds(0,0,300,300);  // x��ǥ,Y��ǥ ,width,height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(this);
	}
	
	

	public static void main(String[] args) {
		new ExchangCalc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculate();
	}
	public void calculate() {
		float won =Float.parseFloat(txt.getText());  //�Էµ� ���ڸ� �Ǽ��� ��ȯ.
		String result =null;
		String money = combo.getSelectedItem().toString();//���� ����
		
		if(money.equals("�޷�")) {
			result = String.format("%.2f",won /USD);
		}else if(money.equals("��")) {
			result =String.format("%.2f",won/JPY);
		}else if(money.equals("����")) {
			result = String.format("%.2f",won/EUR);
		}else if(money.equals("����")) {
			result =String.format("%.2f",won/CNY);
		}
		lbl.setText(result);
		
		
	}

}
