

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import GUIPractice.ActionListener1;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
public class MenuCard {

	static	int sum=0;
	private String mode;
	private JFrame frame;
	private JPanel PanelHome;
	private JPanel PanelRegister;
	private JPanel PanelAllCuisine;
	private JPanel PanelChineseCuisine;
	private JPanel PanelItalianCuisine;
	private JPanel PanelMexicanCuisine;
	private JPanel PanelThaiCuisine;
	private JPanel PanelDrinks;
	private JPanel PanelYourOrder;
	private JPanel PanelOrderMore;
	private JLabel lblNewLabel_1;
	private JButton btnRegisterHere;
	private JLayeredPane layeredPane;
	private JTextField textFieldName;
	private JTextField textField_1;
	private JLabel lblGender;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JButton btnRegister;
	private JLabel lblNewLabel_4;
	private JLabel lblPleaseSelectFrom;
	private JButton btnViewOrder;
	private JLabel lblNewLabel_5;
	private JLabel lblChineseCuisine;
	private JLabel lblName_1;
	private JLabel lblPrice;
	private JLabel lblQuantity;
	private JLabel lblXyz;
	private JLabel lblDumpling;
	private JLabel lblSpringRoll;
	private JLabel label_2;
	private JLabel lblNewLabel_6;
	private JLabel lblItalianCuisine;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblRisotto;
	private JLabel label_8;
	private JComboBox comboBox;
	private JComboBox comboBox_4;
	private JLabel lblLasagna;
	private JLabel label_10;
	private JComboBox comboBox_5;
	private JLabel lblPanini;
	private JLabel label_12;
	private JComboBox comboBox_6;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_7;
	private JLabel lblMexicanCuisine;
	private JLabel label_9;
	private JLabel label_11;
	private JLabel lblPozole;
	private JLabel label_15;
	private JLabel lblCabrito;
	private JLabel label_17;
	private JLabel lblBurrito;
	private JLabel label_19;
	private JLabel lblThaiCuisine;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_16;
	private JLabel lblThaiFriedRice;
	private JLabel label_20;
	private JComboBox comboBox_10;
	private JLabel lblGreenPapayaSalad;
	private JLabel label_22;
	private JComboBox comboBox_11;
	private JLabel lblTomyum;
	private JLabel label_24;
	private JComboBox comboBox_12;
	private JButton button_4;
	private JButton button_5;
	private JLabel label_25;
	private JLabel label_7;
	private JLabel lblDrinks;
	private JLabel label_21;
	private JLabel label_23;
	private JLabel label_26;
	private JLabel lblSoftDrink;
	private JLabel label_28;
	private JComboBox comboBox_13;
	private JLabel lblTea;
	private JLabel label_30;
	private JComboBox comboBox_14;
	private JLabel lblCoffee;
	private JLabel label_32;
	private JComboBox comboBox_15;
	private JButton button_6;
	private JButton button_7;
	private JTextField textfield_total;
	private JButton btnFinish;

