package FlowerOrderProjectUI;
//package FlowerOrderProjectUI;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.SwingConstants;
// 
//@SuppressWarnings("serial")
//public class FlowerLoginView extends JFrame{
//    private FlowerMainProgram main;
//
//    // 로그인 실행하는 창
//   
//    private JButton btnLogin;
//    private JPasswordField passText;
//    private JTextField userText;
//    private boolean bLoginCheck;
//    private JLabel lblNewLabel;
//    private JLabel lblNewLabel_1;
//   
//    public static void main(String[] args) {
//    	// 메인클래스 실행
//        FlowerMainProgram main = new FlowerMainProgram();
//        main.flowerloginView = new FlowerLoginView(); // 로그인창 보이기
//        main.flowerloginView.setMain(main); // 로그인창에게 메인 클래스보내기
//    }
// 
//    public FlowerLoginView() {
//    	setFont(new Font("Bernard MT Condensed", Font.PLAIN, 12));
//      
//        setTitle("Manager");
//        setSize(870, 456);
//        setResizable(false);
//        setLocation(800, 450);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//       
//      
//        JPanel panel = new JPanel();
//        placeLoginPanel(panel);
//       
//        getContentPane().add(panel);
//        
//        lblNewLabel = new JLabel("");
//        lblNewLabel.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\flower.JPG"));
//        lblNewLabel.setBounds(0, 0, 439, 427);
//        panel.add(lblNewLabel);
//        
//        lblNewLabel_1 = new JLabel("");
//        lblNewLabel_1.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\heart.jpg"));
//        lblNewLabel_1.setBounds(415, -13, 539, 1031);
//        panel.add(lblNewLabel_1);
//       
//        setVisible(true);
//    }
//   
//    public void placeLoginPanel(JPanel panel){
//        panel.setLayout(null);     
//        JLabel userLabel = new JLabel("Manager id");
//        userLabel.setHorizontalAlignment(SwingConstants.LEFT);
//        userLabel.setFont(new Font("Gabriola", Font.ITALIC, 20));
//        userLabel.setForeground(Color.BLACK);
//        userLabel.setBackground(Color.WHITE);
//        userLabel.setBounds(470, 25, 128, 25);
//        panel.add(userLabel);
//       
//        JLabel passLabel = new JLabel("Password");
//        passLabel.setHorizontalAlignment(SwingConstants.LEFT);
//        passLabel.setForeground(Color.BLACK);
//        passLabel.setFont(new Font("Gabriola", Font.ITALIC, 20));
//        passLabel.setBackground(Color.WHITE);
//        passLabel.setBounds(470, 94, 99, 25);
//        panel.add(passLabel);
//       
//        userText = new JTextField(20);
//        userText.setBounds(470, 54, 212, 30);
//        panel.add(userText);
//       
//        passText = new JPasswordField(20);
//        passText.setBounds(470, 118, 212, 30);
//        panel.add(passText);
//        passText.addActionListener(new ActionListener() {          
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                isLoginCheck();        
//            }
//        });
//       
//        btnLogin = new JButton("Login");
//        btnLogin.setBackground(Color.PINK);
//        btnLogin.setFont(new Font("Gabriola", Font.ITALIC, 20));
//        btnLogin.setBounds(470, 174, 100, 25);
//        panel.add(btnLogin);
//        btnLogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                isLoginCheck();
//            }
//        });
//    }
//   
//    public void isLoginCheck(){
//        if(userText.getText().equals("minruki") && new String(passText.getPassword()).equals("angel")){
//            JOptionPane.showMessageDialog(null, "Success");
//            bLoginCheck = true;
//           
//            
//            if(isLogin()){
//                main.showFrameTest(); 
//            }                  
//        }else{
//            JOptionPane.showMessageDialog(null, "Faild");
//        }
//    }
// 
//   
//    
//    public void setMain(FlowerMainProgram main) {
//        this.main = main;
//    }
//   
// 
//    public boolean isLogin() {     
//        return bLoginCheck;
//    }
// 
//}
