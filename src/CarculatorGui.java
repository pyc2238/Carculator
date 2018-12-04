
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
	
	private JButton [] buttons;	// 버튼 변수
	private JTextField tField;	//텍스트 
	private JPanel panel;	
	
	private String [] labels = {	// 16개 버튼 인덱스
		"7","8","9","+",
		"4","5","6","-",
		"1","2","3","x",
		"+/-","0","=","/",
		"C","←","....","...."
	};
	 
	Carculator c;
	
	public CarculatorGui(Carculator c) {
		this.c = c;
		
		tField = new JTextField(35);	// 텍스트필드에 35자 입출력가능
		tField.setText("0");			// 초기화면 '00'출력
		tField.setEnabled(false);		//사용자는 텍스트창 입력불가
		
		panel = new JPanel(); // JPanel 객체 생성
		panel.setLayout(new GridLayout(0,4,3,3));	// 가로 세로 좌우 여백
		buttons = new JButton [20];	//각 버튼을 16개의 인덱스에 배치
		panel.setBackground(Color.BLUE);
		tField.setBackground(Color.BLACK);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int index = 0;
		for(int rows = 0; rows < 5 ; rows ++) {			//세로 5줄 
			for(int cols = 0; cols < 4; cols ++ ) {		//가로 4줄
				
				buttons[index] = new JButton(labels[index]); //buttons 배열 변수안에 labels배열 변수를 대입
				panel.add(buttons[index]);	//add메소드를 이용해 panel에 buttons 배열 변수를 차례대로 붙혀준다.
				
					buttons[index].setBackground(Color.GREEN);
					
				
				
				buttons[index].addActionListener(this);
				index++;
			}
			
		}
		
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
		setResizable(false);		
		setLocationRelativeTo(null); //절대위치
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
		case "←" : c.backSpace(); break;
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