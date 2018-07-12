package com.ecust.jingdianchaxun.view;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import com.ecust.jingdianchaxun.controller.Dijkstra;

import javax.swing.JScrollPane;


public class mainpage extends JFrame {
	private JTextField textStart;
	private JTextField textEnd;
    private static int vs;
    private static int s2;
    public static JTextPane result;

	/**
	 * Create the frame.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					mainpage jframe = new mainpage();
					jframe.setVisible(true);
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		

	}
	
	
	
	public mainpage() {
		
		setBounds(new Rectangle(0, 0, 1300, 700));
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(mainpage.class.getResource("/img/mapIcon.png")));
		setTitle("华理奉贤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1284, 661);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane textGymnasium = new JTextPane();
		textGymnasium.setVisible(false);
		textGymnasium.setEditable(false);
		textGymnasium.setBounds(508, 463, 153, 86);
		panel.add(textGymnasium);
		textGymnasium.setText("编号：6\r\n名称：体育馆\r\n简介：观看室内篮球赛的绝佳场地，也有羽毛球场、乒乓球场、体操垫等场地");
		
		JTextPane textGolf = new JTextPane();
		textGolf.setVisible(false);
		textGolf.setEditable(false);
		textGolf.setText("编号：1\r\n名称：高尔夫球场\r\n简介：莅临校医院与户外拓展基地的高尔夫球场风景优美，草坪整齐翠绿，是学生们放松的好地方");
		textGolf.setBounds(105, 113, 153, 100);
		panel.add(textGolf);
		
		JTextPane textBuilding1 = new JTextPane();
		textBuilding1.setVisible(false);
		textBuilding1.setEditable(false);
		textBuilding1.setText("编号：4\r\n名称：信息楼\r\n简介：可做单片机实验，有许多高速运转的电脑，也是广播室的基地，还有阳光育人平台展示学生们一些有趣的作品");
		textBuilding1.setBounds(308, 110, 153, 121);
		panel.add(textBuilding1);
		
		JTextPane textLibrary = new JTextPane();
		textLibrary.setVisible(false);
		textLibrary.setEditable(false);
		textLibrary.setText("编号：3\r\n名称：图书馆\r\n简介：外部方方正正，内部蕴含海量图书，还有阅读亭、咖啡屋、3D打印机等有趣的东西");
		textLibrary.setBounds(477, 172, 153, 104);
		panel.add(textLibrary);
		
		JTextPane textBuilding6 = new JTextPane();
		textBuilding6.setVisible(false);
		textBuilding6.setEditable(false);
		textBuilding6.setText("编号：2\r\n名称：实验6楼\r\n简介：做物理实验的天堂，比如全息照相实验，牛顿环实验");
		textBuilding6.setBounds(103, 397, 153, 84);
		panel.add(textBuilding6);
		
		JTextPane textIsland = new JTextPane();
		textIsland.setVisible(false);
		textIsland.setEditable(false);
		textIsland.setText("编号：5\r\n名称：通海湖湖心岛\r\n简介：通海湖风景优美可划龙舟，而湖心岛更是孔雀、天鹅、鸭子的栖息地");
		textIsland.setBounds(327, 372, 153, 83);
		panel.add(textIsland);
		
		JTextPane textTeaching = new JTextPane();
		textTeaching.setVisible(false);
		textTeaching.setEditable(false);
		textTeaching.setText("编号：9\r\n名称：A教学楼\r\n简介：教室可容纳200人，教学楼中间的花园风景优美，学生休憩时间可坐在木凳上享受阳谷，而双手的雕塑寓意着托举华理美好未来");
		textTeaching.setBounds(491, 313, 119, 147);
		panel.add(textTeaching);
		
		JTextPane textPlayground = new JTextPane();
		textPlayground.setVisible(false);
		textPlayground.setEditable(false);
		textPlayground.setText("编号：7\r\n名称：操场\r\n简介：临近篮球场、网球场，是运动者的天堂");
		textPlayground.setBounds(766, 395, 119, 85);
		panel.add(textPlayground);
		
		JTextPane textCanteen = new JTextPane();
		textCanteen.setVisible(false);
		textCanteen.setEditable(false);
		textCanteen.setText("编号：8\r\n名称：一食堂\r\n简介：共有三楼，多个窗口开放，菜品丰富，比如红烧肉、石锅拌饭、过桥米线、岩扒饭、铁板意面、醋溜海带丝等");
		textCanteen.setBounds(647, 259, 165, 100);
		panel.add(textCanteen);
		
		JTextPane textActivity = new JTextPane();
		textActivity.setVisible(false);
		textActivity.setEditable(false);
		textActivity.setText("编号：10\r\n名称：大学生活动中心\r\n简介：各社团举办活动的首要场地，更是有咖啡屋、台球室、舞蹈室");
		textActivity.setBounds(647, 113, 150, 88);
		panel.add(textActivity);
		
		JButton library = new JButton("");
		library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textLibrary.isVisible())
					textLibrary.setVisible(false);
				else
					 textLibrary.setVisible(true);						
			}
		});
		library.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));		
		library.setContentAreaFilled(false); 
		library.setBounds(464, 272, 30, 35);
		panel.add(library);
		
		JButton island = new JButton("");
		island.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textIsland.isVisible())
					textIsland.setVisible(false);
				else
					 textIsland.setVisible(true);						
			}
		});
		island.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		island.setContentAreaFilled(false);
		island.setBounds(480, 360, 30, 35);
		panel.add(island);
		
		JButton playground = new JButton("");
		playground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textPlayground.isVisible())
					textPlayground.setVisible(false);
				else
					 textPlayground.setVisible(true);						
			}
		});
		playground.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		playground.setContentAreaFilled(false);
		playground.setBounds(771, 360, 30, 35);
		panel.add(playground);
		
		JButton canteen = new JButton("");
		canteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textCanteen.isVisible())
					textCanteen.setVisible(false);
				else
					 textCanteen.setVisible(true);						
			}
		});
		canteen.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		canteen.setContentAreaFilled(false);
		canteen.setBounds(802, 228, 30, 35);
		panel.add(canteen);
		
		JButton golf = new JButton("");
		golf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textGolf.isVisible())
					textGolf.setVisible(false);
				else
					 textGolf.setVisible(true);						
			}
		});
		golf.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		golf.setContentAreaFilled(false);
		golf.setBounds(253, 198, 30, 35);
		panel.add(golf);
		
		JButton building6 = new JButton("");
		building6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textBuilding6.isVisible())
					textBuilding6.setVisible(false);
				else
					 textBuilding6.setVisible(true);						
			}
		});
		building6.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		building6.setContentAreaFilled(false);
		building6.setBounds(253, 371, 30, 35);
		panel.add(building6);
		
		JButton building1 = new JButton("");
		building1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textBuilding1.isVisible())
					textBuilding1.setVisible(false);
				else
					 textBuilding1.setVisible(true);						
			}
		});
		building1.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		building1.setContentAreaFilled(false);
		building1.setBounds(391, 228, 30, 35);
		panel.add(building1);
		
		JButton activity = new JButton("");
		activity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textActivity.isVisible())
					textActivity.setVisible(false);
				else
					 textActivity.setVisible(true);						
			}
		});
		activity.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		activity.setContentAreaFilled(false);
		activity.setBounds(802, 106, 30, 35);
		panel.add(activity);
		
		JButton teaching = new JButton("");
		teaching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textTeaching.isVisible())
					textTeaching.setVisible(false);
				else
					 textTeaching.setVisible(true);						
			}
		});
		teaching.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		teaching.setContentAreaFilled(false);
		teaching.setBounds(608, 316, 30, 35);
		panel.add(teaching);
		
		JButton gymnasium = new JButton("");
		gymnasium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textGymnasium.isVisible())
					textGymnasium.setVisible(false);
				else
					 textGymnasium.setVisible(true);						
			}
		});
		gymnasium.setIcon(new ImageIcon(mainpage.class.getResource("/img/gps.png")));
		gymnasium.setContentAreaFilled(false);
		gymnasium.setBounds(659, 449, 30, 35);
		panel.add(gymnasium);
		
		JLabel label_1_2 = new JLabel("");
		label_1_2.setName("1_2");
		label_1_2.setIcon(new ImageIcon(mainpage.class.getResource("/img/1-2.png")));
		label_1_2.setForeground(new Color(0, 102, 102));
		label_1_2.setFont(new Font("幼圆", Font.BOLD, 51));
		label_1_2.setBounds(0, 0, 900, 670);
		panel.add(label_1_2);
		
		JLabel label_1_4 = new JLabel("");
		label_1_4.setName("1_4");
		label_1_4.setIcon(new ImageIcon(mainpage.class.getResource("/img/1-4.png")));
		label_1_4.setForeground(new Color(0, 102, 102));
		label_1_4.setFont(new Font("幼圆", Font.BOLD, 51));
		label_1_4.setBounds(0, 0, 900, 670);
		panel.add(label_1_4);
		
		JLabel label_3_4 = new JLabel("");
		label_3_4.setName("3_4");
		label_3_4.setIcon(new ImageIcon(mainpage.class.getResource("/img/3-4.307.png")));
		label_3_4.setForeground(new Color(0, 102, 102));
		label_3_4.setFont(new Font("幼圆", Font.BOLD, 51));
		label_3_4.setBounds(0, 0, 900, 670);
		panel.add(label_3_4);
		
		JLabel label_3_5 = new JLabel("");
		label_3_5.setName("3_5");
		label_3_5.setIcon(new ImageIcon(mainpage.class.getResource("/img/3-5.png")));
		label_3_5.setForeground(new Color(0, 102, 102));
		label_3_5.setFont(new Font("幼圆", Font.BOLD, 51));
		label_3_5.setBounds(0, 0, 900, 670);
		panel.add(label_3_5);
		
		JLabel label_3_9 = new JLabel("");
		label_3_9.setName("3_9");
		label_3_9.setIcon(new ImageIcon(mainpage.class.getResource("/img/3-9.png")));
		label_3_9.setForeground(new Color(0, 102, 102));
		label_3_9.setFont(new Font("幼圆", Font.BOLD, 51));
		label_3_9.setBounds(0, 0, 900, 670);
		panel.add(label_3_9);
		
		JLabel label_4_10 = new JLabel("");
		label_4_10.setName("4_10");
		label_4_10.setIcon(new ImageIcon(mainpage.class.getResource("/img/4-10,732.png")));
		label_4_10.setForeground(new Color(0, 102, 102));
		label_4_10.setFont(new Font("幼圆", Font.BOLD, 51));
		label_4_10.setBounds(0, 0, 900, 670);
		panel.add(label_4_10);
		
		JLabel label_6_7 = new JLabel("");
		label_6_7.setName("6_7");
		label_6_7.setIcon(new ImageIcon(mainpage.class.getResource("/img/6-7.png")));
		label_6_7.setForeground(new Color(0, 102, 102));
		label_6_7.setFont(new Font("幼圆", Font.BOLD, 51));
		label_6_7.setBounds(0, 0, 900, 670);
		panel.add(label_6_7);
		
		JLabel label_5_6 = new JLabel("");
		label_5_6.setName("5_6");
		label_5_6.setIcon(new ImageIcon(mainpage.class.getResource("/img/5-6.png")));
		label_5_6.setForeground(new Color(0, 102, 102));
		label_5_6.setFont(new Font("幼圆", Font.BOLD, 51));
		label_5_6.setBounds(0, 0, 900, 670);
		panel.add(label_5_6);
		
		JLabel label_7_8 = new JLabel("");
		label_7_8.setName("7_8");
		label_7_8.setIcon(new ImageIcon(mainpage.class.getResource("/img/7-8.png")));
		label_7_8.setForeground(new Color(0, 102, 102));
		label_7_8.setFont(new Font("幼圆", Font.BOLD, 51));
		label_7_8.setBounds(0, 0, 900, 670);
		panel.add(label_7_8);
		
		JLabel label_7_9 = new JLabel("");
		label_7_9.setName("7_9");
		label_7_9.setIcon(new ImageIcon(mainpage.class.getResource("/img/7-9.png")));
		label_7_9.setForeground(new Color(0, 102, 102));
		label_7_9.setFont(new Font("幼圆", Font.BOLD, 51));
		label_7_9.setBounds(0, 0, 900, 670);
		panel.add(label_7_9);
		
		JLabel label_8_10 = new JLabel("");
		label_8_10.setName("8_10");
		label_8_10.setIcon(new ImageIcon(mainpage.class.getResource("/img/8-10.png")));
		label_8_10.setForeground(new Color(0, 102, 102));
		label_8_10.setFont(new Font("幼圆", Font.BOLD, 51));
		label_8_10.setBounds(0, 0, 900, 670);
		panel.add(label_8_10);
		
		JLabel label_9_10 = new JLabel("");
		label_9_10.setName("9_10");
		label_9_10.setIcon(new ImageIcon(mainpage.class.getResource("/img/9-10.png")));
		label_9_10.setForeground(new Color(0, 102, 102));
		label_9_10.setFont(new Font("幼圆", Font.BOLD, 51));
		label_9_10.setBounds(0, 0, 900, 670);
		panel.add(label_9_10);
		
		JLabel oneLabel = new JLabel("华 东 理 工 大 学 奉 贤 校 区 欢 迎 您");
		oneLabel.setForeground(new Color(0, 102, 102));
		oneLabel.setFont(new Font("幼圆", Font.BOLD, 51));
		oneLabel.setBounds(105, 0, 1068, 86);
		panel.add(oneLabel);
		
		JLabel start = new JLabel("请输入出发地序号");
		start.setName("start\r\n");
		start.setForeground(new Color(0, 102, 102));
		start.setFont(new Font("幼圆", Font.BOLD, 18));
		start.setBounds(1065, 187, 171, 43);
		panel.add(start);
		
		JLabel end = new JLabel("请输入目的地序号");
		end.setForeground(new Color(0, 102, 102));
		end.setFont(new Font("幼圆", Font.BOLD, 18));
		end.setBounds(1065, 264, 171, 43);
		panel.add(end);
		
		textStart = new JTextField();
		textStart.setColumns(10);
		textStart.setBounds(1065, 225, 180, 29);
		panel.add(textStart);
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBounds(1065, 301, 180, 29);
		panel.add(textEnd);
		
		
		
		JLabel map = new JLabel();
		map.setIcon(new ImageIcon(mainpage.class.getResource("/img/pingmiantu.jpg")));
		map.setBounds(0, 0, 900, 670);
		panel.add(map);
		
		JLabel label = new JLabel("最短路径及路线如下：");
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("幼圆", Font.BOLD, 18));
		label.setBounds(1065, 363, 196, 43);
		panel.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1059, 400, 191, 135);
		panel.add(scrollPane);
		
		JTextPane result = new JTextPane();
		scrollPane.setViewportView(result);
		       
		label_1_2.setVisible(false);
		label_1_4.setVisible(false);
		label_3_5.setVisible(false);
		label_3_4.setVisible(false);
		label_3_9.setVisible(false);
		label_4_10.setVisible(false);
		label_5_6.setVisible(false);
		label_6_7.setVisible(false);
		label_7_8.setVisible(false);
		label_7_9.setVisible(false);
		label_8_10.setVisible(false);
		label_9_10.setVisible(false);
		
				
		JButton confirm = new JButton("确定");
		confirm.setFont(new Font("方正舒体", Font.BOLD, 17));
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label_1_2.setVisible(false);
				label_1_4.setVisible(false);
				label_3_5.setVisible(false);
				label_3_4.setVisible(false);
				label_3_9.setVisible(false);
				label_4_10.setVisible(false);
				label_5_6.setVisible(false);
				label_6_7.setVisible(false);
				label_7_8.setVisible(false);
				label_7_9.setVisible(false);
				label_8_10.setVisible(false);
				label_9_10.setVisible(false);
				vs=Integer.valueOf(textStart.getText().toString());
				s2=Integer.valueOf(textEnd.getText().toString());
				Dijkstra.dijkstra(vs-1,s2-1, Dijkstra.Graph);
				result.setText(Dijkstra.str);
				if(Dijkstra.sur==true) {
				
				 for (int v=s2-1; v!=vs-1; v=Dijkstra.prenode[v]) {
			         int small;
			         int big;
			         System.out.println("v="+v+"   prenode[v]="+Dijkstra.prenode[v]);
			         if(v<Dijkstra.prenode[v]) {
			        	 small=v+1;
			        	 big=Dijkstra.prenode[v]+1;
			         }else {
			        	 small=Dijkstra.prenode[v]+1;
			        	 big=v+1;
			         }
			         System.out.println("small="+small+"   big="+big);
			         if(small==3) {
			        	 if(big==4) {
			        		 label_3_4.setVisible(true);
			        	 }
			        	 if(big==9){
			        		 label_3_9.setVisible(true);
			        	 }
			        	 if(big==5){
			        		 label_3_5.setVisible(true);
			        	 }
			         }
			         if(small==1) {
			        	 if(big==4) {
			        		 label_1_4.setVisible(true);
			        	 }
			        	 if(big==2){
			        		 label_1_2.setVisible(true);
			        	 }
			         }
			         if(small==4) {
			        	 if(big==10) {
			        		 label_4_10.setVisible(true);
			        	 }
			         }
			         if(small==5) {
			        	 if(big==6) {
			        		 label_5_6.setVisible(true);
			        	 }
			         }
			         if(small==6) {
			        	 if(big==7) {
			        		 label_6_7.setVisible(true);
			        	 }
			         }
			         if(small==7) {
			        	 if(big==8) {
			        		 label_7_8.setVisible(true);
			        	 }
			        	 if(big==9){
			        		 label_7_9.setVisible(true);
			        	 }
			         }
			         if(small==8) {
			        	 if(big==10) {
			        		 label_8_10.setVisible(true);
			        	 }
			         }
			         if(small==9) {
			        	 if(big==10) {
			        		 label_9_10.setVisible(true);
			        	 }
			         }
			     }
			}
			}
		});
		confirm.setForeground(new Color(255, 255, 255));
		confirm.setBackground(new Color(0, 0, 51));
		confirm.setBounds(1065, 340, 84, 23);
		panel.add(confirm);
	}
}