	/**
	 * Launch the application.
	 */
	public MenuCard(String name)
	{
	String CustomerName=name;
	System.out.println(CustomerName);
	
	}
	
	
	public static void main(String[] args) throws IOException  {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCard window = new MenuCard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		MenuCard obj=new MenuCard();
		
	/*	
		Path currentRelativePath = Paths.get("");
		String s =
		currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current path is: " + s);
		//C:\Users\gsaba\eclipse-workspace\Project_test1
		
		String dirString=s+"/report";
		Path dirPath=Paths.get(dirString);
		if (Files.notExists(dirPath))
		{
		Files.createDirectories(dirPath);
		}
		
		String fileString="customerdata.txt";
		Path filePath=Paths.get(dirString,fileString);
		if (Files.notExists(filePath)){
		Files.createFile(filePath);
		}
		
		
		Path productPath=Paths.get(dirString, fileString);
		File products1File=productPath.toFile();
		
		PrintWriter out2=new PrintWriter(
				new BufferedWriter(
				new FileWriter(products1File)));
		
		
		PrintWriter out1=new PrintWriter(
				new BufferedWriter(
				new FileWriter(products1File,true)));
				out1.print("Customer Name is: ");
			//	LocalDateTime currentDateTime=LocalDateTime.now();
			//	out1.println(currentDateTime);
				
			//	out1.write();
				
			//	out1.print(obj.CustomerName);
				
				
				
				
				out1.close();
				*/
		
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the application.
	 */
	public MenuCard() throws IOException  {
		initialize();
	
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(300, 150, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel roughpanel =new JPanel();
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 798, 528);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		PanelHome = new JPanel();
		layeredPane.add(PanelHome, "name_476722500756990");
		PanelHome.setLayout(null);
		
		btnRegisterHere = new JButton("Register Here");
		btnRegisterHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(PanelRegister);
			}
		});
		btnRegisterHere.setBounds(335, 462, 117, 29);
		PanelHome.add(btnRegisterHere);
		
		lblNewLabel_1 = new JLabel("Welcome to Foodie's Place");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(48, 385, 760, 65);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 54));
		lblNewLabel_1.setForeground(Color.green);
		//lblNewLabel_1.setVerticalAlignment(JLabel.NORTH);
		//lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		PanelHome.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-596, -62, 1391, 590);
		lblNewLabel.setIcon(new ImageIcon(("src/thanksgiving-menus-1571160428.jpg")));
		PanelHome.add(lblNewLabel);
		
		PanelRegister = new JPanel();
		layeredPane.add(PanelRegister, "name_476747983186638");
		PanelRegister.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		textFieldName.setBounds(247, 109, 346, 40);
		PanelRegister.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblName.setBounds(249, 72, 135, 35);
		PanelRegister.add(lblName);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
		lblPhoneNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblPhoneNumber.setBounds(246, 168, 344, 35);
		PanelRegister.add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(245, 200, 346, 40);
		PanelRegister.add(textField_1);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblAge.setBounds(247, 252, 344, 35);
		PanelRegister.add(lblAge);
		
		 comboBox = new JComboBox();
		comboBox.setBounds(247, 285, 180, 27);
		PanelRegister.add(comboBox);
		comboBox.addItem("Select Age Group");
		comboBox.addItem("Under 19");
		comboBox.addItem("20 - 29");
		comboBox.addItem("30 - 39");
		comboBox.addItem("40 - 49");
		comboBox.addItem("Above 50");
		
		lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblGender.setBounds(247, 331, 344, 35);
		PanelRegister.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		rdbtnMale.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnMale.setBounds(247, 366, 77, 23);
		PanelRegister.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnFemale.isSelected()) {
					rdbtnMale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		rdbtnFemale.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnFemale.setBounds(360, 366, 101, 23);
		PanelRegister.add(rdbtnFemale);
		
		rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnOther.isSelected()) {
					rdbtnMale.setSelected(false);
					rdbtnFemale.setSelected(false);
				}
			}
		});
		rdbtnOther.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnOther.setBounds(484, 366, 86, 23);
		PanelRegister.add(rdbtnOther);
		
		btnRegister = new JButton("REGISTER");
		//ActionListener1 aListen=new ActionListener1();
		//btnRegister.addActionListener(aListen);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// second page register button
				
				
				String name=textFieldName.getText();
				
				MenuCard m1=new MenuCard(name);
				
				
				
				
		
				
				
				
				switchPanels(PanelAllCuisine);
				lblNewLabel_4.setText("Welcome " + textFieldName.getText() + "!");
			}
		});
		btnRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnRegister.setBounds(358, 415, 117, 27);
		PanelRegister.add(btnRegister);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-686, 0, 1484, 528);
		lblNewLabel_2.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		PanelRegister.add(lblNewLabel_2);
		
		PanelAllCuisine = new JPanel();
		layeredPane.add(PanelAllCuisine, "name_477109571487522");
		PanelAllCuisine.setLayout(null);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(139, 39, 506, 25);
		PanelAllCuisine.add(lblNewLabel_4);
		
		lblPleaseSelectFrom = new JLabel("Please select from the options - ");
		lblPleaseSelectFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPleaseSelectFrom.setBounds(139, 73, 506, 25);
		PanelAllCuisine.add(lblPleaseSelectFrom);
		
		JButton btnNewButton = new JButton("Chinese");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelChineseCuisine);
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(139, 126, 150, 53);
		PanelAllCuisine.add(btnNewButton);
		
		JButton btnMexicana = new JButton("Mexican");
		btnMexicana.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnMexicana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelMexicanCuisine);
			}
		});
		btnMexicana.setBounds(139, 202, 150, 50);
		PanelAllCuisine.add(btnMexicana);
		
		JButton btnItalian = new JButton("Italian");
		btnItalian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelItalianCuisine);
				
			}
		});
		btnItalian.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnItalian.setBounds(583, 126, 150, 53);
		PanelAllCuisine.add(btnItalian);
		
		JButton btnThai = new JButton("Thai");
		btnThai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelThaiCuisine);
			}
		});
		btnThai.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnThai.setBounds(583, 202, 150, 53);
		PanelAllCuisine.add(btnThai);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelDrinks);
			}
		});
		btnDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnDrinks.setBounds(371, 283, 150, 50);
		PanelAllCuisine.add(btnDrinks);
		
		btnViewOrder = new JButton("VIEW ORDER");
		btnViewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
			}
		});
		btnViewOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnViewOrder.setBounds(371, 444, 150, 50);
		PanelAllCuisine.add(btnViewOrder);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		lblNewLabel_3.setBounds(-680, 0, 1478, 528);
		PanelAllCuisine.add(lblNewLabel_3);
		
		PanelChineseCuisine = new JPanel();
		layeredPane.add(PanelChineseCuisine, "name_476751793225760");
		PanelChineseCuisine.setLayout(null);
		
		JButton btnaddToCartChinese1 = new JButton("Add to Cart");
		JButton btnaddToCartChinese2 = new JButton("Add to Cart");
		JButton btnaddToCartChinese3 = new JButton("Add to Cart");
		
		
		lblChineseCuisine = new JLabel("Chinese Cuisine");
		lblChineseCuisine.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChineseCuisine.setBounds(170, 43, 506, 25);
		PanelChineseCuisine.add(lblChineseCuisine);
		
		lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblName_1.setBounds(170, 106, 57, 25);
		PanelChineseCuisine.add(lblName_1);
		
		lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblPrice.setBounds(443, 106, 110, 25);
		PanelChineseCuisine.add(lblPrice);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblQuantity.setBounds(580, 106, 110, 25);
		PanelChineseCuisine.add(lblQuantity);
		
		lblXyz = new JLabel("Kung Pao Chicken");
		lblXyz.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblXyz.setBounds(170, 177, 129, 25);
		PanelChineseCuisine.add(lblXyz);
		
		lblDumpling = new JLabel("Dumpling");
		lblDumpling.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDumpling.setBounds(170, 229, 129, 25);
		PanelChineseCuisine.add(lblDumpling);
		
		lblSpringRoll = new JLabel("Spring Roll");
		lblSpringRoll.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSpringRoll.setBounds(170, 287, 129, 25);
		PanelChineseCuisine.add(lblSpringRoll);
		
		JLabel label = new JLabel("$10");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label.setBounds(449, 177, 92, 16);
		PanelChineseCuisine.add(label);
		
		JLabel label_1 = new JLabel("$5");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_1.setBounds(449, 229, 129, 16);
		PanelChineseCuisine.add(label_1);
		
		label_2 = new JLabel("$7");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_2.setBounds(449, 291, 129, 16);
		PanelChineseCuisine.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(580, 177, 66, 27);
		PanelChineseCuisine.add(comboBox_1);
		comboBox_1.addItem("0");
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		comboBox_1.addItem("6");
		comboBox_1.addItem("7");
		comboBox_1.addItem("8");
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(580, 229, 66, 27);
		PanelChineseCuisine.add(comboBox_2);
		comboBox_2.addItem("0");
		comboBox_2.addItem("1");
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		comboBox_2.addItem("5");
		comboBox_2.addItem("6");
		comboBox_2.addItem("7");
		comboBox_2.addItem("8");
		comboBox_2.addItem("9");
		comboBox_2.addItem("10");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(580, 287, 66, 27);
		PanelChineseCuisine.add(comboBox_3);
		comboBox_3.addItem("0");
		comboBox_3.addItem("1");
		comboBox_3.addItem("2");
		comboBox_3.addItem("3");
		comboBox_3.addItem("4");
		comboBox_3.addItem("5");
		comboBox_3.addItem("6");
		comboBox_3.addItem("7");
		comboBox_3.addItem("8");
		comboBox_3.addItem("9");
		comboBox_3.addItem("10");
		
	
		btnaddToCartChinese1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel kung=new JPanel();
	                    kung.setSize(new Dimension(800, 200));
	                    kung.setLayout(new GridLayout(1,2));
	                   kung.setBackground(Color.orange);
	                   
	                    JLabel kungpao_label= new JLabel("Kung Pao Chicken  ");
	        kung.add(kungpao_label);      
	       
	        JLabel kung_price= new JLabel("$10");
	        kung.add(kung_price);
	       
	   String count= (String)comboBox_1.getSelectedItem();
	   
	   int quants= Integer.parseInt(count);
	  
	   
	   int quant_totals1=quants*10;
	   
	  sum=sum+quant_totals1;
	  
	  /* kung.setBackground(Color.orange);
	   * textfield_total.setText(String.valueOf(sum));
	   * roughpanel.remove(kung);
	       		roughpanel.revalidate();
	       		roughpanel.repaint();
	       		textfield_total.setText(String.valueOf(sum));
	       		   */
	  
	  textfield_total.setText(String.valueOf(sum));
	   
	       JLabel quant_total= new JLabel();
	       quant_total.setText(String.valueOf(quant_totals1));
	       
	       kung.add(quant_total);
	       
	      // kung.add(comboBox_1);
	     //  kung.add(btnaddToCartChinese1);
	       
	       
	       JButton Remove = new JButton("Remove");
	          
	          Remove.addActionListener(new ActionListener() {
	       	   public void actionPerformed(ActionEvent arg0)
	   	      {
	       		/*PanelYourOrder.remove(kung);
	       		PanelYourOrder.revalidate();
	       		PanelYourOrder.repaint();*/
	       		   
	       		roughpanel.remove(kung);
	       		roughpanel.revalidate();
	       		roughpanel.repaint();
	       		   
	       		   
	       		   
	   	         sum=sum-quant_totals1;
	       		textfield_total.setText(String.valueOf(sum));
	   	      }
	       	   
	          });
	          
	          kung.add(Remove);       
	         // PanelYourOrder.add(kung);
	          
	          roughpanel.add(kung);
	          
	           }  
	     
		});
		btnaddToCartChinese1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartChinese1.setBounds(674, 178, 92, 24);
		PanelChineseCuisine.add(btnaddToCartChinese1);
		
		
		
		btnaddToCartChinese2.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel dumpling=new JPanel();
	                    dumpling.setSize(new Dimension(800, 200));
	                    dumpling.setLayout(new GridLayout(1,2));
	                    dumpling.setBackground(Color.orange);
	                   
	                    JLabel Dosa_label= new JLabel("Dumpling");
	        dumpling.add(Dosa_label);      
	       
	        JLabel dumpling_price= new JLabel("$5");
	        dumpling.add(dumpling_price);
	       
	        String count=    (String)comboBox_2.getSelectedItem();
	 	   
	 	   int quants= Integer.parseInt(count);
	 	  
	 	   
	 	   int quant_totals2=quants*5;
	 	   
	 	   sum=sum+quant_totals2;
	 	  // System.out.println(sum);
	 	   
	 	  textfield_total.setText(String.valueOf(sum));
	 	   
	 	       JLabel quant_total= new JLabel();
	 	       quant_total.setText(String.valueOf(quant_totals2));
	 	       
	 	       dumpling.add(quant_total);
	          
