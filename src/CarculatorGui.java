
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CarculatorGui extends JFrame implements ActionListener {
	
	private JButton [] buttons;	// ��ư ����
	private JTextField tField;	//�ؽ�Ʈ 
	private JPanel panel;	
	
	private String [] labels = {	// 16�� ��ư �ε���
		"7","8","9","+",
		"4","5","6","-",
		"1","2","3","x",
		"+/-","0","=","/",
		"C","��","....","...."
	};
	 
	Carculator c;
	
	public CarculatorGui(Carculator c) {
		this.c = c;
		
		tField = new JTextField(35);	// �ؽ�Ʈ�ʵ忡 35�� ����°���
		tField.setText("0");			// �ʱ�ȭ�� '00'���
		tField.setEnabled(false);		//����ڴ� �ؽ�Ʈâ �ԷºҰ�
		
		panel = new JPanel(); // JPanel ��ü ����
		panel.setLayout(new GridLayout(0,4,3,3));	// ���� ���� �¿� ����
		buttons = new JButton [20];	//�� ��ư�� 16���� �ε����� ��ġ
		panel.setBackground(Color.BLUE);
		tField.setBackground(Color.BLACK);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int index = 0;
		for(int rows = 0; rows < 5 ; rows ++) {			//���� 5�� 
			for(int cols = 0; cols < 4; cols ++ ) {		//���� 4��
				
				buttons[index] = new JButton(labels[index]); //buttons �迭 �����ȿ� labels�迭 ������ ����
				panel.add(buttons[index]);	//add�޼ҵ带 �̿��� panel�� buttons �迭 ������ ���ʴ�� �����ش�.
				
					buttons[index].setBackground(Color.GREEN);
					
				
				
				buttons[index].addActionListener(this);
				index++;
			}
			
		}
		
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
		setResizable(false);		
		setLocationRelativeTo(null); //������ġ
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		
				
		switch (e.getActionCommand()) {
		case "+" : c.puls(); break;
		case "-" : c.minus(); break;
		case "/" : c.divi(); break;
		case "C" : c.reset(); break;
		case "=" : c.result(); break;
		case "+/-" :c.change(); break;
		case "x" : c.mult(); break;
		case "��" : c.backSpace(); break;
		default: c.setResult(e.getActionCommand());
					break;
		}
		tField.setText(c.getResult());
		
		
	}
	
}

/**if(e.getSource() == buttons[0]) {
c.setResult("7");
}else if(e.getSource() == buttons[1]) {
c.setResult("8");
}else if(e.getSource() == buttons[2]) {
c.setResult("9");
}else if(e.getSource() == buttons[3]) {
c.puls();
}else if(e.getSource() == buttons[4]) {
c.setResult("4");
}else if(e.getSource() == buttons[5]) {
c.setResult("5");
}else if(e.getSource() == buttons[6]) {
c.setResult("6");
}else if(e.getSource() == buttons[7]) {
c.minus();
}else if(e.getSource() == buttons[8]) {
c.setResult("1");
}else if(e.getSource() == buttons[9]) {
c.setResult("2");
}else if(e.getSource() == buttons[10]) {
c.setResult("3");
}else if(e.getSource() == buttons[11]) {
c.mult();
}else if(e.getSource() == buttons[12]) {
c.change();
}else if(e.getSource() == buttons[13]) {
c.setResult("0");
}else if(e.getSource() == buttons[14]) {
c.result();
}else if(e.getSource() == buttons[15]) {
c.divi();
}else if(e.getSource() == buttons[16]) {
c.reset();
}else if(e.getSource() == buttons[17]) {
c.backSpace();
}else if(e.getSource() == buttons[18]) {

}else if(e.getSource() == buttons[19]) {

}

tField.setText(c.getResult());
*/