JButton Remove = new JButton("Remove");
	          
	          Remove.addActionListener(new ActionListener() {
	       	   public void actionPerformed(ActionEvent arg0)
	   	      {
	       		/*PanelYourOrder.remove(dumpling);
	       		PanelYourOrder.revalidate();
	       		PanelYourOrder.repaint();*/
	       		roughpanel.remove(dumpling);
	       		roughpanel.revalidate();
	       		roughpanel.repaint();
	   	   sum=sum-quant_totals2;
	   	textfield_total.setText(String.valueOf(sum));
	   	      }
	       	   
	          });
	          
	          dumpling.add(Remove);       
	       
	       
	          roughpanel.add(dumpling);
	                   
	                   
	                   
	                 
	           }  
	     
		});
		
		btnaddToCartChinese2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartChinese2.setBounds(674, 229, 92, 24);
		PanelChineseCuisine.add(btnaddToCartChinese2);
		
		
		btnaddToCartChinese3.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel SpringRoll=new JPanel();
	                    SpringRoll.setSize(new Dimension(800, 200));
	                    SpringRoll.setLayout(new GridLayout(1,2));
	                    SpringRoll.setBackground(Color.orange);
	                    
	                    JLabel Dosa_label= new JLabel("Spring Roll");
	        SpringRoll.add(Dosa_label);      
	       
	        JLabel dumpling_price= new JLabel("$7");
	        SpringRoll.add(dumpling_price);
	        
	        
	        String count= (String)comboBox_3.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals3=quants*7;
		 	   
		 	  sum=sum+quant_totals3;
		 	 textfield_total.setText(String.valueOf(sum));
		 	// System.out.println(sum);
		 	 
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals3));
		 	       
		 	       SpringRoll.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(SpringRoll);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(SpringRoll);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals3;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          SpringRoll.add(Remove);       
	       
	       
	       
	        //  PanelYourOrder.add(SpringRoll);
	          roughpanel.add(SpringRoll);     
	                   
	                   
	                 
	           }  
	     
		});
		
		btnaddToCartChinese3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartChinese3.setBounds(674, 287, 92, 24);
		PanelChineseCuisine.add(btnaddToCartChinese3);
		
		
		
		
		
		JButton btnViewMenu = new JButton("VIEW MENU");
		btnViewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelAllCuisine);
				
			}
		});
		btnViewMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnViewMenu.setBounds(202, 416, 140, 29);
		PanelChineseCuisine.add(btnViewMenu);
		
		JButton btnViewYourOrder = new JButton("VIEW YOUR ORDER");
		btnViewYourOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
			}
		});
		btnViewYourOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnViewYourOrder.setBounds(485, 416, 220, 29);
		PanelChineseCuisine.add(btnViewYourOrder);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(-680, 0, 1478, 528);
		lblNewLabel_5.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		PanelChineseCuisine.add(lblNewLabel_5);
		
		PanelItalianCuisine = new JPanel();
		layeredPane.add(PanelItalianCuisine, "name_476757810757407");
		PanelItalianCuisine.setLayout(null);
		

		JButton btnaddToCartItalian1 = new JButton("Add to Cart");
		btnaddToCartItalian1.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Risotto=new JPanel();
	                    Risotto.setSize(new Dimension(800, 200));
	                    Risotto.setLayout(new GridLayout(1,2));
	                   Risotto.setBackground(Color.orange);
	                   
	                    JLabel Risotto_label= new JLabel("Risotto");
	        Risotto.add(Risotto_label);      
	       
	        JLabel Risotto_price= new JLabel("$14");
	        Risotto.add(Risotto_price);
	       
	        String count= (String)comboBox_4.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals4=quants*14;
		 	  sum=sum+quant_totals4;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals4));
		 	       
		 	       Risotto.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Risotto);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Risotto);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals4;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Risotto.add(Remove);       
	       
	       
	       
	         // PanelYourOrder.add(Risotto);
	          roughpanel.add(Risotto);      
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartItalian1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartItalian1.setBounds(674, 178, 92, 24);
		PanelItalianCuisine.add(btnaddToCartItalian1);
		
		JButton btnaddToCartItalian2 = new JButton("Add to Cart");
		btnaddToCartItalian2.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Lasagna=new JPanel();
	                    Lasagna.setSize(new Dimension(800, 200));
	                    Lasagna.setLayout(new GridLayout(1,2));
	                    Lasagna.setBounds(674, 178, 92, 24);
	                   Lasagna.setBackground(Color.orange);
	                   
	                    JLabel Lasagna_label= new JLabel("Lasagna");
	        Lasagna.add(Lasagna_label);      
	       
	        JLabel Lasagna_price= new JLabel("$17");
	        Lasagna.add(Lasagna_price);
	       
	       
	        String count= (String)comboBox_5.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals5=quants*17;
		 	  sum=sum+quant_totals5;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals5));
		 	       
		 	       Lasagna.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Lasagna);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Lasagna);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals5;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Lasagna.add(Remove);       
	         // PanelYourOrder.add(Lasagna);
		          roughpanel.add(Lasagna);        
	                   
	                   
	                 
	           }  
	     
		});
		
		btnaddToCartItalian2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartItalian2.setBounds(674, 229, 92, 24);
		PanelItalianCuisine.add(btnaddToCartItalian2);
		
		JButton btnaddToCartItalian3 = new JButton("Add to Cart");
		btnaddToCartItalian3.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Panini=new JPanel();
	                    Panini.setSize(new Dimension(800, 200));
	                    Panini.setLayout(new GridLayout(1,2));
	                   Panini.setBackground(Color.orange);
	                   
	                    JLabel Panini_label= new JLabel("Panini");
	        Panini.add(Panini_label);      
	       
	        JLabel Panini_price= new JLabel("$7");
	        Panini.add(Panini_price);
	       
	       
	       
	        String count= (String)comboBox_6.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals6=quants*7;
		 	   
		 	  sum=sum+quant_totals6;
		 	 textfield_total.setText(String.valueOf(sum));
		 	 
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals6));
		 	       
		 	       Panini.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Panini);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(Panini);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		
		       		sum=sum-quant_totals6;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Panini.add(Remove);       
	       
	         // PanelYourOrder.add(Panini);
		          roughpanel.add(Panini);      
	                   
	                   
	                 
	           }  
	     
		});
		
		btnaddToCartItalian3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartItalian3.setBounds(674, 287, 92, 24);
		PanelItalianCuisine.add(btnaddToCartItalian3);
		
		
		
		lblItalianCuisine = new JLabel("Italian Cuisine");
		lblItalianCuisine.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblItalianCuisine.setBounds(157, 45, 506, 25);
		PanelItalianCuisine.add(lblItalianCuisine);
		
		label_4 = new JLabel("Name");
		label_4.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_4.setBounds(157, 108, 57, 25);
		PanelItalianCuisine.add(label_4);
		
		label_5 = new JLabel("Price");
		label_5.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_5.setBounds(430, 108, 110, 25);
		PanelItalianCuisine.add(label_5);
		
		label_6 = new JLabel("Quantity");
		label_6.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_6.setBounds(579, 108, 110, 25);
		PanelItalianCuisine.add(label_6);
		
		lblRisotto = new JLabel("Risotto");
		lblRisotto.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRisotto.setBounds(157, 179, 129, 25);
		PanelItalianCuisine.add(lblRisotto);
		
		label_8 = new JLabel("$14");
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_8.setBounds(436, 179, 92, 16);
		PanelItalianCuisine.add(label_8);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(579, 179, 66, 27);
		PanelItalianCuisine.add(comboBox_4);
		comboBox_4.addItem("0");
		comboBox_4.addItem("1");
		comboBox_4.addItem("2");
		comboBox_4.addItem("3");
		comboBox_4.addItem("4");
		comboBox_4.addItem("5");
		comboBox_4.addItem("6");
		comboBox_4.addItem("7");
		comboBox_4.addItem("8");
		comboBox_4.addItem("9");
		comboBox_4.addItem("10");
		
		lblLasagna = new JLabel("Lasagna");
		lblLasagna.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblLasagna.setBounds(157, 231, 129, 25);
		PanelItalianCuisine.add(lblLasagna);
		
		label_10 = new JLabel("$17");
		label_10.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_10.setBounds(436, 231, 129, 16);
		PanelItalianCuisine.add(label_10);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(579, 231, 66, 27);
		PanelItalianCuisine.add(comboBox_5);
		comboBox_5.addItem("0");
		comboBox_5.addItem("1");
		comboBox_5.addItem("2");
		comboBox_5.addItem("3");
		comboBox_5.addItem("4");
		comboBox_5.addItem("5");
		comboBox_5.addItem("6");
		comboBox_5.addItem("7");
		comboBox_5.addItem("8");
		comboBox_5.addItem("9");
		comboBox_5.addItem("10");
		
		lblPanini = new JLabel("Panini");
		lblPanini.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPanini.setBounds(157, 289, 129, 25);
		PanelItalianCuisine.add(lblPanini);
		
		label_12 = new JLabel("$7");
		label_12.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_12.setBounds(436, 293, 129, 16);
		PanelItalianCuisine.add(label_12);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setBounds(579, 289, 66, 27);
		PanelItalianCuisine.add(comboBox_6);
		comboBox_6.addItem("0");
		comboBox_6.addItem("1");
		comboBox_6.addItem("2");
		comboBox_6.addItem("3");
		comboBox_6.addItem("4");
		comboBox_6.addItem("5");
		comboBox_6.addItem("6");
		comboBox_6.addItem("7");
		comboBox_6.addItem("8");
		comboBox_6.addItem("9");
		comboBox_6.addItem("10");
		
		button = new JButton("VIEW MENU");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelAllCuisine);
			}
		});
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button.setBounds(189, 418, 140, 29);
		PanelItalianCuisine.add(button);
		
		button_1 = new JButton("VIEW YOUR ORDER");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
			}
		});
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_1.setBounds(472, 418, 220, 29);
		PanelItalianCuisine.add(button_1);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		lblNewLabel_6.setBounds(-678, 0, 1476, 528);
		PanelItalianCuisine.add(lblNewLabel_6);
		
		PanelMexicanCuisine = new JPanel();
		layeredPane.add(PanelMexicanCuisine, "name_476760697828722");
		PanelMexicanCuisine.setLayout(null);
		
		
		
		lblMexicanCuisine = new JLabel("Mexican Cuisine");
		lblMexicanCuisine.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMexicanCuisine.setBounds(203, 45, 506, 25);
		PanelMexicanCuisine.add(lblMexicanCuisine);
		
		label_9 = new JLabel("Name");
		label_9.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_9.setBounds(203, 106, 57, 25);
		PanelMexicanCuisine.add(label_9);
		
		label_11 = new JLabel("Price");
		label_11.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_11.setBounds(442, 106, 110, 25);
		PanelMexicanCuisine.add(label_11);
		
		lblPozole = new JLabel("Pozole");
		lblPozole.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPozole.setBounds(203, 173, 129, 25);
		PanelMexicanCuisine.add(lblPozole);
		
		label_15 = new JLabel("$14");
		label_15.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_15.setBounds(442, 177, 92, 16);
		PanelMexicanCuisine.add(label_15);
		
		lblCabrito = new JLabel("Cabrito");
		lblCabrito.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCabrito.setBounds(203, 228, 129, 25);
		PanelMexicanCuisine.add(lblCabrito);
		
		label_17 = new JLabel("$17");
		label_17.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_17.setBounds(442, 232, 129, 16);
		PanelMexicanCuisine.add(label_17);
		
		lblBurrito = new JLabel("Burrito");
		lblBurrito.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblBurrito.setBounds(203, 284, 129, 25);
		PanelMexicanCuisine.add(lblBurrito);
		
		label_19 = new JLabel("$7");
		label_19.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_19.setBounds(442, 288, 129, 16);
		PanelMexicanCuisine.add(label_19);
		
		JLabel label_3 = new JLabel("Quantity");
		label_3.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_3.setBounds(580, 106, 110, 25);
		PanelMexicanCuisine.add(label_3);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(580, 173, 66, 27);
		PanelMexicanCuisine.add(comboBox_7);
		comboBox_7.addItem("0");
		comboBox_7.addItem("1");
		comboBox_7.addItem("2");
		comboBox_7.addItem("3");
		comboBox_7.addItem("4");
		comboBox_7.addItem("5");
		comboBox_7.addItem("6");
		comboBox_7.addItem("7");
		comboBox_7.addItem("8");
		comboBox_7.addItem("9");
		comboBox_7.addItem("10");
	
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(580, 228, 66, 27);
		PanelMexicanCuisine.add(comboBox_8);
		comboBox_8.addItem("0");
		comboBox_8.addItem("1");
		comboBox_8.addItem("2");
		comboBox_8.addItem("3");
		comboBox_8.addItem("4");
		comboBox_8.addItem("5");
		comboBox_8.addItem("6");
		comboBox_8.addItem("7");
		comboBox_8.addItem("8");
		comboBox_8.addItem("9");
		comboBox_8.addItem("10");
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(580, 284, 66, 27);
		PanelMexicanCuisine.add(comboBox_9);
		comboBox_9.addItem("0");
		comboBox_9.addItem("1");
		comboBox_9.addItem("2");
		comboBox_9.addItem("3");
		comboBox_9.addItem("4");
		comboBox_9.addItem("5");
		comboBox_9.addItem("6");
		comboBox_9.addItem("7");
		comboBox_9.addItem("8");
		comboBox_9.addItem("9");
		comboBox_9.addItem("10");
		
		JButton btnaddToCartMexican1 = new JButton("Add to Cart");
		btnaddToCartMexican1.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Pozole=new JPanel();
	                    Pozole.setSize(new Dimension(800, 200));
	                    Pozole.setLayout(new GridLayout(1,2));
	                   Pozole.setBackground(Color.orange);
	                    
	                    
	                    
	                    JLabel Pozole_label= new JLabel("Pozole");
	        Pozole.add(Pozole_label);      
	       
	        JLabel Pozole_price= new JLabel("$14");
	        Pozole.add(Pozole_price);
	       
	        String count= (String)comboBox_7.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals7=quants*14;
		 	  sum=sum+quant_totals7;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals7));
		 	       
		 	       Pozole.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Pozole);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Pozole);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		
		       		sum=sum-quant_totals7;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Pozole.add(Remove);       
	       
	       
	       
	       
	       
	         // PanelYourOrder.add(Pozole);
		          roughpanel.add(Pozole);       
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartMexican1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartMexican1.setBounds(674, 178, 92, 24);
		PanelMexicanCuisine.add(btnaddToCartMexican1);
		
		JButton btnaddToCartMexican2 = new JButton("Add to Cart");
		btnaddToCartMexican2.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Cabrito=new JPanel();
	                    Cabrito.setSize(new Dimension(800, 200));
	                    Cabrito.setLayout(new GridLayout(1,2));
	                   Cabrito.setBackground(Color.orange);
	                    JLabel GreenPapayaSalad_label= new JLabel("Cabrito");
	        Cabrito.add(GreenPapayaSalad_label);      
	       
	        JLabel Cabrito_price= new JLabel("$17");
	        Cabrito.add(Cabrito_price);
	       
	        String count= (String)comboBox_8.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals8=quants*17;
		 	  sum=sum+quant_totals8;
		 	 textfield_total.setText(String.valueOf(sum));
	       		
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals8));
		 	       
		 	       Cabrito.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Cabrito);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		 roughpanel.remove(Cabrito);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		
		       		sum=sum-quant_totals8;
		       		textfield_total.setText(String.valueOf(sum));
		       		
		   	      }
		       	   
		          });
		          
		          Cabrito.add(Remove);       
	       
	       
		          roughpanel.add(Cabrito);
	         // PanelYourOrder.add(Cabrito);
	                   
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartMexican2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartMexican2.setBounds(674, 229, 92, 24);
		PanelMexicanCuisine.add(btnaddToCartMexican2);
		
		JButton btnaddToCartMexican3 = new JButton("Add to Cart");
		btnaddToCartMexican3.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Burrito=new JPanel();
	                    Burrito.setSize(new Dimension(800, 200));
	                    Burrito.setLayout(new GridLayout(1,2));
	                   Burrito.setBackground(Color.orange);
	                   
	                    JLabel Burrito_label= new JLabel("Burrito");
	        Burrito.add(Burrito_label);      
	       
	        JLabel Burrito_price= new JLabel("$7");
	        Burrito.add(Burrito_price);
	       
	        String count= (String)comboBox_9.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals9=quants*7;
		 	   
		 	  sum=sum+quant_totals9;
		 	 textfield_total.setText(String.valueOf(sum));
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals9));
		 	       
		 	       Burrito.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Burrito);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Burrito);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals9;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Burrito.add(Remove);       
	       
	       
	       
		          roughpanel.add(Burrito);
	       
	         // PanelYourOrder.add(Burrito);
	                   
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartMexican3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartMexican3.setBounds(674, 287, 92, 24);
		PanelMexicanCuisine.add(btnaddToCartMexican3);
		
		JButton button_2 = new JButton("VIEW MENU");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelAllCuisine);
			}
		});
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_2.setBounds(199, 416, 140, 29);
		PanelMexicanCuisine.add(button_2);
		
		JButton button_3 = new JButton("VIEW YOUR ORDER");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
				
			}
		});
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_3.setBounds(482, 416, 220, 29);
		PanelMexicanCuisine.add(button_3);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		lblNewLabel_7.setBounds(-675, 0, 1473, 522);
		PanelMexicanCuisine.add(lblNewLabel_7);
		
		PanelThaiCuisine = new JPanel();
		layeredPane.add(PanelThaiCuisine, "name_476763991936766");
		PanelThaiCuisine.setLayout(null);
		
		
		
		
		lblThaiCuisine = new JLabel("Thai Cuisine");
		lblThaiCuisine.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblThaiCuisine.setBounds(203, 45, 506, 25);
		PanelThaiCuisine.add(lblThaiCuisine);
		
		label_13 = new JLabel("Name");
		label_13.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_13.setBounds(203, 106, 57, 25);
		PanelThaiCuisine.add(label_13);
		
		label_14 = new JLabel("Price");
		label_14.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_14.setBounds(442, 106, 110, 25);
		PanelThaiCuisine.add(label_14);
		
		label_16 = new JLabel("Quantity");
		label_16.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_16.setBounds(580, 106, 110, 25);
		PanelThaiCuisine.add(label_16);
		
		lblThaiFriedRice = new JLabel("Thai Fried Rice");
		lblThaiFriedRice.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblThaiFriedRice.setBounds(203, 173, 129, 25);
		PanelThaiCuisine.add(lblThaiFriedRice);
		
		label_20 = new JLabel("$14");
		label_20.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_20.setBounds(442, 177, 92, 16);
		PanelThaiCuisine.add(label_20);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setBounds(580, 173, 66, 27);
		PanelThaiCuisine.add(comboBox_10);
		comboBox_10.addItem("0");
		comboBox_10.addItem("1");
		comboBox_10.addItem("2");
		comboBox_10.addItem("3");
		comboBox_10.addItem("4");
		comboBox_10.addItem("5");
		comboBox_10.addItem("6");
		comboBox_10.addItem("7");
		comboBox_10.addItem("8");
		comboBox_10.addItem("9");
		comboBox_10.addItem("10");
		
		lblGreenPapayaSalad = new JLabel("Green Papaya Salad");
		lblGreenPapayaSalad.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblGreenPapayaSalad.setBounds(203, 228, 161, 25);
		PanelThaiCuisine.add(lblGreenPapayaSalad);
		
		label_22 = new JLabel("$17");
		label_22.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_22.setBounds(442, 232, 129, 16);
		PanelThaiCuisine.add(label_22);
		
		comboBox_11 = new JComboBox();
		comboBox_11.setBounds(580, 228, 66, 27);
		PanelThaiCuisine.add(comboBox_11);
		comboBox_11.addItem("0");
		comboBox_11.addItem("1");
		comboBox_11.addItem("2");
		comboBox_11.addItem("3");
		comboBox_11.addItem("4");
		comboBox_11.addItem("5");
		comboBox_11.addItem("6");
		comboBox_11.addItem("7");
		comboBox_11.addItem("8");
		comboBox_11.addItem("9");
		comboBox_11.addItem("10");
		
		lblTomyum = new JLabel("Tom Yum");
		lblTomyum.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTomyum.setBounds(203, 284, 129, 25);
		PanelThaiCuisine.add(lblTomyum);
		
		label_24 = new JLabel("$7");
		label_24.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_24.setBounds(442, 288, 129, 16);
		PanelThaiCuisine.add(label_24);
		
		comboBox_12 = new JComboBox();
		comboBox_12.setBounds(580, 284, 66, 27);
		PanelThaiCuisine.add(comboBox_12);
		comboBox_12.addItem("0");
		comboBox_12.addItem("1");
		comboBox_12.addItem("2");
		comboBox_12.addItem("3");
		comboBox_12.addItem("4");
		comboBox_12.addItem("5");
		comboBox_12.addItem("6");
		comboBox_12.addItem("7");
		comboBox_12.addItem("8");
		comboBox_12.addItem("9");
		comboBox_12.addItem("10");
		
		
		
		
		JButton btnaddToCartThai1 = new JButton("Add to Cart");
		btnaddToCartThai1.addActionListener(new ActionListener() 
		{
			/*
			public void actionPerformed(ActionEvent e) {
				
				//switchPanels(PanelYourOrder);
				
			}
			*/
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel ThaiFriedRice=new JPanel();
	                    ThaiFriedRice.setSize(new Dimension(800, 200));
	                    ThaiFriedRice.setLayout(new GridLayout(1,2));
	                    ThaiFriedRice.setBackground(Color.orange);
	                   
	                    JLabel ThaiFriedRice_label= new JLabel("Thai Fried Rice");
	        ThaiFriedRice.add(ThaiFriedRice_label);      
	       
	        JLabel ThaiFriedRice_price= new JLabel("$14");
	        ThaiFriedRice.add(ThaiFriedRice_price);
	       
	        String count= (String)comboBox_10.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals10=quants*14;
		 	  sum=sum+quant_totals10;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals10));
		 	       
		 	      ThaiFriedRice.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(ThaiFriedRice);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(ThaiFriedRice);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals10;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          ThaiFriedRice.add(Remove);       
	       
	       
	       
	       
	         // PanelYourOrder.add(ThaiFriedRice);
		          roughpanel.add(ThaiFriedRice);      
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartThai1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartThai1.setBounds(674, 178, 92, 24);
		PanelThaiCuisine.add(btnaddToCartThai1);
		
		JButton btnaddToCartThai2 = new JButton("Add to Cart");
		btnaddToCartThai2.addActionListener(new ActionListener() 
		{
			/* kung.setBackground(Color.orange);
			   * textfield_total.setText(String.valueOf(sum));
			   * roughpanel.remove(kung);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		textfield_total.setText(String.valueOf(sum));
			       		 roughpanel.add(dumpling);
			       		   */
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				//btnaddToCartChinese1.setBackground(Color.GREEN);
	                 	//JPanel jp7 = new JPanel();
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel GreenPapayaSalad=new JPanel();
	                    GreenPapayaSalad.setSize(new Dimension(800, 200));
	                    GreenPapayaSalad.setLayout(new GridLayout(1,2));
	                    GreenPapayaSalad.setBackground(Color.orange);
	                   
	                    JLabel GreenPapayaSalad_label= new JLabel("Green Papaya Salad");
	        GreenPapayaSalad.add(GreenPapayaSalad_label);      
	       
	        JLabel GreenPapayaSalad_price= new JLabel("$17");
	        GreenPapayaSalad.add(GreenPapayaSalad_price);
	       
	        String count= (String)comboBox_11.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals11=quants*17;
		 	  sum=sum+quant_totals11;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals11));
		 	       
		 	      GreenPapayaSalad.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(GreenPapayaSalad);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(GreenPapayaSalad);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		 
		       		sum=sum-quant_totals11;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          GreenPapayaSalad.add(Remove);       
	       
	       
	       
	         // PanelYourOrder.add(GreenPapayaSalad);
	                   
		          roughpanel.add(GreenPapayaSalad);      
	                   
	                 
	           }  
	     
		});
		btnaddToCartThai2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartThai2.setBounds(674, 229, 92, 24);
		PanelThaiCuisine.add(btnaddToCartThai2);
		
		JButton btnaddToCartThai3 = new JButton("Add to Cart");
		btnaddToCartThai3.addActionListener(new ActionListener() 
		{
			/* kung.setBackground(Color.orange);
			   * textfield_total.setText(String.valueOf(sum));
			   * roughpanel.remove(kung);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		textfield_total.setText(String.valueOf(sum));
			       		 roughpanel.add(dumpling);
			       		   */
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel TomYum=new JPanel();
	                    TomYum.setSize(new Dimension(800, 200));
	                    TomYum.setLayout(new GridLayout(1,2));
	                    TomYum.setBackground(Color.orange);
	                   
	                    JLabel TomYum_label= new JLabel("Tom Yum");
	        TomYum.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$7");
	        TomYum.add(TomYum_price);
	       
	        String count= (String)comboBox_12.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals12=quants*7;
		 	  sum=sum+quant_totals12;
		 	 textfield_total.setText(String.valueOf(sum));
       		 
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals12));
		 	       
		 	       TomYum.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(TomYum);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(TomYum);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		sum=sum-quant_totals12;
		       		textfield_total.setText(String.valueOf(sum));
		       		 
		   	      }
		       	   
		          });
		          
		          TomYum.add(Remove);       
	       
	       
	       
	         // PanelYourOrder.add(TomYum);
		          roughpanel.add(TomYum);        
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartThai3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartThai3.setBounds(674, 287, 92, 24);
		PanelThaiCuisine.add(btnaddToCartThai3);
		
		
		
		
		
		
		
		
		
		button_4 = new JButton("VIEW MENU");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelAllCuisine);
			}
		});
		button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_4.setBounds(199, 416, 140, 29);
		PanelThaiCuisine.add(button_4);
		
		button_5 = new JButton("VIEW YOUR ORDER");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
				
			}
		});
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_5.setBounds(482, 416, 220, 29);
		PanelThaiCuisine.add(button_5);
		
		label_25 = new JLabel("New label");
		label_25.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		label_25.setBounds(-675, 0, 1473, 528);
		PanelThaiCuisine.add(label_25);
		
		PanelDrinks = new JPanel();
		layeredPane.add(PanelDrinks, "name_476767325827604");
		PanelDrinks.setLayout(null);
		
		lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDrinks.setBounds(203, 45, 506, 25);
		PanelDrinks.add(lblDrinks);
		
		label_21 = new JLabel("Name");
		label_21.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_21.setBounds(170, 106, 57, 25);
		PanelDrinks.add(label_21);
		
		label_23 = new JLabel("Price");
		label_23.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_23.setBounds(443, 106, 110, 25);
		PanelDrinks.add(label_23);
		
		label_26 = new JLabel("Quantity");
		label_26.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		label_26.setBounds(580, 106, 110, 25);
		PanelDrinks.add(label_26);
		
		lblSoftDrink = new JLabel("Soft Drink");
		lblSoftDrink.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSoftDrink.setBounds(170, 177, 129, 25);
		PanelDrinks.add(lblSoftDrink);
		
		label_28 = new JLabel("$14");
		label_28.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_28.setBounds(442, 177, 92, 16);
		PanelDrinks.add(label_28);
		
		comboBox_13 = new JComboBox();
		comboBox_13.setBounds(580, 174, 66, 27);
		PanelDrinks.add(comboBox_13);
		comboBox_13.addItem("0");
		comboBox_13.addItem("1");
		comboBox_13.addItem("2");
		comboBox_13.addItem("3");
		comboBox_13.addItem("4");
		comboBox_13.addItem("5");
		comboBox_13.addItem("6");
		comboBox_13.addItem("7");
		comboBox_13.addItem("8");
		comboBox_13.addItem("9");
		comboBox_13.addItem("10");
		
		
		
		
		JButton btnaddToCartDrinks1 = new JButton("Add to Cart");
		btnaddToCartDrinks1.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Soft=new JPanel();
	                    Soft.setSize(new Dimension(800, 200));
	                    Soft.setLayout(new GridLayout(1,2));
	                    Soft.setBackground(Color.orange);
	                   
	                    JLabel TomYum_label= new JLabel("Soft Drinks");
	                    Soft.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$14");
	        Soft.add(TomYum_price);
	       
	        String count= (String)comboBox_13.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals13=quants*14;
		 	  sum=sum+quant_totals13;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals13));
		 	       
		 	       Soft.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Soft);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		   
		       		 roughpanel.remove(Soft);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		
			       		 
		       		   
		       		sum=sum-quant_totals13;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Soft.add(Remove);       
	         // PanelYourOrder.add(Soft);
		          roughpanel.add(Soft);   
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartDrinks1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartDrinks1.setBounds(674, 178, 92, 24);
		PanelDrinks.add(btnaddToCartDrinks1);
	
	
		lblTea = new JLabel("Tea");
		lblTea.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTea.setBounds(170, 229, 129, 25);
		PanelDrinks.add(lblTea);
		
		label_30 = new JLabel("$17");
		label_30.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_30.setBounds(442, 229, 92, 16);
		PanelDrinks.add(label_30);
		
		comboBox_14 = new JComboBox();
		comboBox_14.setBounds(580, 230, 66, 27);
		PanelDrinks.add(comboBox_14);
		comboBox_14.addItem("0");
		comboBox_14.addItem("1");
		comboBox_14.addItem("2");
		comboBox_14.addItem("3");
		comboBox_14.addItem("4");
		comboBox_14.addItem("5");
		comboBox_14.addItem("6");
		comboBox_14.addItem("7");
		comboBox_14.addItem("8");
		comboBox_14.addItem("9");
		comboBox_14.addItem("10");
		
		JButton btnaddToCartDrinks2 = new JButton("Add to Cart");
		btnaddToCartDrinks2.addActionListener(new ActionListener() 
		{
			/* kung.setBackground(Color.orange);
			   * textfield_total.setText(String.valueOf(sum));
			   * roughpanel.remove(kung);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		textfield_total.setText(String.valueOf(sum));
			       		 roughpanel.add(dumpling);
			       		   */
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Tea=new JPanel();
	                    Tea.setSize(new Dimension(800, 200));
	                    Tea.setLayout(new GridLayout(1,2));
	                    Tea.setBackground(Color.orange);
	                   
	                    JLabel TomYum_label= new JLabel("Tea");
	                    Tea.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$17");
	        Tea.add(TomYum_price);
	       
	        String count= (String)comboBox_14.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals14=quants*17;
		 	  sum=sum+quant_totals14;
		 	 textfield_total.setText(String.valueOf(sum));
	       		
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals14));
		 	       
		 	       Tea.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Tea);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(Tea);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		sum=sum-quant_totals14;
		       		textfield_total.setText(String.valueOf(sum));
		       		
		   	      }
		       	   
		          });
		          
		          Tea.add(Remove);       
	       
	       
	       
	         // PanelYourOrder.add(Tea);
	                   
		          roughpanel.add(Tea);      
	                   
	                 
	           }  
	     
		});
		btnaddToCartDrinks2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartDrinks2.setBounds(674, 229, 92, 24);
		PanelDrinks.add(btnaddToCartDrinks2);
		
		lblCoffee = new JLabel("Coffee");
		lblCoffee.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCoffee.setBounds(170, 287, 129, 25);
		PanelDrinks.add(lblCoffee);
		
		label_32 = new JLabel("$7");
		label_32.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_32.setBounds(442, 287, 92, 16);
		PanelDrinks.add(label_32);
		
		comboBox_15 = new JComboBox();
		comboBox_15.setBounds(580, 287, 66, 27);
		PanelDrinks.add(comboBox_15);
		comboBox_15.addItem("0");
		comboBox_15.addItem("1");
		comboBox_15.addItem("2");
		comboBox_15.addItem("3");
		comboBox_15.addItem("4");
		comboBox_15.addItem("5");
		comboBox_15.addItem("6");
		comboBox_15.addItem("7");
		comboBox_15.addItem("8");
		comboBox_15.addItem("9");
		comboBox_15.addItem("10");
		
		
		
		JButton btnaddToCartDrinks3 = new JButton("Add to Cart");
		btnaddToCartDrinks3.addActionListener(new ActionListener() 
		{
			/* kung.setBackground(Color.orange);
			   * textfield_total.setText(String.valueOf(sum));
			   * roughpanel.remove(kung);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		textfield_total.setText(String.valueOf(sum));
			       		 roughpanel.add(dumpling);
			       		   */
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Coffee=new JPanel();
	                    Coffee.setSize(new Dimension(800, 200));
	                    Coffee.setLayout(new GridLayout(1,2));
	                    Coffee.setBackground(Color.orange);
	                   
	                    JLabel TomYum_label= new JLabel("Coffee");
	                    Coffee.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$7");
	        Coffee.add(TomYum_price);
	       
	        String count= (String)comboBox_15.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals15=quants*7;
		 	  sum=sum+quant_totals15;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals15));
		 	       
		 	       Coffee.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Coffee);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Coffee);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		
		       		sum=sum-quant_totals15;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Coffee.add(Remove);       
	       
	       
	       
	        //  PanelYourOrder.add(Coffee);
	                   
		          roughpanel.add(Coffee);         
	                   
	                 
	           }  
	     
		});
		btnaddToCartDrinks3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartDrinks3.setBounds(674, 287, 92, 24);
		PanelDrinks.add(btnaddToCartDrinks3);
		
		button_6 = new JButton("VIEW MENU");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelAllCuisine);
			}
		});
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_6.setBounds(203, 431, 140, 29);
		PanelDrinks.add(button_6);
		
		button_7 = new JButton("VIEW YOUR ORDER");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelYourOrder);
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		button_7.setBounds(489, 431, 220, 29);
		PanelDrinks.add(button_7);
		
		JLabel lblSmoothie = new JLabel("Smoothie");
		lblSmoothie.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSmoothie.setBounds(170, 345, 129, 25);
		PanelDrinks.add(lblSmoothie);
		
		JLabel label_33 = new JLabel("$14");
		label_33.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_33.setBounds(442, 345, 92, 16);
		PanelDrinks.add(label_33);
		
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setBounds(580, 345, 66, 27);
		PanelDrinks.add(comboBox_16);
		comboBox_16.addItem("0");
		comboBox_16.addItem("1");
		comboBox_16.addItem("2");
		comboBox_16.addItem("3");
		comboBox_16.addItem("4");
		comboBox_16.addItem("5");
		comboBox_16.addItem("6");
		comboBox_16.addItem("7");
		comboBox_16.addItem("8");
		comboBox_16.addItem("9");
		comboBox_16.addItem("10");
		
		
		
		JButton btnaddToCartDrinks4 = new JButton("Add to Cart");
		btnaddToCartDrinks4.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                 
				/* kung.setBackground(Color.orange);
				   * textfield_total.setText(String.valueOf(sum));
				   * roughpanel.remove(kung);
				       		roughpanel.revalidate();
				       		roughpanel.repaint();
				       		textfield_total.setText(String.valueOf(sum));
				       		 roughpanel.add(dumpling);
				       		   */
				
						
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Smooth=new JPanel();
	                    Smooth.setSize(new Dimension(800, 200));
	                    Smooth.setLayout(new GridLayout(1,2));
	                    Smooth.setBackground(Color.orange);
	                   
	                    JLabel TomYum_label= new JLabel("Smoothie");
	                    Smooth.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$14");
	        Smooth.add(TomYum_price);
	       
	        String count= (String)comboBox_16.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals16=quants*14;
		 	  sum=sum+quant_totals16;
		 	 textfield_total.setText(String.valueOf(sum));
		 	   
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals16));
		 	       
		 	       Smooth.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Smooth);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		roughpanel.remove(Smooth);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		
		       		sum=sum-quant_totals16;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Smooth.add(Remove);       
	       
	       
	       
	        //  PanelYourOrder.add(Smooth);
		          roughpanel.add(Smooth);
	                   
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartDrinks4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartDrinks4.setBounds(674, 345, 92, 24);
		PanelDrinks.add(btnaddToCartDrinks4);
		
		
		JLabel lblFruitJuice = new JLabel("Fruit juice");
		lblFruitJuice.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblFruitJuice.setBounds(170, 403, 129, 25);
		PanelDrinks.add(lblFruitJuice);
		
		JLabel label_37 = new JLabel("$7");
		label_37.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_37.setBounds(442, 403, 92, 16);
		PanelDrinks.add(label_37);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setBounds(580, 403, 66, 27);
		PanelDrinks.add(comboBox_18);
		comboBox_18.addItem("0");
		comboBox_18.addItem("1");
		comboBox_18.addItem("2");
		comboBox_18.addItem("3");
		comboBox_18.addItem("4");
		comboBox_18.addItem("5");
		comboBox_18.addItem("6");
		comboBox_18.addItem("7");
		comboBox_18.addItem("8");
		comboBox_18.addItem("9");
		comboBox_18.addItem("10");
		
		
		
		JButton btnaddToCartDrinks6 = new JButton("Add to Cart");
		btnaddToCartDrinks6.addActionListener(new ActionListener() 
		{
			/* kung.setBackground(Color.orange);
			   * textfield_total.setText(String.valueOf(sum));
			   * roughpanel.remove(kung);
			       		roughpanel.revalidate();
			       		roughpanel.repaint();
			       		textfield_total.setText(String.valueOf(sum));
			       		 roughpanel.add(dumpling);
			       		   */
			
			public void actionPerformed(ActionEvent arg0)
	           {
	                
	                    PanelYourOrder.setLayout(new BoxLayout(PanelYourOrder, BoxLayout.Y_AXIS));
	                   
	                    JPanel Juice=new JPanel();
	                    Juice.setSize(new Dimension(800, 200));
	                    Juice.setLayout(new GridLayout(1,2));
	                   Juice.setBackground(Color.orange);
	                    JLabel TomYum_label= new JLabel("Juice");
	                    Juice.add(TomYum_label);      
	       
	        JLabel TomYum_price= new JLabel("$7");
	        Juice.add(TomYum_price);
	       
	        String count= (String)comboBox_18.getSelectedItem();
		 	   
		 	   int quants= Integer.parseInt(count);
		 	  
		 	   
		 	   int quant_totals18=quants*7;
		 	  sum=sum+quant_totals18;
		 	 textfield_total.setText(String.valueOf(sum));
		 	       JLabel quant_total= new JLabel();
		 	       quant_total.setText(String.valueOf(quant_totals18));
		 	       
		 	      Juice.add(quant_total);
	       
		 	      JButton Remove = new JButton("Remove");
		          
		          Remove.addActionListener(new ActionListener() {
		       	   public void actionPerformed(ActionEvent arg0)
		   	      {
		       		/*PanelYourOrder.remove(Juice);
		       		PanelYourOrder.revalidate();
		       		PanelYourOrder.repaint();*/
		       		   
		       		roughpanel.remove(Juice);
		       		roughpanel.revalidate();
		       		roughpanel.repaint();
		       		
		       		
		       		   
		       		sum=sum-quant_totals18;
		       		textfield_total.setText(String.valueOf(sum));
		   	      }
		       	   
		          });
		          
		          Juice.add(Remove);       
	       
	       
		          roughpanel.add(Juice);
	         // PanelYourOrder.add(Juice);
	                   
	                   
	                   
	                 
	           }  
	     
		});
		btnaddToCartDrinks6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnaddToCartDrinks6.setBounds(674, 403, 92, 24);
		PanelDrinks.add(btnaddToCartDrinks6);
		
		
		
		label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(("src/Try-Our-Brunch-Menu-background-upd.jpg")));
		label_7.setBounds(-675, 0, 1473, 528);
		PanelDrinks.add(label_7);
		
		PanelYourOrder = new JPanel();
		layeredPane.add(PanelYourOrder, "name_476770603759030");
		PanelYourOrder.setBackground(Color.orange);
		PanelYourOrder.setLayout(null);
		
		
		
		JPanel roughpanel1=new JPanel();
		roughpanel1.setBounds(10, 11, 778, 96);
		roughpanel1.setBackground(Color.orange);
		PanelYourOrder.add(roughpanel1);
		
		//JPanel roughpanel =new JPanel();
		roughpanel.setBackground(Color.orange);
		roughpanel.setBounds(10, 118, 765, 238);
		PanelYourOrder.add(roughpanel);
		roughpanel.setLayout(new BoxLayout(roughpanel, BoxLayout.Y_AXIS));
		roughpanel.setLayout(new BoxLayout(roughpanel, BoxLayout.Y_AXIS));
		
		
		
		//String pattern1 = "yyyy-MM-dd";
		String Pattern="MMM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Pattern);
		String date = simpleDateFormat.format(new Date());
		roughpanel1.setLayout(null);
		
		
		JLabel lblYourOrders = new JLabel("Your Orders - ");
		lblYourOrders.setBounds(10, 5, 129, 26);
		lblYourOrders.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		roughpanel1.add(lblYourOrders);
		
		//setBounds(10, 5, 129, 26);
		
			JLabel lblTodayDate = new JLabel(date.toString());
			lblTodayDate.setBounds(654, 5, 115, 26);
			lblTodayDate.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			roughpanel1.add(lblTodayDate);
			
			
			JPanel roughpanel2=new JPanel();
			roughpanel2.setBounds(10, 373, 759, 124);
			roughpanel2.setBackground(Color.orange);
			PanelYourOrder.add(roughpanel2);
			roughpanel2.setLayout(null);
			
			
			
			JButton lblConfirmOrder12 = new JButton("Confirm");
			lblConfirmOrder12.setBounds(291, 29, 129, 26);
			lblConfirmOrder12.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			
			roughpanel2.add(lblConfirmOrder12);
			
			lblConfirmOrder12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					switchPanels(PanelOrderMore);
				}
			});;
			
			
			JButton lblYourOrders2 = new JButton("Add items");
			lblYourOrders2.setBounds(0, 29, 129, 26);
			roughpanel2.add(lblYourOrders2);
			lblYourOrders2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			
			lblYourOrders2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					switchPanels(PanelAllCuisine);
					
				}
			});
			
		
			
			JLabel	btnGrandTotal = new JLabel("Total");
			btnGrandTotal.setBounds(509, 29, 129, 26);
			roughpanel2.add(btnGrandTotal);
			btnGrandTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			
			
	
			textfield_total=new JTextField();
			textfield_total.setBounds(579, 29, 129, 26);
			roughpanel2.add(textfield_total);
			textfield_total.setMinimumSize(new Dimension(57, 23));
			textfield_total.setMaximumSize(new Dimension(57, 23));
			textfield_total.setPreferredSize(new Dimension(57, 23));
			
			
			
	
	
	
	// Panel order more--> do not touch
		
		 PanelOrderMore = new JPanel();
		layeredPane.add(PanelOrderMore, "name_476774093542103");
		PanelOrderMore.setLayout(null);
		
		JButton OptionstoPay1 = new JButton("Credit Card");
		OptionstoPay1.setBounds(28, 138, 118, 63);
		PanelOrderMore.add(OptionstoPay1);
		//PanelOrderMore.setLayout(new GridLayout(3,3));
		
		JLabel OptionstoPay = new JLabel(" How would you like to pay us today?");
		OptionstoPay.setBounds(223, 5, 327, 26);
		OptionstoPay.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		PanelOrderMore.add(OptionstoPay);
		JButton OptionstoPay2 = new JButton("Debit Card");
		OptionstoPay2.setBounds(337, 138, 111, 63);
		PanelOrderMore.add(OptionstoPay2);
		JButton OptionstoPay3 = new JButton("Cash");
		OptionstoPay3.setBounds(641, 138, 92, 63);
		PanelOrderMore.add(OptionstoPay3);
		
		/*JLabel message = new JLabel("Thanks for the Visit, Your Payment is confirmed");
		message.setSize(367, 50);
		message.setLocation(298, 296);
		PanelOrderMore.add(message);*/
		
		/*JLabel message1 = new JLabel("Happy meal!!!");
		message1.setSize(127, 50);
		message1.setLocation(380, 339);
		PanelOrderMore.add(message1);*/
		
		PanelOrderMore.setBackground(Color.orange);
		
		OptionstoPay1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode="Credit Card";
				JLabel message = new JLabel("Thanks for the Visit. Your Payment is confirmed");
				JLabel message1 = new JLabel("Happy meal");
				message.setSize(367, 100);
				message.setLocation(298, 296);
				//message.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message);
				message1.setSize(127, 50);
				message1.setLocation(380, 339);
				//message1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message1);
				PanelOrderMore.revalidate();
				PanelOrderMore.repaint();
				//switchPanels(PanelOrderMore);
			}
		});
		
		OptionstoPay2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode="Debit Card";
				JLabel message = new JLabel("Thanks for the Visit. Your Payment is confirmed");
				JLabel message1 = new JLabel("Happy meal");
				message.setSize(367, 100);
				message.setLocation(298, 296);
				//message.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message);
				message1.setSize(127, 50);
				message1.setLocation(380, 339);
				//message1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message1);
				PanelOrderMore.revalidate();
				PanelOrderMore.repaint();
				//switchPanels(PanelOrderMore);
			}
		});
		
		OptionstoPay3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode="Cash";
				JLabel message = new JLabel("Thanks for the Visit. Your Payment is confirmed");
				JLabel message1 = new JLabel("Happy meal");
				message.setSize(367, 100);
				message.setLocation(298, 296);
				//message.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message);
				message1.setSize(127, 50);
				message1.setLocation(380, 339);
				//message1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
				PanelOrderMore.add(message1);
				PanelOrderMore.revalidate();
				PanelOrderMore.repaint();
				//switchPanels(PanelOrderMore);
			}
		});
		
		 btnFinish = new JButton("Finish");
		btnFinish.setBounds(337, 447, 150, 50);
		btnFinish.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		PanelOrderMore.add(btnFinish);
		ActionListener1 aListen1=new ActionListener1();
		btnFinish.addActionListener(aListen1);
		
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(PanelRegister);
			}
		});
	}
	
	class ActionListener1 implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if (evt.getSource()==btnFinish){
				
				try {
					MenuCard obj1=new MenuCard();
		            PrintWriter out = new PrintWriter(new FileWriter("TestFile6.txt"));
		            out.println("Customer Name,Phonenumber,Age,Total,Mode of Payment ");
		            out.print(textFieldName.getText()+",");
		            out.print(textField_1.getText()+",");
		            out.print(comboBox.getSelectedItem()+",");
		            out.print(sum+",");
		            out.print(mode);
		            
		          //  out.print();
		            
		        //    out.print();
		            
		            
		            out.close();
		            System.out.println(textFieldName.getText());

		        } catch (IOException e1) {
		            System.err.println("Error occurred");
		            e1.printStackTrace();
		        }
			}
			}
		}
}
		
			
		
		
		
